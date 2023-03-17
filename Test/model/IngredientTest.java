package model;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IngredientTest {

    private Ingredient ingredient;

    public void setupStage1(){
        ingredient=new Ingredient("Tomate", 245);
    }


    @Test
    public void addWeightTest(){
        //Arrange
        setupStage1();
        //Act
        ingredient.addWeight(54);
        //Assert
        assertEquals(299, ingredient.getWeight());




    }
    @Test
    public void addWeightTest1(){
        //Arrange
        setupStage1();
        //Act

        //Assert


    }

    @Test
    public void removeWeight(){
        //Arrange
        setupStage1();
        //Act
        ingredient.removeWeight(45);
        //Assert
        assertEquals(200, ingredient.getWeight());


    }

    @Test
    public void removeWeight1(){
        //Arrange
        setupStage1();
        //Act

        //Assert

    }
}
