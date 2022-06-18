package exceptionhandling;

public abstract class Character {
    private int defense;
    private int attack;
    private int HP;
    
    Character(int defense,int attack,int HP){
        this.defense = defense;
        this.attack = attack;
        this.HP = HP;
    }
    public abstract boolean attack();
    
    public void Damage(int damage){
        if(damage > defense){
            this.HP = (HP + defense) - damage;
        if(this.HP <= 0){
            HP = 0;
            }    
        }
    }
    public void info(){
        System.out.println("============== STATUS ==============" + 
                            "\nROLE\t\t: " + getClass().getSimpleName() + 
                            "\nHP\t\t: " + getHp() + 
                            "\nATTACK\t\t: " + getAttack() + 
                            "\nDEFENSE\t\t: " + getDefense());
    }
    public int getDefense(){
        return this.defense;
    }
    public void setDefense(int defense){
        System.out.println(this.defense);
    }
    
    public int getAttack(){
        return this.attack;
    }
    public void setAttack(int attack){
       System.out.println(this.attack);
    }
    
    public int getHp(){
        return this.HP;
    }
    public void setHp(int HP){
        System.out.println(this.HP);
    }
    
}