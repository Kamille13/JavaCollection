import java.util.ArrayList;
import java.util.Collections;

public class Hero{

    public static void main(String[] args){

        Heroes hero1 = new Heroes("Black Widow",34);
        Heroes hero2 = new Heroes("Captain America",100);
        Heroes hero3 = new Heroes("Vision",3);
        Heroes hero4 = new Heroes("Iron Man",48);
        Heroes hero5 = new Heroes("Scarlet Witch",29);
        Heroes hero6 = new Heroes("Thor",1500);
        Heroes hero7 = new Heroes("Spider Man",18);
        Heroes hero8 = new Heroes("Hulk",49);
        Heroes hero9 = new Heroes("Doctor Strange",42);

        ArrayList<Heroes> hero = new ArrayList<>();
        hero.add(hero1);       // index 0
        hero.add(hero2);
        hero.add(hero3);
        hero.add(hero4);
        hero.add(hero5);
        hero.add(hero6);
        hero.add(hero7);
        hero.add(hero8);
        hero.add(hero9);

        hero.remove(0);
        hero.remove(1);
        hero.remove(2);
        hero.remove(3);
        hero.remove(4);

        //list<Heroes>subheroes = hero.subList(0,5);
        //supression d'une partie de la liste

        hero6.setAge(1501);

        Collections.shuffle(hero);

        for(Heroes heroes : hero){
            System.out.println(heroes.getName());
        }
    }
}