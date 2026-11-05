package org.zabalburu.ui;

import org.zabalburu.ichueca.terminalUtils.utils.TerminalANSI;
import org.zabalburu.ichueca.terminalUtils.utils.VisorImagenes;

import org.zabalburu.domine.Clientes;

public class Pantalla {

    private VisorImagenes visor;

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
            TerminalANSI.RESET
        );
    }

}
