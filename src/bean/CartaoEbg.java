package bean;
// Generated 01/12/2023 16:33:26 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CartaoEbg generated by hbm2java
 */
@Entity
@Table(name="cartao_ebg"
    ,catalog="db_estefani_gimenez"
)
public class CartaoEbg  implements java.io.Serializable {


     private int idcartaoEbg;
     private String nomecompletoEbg;
     private String cpfEbg;
     private String numerocartaoEbg;
     private int cscEbg;
     private Date validadeEbg;

    public CartaoEbg() {
    }

    public CartaoEbg(int idcartaoEbg, String nomecompletoEbg, String cpfEbg, String numerocartaoEbg, int cscEbg, Date validadeEbg) {
       this.idcartaoEbg = idcartaoEbg;
       this.nomecompletoEbg = nomecompletoEbg;
       this.cpfEbg = cpfEbg;
       this.numerocartaoEbg = numerocartaoEbg;
       this.cscEbg = cscEbg;
       this.validadeEbg = validadeEbg;
    }
   
     @Id 

    
    @Column(name="idcartao_ebg", unique=true, nullable=false)
    public int getIdcartaoEbg() {
        return this.idcartaoEbg;
    }
    
    public void setIdcartaoEbg(int idcartaoEbg) {
        this.idcartaoEbg = idcartaoEbg;
    }

    
    @Column(name="nomecompleto_ebg", nullable=false, length=80)
    public String getNomecompletoEbg() {
        return this.nomecompletoEbg;
    }
    
    public void setNomecompletoEbg(String nomecompletoEbg) {
        this.nomecompletoEbg = nomecompletoEbg;
    }

    
    @Column(name="cpf_ebg", nullable=false, length=80)
    public String getCpfEbg() {
        return this.cpfEbg;
    }
    
    public void setCpfEbg(String cpfEbg) {
        this.cpfEbg = cpfEbg;
    }

    
    @Column(name="numerocartao_ebg", nullable=false, length=80)
    public String getNumerocartaoEbg() {
        return this.numerocartaoEbg;
    }
    
    public void setNumerocartaoEbg(String numerocartaoEbg) {
        this.numerocartaoEbg = numerocartaoEbg;
    }

    
    @Column(name="csc_ebg", nullable=false)
    public int getCscEbg() {
        return this.cscEbg;
    }
    
    public void setCscEbg(int cscEbg) {
        this.cscEbg = cscEbg;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="validade_ebg", nullable=false, length=10)
    public Date getValidadeEbg() {
        return this.validadeEbg;
    }
    
    public void setValidadeEbg(Date validadeEbg) {
        this.validadeEbg = validadeEbg;
    }




}


