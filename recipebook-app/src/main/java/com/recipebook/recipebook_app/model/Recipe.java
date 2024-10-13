package com.recipebook.recipebook_app.model;

import java.util.List;

public class Recipe {
    private String title;
    private List<String> ingredients;
    private String description;
    private String preparationSteps;
    private int cookingTime;

    // Constructors, Getters and Setters
    public Recipe() {}

    public Recipe(String title, List<String> ingredients, String description, String preparationSteps, int cookingTime) {
        this.title = title;
        this.ingredients = ingredients;
        this.description = description;
        this.preparationSteps = preparationSteps;
        this.cookingTime = cookingTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPreparationSteps() {
        return preparationSteps;
    }

    public void setPreparationSteps(String preparationSteps) {
        this.preparationSteps = preparationSteps;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }
}
