
public class Main {

	public static void main(String[] args) throws Exception {
		Noeud noeud = new Noeud("+", new Noeud("3"), new Noeud("5"));
		System.out.println(noeud.show());
	}

}
