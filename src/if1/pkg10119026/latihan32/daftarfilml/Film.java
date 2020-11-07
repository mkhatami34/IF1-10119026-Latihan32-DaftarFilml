/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119026.latihan32.daftarfilml;

/**
 *
 * @author Asus
 */
public class Film {
    public double rating;
    public int duration;
    public String name, genre;
    public void nowPlaying(){
         System.out.println("===Daftar Film Sedang Tayang===");
         System.out.println("Judul Film : " +name);
         System.out.println("Genre Film : " +genre);
         System.out.println("Rating Film : " +rating);
         System.out.println("Duration Film : " +duration);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Film movie = new Film();
       Film movie1 = new Film();
       Film movie2 = new Film();
       Film movie3 = new Film();
       
       movie.name = "Venom";
       movie.genre = "Action, Horror, Scifi";
       movie.rating = 8.5;
       movie.duration = 120;
       movie.nowPlaying();
       
       movie1.name = "Small Foot";
       movie1.genre = "Animation";
       movie1.rating = 9.0;
       movie1.duration = 96;
       movie1.nowPlaying();
       
       movie2.name = "Crazy Rich Asian";
       movie2.genre = "Comedy";
       movie2.rating = 7.8;
       movie2.duration = 119;
       movie2.nowPlaying();
       
       movie3.name = "Asih";
       movie3.genre = "Horror";
       movie3.rating = 6.0;
       movie3.duration = 100;
       movie3.nowPlaying();
    }
    
}
