package  com.wellsfargo.counselor.entity;
import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Portfolio{
    @Id
    @GeneratedValue
    private long portfolioId;

    @ManyToOne
    @JoinColumn(name = "clientId")
    private Client Client;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Portfolio")

    @Column(nullable = false)
    private Date creationDate;

    protected Portfolio(){
    }

    public Portfolio(long portfolioId, Date creationDate, Client Client){
        this.portfolioId = portfolioId;
        this.Client =Client;
        this.creationDate = creationDate;
    }

    public Client getClient() {
        return Client;
    }

    public void setClient(Client Client){
        this.Client = Client;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public long getPortfolioId() {
        return portfolioId;
    }
}