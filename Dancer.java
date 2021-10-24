public class Dancer extends Character{
  public void dance(){
    System.out.println(this.name + "は情熱的に踊った");;
  } 
  
  public abstract void attack(Mantago m){
    System.out.println(this.name + "の攻撃");
    System.out.println("的に3ポイントのダメージ");
   m.hp -=3;
   }
}   
