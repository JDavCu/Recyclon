package org.zabalburu.ui;

import org.zabalburu.ichueca.terminalUtils.utils.TerminalANSI;
import org.zabalburu.ichueca.terminalUtils.utils.VisorImagenes;

import org.zabalburu.domine.Clientes;

public class PantallaNuevoCliente {

    private VisorImagenes visor;

    public PantallaNuevoCliente() {
        this.visor = new VisorImagenes();
        visor.establecerTamaño(36, 16);
        
    }

    private void escribir(int fila, int columna, String texto) {
        System.out.println(
                TerminalANSI.goTo(fila, columna) + texto);
    }

    private void dibujarMarco() {
        escribir(
                3,
                3,
                TerminalANSI.CYAN +
                        "┌" + "─".repeat(86) + "┐" +
                        TerminalANSI.RESET);
        for (int fila = 4; fila < 24; fila++) {
            escribir(
                    fila,
                    3,
                    TerminalANSI.CYAN +
                            "│" +
                            TerminalANSI.RESET);
            escribir(
                    fila,
                    90,
                    TerminalANSI.CYAN +
                            "│" +
                            TerminalANSI.RESET);
        }
        escribir(
                24,
                3,
                TerminalANSI.CYAN +
                        "└" + "─".repeat(86) + "┘" +
                        TerminalANSI.RESET);

    }

    public void mostrarNuevoCliente(Clientes clientes) {

        
        System.out.println(
            TerminalANSI.RESET +
            TerminalANSI.CLEAR_SCREEN +
            TerminalANSI.GO_HOME);
            escribir(
                7,
                40,
                TerminalANSI.BOLD + TerminalANSI.CYAN + "Nuevo Cliente" + TerminalANSI.RESET);
                
                dibujarMarco();
        
                System.out.flush();
                visor.mostrar("imagenespro/cliente.png");
            }

    public static void main(String[] args) {
        PantallaNuevoCliente tj = new PantallaNuevoCliente();
        tj.mostrarNuevoCliente(null);

    }
}
