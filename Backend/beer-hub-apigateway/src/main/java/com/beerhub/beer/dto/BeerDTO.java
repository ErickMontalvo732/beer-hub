package com.beerhub.beer.dto;

public class BeerDTO {

    private Long id;
    private String name;
    private String type;
    private double alcoholContent;


    public BeerDTO() {
    }

    public BeerDTO(Long id, String name, String type, double alcoholContent) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.alcoholContent = alcoholContent;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAlcoholContent() {
        return alcoholContent;
    }

    public void setAlcoholContent(double alcoholContent) {
        this.alcoholContent = alcoholContent;
    }

}
