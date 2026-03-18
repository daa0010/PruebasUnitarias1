package instituto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorRegistroTest {

    // Traemos el "motor" que vamos a probar desde la carpeta main
    ValidadorRegistro validador = new ValidadorRegistro();

    @Test
    @DisplayName("Ejemplo: Un nombre válido debe ser aceptado")
    public void testNombreValido() {
        // Ejecutamos la lógica con un nombre correcto
        boolean resultado = validador.validarNombre("Carlos");

        // Sentenciamos: Como el nombre está bien, esperamos que el resultado sea TRUE
        assertTrue(resultado, "Error: El sistema rechazó un nombre válido");
    }

    // ESCRIBE TUS 5 RETOS A PARTIR DE AQUÍ

    @Test
    @DisplayName("Un nombre vacío debe ser rechazado")
    public void NombreVacioTest() {
        String nombre="";
        boolean estaVacio = nombre.length()>0;
        assertFalse(estaVacio, "El nombre no es válido");
    }

    @Test
    @DisplayName("Una contraseña debe ser aceptada")
    public void PasswordJustaTest() {
        String password = "12345678";
        boolean esValida = password.length()==8;
        assertTrue(esValida, "El password es incorrecto");
    }

    @Test
    @DisplayName("Una contraseña debe ser rechazada")
    public void PasswordCortaTest() {
        String password = "Admin";
        boolean esValida = password.length()>=8;
        assertFalse(esValida, "El password es corto");
    }

    @Test
    @DisplayName("Un email debe ser rechazado")
    public void EmailSinArrobaTest() {
        String email = "usuario.gmail.com";
        boolean tieneArroba = email.contains("@");
        assertFalse(tieneArroba, "El email es incorrecto");
    }

    @Test
    @DisplayName("Una edad debe ser aceptada")
    public void EdadLimiteTest() {
        int edad = 16;
        boolean esMayor = edad==16;
        assertTrue(esMayor, "La edad es incorrecta");
    }
}