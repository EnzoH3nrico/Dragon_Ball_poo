public class Saiyajin extends DragonBall{
    public void goku(){
        setNome("Goku");
        setIdade(49);
        setVivo(true);
        setRaca("Saiyajin");

        System.out.println(getNome());
        System.out.println(getIdade());
        if(getVivo()){
            System.out.println("Vivo");
        }
        System.out.println(getRaca());
    }
}