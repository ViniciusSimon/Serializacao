package br.com.fiap.teste;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.fiap.bean.Cliente;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException {
		
		Cliente cliente = new Cliente(1, "Simon");
		
		FileOutputStream output = new FileOutputStream("objeto.txt");
		
		ObjectOutputStream out = new ObjectOutputStream(output);
		
		out.writeObject(cliente);
		
		out.close();
	}
}
