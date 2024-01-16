
package game;


public class Game {
    
    
    public static void main(String[] args) {
        Player hero = new Player();
        Player enemy = new Player();
        
        hero.name = "Flash";
        hero.speed = 1000000000;
        hero.healthPoint = 100;
        hero.damage = 70;
        hero.armor = 50;
        
       
      

        
        enemy.name = "Joker";
        enemy.speed = 100;
        enemy.healthPoint = 100;
        enemy.damage = 90;
        enemy.armor = 40;
        
       
        
          if(hero.isDead()){
            System.out.println("Game Over :(");
          }
          
         enemy.run();
         hero.defend(enemy.name);
        }
        
    }
    

