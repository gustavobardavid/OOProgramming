package tests;

import java.time.LocalDate;
import java.util.Scanner;


import models.ContaCorrente;
import models.Endereco;
import models.PessoaFisica;


public class ContaTest {
	
	public static void main(String[] args) {
		Endereco e = new Endereco("rua do morto", 123, "cajazeiras");
		PessoaFisica pf = new PessoaFisica(1000, e, "098282321", "Gusta", LocalDate.of(2000, 2, 10));
		ContaCorrente cc = new ContaCorrente("111-1", 23430, (double) 100, LocalDate.of(2023,9,29), pf, (double)10 );
	    Scanner scanner = new Scanner(System.in);
	    int opcao;
	        do {
	            System.out.println("1 - Aplicar Taxa\n" +
	                    "2- Ver Saldo \n" +
	            		"3 - Ver Limite \n " +
	                    "0- Sair");
	            opcao = Integer.parseInt(scanner.nextLine());
	            switch (opcao) {
	                case 1:
	                	cc.aplicarTx();
	                    break;
	                case 2:
	                	System.out.println(cc.getSaldo());
	                    break;
	                case 3: 
	                	System.out.println(pf.getLimiteCredito());
	                	break;
	            
	                case 0:
	                    System.out.println("Saindo...");
	                    break;
	                default:
	                    break;
	            }

	        } while(opcao != 0);
	        scanner.close();
	    }
	}

