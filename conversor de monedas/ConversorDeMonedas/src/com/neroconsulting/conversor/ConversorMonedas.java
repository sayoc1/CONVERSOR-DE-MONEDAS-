package com.neroconsulting.conversor;

import java.util.Scanner;

public class ConversorMonedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tasas de cambio (ejemplos)
        double tasaDolarAPesoArgentino = 350.0; // 1 USD a ARS
        double tasaPesoArgentinoADolar = 1 / tasaDolarAPesoArgentino;

        double tasaDolarARealBrasileño = 5.0; // 1 USD a BRL
        double tasaRealBrasileñoADolar = 1 / tasaDolarARealBrasileño;

        double tasaDolarAPesoColombiano = 4000.0; // 1 USD a COP
        double tasaPesoColombianoADolar = 1 / tasaDolarAPesoColombiano;

        // Mensaje de bienvenida
        System.out.println("****************************************");
        System.out.println("*    ¡Bienvenido al Conversor de Monedas!   *");
        System.out.println("****************************************");
        System.out.println("Seleccione la conversión que desea realizar:");
        System.out.println("1. Dólar a Peso Argentino");
        System.out.println("2. Peso Argentino a Dólar");
        System.out.println("3. Dólar a Real Brasileño");
        System.out.println("4. Real Brasileño a Dólar");
        System.out.println("5. Dólar a Peso Colombiano");
        System.out.println("6. Peso Colombiano a Dólar");
        System.out.print("Por favor, ingrese su opción (1-6): ");

        int opcion = scanner.nextInt();
        double cantidad, resultado;

        switch (opcion) {
            case 1:
                System.out.print("Ingrese la cantidad en Dólares: ");
                cantidad = scanner.nextDouble();
                resultado = cantidad * tasaDolarAPesoArgentino;
                System.out.printf("✨ %.2f Dólares son %.2f Pesos Argentinos ✨%n", cantidad, resultado);
                break;

            case 2:
                System.out.print("Ingrese la cantidad en Pesos Argentinos: ");
                cantidad = scanner.nextDouble();
                resultado = cantidad * tasaPesoArgentinoADolar;
                System.out.printf("💵 %.2f Pesos Argentinos son %.2f Dólares 💵%n", cantidad, resultado);
                break;

            case 3:
                System.out.print("Ingrese la cantidad en Dólares: ");
                cantidad = scanner.nextDouble();
                resultado = cantidad * tasaDolarARealBrasileño;
                System.out.printf("🇧🇷 %.2f Dólares son %.2f Reales Brasileños 🇧🇷%n", cantidad, resultado);
                break;

            case 4:
                System.out.print("Ingrese la cantidad en Reales Brasileños: ");
                cantidad = scanner.nextDouble();
                resultado = cantidad * tasaRealBrasileñoADolar;
                System.out.printf("💰 %.2f Reales Brasileños son %.2f Dólares 💰%n", cantidad, resultado);
                break;

            case 5:
                System.out.print("Ingrese la cantidad en Dólares: ");
                cantidad = scanner.nextDouble();
                resultado = cantidad * tasaDolarAPesoColombiano;
                System.out.printf("🇨🇴 %.2f Dólares son %.2f Pesos Colombianos 🇨🇴%n", cantidad, resultado);
                break;

            case 6:
                System.out.print("Ingrese la cantidad en Pesos Colombianos: ");
                cantidad = scanner.nextDouble();
                resultado = cantidad * tasaPesoColombianoADolar;
                System.out.printf("💸 %.2f Pesos Colombianos son %.2f Dólares 💸%n", cantidad, resultado);
                break;

            default:
                System.out.println("🚫 Opción no válida. Por favor, inténtelo de nuevo. 🚫");
                break;
        }

        // Mensaje de despedida
        System.out.println("****************************************");
        System.out.println("*   ¡Gracias por usar el conversor!   *");
        System.out.println("****************************************");

        scanner.close();
    }
}


