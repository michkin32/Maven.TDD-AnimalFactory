package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setName() {
        // Given (cat data)
        String givenName = "Nala";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        dog.setName("Katara");
        String retrievedName = dog.getName();


        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals("Katara", retrievedName);

    }




    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Nala";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void setBirthDateTest() {
        // Given (cat data)
        String givenName = "Nala";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        dog.setBirthDate(givenBirthDate);

        Date retrievedBirthDate = dog.getBirthDate();


        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);

    }
    @Test
    public void getIdTest() {
        // Given (cat data)
        String givenName = "Nala";
        Date givenBirthDate = new Date();
        Integer givenId = 10;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)

        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void eat() {
        // Given (cat data)
        String givenName = "Nala";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Food catFood = new Food();

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        dog.setName("Sokka");
        dog.eat(catFood);


        // Then (we expect the given data, to match the retrieved data)
        //Assert.assertEquals("Sokka", retrievedName);

    }

    @Test
    public void speakTest() {
        // Given (cat data)
        String givenName = "Nala";
        Date givenBirthDate = new Date();
        Integer givenId = 10;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)

        String expected = dog.speak();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, "bark!");
    }
    @Test
    public void instanceOfTest() {
        // Given (cat data)
        String givenName = "Nala";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);


        // Then (we expect the given data, to match the retrieved data)
        Assert.assertTrue(dog instanceof Animal);
        Assert.assertTrue(dog instanceof Mammal);

    }

}
