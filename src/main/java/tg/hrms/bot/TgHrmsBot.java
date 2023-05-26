package tg.hrms.bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

import tg.hrms.dto.UserNumberRegDto;
import tg.hrms.services.impl.UserNumberRegServiceImpl;
import tg.hrms.token.BotToken;

@SuppressWarnings("deprecation")
public class TgHrmsBot extends TelegramLongPollingBot {
	String token = BotToken.readTokenFromFile();

//	@Autowired
//	UserNumberRegServiceImpl regService;

	@Override
	public void onUpdateReceived(Update update) {
		UserNumberRegServiceImpl regService = new UserNumberRegServiceImpl();
		var msg = update.getMessage();
		var user = msg.getFrom();

		System.out.println(user.getFirstName() + " wrote " + msg.getText());
		UserNumberRegDto userNumberReg = new UserNumberRegDto();
		userNumberReg.setId(1);
		userNumberReg.setTgId(update.getMessage().getChatId());
		userNumberReg.setPhoneNumber(999999999L);
		userNumberReg.setRegId("regId");
		System.out.println(userNumberReg);
//		regService.saveUser(userNumberReg);
		regService.findByID(1);
	}

	@Override
	public String getBotUsername() {
		// TODO Auto-generated method stub
		return "HRMS";
	}

	@Override
	public String getBotToken() {
		return token;
	}

}
