package tg.hrms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import tg.hrms.bot.TgHrmsBot;

@SpringBootApplication
@ComponentScan(basePackages = { "tg.hrms.entities" })
@EnableJpaRepositories(basePackages = { "tg.hrms.repository" })
public class TgHrmsApplication {

	public static void main(String[] args) throws TelegramApiException {

		SpringApplication.run(TgHrmsApplication.class, args);
		TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
		botsApi.registerBot(new TgHrmsBot());
	}

}
