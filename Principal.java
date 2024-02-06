import java.util.Date;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		System.out.println("Hola mundo!!");

		Date fecha = new Date();
		System.out.println(fecha);


		Usuario[] usuarios = crearUsuarios(3);
		System.out.println();
		mostrarUsuarios(usuarios);

	}

	public static Usuario[] crearUsuarios(int cantidad) {
		Usuario[] usuarios = new Usuario[cantidad];

		for (int i = 0; i < usuarios.length; i++) {
			Usuario actual = new Usuario();
			System.out.println("USUARIO "  + (i + 1) + "\n-------------------------");
			actual.nombre = pedirTexto("Nombre: ");
			actual.apellidos = pedirTexto("Apellidos: ");
			actual.email = pedirTexto("Email: ");
			usuarios[i] = actual;
			System.out.println();
		}

		return usuarios;
	}

	public static void mostrarUsuarios(Usuario[] usuarios) {
		//System.out.println("USUARIO "  + (i + 1) + "\n-------------------------");
		System.out.println("USUARIOS" + "\n-------------------------");
		for (int i = 0; i < usuarios.length; i++) {
			System.out.println("Nombre: " + usuarios[i].nombre);
			System.out.println("Apellidos: " + usuarios[i].apellidos);
			System.out.println("Email: " + usuarios[i].email);
			System.out.println();
		}
	}

	private static String pedirTexto(String sentence) {
		Scanner kb = new Scanner(System.in);
		System.out.print(sentence);
		return kb.nextLine().trim();
	}
}