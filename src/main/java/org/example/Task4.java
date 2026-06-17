package org.example;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Task4 {
    public static void task4() {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://httpbin.org/ip")).GET().build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                String body = response.body();

                // JSON - { "origin": "xxx.xxx.xxx.xxx" }
                String ip = body.split(":")[1]
                        .replace("\"", "")
                        .replace("}", "")
                        .trim();

                System.out.println("Ваш IP адрес: " + ip);
            } else {
                System.out.println("Ошибка сервера: " + response.statusCode());
            }

        } catch (Exception e) {
            System.out.println("Ошибка запроса: " + e.getMessage());
        }
    }
}
