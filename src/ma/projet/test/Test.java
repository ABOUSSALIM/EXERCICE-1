
package ma.projet.test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import ma.projet.entity.Produit;
import ma.projet.service.ProduitService;

public class Test {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        ProduitService pds = new ProduitService();
        Date d1 = null ;
        Date d2 = null ;
        // Creation des produits
        pds.create(new Produit("Armani","EHDFHKS34",new Date(),2000.00, "adama"));
        pds.create(new Produit("H&M", "16SDF", new Date(), 1000.00, "adama"));
        pds.create(new Produit("Celio", "1S354DM", new Date(), 50.00, "adama"));
        pds.create(new Produit("Tommy", "HILF744", new Date(), 100.00, "adama"));
        pds.create(new Produit("Lacoste", "LAC31SDF", new Date(), 3000.00, "adama"));
        
        // Affichage des produits
        //1
        for(Produit p : pds.findAll())
            System.out.println("--> "+p);
        //2
        System.out.println(pds.findById(2));
        //Suppression
        pds.delete(pds.findById(3));
        
        //modification
         Produit pd = pds.findById(1);
         pd.setDate(new Date());
         pd.setDes("mamda");
         pd.setMarque("Nike");
         pd.setPrix(200.00);
         pd.setRef("HDOC23S");
         
         pds.update(pd);
        
         //Affichage conditionne
        //1
        for(Produit p : pds.findAll())
            if(p.getPrix()> 100)
            System.out.println("--> "+p);
        //2
        try{
            System.out.println(" entrer La date de debut dd-MM-yyyy :");
            String debut = scan.nextLine();
             d1 = sdf.parse(debut);
             System.out.println(" entrer La date de fin dd-MM-yyyy :");
              String fin = scan.nextLine();
             d2 = sdf.parse(fin);
          
        }catch(ParseException e){
            
            System.out.println(" Entrer format valide "+e.getMessage());
          
        }finally{
            scan.close();
        }
          //################################################################################# 
           for (Produit p : pds.findAll()) {
        if (p.getDate().compareTo(d1) >= 0 && p.getDate().compareTo(d2) <= 0) {
            System.out.println(" --> " + p);
        }
    }
//           #################################################################################
            
    }
    
    
    
}
