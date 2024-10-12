package ma.projet.entity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name = "produits")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String marque ;   
    @Column(name = "reference")
    private String ref ;   
    @Temporal(TemporalType.DATE)
    @Column(name = "date_achat")
    private Date date ;    
    private Double prix ;
    @Column(name = "designation")
    private String des ;
    public Produit() {
    }
    public Produit(String marque,String ref,Date date,Double prix,String des) {
        this.marque = marque;
        this.ref = ref;
        this.date = date;
        this.prix = prix;
        this.des = des;
    }  
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public String getRef() {
        return ref;
    }
    public void setRef(String ref) {
        this.ref = ref;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Double getPrix() {
        return prix;
    }
    public void setPrix(Double prix) {
        this.prix = prix;
    }
    public String getDes() {
        return des;
    }
    public void setDes(String des) {
        this.des = des;
    }
    @Override
    public String toString() {
    return "Id : "+getId()+"| La marque : "+getMarque()+"| Reference : "
            +getRef()+"| Date : "+getDate()+"| Prix : "+getPrix()+
            "| Designation : "+getDes();
    }
        
}
