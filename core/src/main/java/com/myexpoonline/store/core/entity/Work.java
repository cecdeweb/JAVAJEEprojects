/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myexpoonline.store.core.entity;

/**
 *
 * @author CECILE
 */
public class Work {
    
    public static int lastId;// lastId appartient à la classe
    // il n'appartient pas aux objets que je vais créer à partir de la classe
    
    // il n'appartient pas aux objets que je vais créer à partir de la classe
    // a chaque création objet ba j'ai lastId +1
    // -> ca me permet d'avoir un suivi des id créé
    // a chaque fois qu'on va créer une oeuvre ba lastId va être incrémenter de 1
    // du coup je pourrai le récupérer pour savoir l'id que je dois setter pour mon nouvel objet

    
    private int id;
    private String title;
    private Author author;
    private int year;
    private String style;
    private String description;
    
    public Work(){
        
    }
    
    public Work(String title){
        this.title = title;
        lastId++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
