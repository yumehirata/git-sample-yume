package jp.co.rakus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitSampleYumeApplication {

	public static void main(String[] args) {
		System.out.println("デプロイとサーバ起動を行います");
		SpringApplication.run(GitSampleYumeApplication.class, args);
	}
}
