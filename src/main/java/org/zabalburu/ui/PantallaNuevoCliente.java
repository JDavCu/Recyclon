package org.zabalburu.ui;

import org.zabalburu.ichueca.terminalUtils.utils.TerminalANSI;
import org.zabalburu.ichueca.terminalUtils.utils.VisorImagenes;

import org.zabalburu.domine.Clientes;

public class PantallaNuevoCliente {

    private VisorImagenes visor;

    public PantallaNuevoCliente() {
        this.visor = new VisorImagenes();
        visor.establecerTamaño(32, 16);
        visor.alinearIzquierda();
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
                        "┌" + "─".repeat(60) + "┐" +
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
                    64,
                    TerminalANSI.CYAN +
                            "│" +
                            TerminalANSI.RESET);

        }

        escribir(
                24,
                3,
                TerminalANSI.CYAN +
                        "└" + "─".repeat(60) + "┘" +
                        TerminalANSI.RESET);
    }

    public void mostrarNuevoCliente(Clientes clientes) {
        
        dibujarMarco();
        
        System.out.println(
                TerminalANSI.RESET +
                        TerminalANSI.CLEAR_SCREEN +
                        TerminalANSI.GO_HOME);
        escribir(
                7,
                27,
                TerminalANSI.BOLD + TerminalANSI.CYAN + "Nuevo Cliente" + TerminalANSI.RESET);

    }

    public static void main(String[] args) {
        PantallaNuevoCliente tj = new PantallaNuevoCliente();
        tj.mostrarNuevoCliente(null);

    }
}
