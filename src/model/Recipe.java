package model;

import java.util.LinkedList;

public class Recipe {

    public LinkedList<Ingredient> ingredients;

    public Recipe() {
        ingredients = new LinkedList<>();
    }

    public void addIngredient(Ingredient ingredient){
            ingredients.add(ingredient);

    }

    public int getSize(){
        return ingredients.size();
    }

    public Ingredient getLast(){
        return ingredients.getLast();
    }

    public void removeIngredient(String ingredientName) {

        for (int i = 0; i < ingredients.size(); i++) {
            if(ingredientName.equals(ingredients.getLast().getName())){
                ingredients.remove(ingredients.get(i));
            }

        }
    }


}
