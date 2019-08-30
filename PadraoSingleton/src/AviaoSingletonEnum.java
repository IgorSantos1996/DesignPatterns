import java.util.HashSet;
import java.util.Set;

public enum AviaoSingletonEnum
{
    INSTANCE;
    private Set<String> assentosDisponiveis;

    private AviaoSingletonEnum() {
        this.assentosDisponiveis = new HashSet<>();
        assentosDisponiveis.add("1A");
        assentosDisponiveis.add("1B");
    }
    public boolean bookAssento (String assento){
        return assentosDisponiveis.remove(assento);
    }
    public static void agendarAssento (String assento){
    AviaoSingleton a =  AviaoSingleton.getINSTANCE();
    System.out.println(a.bookAssento(assento));

    }
}
