package kadai3;
public interface Human extends Creature {//インターフェースがインターフェースを継承する時はextends
    void talk();
    void watch();
    void hear();
    //Creatureインターフェースからrun()を継承する
}
