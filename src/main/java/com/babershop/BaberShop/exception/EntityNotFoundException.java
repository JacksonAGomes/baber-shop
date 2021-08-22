package com.babershop.BaberShop.exception;

public class EntityNotFoundException extends RuntimeException{


    public EntityNotFoundException(){
        super("Entity Not Found");
    }
}
