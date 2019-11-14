package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given

        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        ;
        Assert.assertEquals((Integer)1, DogHouse.getNumberOfDogs());
    }
    @Test
    public void add() {
        // Given (some
        DogHouse dogHouse = new DogHouse();
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        //When
        DogHouse.add(animal);
        Dog actual = DogHouse.getDogById(0);

        //Then
        Assert.assertEquals(actual, animal);
    }

    @Test
    public void remove() {
        // Given
        DogHouse dogHouse = new DogHouse();
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        Dog animal2 = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        //When
        DogHouse.add(animal);
        DogHouse.add(animal2);
       // dogHouse.remove(1);
        Dog actual = DogHouse.getDogById(1);

        //Then
        Assert.assertNull(actual);
    }

    @Test
    public void dogRemove() {
        // Given
        DogHouse dogHouse = new DogHouse();
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        Dog animal2 = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        //When
        DogHouse.add(animal);
        DogHouse.add(animal2);
        DogHouse.remove(animal2);
        Dog actual = DogHouse.getDogById(1);

        //Then
        Assert.assertNull(actual);

    }

    @Test
    public void getCatById() {
        // Given
        DogHouse dogHouse = new DogHouse();
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        Dog animal2 = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        //When
        DogHouse.add(animal);
        DogHouse.add(animal2);

        Dog actual = DogHouse.getDogById(0);

        //Then
        Assert.assertEquals(animal2, actual);
    }

    @Test
    public void getNumberOfDogs() {
        //Given
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        Dog animal2 = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        //When
        DogHouse.add(animal);
        DogHouse.add(animal2);

        Integer actual = DogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(actual, (Integer) 2);
    }

    @Test
    public void clear() {
        //Given
        DogHouse dogHouse = new DogHouse();
        Date birthdate = new Date();
        Dog dog = new Dog("Zula", birthdate, 10 );
        Dog dog2 = new Dog("Asami", birthdate, 101);


        //When
        DogHouse.add(dog);
        DogHouse.add(dog2);
        DogHouse.clear();

        Dog actual = DogHouse.getDogById(10);
        Dog actual2 = DogHouse.getDogById(101);

        //Then
        Assert.assertNull(actual);
        Assert.assertNull(actual2);
    }

}
