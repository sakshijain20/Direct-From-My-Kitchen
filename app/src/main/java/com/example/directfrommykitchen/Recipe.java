package com.example.directfrommykitchen;

public class Recipe {
    private String  Recipe;
    private String RecipeName;
    private String Make;
    private String Ingredients;

    public Recipe(String recipe, String recipeName, String make, String ingredients) {
        Recipe = recipe;
        RecipeName = recipeName;
        Make = make;
        Ingredients = ingredients;
    }

    public String getRecipe() {
        return Recipe;
    }

    public void setRecipe(String recipe) {
        Recipe = recipe;
    }

    public String getRecipeName() {
        return RecipeName;
    }

    public void setRecipeName(String recipeName) {
        RecipeName = recipeName;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String getIngredients() {
        return Ingredients;
    }

    public void setIngredients(String ingredients) {
        Ingredients = ingredients;
    }
}
