package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void add() {
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        CatHouse.clear();

        Cat cat1 = AnimalFactory.createCat(name, birthDate);
        CatHouse.add(cat1);
        Cat cat2 = AnimalFactory.createCat(name, birthDate);
        CatHouse.add(cat2);



        Cat actual = CatHouse.getCatById(1);

        //Then
        Assert.assertEquals(actual, cat2);
    }

    @Test
    public void remove() {
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        CatHouse.clear();

        Cat cat1 = AnimalFactory.createCat(name, birthDate);
        CatHouse.add(cat1);
        Cat cat2 = AnimalFactory.createCat(name, birthDate);
        CatHouse.add(cat2);

        //When
        CatHouse.remove(cat2);
        Cat actual = CatHouse.getCatById(1);

        //Then
        Assert.assertNull(actual);
    }

    @Test
    public void catRemove() {
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        CatHouse.clear();

        Cat cat1 = AnimalFactory.createCat(name, birthDate);
        CatHouse.add(cat1);
        Cat cat2 = AnimalFactory.createCat(name, birthDate);
        CatHouse.add(cat2);

        //When
        CatHouse.remove(1);
        Cat actual = CatHouse.getCatById(1);

        //Then
        Assert.assertNull(actual);

    }

    @Test
    public void getCatById() {
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        CatHouse.clear();

        Cat cat1 = AnimalFactory.createCat(name, birthDate);
        CatHouse.add(cat1);
        Cat cat2 = AnimalFactory.createCat(name, birthDate);
        CatHouse.add(cat2);

        //When

        Cat actual = CatHouse.getCatById(1);

        //Then
        Assert.assertEquals(actual, cat2);
    }

    @Test
    public void getNumberOfCats() {
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        CatHouse.clear();

        Cat cat1 = AnimalFactory.createCat(name, birthDate);
        CatHouse.add(cat1);
        Cat cat2 = AnimalFactory.createCat(name, birthDate);
        CatHouse.add(cat2);

        //When
        Integer actual = CatHouse.getNumberOfCats();


        //Then
        Assert.assertEquals(actual, (Integer) 2);
    }

    @Test
    public void clear() {
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        //when
        Cat cat1 = AnimalFactory.createCat(name, birthDate);
        CatHouse.add(cat1);
        Cat cat2 = AnimalFactory.createCat(name, birthDate);
        CatHouse.add(cat2);

        CatHouse.clear();

        Cat actual = CatHouse.getCatById(0);
        Cat actual2 = CatHouse.getCatById(1);

        //Then
        Assert.assertNull(actual);
        Assert.assertNull(actual2);
    }

}
