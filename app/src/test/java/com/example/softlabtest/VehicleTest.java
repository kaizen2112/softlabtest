package com.example.softlabtest;

import static org.junit.Assert.*;

import junit.framework.TestCase;

import org.junit.Test;

public class VehicleTest extends TestCase {
    @Test
    public void testsedan() {
        Sedan c = new Sedan(4, 100, 400);
        assertEquals(4, c.wheels(), 0.01);
        assertEquals(100, c.fuel(), 0.01);
        assertEquals(400, c.milage(), 0.01);


    }

    @Test
    public void testmotorcyle() {
        Motorcycle m = new Motorcycle(2, 100.5, 200);
        assertEquals(2, m.wheels(), 0.01);
        assertEquals(100.5, m.fuel(), 0.01);
        assertEquals(200, m.milage(), 0.01);


    }

    @Test
    public void testsuv() {
        SUV c = new SUV(4, 100, 400);
        assertEquals(4, c.wheels(), 0.01);
        assertEquals(100, c.fuel(), 0.01);
        assertEquals(400, c.milage(), 0.01);


    }

}