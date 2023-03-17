package model;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RecipeTest {

    private Recipe recipe;


    public void setupStage1(){
        recipe=new Recipe();

    }

    public void setupStage2(){
        recipe = new Recipe();
        recipe.addIngredient(new Ingredient("Cebolla",315 ));
        recipe.addIngredient(new Ingredient("Ajo",58 ));
        recipe.addIngredient(new Ingredient("Arroz", 520 ));

    }

    @Test
    public void addIngredientTest(){
        //Arrange
        setupStage1();

        //Act
        recipe.addIngredient(new Ingredient("Sal", 12 ));

        //Assert
        assertEquals(recipe.getSize(), 1);
        assertEquals(recipe.getLast().getName(), "Sal");
    }

    @Test
    public void addIngredientTest1(){
        //Arrange
        setupStage2();

        //Act
        recipe.addIngredient(new Ingredient("Pimienta", 6));

        //Assert
        assertEquals(recipe.getSize(), 4);
        assertEquals(recipe.getLast().getName(), "Pimienta");
    }

    @Test
    public void  addIngredientTest2(){
        //Arrange
        setupStage2();

        //Act

    }

    @Test
    public void removeIngredient(){
        //Arrange
        setupStage2();

        //Act
        recipe.removeIngredient("Ajo");

        //Assert
        assertFalse(recipe.ingredients.equals("Ajo"));

    }





}
