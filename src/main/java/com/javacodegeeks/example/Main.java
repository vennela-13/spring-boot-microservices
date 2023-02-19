package com.javacodegeeks.example;

import com.javacodegeeks.example.registration.EurekaServer;
import com.javacodegeeks.example.rest.addition.AdditionServer;
import com.javacodegeeks.example.rest.subtraction.SubtractionServer;
import com.javacodegeeks.example.web.WebServer;

import java.util.function.Consumer;

public class Main {
	public static void main(String[] args, Consumer<String> consumer) {

		String serverName = "";

		switch (args.length) {
			case 2:
				System.setProperty("server.port", args[1]);
			case 1:
				serverName = args[0].toLowerCase();
				break;

			default:
				return;
		}

		consumer.accept(serverName);


	}
}
