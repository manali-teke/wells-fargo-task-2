package  com.wellsfargo.counselor.entity;
import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Security{
    @Id
    @GeneratedValue
    private long securityId;

    @ManyToOne
    @JoinColumn(name="portfolioId")
    private Portfolio Portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private float purchasePrice;

    @Column(nullable = false)
    private Date purchaseDate;

    @Column(nullable = false)
    private int quantity;

    protected Security(){}

    public Security(long securityId, String name, String category, float purchasePrice, Date purchaseDate, int quantity, Portfolio Portfolio){
        this.securityId = securityId;
        this.category = category;
        this.name  = name;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.Portfolio =Portfolio;
    }

    public long getSecurityId(){
        return securityId;
    }

    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category=category;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public float getPurchasePrice(){
        return purchasePrice;
    }

    public void setPurchasePrice(float purchasePrice){
        this.purchasePrice = purchasePrice;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate){
        this.purchaseDate = purchaseDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public com.wellsfargo.counselor.entity.Portfolio getPortfolio() {
        return Portfolio;
    }

    public void setPortfolio(com.wellsfargo.counselor.entity.Portfolio portfolio) {
        Portfolio = portfolio;
    }
}