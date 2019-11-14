package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
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
        //Given
        Date birthdate = new Date();
        Cat cat = new Cat("Zula", birthdate, 10 );
        CatHouse catHouse = new CatHouse();

        //When
        CatHouse.add(cat);
        Cat actual = CatHouse.getCatById(10);

        //Then
        Assert.assertEquals(actual, cat);
    }

    @Test
    public void remove() {
        //Given
        Date birthdate = new Date();
        Cat cat = new Cat("Zula", birthdate, 10 );
        Cat cat2 = new Cat("Asami", birthdate, 101);
        CatHouse catHouse = new CatHouse();

        //When
        CatHouse.add(cat);
        CatHouse.add(cat2);
        CatHouse.remove(101);
        Cat actual = CatHouse.getCatById(101);

        //Then
        Assert.assertNull(actual);
    }

    @Test
    public void catRemove() {
        //Given
        Date birthdate = new Date();
        Cat cat = new Cat("Zula", birthdate, 10 );
        Cat cat2 = new Cat("Asami", birthdate, 101);
        CatHouse catHouse = new CatHouse();

        //When
        CatHouse.add(cat);
        CatHouse.add(cat2);
        CatHouse.remove(cat2);
        Cat actual = CatHouse.getCatById(101);

        //Then
        Assert.assertNull(actual);

    }

    @Test
    public void getCatById() {
        //Given
        Date birthdate = new Date();
        Cat cat = new Cat("Zula", birthdate, 10 );
        Cat cat2 = new Cat("Asami", birthdate, 101);
        CatHouse catHouse = new CatHouse();

        //When
        CatHouse.add(cat2);
        Cat actual = CatHouse.getCatById(101);

        //Then
        Assert.assertEquals(actual, cat2);
    }

    @Test
    public void getNumberOfCats() {
        //Given
        Date birthdate = new Date();
        Cat cat = new Cat("Zula", birthdate, 10 );
        Cat cat2 = new Cat("Asami", birthdate, 101);
        CatHouse catHouse = new CatHouse();

        //When
        CatHouse.add(cat);
        CatHouse.add(cat2);

        Integer actual = CatHouse.getNumberOfCats();

        //Then
        Assert.assertEquals(actual, (Integer) 2);
    }

    @Test
    public void clear() {
        //Given
        Date birthdate = new Date();
        Cat cat = new Cat("Zula", birthdate, 10 );
        Cat cat2 = new Cat("Asami", birthdate, 101);
        CatHouse catHouse = new CatHouse();

        //When
        CatHouse.add(cat);
        CatHouse.add(cat2);
        CatHouse.clear();

        Cat actual = CatHouse.getCatById(10);
        Cat actual2 = CatHouse.getCatById(101);

        //Then
        Assert.assertNull(actual);
        Assert.assertNull(actual2);
    }

}
