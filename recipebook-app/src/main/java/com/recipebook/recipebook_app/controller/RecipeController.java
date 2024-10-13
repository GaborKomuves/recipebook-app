package com.recipebook.recipebook_app.controller;


import com.recipebook.recipebook_app.model.Recipe;
import com.recipebook.recipebook_app.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @GetMapping("/recipes")
    public String listRecipes(Model model) {
        model.addAttribute("recipes", recipeService.getAllRecipes());
        return "recipes";
    }

    @GetMapping("/recipe/add")
    public String showAddRecipeForm(Model model) {
        model.addAttribute("recipe", new Recipe());
        return "add-recipe";
    }

    @PostMapping("/recipe/add")
    public String addRecipe(@ModelAttribute Recipe recipe) {
        recipeService.addRecipe(recipe);
        return "redirect:/recipes";
    }
}