package com.recipebook.recipebook_app.service;


import com.recipebook.recipebook_app.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecipeService {
    private List<Recipe> recipes = new ArrayList<>();

    public java.util.List<Recipe> getAllRecipes() {
        return recipes;
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }
}
