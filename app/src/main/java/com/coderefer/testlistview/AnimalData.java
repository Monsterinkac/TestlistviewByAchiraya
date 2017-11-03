package com.coderefer.testlistview;

import com.coderefer.testlistview.animal.Animal;

import java.util.ArrayList;

/**
 * Created by User on 29/10/2560.
 */

public class AnimalData {
    private static AnimalData sInstance;
    public ArrayList<Animal> animalList;
    public static AnimalData getsInstance() {

        if(sInstance == null) {
            sInstance = new AnimalData();
        }
        return sInstance;
    }
}
