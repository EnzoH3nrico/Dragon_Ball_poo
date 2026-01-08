public class Humano extends DragonBall{
    public void kuririn(){
        setNome("Kuririn");
        setIdade(42);
        setVivo(true);
        setRaca("Humano");

        System.out.println(getNome());
        System.out.println(getIdade());
        if(getVivo()){
            System.out.println("Vivo");
        }
        System.out.println(getRaca());

    }

    @Override
    public void ataquebase(){
        System.out.println("Sei atirar uma bola de KI imperceptível, um tipo de ataque surpresa");
    }
}