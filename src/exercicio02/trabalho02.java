package exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class trabalho02 {
	
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			sc.useLocale(Locale.ENGLISH);
			Locale.setDefault(new Locale("en", "US"));

			int n, i, j, a, b,vet3[];
			String vet1[], vet2[];
			double  vet4[], vet5[], matriz[][];
			//entrada//
			System.out.println("Quantos clientes?");
			n = sc.nextInt();

			vet1 = new String[n];
			vet2 = new String[n];
			vet3 = new int[n];
			vet4 = new double[n];
			vet5 = new double[n];

			for (i = 0; i < n; i++) {
				System.out.println("Nome: ");
				sc.nextLine();
				vet1[i] = sc.nextLine();
				System.out.println("Telefone: ");
				vet2[i] = sc.nextLine();
				
				
				System.out.println("Minutos: ");
				vet4[i] = sc.nextDouble();
				
				System.out.println("Tipo: ");
				vet3[i] = sc.nextInt();
				while (vet3[i] !=0 && vet3[i] !=1 && vet3[i] !=2){
				    System.out.println("Digite novamente (0, 1 ou 2)!");
				    }
			}
			

			a = 3;
			b = 2;
			
			matriz = new double [a][b];
			System.out.println("Digite os valores da matriz:");
				for (i = 0; i < a; i++) {
					for (j = 0; j < b; j++) {
						matriz[i][j] = sc.nextDouble();
						}
				}

				//calculos//
				 
				for (i=0;i<n;i++){
				        
				        if (vet4[i]<=90 && vet3[i]==0){
				        vet5[i] = matriz[0][0];
				        }
				        if (vet4[i]>90){
				            vet5[i] = matriz[0][0]+((vet4[i]-90)*matriz[1][0]);
				        }
				        if (vet4[i]<=90 && vet3[i]==1){
				        vet5[i] = matriz[1][0];
				        }
				        if (vet4[i]>90){
				            vet5[i] = matriz[1][0]+((vet4[i]-90)*matriz[1][1]);
				        }
				        if (vet4[i]<=90 && vet3[i]==2){
				        vet5[i] = matriz[2][0];
				        }
				        if (vet4[i]>90){
				            vet5[i] = matriz[2][0]+((vet4[i]-90)*matriz[2][1]);
				        }
				}
				        
				
				//saida//
				System.out.print("Nome: \t\t Telefone: \t\t Tipo: \t Minutos: \t Valor da conta:\n");
				for (i=0;i<n;i++){
					System.out.print(vet1[i]+"\t\t" +vet2[i]+ "\t\t\t" +vet3[i]+ "\t" +vet4[i]+ "\t\t" +vet5[i]+"\n");
					
				}
				
				//soma valores//
				double soma=0.0;
				System.out.println("\nA soma das contas é:");
				for (i=0;i<n;i++){
					soma = soma + vet5[i];
				}
				System.out.println(soma);
				
				//media minutos//
				double mediam=0;
				double soma2=0;
				int cont=0;
				System.out.println("\nMédia de minutos consumidos por clientes de conta tipo 1:");
				for (i=0;i<n;i++){
					if (vet3[i]==1){
						soma2 = soma2 + vet4[i];
					    cont++;
					}
					
				}
					mediam = soma2/cont;
				System.out.println(+mediam);
				
				//clientes sem minutos excedentes//
				System.out.println("\nclientes que não consumiram minutos excedentes:");
				for (i=0;i<n;i++){
					if (vet4[i] <= 90) {
						System.out.println(vet1[i]+"\t\t\t"+vet2[i]+"\n");
					}
					
				}
					
				
				//quantidade de clientes excedentes//
				System.out.println("\nA quantidade de clientes excedentes é:");
				int contclientex=0;
				for (i=0;i<n;i++) {
					if (vet4[i]>90) {
						contclientex++;	
					}
				}
				System.out.println(+contclientex);
				
				//porcentagem de clientes tipo 2//
				System.out.println("\nA porcentagem de clientes que possuem conta tipo 2, em relação ao total de clientes é:");
				double porcent=0.0;
				int cont2=0;
				for (i=0;i<n;i++) {
					if (vet3[i]==2){
					    cont2++;
							
					}
				}
				porcent = (100.0/n)*cont2;
				System.out.println(+porcent);
				
				
			}
				
			}




