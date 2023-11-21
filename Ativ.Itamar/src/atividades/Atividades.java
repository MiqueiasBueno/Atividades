package atividades;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;



public class Atividades {
	
	
	 public static void main(String[] args) {
	        try (Scanner sc = new Scanner(System.in)) {
	            ArrayList<Integer> numbers = new ArrayList<>();
	            ArrayList<Integer> maiores = new ArrayList<>();
	            Integer[] n1 = new Integer[10];
	            String[] name = new String[5];
	            Integer media = 0;
	            int add = 0;
	            int cont = 0;
	            int i = 0;
	            int soma = 0;
	            int menor = Integer.MAX_VALUE;
	            int guardar = Integer.MIN_VALUE;
	            int n;
	            
	            //Atividade 1
	            for(n = 0; n != 10; n++ ){
	                System.out.print(n + " ");
	            }
	            
	            System.out.println("");
	            
	            //Atividade 2
	            for(n = 1; n != 20; n ++){
	                if(n%2 == 0){
	                    System.out.print(n + " ");
	                }
	            }

	            System.out.println("");
	            
	            //Atividade 3
	            for(n = 1; n <=50;n ++){
	                if ((n%2)==1)
	                System.out.println(n + "");
	            }
	            
	            System.out.println("");
	            
	            //Atividade 4
	            for(n = 0; n != 5; n++){
	                System.out.print("Informe 5 números: ");
	                n1[n] = sc.nextInt();
	            }
	            
	            Arrays.sort(n1);
	            
	            System.out.println("O maior número informado foi: " + n1[4]);
	            
	            System.out.println("");
	            
	            //Atividade 5
	            for(n = 0; n != 10; n++){
	                System.out.print("Informe 10 números: ");
	                n1[n] = sc.nextInt();
	                
	                media += n1[n];
	            }
	            
	            System.out.println("A média entre eles é: " + (media / 10));
	            
	            System.out.println("");
	            
	            //Atividade 7
	            soma = 0;
	            System.out.print("Deseja somar quantos números? ");
	            i = sc.nextInt();
	            
	            Integer[] n2 = new Integer[i];
	            for(n = 0; n != i; n ++ ){
	                System.out.print("Informe o" + (n + 1) + "º número: ");
	                n2[n] = sc.nextInt();
	                soma =+ n2[n];
	            }
	            
	            System.out.println("A soma entre todos os números informados é igual a: " + soma);
	            
	            System.out.println("");
	            
	            //Atividade 8
	            System.out.print("Informe um número inteiros: ");
	            i = sc.nextInt();
	            
	            System.out.print("Divisores de "+ i + ": ");
	            for(n = 1; n != i; n ++){
	                if(i % n == 0){
	                    System.out.print(n + " ");
	                }
	            }
	            
	            System.out.println("");
	            
	            //Atividade 9
	            while(true){
	                System.out.print("Informe números aleatórios (ou insira o número '0' para encerrar): ");
	                Integer number = sc.nextInt();
	                
	                cont ++;

	                if (number == 0) {
	                    break;
	                }
	                
	                numbers.add(number);
	            }
	            
	            System.out.println("Você digitou um total de " + cont + " números!");
	            
	            System.out.println("");
	            
	            //Atividade 10
	            cont = 0;
	            while(true){
	                System.out.print("Informe números aleatórios (caso informe um número repetido o programa ira encerrar): ");
	                Integer number = sc.nextInt();
	                
	                if (numbers.contains(number) == true) {
	                    break;
	                }
	                
	                numbers.add(number);
	                cont ++;
	            }
	            
	            System.out.println("Você digitou um total de " + cont + " números antes de digitar um número repetido!");
	            
	            System.out.println("");
	            
	            //Atividade 11
	            System.out.print("Digite 10 números. Após isso, o programa mostrará o menor. ");
	            for (n = 0; n < 10; n++) {
	            System.out.print((n + 1) + "° Numero = ");
	            n1[n] = sc.nextInt();
	            
	            if (n1[n] < menor) {
	                menor = n1[n];
	            }
	        }
	            System.out.println(menor + " é o menor número.");

	            System.out.println("");

	            //Atividade 12
	            cont = 0;
	            
	            while(true){
	                System.out.print("Digite números (ou um número negativo para encerrar!): ");
	                Integer number = sc.nextInt();
	                
	                if (number < 0) {
	                    break;
	                }
	                
	                media += number;
	                
	                numbers.add(number);
	                cont ++;
	            }
	            
	            System.out.println("A média entre os números digitados é " + (media / cont) + "!");
	            
	            System.out.println("");
	            
	            //Atividade 13
	            int somaPar = 0;
	            int somaImpar = 0;
	            
	            while(true){
	                System.out.print("Digite números aleatórios (ou o número '999' para encerrar!): ");
	                Integer number = sc.nextInt();
	                
	                if (number == 999) {
	                    break;
	                }
	                
	                if (number % 2 == 0) {
	                    somaPar += number;
	                }else if(number % 2 != 0){
	                    somaImpar += number;
	                }
	                
	                numbers.add(number);
	            }

	            System.out.println("A soma entre os números pares digitados é: " + somaPar + ". E a soma entre os números impares digitados é: " + somaImpar);

	            System.out.println("");
	            
	            //Atividade 14
	            System.out.println("Digite 5 nome : ");
	            
		        for (n = 0; n <= 4; n ++) {
	                System.out.println((n + 1) + "º = ");
			        name[n] = sc.nextLine();
		        }
		        Arrays.sort(name);
	            
		        System.out.print("Aqui estao os nome em Ordem alfabetica: ");
	            
		        for (n = 0 ; n  <= 4; n ++ ) {
	                System.out.print(name[n] + " ");
		        }
	            
	            System.out.println("");
	            
	            //Atividade 15
	            add = 0;
	            while(true){
	                System.out.print("Insira números aleatórios (caso seja maior que o anterior o programa ira encerrar): ");
	                Integer maior = sc.nextInt();
	    
	                maiores.add(maior);
	    
	               if(guardar < maiores.get(add)){
	                   break;
	                }
	                
	                guardar = maiores.get(0);
	                
	                add ++;
	            }
	            
	            System.out.println("Você digitou um número maior que o anterio!");
	            
	            System.out.println("");
	            
	            //Atividade 16
	            add = 0;
	            while(true){
	                System.out.print("Insira números aleatórios (caso seja igual ao primeiro número informado o programa ira encerrar): ");
	                Integer maior = sc.nextInt();
	                
	                maiores.add(maior);
	                
	               if(guardar == maiores.get(add)){
	                   break;
	                }
	                
	                guardar = maiores.get(0);
	                
	                add ++;
	            }
	            
	            System.out.println("O número informado é igual ao primeiro!");
	            
	            System.out.println("");
	            
	            //Atividade 17
	            int numero;
	            Boolean primo;
	            System.out.println("Digite números. Digite um número primo para encerrar.");
			
			    do {
				System.out.print("Digite um numero: ");
				numero = sc.nextInt();
				
				primo = verificar(numero);
				
				if(primo) {
	                numbers.add(numero);
				}else {
					System.out.println(numero + " É um numero primo. Programa encerrado." );
				}
			    }while(!primo);
	        
	            System.out.println("");
	            
	            //Atividade 18
	            add = 1;
	            while(true){
	                System.out.print("Insira números aleatórios (caso seja maior que o anterior o programa ira encerrar): ");
	                Integer maior = sc.nextInt();
	                
	                maiores.add(maior);

	                if(maiores.size() < 3){
	                    System.out.println("Ainda não tem números o suficiente!");
	                }else if(maiores.get(add) == maiores.get(add - 1) + maiores.get(add - 2)){
	                    break;
	                }
	                add ++;
	            }
	            
	            System.out.println("Você digitou um número equivalente a soma dos dois números anteriores!");
	            
	            System.out.println("");
	            
	            //Atividade 19
	            int posicao = 0;
	            soma = 0;
	            System.out.print("Deseja somar quantos números? ");
	            i = sc.nextInt();
	            
	            Integer[] n3 = new Integer[i];
	            for(n = 0; n != i; n ++ ){
	                System.out.print("Informe o" + (n + 1) + "º número: ");
	                n3[n] = sc.nextInt();
	            }
	            for (int x = 0; x < i;x++) {
	                System.out.println("Posição " + (x + 1 ) + "° = " );
	                n3[x] = sc.nextInt();
	            }
	            int maior = n3[0];
	            
	            for (int x = 1; x < i;x++) {
	                if(n3[x] > maior) {
	                    maior = n3[x];
	                    posicao ++;
	                }
	            }
	            System.out.println("O maior número é: " + maior);
	            System.out.println("Posição no array: " + posicao );
	            
	            System.out.println("");

	            //Atividade 20
	            posicao = 0;
	            soma = 0;
	            System.out.print("Deseja somar quantos números? ");
	            i = sc.nextInt();
	            
	            for(n = 0; n != i; n ++ ){
	                System.out.print("Informe o" + (n + 1) + "º número: ");
	                n3[n] = sc.nextInt();
	            }
	            for (int x = 0; x < i;x++) {
	                System.out.println("Posição " + (x + 1 ) + "° = " );
	                n3[x] = sc.nextInt();
	            }
	            menor = n3[0];
	            
	            for (int x = 1; x < i;x++) {
	                if(n3[x] < menor) {
	                    menor = n3[x];
	                    posicao ++;
	                }
	            }
	            System.out.println("O menor número é: " + menor);
	            System.out.println("Posição no array: " + posicao );
	            
	            System.out.println("");

	            //Atividade 21
	            for(n = 0; n != 5; n++){
	                System.out.print("Informe 5 números: ");
	                n1[n] = sc.nextInt();
	                
	                media += n1[n];
	            }

	            System.out.println("A média entre os números é " + (media / 5) + "!");

	            System.out.println("");

	            //Atividade 22
	            for(n = 0; n != 10; n++){
	                System.out.print("Informe 10 números: ");
	                n1[n] = sc.nextInt();
	            }

	            Arrays.sort(n1);

	            System.out.println("O segundo maior número do array é " + n1[8]);
	            
	            System.out.println("");
	            
	            //Atividade 23
	            ArrayList<String> nomes = new ArrayList<>();
	            
	            while(true){
	                System.out.print("Digite um nome (ou 'FIM' para encerrar): ");
	                String nome = sc.nextLine();
	                
	                if (nome.equalsIgnoreCase("FIM")) {
	                    break;
	                }

	                nomes.add(nome);
	            }
	            
	            System.out.println("\nNomes em ordem inversa:");
	            for(n = nomes.size() - 1; n >= 0; n--){
	                System.out.println(nomes.get(n));
	            }
	            
	            System.out.println("");

	            //Atividade 24
	            cont = 0;

	            while(true){
	                System.out.print("Digite números (ou um número negativo para encerrar!): ");
	                Integer number = sc.nextInt();
	                
	                if (number < 0) {
	                    break;
	                }
	                
	                media += number;
	                
	                numbers.add(number);
	                cont ++;
	            }

	            for(n = numbers.size() - 1; n >= 0; n--){

	                if(numbers.get(n)%2 == 0){
	                    add++;
	                }
	            }

	            System.out.println("A média entre os números digitados é " + (media / cont) + "! e um teve um total de " + add + " números pares!");

	            System.out.println("");
	            
	            //Atividade 25
	            soma = 0;
	            media = 0;
	            cont = 0;
	            while(true){
	                System.out.print("Digite números (Caso o número informado seja a média dos anteriores o programa ira encerrar!): ");
	                Integer number = sc.nextInt();

	                numbers.add(number);
	                
	                if (number == media) {
	                    break;
	                }
	                soma += number;
	                cont ++;
	                media = soma / cont;

	            }

	            System.out.println("O número informado foi igual a média dos números anteriores! ");
	            
	            System.out.println("");
	            
	            //Atividade 26
	            System.out.println("Informe abaixo quantos 'Anos, meses e dias' você tem!");

	            System.out.print("Quantos anos você tem? ");
	            Integer ano = sc.nextInt();
	            System.out.print("Quantos meses? ");
	            Integer meses = sc.nextInt();
	            System.out.print("Quantos dias? ");
	            Integer dias = sc.nextInt();
	            
	            int total = (ano * 365) + (meses * 30) + dias ;
	            
	            System.out.println("Você tem um total de " + total + " dias de vida!");
	            
	            System.out.println("");
	            
	            //Atividade 27
	            int media1 = 24 / 3;
	            int media2 = 15 / 3;
	            int media3 = (media1 + media2) / 2;

	            System.out.println("A média dos números 7, 8, 9 é " + media1);
	            System.out.println("A média dos números 4, 5, 6 é " + media2);
	            System.out.println("A soma entre as média é " + (media1 + media2));
	            System.out.println("E a média das médias é " + media3);

	            System.out.println("");
	            
	            //Atividade 28
	            System.out.print("Qual o valor do seu saldo? ");
	            Integer saldo = sc.nextInt();
	            
	            saldo = saldo + (saldo / 100);

	            System.out.println("Caso houvesse um reajuste de 1% o seu saldo ficaria " + saldo);

	            System.out.println("");
	            
	            //Atividade 29
	            System.out.print("Informe o valor da primeiro primeira peça: ");
	            Integer valor1 = sc.nextInt();
	            System.out.print("Informe a quantidade comprada: ");
	            Integer quant1 = sc.nextInt();
	            System.out.print("Informe o valor da segunda peça: ");
	            Integer valor2 = sc.nextInt();
	            System.out.print("Informe a quantidade comprada: ");
	            Integer quant2 = sc.nextInt();

	            int ipi = (valor1 * quant1 + valor2 * quant2) * 35 / 100;

	            System.out.println("Como o IPI tudo teria uma aumento de " +  ipi);
	            
	            System.out.println("");
	            
	            //Atividade 30
	            double salarioMinimo = 1500.0;

	            System.out.print("Insira o seu salário: ");
	            double salario = sc.nextDouble();

	            double quantidade = salario / salarioMinimo;

	            System.out.printf("A pessoa recebe %d salários minimos", Math.round(quantidade));
	            
	            System.out.println("");
	            
	            //Atividade 31
	            System.out.printf("Insira um valor para mostrar o seu antecessor e o seu sucessor: ");
	            n = sc.nextInt();
	            
	            System.out.println("Seu antecessor: " + (n-1));
	            System.out.println("Seu sucessor: " + (n+1));

	            System.out.println(""); 
	            
	            //Atividade 32
	            for(n = 1; n <= 10; n++) {
	                    for(i = 1; i <= 10; i ++) {
	                        System.out.println(n + " x " + i + " = " + n*i);
	                    }
	                }

	            System.out.println(""); 
	            
	            //Atividade 33
	            System.out.print("Insira o valor da venda: R$");
	            double venda = sc.nextDouble();
	            
	            System.out.print("Insira o valor da compra: R$");
	            double compra = sc.nextDouble();
	            
	            double troco = compra - venda;

	            if(troco > 0){
	               System.out.printf("O valor do troco é de: R$%.2f", troco); 
	            }
	            else {
	                System.out.println("Não tem troco");
	            }

	            System.out.println("");
	            
	            //Atividade 34
	            double valorBase = 1372.22;
	            
	            double valorIMCS = valorBase * 0.175;
	            double valorIPI = valorBase * 0.07;
	            double valorPIS = valorBase * 0.0375;
	            double valorCOFINS = valorBase * 0.04;
	            
	            double valorTotal = valorBase + valorIMCS + valorIPI + valorPIS + valorCOFINS;
	            
	            System.out.printf("Valor total da nota fiscal: R$%.2f%n", valorTotal);
	            System.out.printf("Valor do ICMS: R$%.2f%n", valorIMCS);
	            System.out.printf("Valor do IPI: R$%.2f%n", valorIPI);
	            System.out.printf("Valor do PIS: R$%.2f%n", valorPIS);
	            System.out.printf("Valor do COFINS: R$%.2f%n", valorCOFINS);
	            
	            System.out.println("");
	            
	            // Atividade 35
	            System.out.print("Insira o primeiro número binário: ");
	            String b1 = sc.nextLine();

	            System.out.print("Insira o segundo número binário: ");
	            String b2 = sc.nextLine();

	            int n1b1 = Integer.parseInt(b1, 2);
	            int n2b2 = Integer.parseInt(b2, 2);
	            
	            int sum = n1b1 + n2b2; 
	            System.out.println("A soma entre os dois valores é de: " + Integer.toBinaryString(sum));
	            
	            System.out.println("");
	            
	            //Atividade 36
	            System.out.print("Digite o primeiro número binário: ");
	            b1 = sc.nextLine();
	            
	            System.out.print("Digite o segundo número binário: ");
	            b2 = sc.nextLine(); 
	            
	            n1b1 = Integer.parseInt(b1, 2);
	            n2b2 = Integer.parseInt(b2, 2);
	            int product = n1b1 * n2b2;
	            System.out.println("O produto é: " + Integer.toBinaryString(product));
	            
	            System.out.println("");
	            
	            //Atividade 37
	            System.out.print("Digite um número decimal: ");
	            n = sc.nextInt();
	            
	            System.out.println("O número binário é: " + Integer.toBinaryString(n));
	            
	            System.out.println("");
	            
	            //Atividade 38
	            System.out.print("Digite um número decimal: ");
	            int numeroDecimal = sc.nextInt();
	            
	            String numeroHexadecimal = Integer.toHexString(numeroDecimal);
	            
	            System.out.println("O número hexadecimal correspondente é: " + numeroHexadecimal.toUpperCase());
	            
	            System.out.println("");
	            
	            //Atividade 39
	            System.out.print("Digite um número decimal: ");
	            numeroDecimal = sc.nextInt();

	            String numeroOctal = Integer.toOctalString(numeroDecimal);
	            
	            System.out.println("O número octal correspondente é: " + numeroOctal);
	            
	            System.out.println(" ");
	            
	            //Atividade 40
	            System.out.print("Digite um número binário: ");
	            String numeroBinario = sc.nextLine();
	            
	            numeroDecimal = Integer.parseInt(numeroBinario, 2);
	            
	            System.out.println("O número decimal correspondente é: " + numeroDecimal);
	            
	            System.out.println("");
	            
	            //Atividade 41
	            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	            LocalDateTime data = LocalDateTime.now();
	            
	            System.out.println("A data do sistema é: " + data.format(dtf));
	            
	            System.out.println("");
	            
	            //Atividade 42
	            int sorteio = (int) (Math.random() * 1001);
	            add = 0;
	            n = 0;

	            do {
	                System.out.print("Digite um número entre 0 e 1000: ");
	                n = sc.nextInt();
	                add++;

	                if (sorteio > n) {
	                    System.out.println("O número sorteado é maior!");
	                }
	                if (sorteio < n) {
	                    System.out.println("O número sorteado é menor!");
	                }
	            } while (sorteio != n);

	            System.out.println("Parabéns! você acertou, o número sorteado era: " + sorteio + " a quantidade de tentativas foi: " + add);

	            System.out.println("");

	            //Atividade 43
	            System.out.print("Insira o seu nome completo: ");
	            String nome = sc.nextLine();
	            
	            String[] divisao = nome.split(" ");
	            for (i = 0; i < divisao.length; i++) {
	                if (divisao[i].length() > 2) {
	                    System.out.print(divisao[i].toUpperCase().charAt(0) + ". ");
	                }
	                else {
	                    System.out.print(divisao[i] + " ");
	                }
	            }
	            
	            System.out.println("");
	            
	            //Atividade 44
	            System.out.print("Insira uma mensagem para criptografrar: ");
	            String msg = sc.nextLine().toLowerCase();

	            int k = 1;
	            
	            System.out.println(criptografar(msg, k));
	            
	        }
	    }
	    // Método para ver se o número é primo
	    private static boolean verificar(int numero) {
	        if (numero <= 1) {
	            return false;
	        }
	        for (int x = 2;x <=Math.sqrt(numero);x++) {
	            if (numero % x ==0){
	                return false;
	            }
	        }
	        return true;
	        }
	    // Método criptografia cifra de César
	    public static String criptografar(String msg, int k) {
	        String alfabeto = " abcdefghijklmnopqrstuvwxyz";
	        StringBuilder msgCriptografada = new StringBuilder();

	        for (char caractere : msg.toCharArray()) {
	            int posicaoOriginal = alfabeto.indexOf(caractere);
	            int posicaoCriptografada = posicaoOriginal + k;
	            char caractereCriptografado = alfabeto.charAt(posicaoCriptografada);
	            msgCriptografada.append(caractereCriptografado);
	        }
	        return msgCriptografada.toString();
	    }
}

	          