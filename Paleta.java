import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Generic class to represent a palette
class Palette<T> {
     private String flavor;
     private double price;
     private T specificType;

     public Palette(String flavor, double price, TspecificType) {
         this.flavor = flavor;
         this.price = price;
         this.specificType = specificType;
     }

     public String getFlavor() {
         return flavor;
     }

     public double getPrice() {
         return price;
     }

     public T getSpecificType() {
         return specificType;
     }

     public void showInformation() {
         System.out.println("Flavor: " + flavor);
         System.out.println("Price: $" + price);
         System.out.println("SpecificType: " + specificType);
     }
}

// Specific class for a type of palette
class StrawberryPalette {
     // Defines specific properties for a strawberry popsicle
}

public class Main {
     public static void main(String[] args) {
         List<Palette<StrawberryPalette>> palettes = new ArrayList<>();

         // Add palettes to the collection
         palettes.add(new Palette<>("Strawberry", 1.5, new StrawberryPalette()));
         palettes.add(new Palette<>("Strawberry with Cream", 2.0, new PaletteStrawberry()));

         // Use an iterator to loop through and display palette information
         Iterator<Palette<StrawberryPalette>> iterator = palettes.iterator();
         while (iterator.hasNext()) {
             Palette<StrawberryPalette> palette = iterator.next();
             palette.showInformation();
         }
     }
}
