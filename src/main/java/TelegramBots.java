import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

public class TelegramBots extends TelegramLongPollingBot {

    SendMessage sendMessage=new SendMessage();


    @Override
    public String getBotUsername() {
        return "damolishjoylaribot";
    }

    @Override
    public String getBotToken() {
        return "1792167995:AAGSVcWUUbwBYHeuNb_qbehv5LLW3ZGWf4I";
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()){
            Message message=update.getMessage();

            if (message.hasText()) {
                String text = message.getText();


                if (text.equals("/start") || text.equals("/setting") || text.equals("/help")) {
                    System.out.println("Habar keldi");

                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("Assalomu alaykum *DamOlishJoylari* Botiga hush kelibsiz!!!");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));

//                KeyboardButton
//                InlineKeyboardButton
                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true);
                    replyKeyboardMarkup.setSelective(true);

                    List<KeyboardRow> keyboardRowList = new ArrayList<>();
                    KeyboardRow keyboardRow = new KeyboardRow();
                    var keyboardButton = new KeyboardButton();
                    keyboardButton.setText("Qayerga dam olish uchun bormoqchisiz \uD83D\uDD04!!!");
                    keyboardRow.add(keyboardButton);
                    keyboardRowList.add(keyboardRow);
                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);


                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }





                else if (text.equals("Qayerga dam olish uchun bormoqchisiz \uD83D\uDD04!!!")||text.equals("⬅ortga")) {

                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("Kategoriyalardan birini tanlashengiz kerak\uD83D\uDC47");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));

//                KeyboardButton
//                InlineKeyboardButton
                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true);
                    replyKeyboardMarkup.setSelective(true);

                    List<KeyboardRow> keyboardRowList = new ArrayList<>();
                    KeyboardRow keyboardRow = new KeyboardRow();
                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton = new KeyboardButton();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    keyboardButton.setText("_Tog'lar_");
                    keyboardButton1.setText("_Viloyatlar_");
                    keyboardButton2.setText("_Davlatlar_");
                    keyboardRow.add(keyboardButton);
                    keyboardRow.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRowList.add(keyboardRow);
                    keyboardRowList.add(keyboardRow1);
                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);


                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }








                else if (text.equals("_Tog'lar_")) {

                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("Juda ajoyib taklif qildengiz!!!\uD83D\uDE0A\uD83D\uDE05");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));

//                KeyboardButton
//                InlineKeyboardButton
                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true);
                    replyKeyboardMarkup.setSelective(true);

                    List<KeyboardRow> keyboardRowList = new ArrayList<>();
                    KeyboardRow keyboardRow = new KeyboardRow();
                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardRow keyboardRow2 = new KeyboardRow();

                    KeyboardButton keyboardButton = new KeyboardButton();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    keyboardButton.setText("_ZoMiN_⛈ tog'lari");
                    keyboardButton1.setText("_Baxmal_\uD83C\uDF26 tog'lari");
                    keyboardButton2.setText("_FoRish_⛈ tog'lari");
                    keyboardButton3.setText("⬅ortga");

                    keyboardRow.add(keyboardButton);
                    keyboardRow.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow2.add(keyboardButton3);

                    keyboardRowList.add(keyboardRow);
                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);

                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);


                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }




                else if (text.equals("_Viloyatlar_")) {

                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("Juda ajoyib taklif qildengiz!!!\uD83D\uDE0A\uD83D\uDE05");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));

//                KeyboardButton
//                InlineKeyboardButton
                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true);
                    replyKeyboardMarkup.setSelective(true);

                    List<KeyboardRow> keyboardRowList = new ArrayList<>();
                    KeyboardRow keyboardRow = new KeyboardRow();
                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardRow keyboardRow2 = new KeyboardRow();

                    KeyboardButton keyboardButton = new KeyboardButton();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    keyboardButton.setText("_BuKhaRa_\uD83C\uDDFA\uD83C\uDDFF");
                    keyboardButton1.setText("_SaMaRqaNd_\uD83C\uDDFA\uD83C\uDDFF");
                    keyboardButton2.setText("_ToShkeNt_\uD83C\uDDFA\uD83C\uDDFF");
                    keyboardButton3.setText("⬅ortga");

                    keyboardRow.add(keyboardButton);
                    keyboardRow.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow2.add(keyboardButton3);

                    keyboardRowList.add(keyboardRow);
                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);

                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);


                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }




                else if (text.equals("_Davlatlar_")) {

                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("Siz Davlatlar bo'limini tanladengiz!!!Qayerga boramiz\uD83D\uDE0A\uD83D\uDE05");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));

//                KeyboardButton
//                InlineKeyboardButton
                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true);
                    replyKeyboardMarkup.setSelective(true);

                    List<KeyboardRow> keyboardRowList = new ArrayList<>();
                    KeyboardRow keyboardRow = new KeyboardRow();
                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardRow keyboardRow2 = new KeyboardRow();

                    KeyboardButton keyboardButton = new KeyboardButton();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    keyboardButton.setText("_DuBaI_\uD83C\uDDE6\uD83C\uDDEA ");
                    keyboardButton1.setText("_RoSSiA_\uD83C\uDDF7\uD83C\uDDFA");
                    keyboardButton2.setText("_TuRkiA_\uD83C\uDDF9\uD83C\uDDF7");
                    keyboardButton3.setText("⬅ortga");

                    keyboardRow.add(keyboardButton);
                    keyboardRow.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow2.add(keyboardButton3);

                    keyboardRowList.add(keyboardRow);
                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);

                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);


                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }






                else if (text.equals("_ZoMiN_⛈ tog'lari")||text.equals("⬅ortga")) {

                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("Assalomu alaykum _ZoMiN_⛈ tog'lariga hush kelibsiz. Zomin tog'lari yer satxidan 2000m balandlikda joylashgan bo'lib,O'rta osiyoda havo tozaligi va sofligi jihatdan oldi o'rinlardan joy olgan, O'zbekistondagi yozning jazirama kunlarida juda salqin hududlardan biri. Jizzax shahridan Zomin sanatoriyasigacha bo'lgan masofa 109km ni tashkil qiladi");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));

//                KeyboardButton
//                InlineKeyboardButton
                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true);
                    replyKeyboardMarkup.setSelective(true);

                    List<KeyboardRow> keyboardRowList = new ArrayList<>();
                    KeyboardRow keyboardRow = new KeyboardRow();
                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton = new KeyboardButton();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    keyboardButton.setText("Murojat uchun tel\uD83D\uDCDE⛈:");
                    keyboardButton1.setText("Photo lavhalar⛈");
                    keyboardButton2.setText("⬅ortga");
                    keyboardRow.add(keyboardButton);
                    keyboardRow.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRowList.add(keyboardRow);
                    keyboardRowList.add(keyboardRow1);
                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);


                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }else if (text.equals("Photo lavhalar⛈")||text.equals("⬅ortga")){
                    SendMessage sendMessage=new SendMessage();
                    sendMessage.setText("\uD83D\uDC47_ZoMiN_⛈ tog'lariga oid rasmlarni ko'rishengiz mumkin\uD83D\uDC47");
                    sendMessage.setChatId(String.valueOf(message.getChatId()));


                    InlineKeyboardMarkup inlineKeyboardMarkup=new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>>inlineButton=new ArrayList<>();
                    List<InlineKeyboardButton>inlineKeyboardButtons=new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton=new InlineKeyboardButton();
                    inlineKeyboardButton.setText("Photo lavhalar⛈");
                    inlineKeyboardButton.setUrl("https://www.google.com/search?q=zomin+tog%27lari&tbm=isch&ved=2ahUKEwjx1Iedko3xAhWI-yoKHaV4DmkQ2-cCegQIABAA&oq=zomin&gs_lcp=CgNpbWcQARgEMgQIABBDMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAOgUIABCxA1DepwxYia8MYPXMDGgAcAB4AIABwwGIAYQHkgEDMC41mAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=qw_CYLHTO4j3qwGl8bnIBg&bih=591&biw=1005&hl=ru");

                    inlineKeyboardButtons.add(inlineKeyboardButton);
                    inlineButton.add(inlineKeyboardButtons);
                    inlineKeyboardMarkup.setKeyboard(inlineButton);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }else if (text.equals("Murojat uchun tel\uD83D\uDCDE⛈:")){
                    SendMessage sendMessage=new SendMessage();
                    sendMessage.setText("Umid: +998996625252");

                    sendMessage.setChatId(String.valueOf(message.getChatId()));

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }






                else if (text.equals("_Baxmal_\uD83C\uDF26 tog'lari")||text.equals("⬅ortga")) {

                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("Assalomu alaykum _Baxmal_\uD83C\uDF26 tog'lariga hush kelibsiz Baxmal tog'lari havosi juda toza, salqin hududlardan biri, dam olish uchun juda ko'p boriladigan hudud hisoblanada, tabiati juda chiroyle, O'zbekistonning har xil hududlardan dam olish uchun ko'plab odamlar tashrif buyuradi, Jizzax shahridan chamasi 95 km cha uzoqda joylashgan");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));

//                KeyboardButton
//                InlineKeyboardButton
                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true);
                    replyKeyboardMarkup.setSelective(true);

                    List<KeyboardRow> keyboardRowList = new ArrayList<>();
                    KeyboardRow keyboardRow = new KeyboardRow();
                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton = new KeyboardButton();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    keyboardButton.setText("Murojat uchun tel\uD83D\uDCDE\uD83C\uDF26:");
                    keyboardButton1.setText("Photo lavhalar\uD83C\uDF26");
                    keyboardButton2.setText("⬅ortga");
                    keyboardRow.add(keyboardButton);
                    keyboardRow.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRowList.add(keyboardRow);
                    keyboardRowList.add(keyboardRow1);
                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);


                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }
                else if (text.equals("Photo lavhalar\uD83C\uDF26")||text.equals("⬅ortga")){
                    SendMessage sendMessage=new SendMessage();
                    sendMessage.setText("\uD83D\uDC47_Baxmal_\uD83C\uDF26 tog'lariga oid rasmlarni ko'rishengiz mumkin\uD83D\uDC47");
                    sendMessage.setChatId(String.valueOf(message.getChatId()));


                    InlineKeyboardMarkup inlineKeyboardMarkup=new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>>inlineButton=new ArrayList<>();
                    List<InlineKeyboardButton>inlineKeyboardButtons=new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton=new InlineKeyboardButton();
                    inlineKeyboardButton.setText("Photo lavhalar\uD83C\uDF26");
                    inlineKeyboardButton.setUrl("https://www.google.com/search?q=baxmal+tumani+tog%27lari&tbm=isch&ved=2ahUKEwi-6pKEko3xAhVn-ioKHZf1Dz0Q2-cCegQIABAA&oq=baxmal+tumani+tog%27lari&gs_lcp=CgNpbWcQAzoECCMQJ1DL8AJY-YMDYKGNA2gAcAB4AIAB3gGIAf8JkgEFMC41LjKYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=dw_CYP7SLOf0qwGX67_oAw&bih=591&biw=1005&hl=ru");

                    inlineKeyboardButton.setSwitchInlineQueryCurrentChat("123");
                    inlineKeyboardButtons.add(inlineKeyboardButton);
                    inlineButton.add(inlineKeyboardButtons);
                    inlineKeyboardMarkup.setKeyboard(inlineButton);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }else if (text.equals("Murojat uchun tel\uD83D\uDCDE\uD83C\uDF26:")){
                    SendMessage sendMessage=new SendMessage();
                    sendMessage.setText("Jamshid: +99890***-00-96");

                    sendMessage.setChatId(String.valueOf(message.getChatId()));

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }



















                else if (text.equals("_FoRish_⛈ tog'lari")||text.equals("⬅ortga")) {

                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("Assalomu alaykum _FoRish_⛈ tog'lariga hush kelibsiz");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));

//                KeyboardButton
//                InlineKeyboardButton
                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true);
                    replyKeyboardMarkup.setSelective(true);

                    List<KeyboardRow> keyboardRowList = new ArrayList<>();
                    KeyboardRow keyboardRow = new KeyboardRow();
                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton = new KeyboardButton();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    keyboardButton.setText("Murojat uchun tel\uD83D\uDCDE,:");
                    keyboardButton1.setText("Photo lavhalar.");
                    keyboardButton2.setText("⬅ortga");
                    keyboardRow.add(keyboardButton);
                    keyboardRow.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRowList.add(keyboardRow);
                    keyboardRowList.add(keyboardRow1);
                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);


                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("Photo lavhalar.")||text.equals("⬅ortga")) {


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButton = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtons = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();

                    inlineKeyboardButton.setUrl("");
                    inlineKeyboardButtons.add(inlineKeyboardButton);
                    inlineButton.add(inlineKeyboardButtons);
                    inlineKeyboardMarkup.setKeyboard(inlineButton);


                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                } else if (text.equals("Murojat uchun tel\uD83D\uDCDE,:")){
                    SendMessage sendMessage=new SendMessage();
                    sendMessage.setText("Eldor: +99890***-**-**");

                    sendMessage.setChatId(String.valueOf(message.getChatId()));

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }














                else if (text.equals("_BuKhaRa_\uD83C\uDDFA\uD83C\uDDFF")||text.equals("⬅ortga")) {

                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("Assalomu alaykum _BuKhaRa_\uD83C\uDDFA\uD83C\uDDFF bo'limiga hush kelibsiz");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));

//                KeyboardButton
//                InlineKeyboardButton
                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true);
                    replyKeyboardMarkup.setSelective(true);

                    List<KeyboardRow> keyboardRowList = new ArrayList<>();
                    KeyboardRow keyboardRow = new KeyboardRow();
                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton = new KeyboardButton();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    keyboardButton.setText("Murojat uchun tel\uD83C\uDDFA\uD83C\uDDFF\uD83D\uDCDE:");
                    keyboardButton1.setText("Photo lavhalar Buxoro\uD83C\uDDFA\uD83C\uDDFF");
                    keyboardButton2.setText("⬅ortga");
                    keyboardRow.add(keyboardButton);
                    keyboardRow.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRowList.add(keyboardRow);
                    keyboardRowList.add(keyboardRow1);
                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);


                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("Photo lavhalar Buxoro\uD83C\uDDFA\uD83C\uDDFF")||text.equals("⬅ortga")){
                    SendMessage sendMessage=new SendMessage();
                    sendMessage.setText("\uD83D\uDC47Buxoro\uD83C\uDDFA\uD83C\uDDFFga oid rasmlarni ko'rishengiz mumkin\uD83D\uDC47");
                    sendMessage.setChatId(String.valueOf(message.getChatId()));


                    InlineKeyboardMarkup inlineKeyboardMarkup=new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>>inlineButton=new ArrayList<>();
                    List<InlineKeyboardButton>inlineKeyboardButtons=new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton=new InlineKeyboardButton();
                    inlineKeyboardButton.setText("Photo lavhalar Buxoro\uD83C\uDDFA\uD83C\uDDFF");
                    inlineKeyboardButton.setUrl("https://www.google.com/search?q=Buxoro+rasmlari&tbm=isch&ved=2ahUKEwj0hIC3-4zxAhWBvSoKHak2BWAQ2-cCegQIABAA&oq=Buxoro+rasmlari&gs_lcp=CgNpbWcQAzoGCAAQBxAeOggIABAHEAUQHlDZsRVY7r0VYMHEFWgAcAB4AIABlwKIAY4IkgEFMC41LjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=xPfBYPSSFoH7qgGp7ZSABg&bih=608&biw=1022");
                    inlineKeyboardButtons.add(inlineKeyboardButton);
                    inlineButton.add(inlineKeyboardButtons);
                    inlineKeyboardMarkup.setKeyboard(inlineButton);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }else if (text.equals("Murojat uchun tel\uD83C\uDDFA\uD83C\uDDFF\uD83D\uDCDE:")){
                    SendMessage sendMessage=new SendMessage();
                    sendMessage.setText("Saidali: +99893***-47-27");

                    sendMessage.setChatId(String.valueOf(message.getChatId()));

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }





                else if (text.equals("_SaMaRqaNd_\uD83C\uDDFA\uD83C\uDDFF")||text.equals("⬅ortga")) {

                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("Assalomu alaykum _SaMaRqaNd_\uD83C\uDDFA\uD83C\uDDFF bo'limiga hush kelibsiz");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));

//                KeyboardButton
//                InlineKeyboardButton
                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true);
                    replyKeyboardMarkup.setSelective(true);

                    List<KeyboardRow> keyboardRowList = new ArrayList<>();
                    KeyboardRow keyboardRow = new KeyboardRow();
                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton = new KeyboardButton();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    keyboardButton.setText("Murojat uchun tel\uD83D\uDCDE\uD83C\uDDFA\uD83C\uDDFF.:");
                    keyboardButton1.setText("Photo lavhalar\uD83C\uDDFA\uD83C\uDDFF.");
                    keyboardButton2.setText("⬅ortga");
                    keyboardRow.add(keyboardButton);
                    keyboardRow.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRowList.add(keyboardRow);
                    keyboardRowList.add(keyboardRow1);
                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);


                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("Photo lavhalar\uD83C\uDDFA\uD83C\uDDFF.")||text.equals("⬅ortga")){
                    SendMessage sendMessage=new SendMessage();
                    sendMessage.setText("\uD83D\uDC47Samarqandga oid rasmlarni ko'rishengiz mumkin\uD83D\uDC47");
                    sendMessage.setChatId(String.valueOf(message.getChatId()));


                    InlineKeyboardMarkup inlineKeyboardMarkup=new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>>inlineButton=new ArrayList<>();
                    List<InlineKeyboardButton>inlineKeyboardButtons=new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton=new InlineKeyboardButton();
                    inlineKeyboardButton.setText("Photo lavhalar\uD83C\uDDFA\uD83C\uDDFF.");
                    inlineKeyboardButton.setUrl("https://www.google.com/search?q=samarqand+rasmlari&tbm=isch&ved=2ahUKEwjflJ3l-YzxAhVB6CoKHSn1CUEQ2-cCegQIABAA&oq=Samar+rasmlari&gs_lcp=CgNpbWcQARgBMgYIABAHEB4yBggAEAcQHjIGCAAQBxAeMgYIABAHEB4yBggAEAcQHjIGCAAQBxAeUK68GlijzRpgluEaaABwAHgAgAGzAogBrgeSAQcwLjQuMC4xmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=DPbBYN_eGsHQqwGp6qeIBA&bih=608&biw=1022");

                    inlineKeyboardButtons.add(inlineKeyboardButton);
                    inlineButton.add(inlineKeyboardButtons);
                    inlineKeyboardMarkup.setKeyboard(inlineButton);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }else if (text.equals("Murojat uchun tel\uD83D\uDCDE\uD83C\uDDFA\uD83C\uDDFF.:")){
                    SendMessage sendMessage=new SendMessage();
                    sendMessage.setText("Avaz: +99890***-85-95");

                    sendMessage.setChatId(String.valueOf(message.getChatId()));

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }










                else if (text.equals("_ToShkeNt_\uD83C\uDDFA\uD83C\uDDFF")||text.equals("⬅ortga")) {

                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("Assalomu alaykum _ToShkeNt_\uD83C\uDDFA\uD83C\uDDFF bo'limiga hush kelibsiz");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));

//                KeyboardButton
//                InlineKeyboardButton
                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true);
                    replyKeyboardMarkup.setSelective(true);

                    List<KeyboardRow> keyboardRowList = new ArrayList<>();
                    KeyboardRow keyboardRow = new KeyboardRow();
                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton = new KeyboardButton();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    keyboardButton.setText("Murojat uchun tel\uD83D\uDCDE\uD83C\uDDFA\uD83C\uDDFF:");
                    keyboardButton1.setText("Photo lavhalar\uD83C\uDDFA\uD83C\uDDFF");
                    keyboardButton2.setText("⬅ortga");
                    keyboardRow.add(keyboardButton);
                    keyboardRow.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRowList.add(keyboardRow);
                    keyboardRowList.add(keyboardRow1);
                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);


                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("Photo lavhalar\uD83C\uDDFA\uD83C\uDDFF")||text.equals("⬅ortga")){
                    SendMessage sendMessage=new SendMessage();
                    sendMessage.setText("\uD83D\uDC47Toshkentga oid rasmlarni ko'rishengiz mumkin\uD83D\uDC47");
                    sendMessage.setChatId(String.valueOf(message.getChatId()));


                    InlineKeyboardMarkup inlineKeyboardMarkup=new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>>inlineButton=new ArrayList<>();
                    List<InlineKeyboardButton>inlineKeyboardButtons=new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton=new InlineKeyboardButton();
                    inlineKeyboardButton.setText("Photo lavhalar\uD83C\uDDFA\uD83C\uDDFF");
                    inlineKeyboardButton.setUrl("https://www.google.com/search?q=toshkent+shahri+rasmlari&tbm=isch&ved=2ahUKEwj9tZnC-IzxAhWLtioKHSvyAmgQ2-cCegQIABAA&oq=Toshkent+shahri&gs_lcp=CgNpbWcQARgAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADoGCAAQBxAeOggIABAHEAUQHjoECAAQGDoICAAQCBAHEB5QjeETWKjWFGC_4hRoAXAAeACAAcIBiAHGGZIBBDAuMjKYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=tvTBYP2CIYvtqgGr5IvABg&bih=608&biw=1022");

                    inlineKeyboardButtons.add(inlineKeyboardButton);
                    inlineButton.add(inlineKeyboardButtons);
                    inlineKeyboardMarkup.setKeyboard(inlineButton);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }else if (text.equals("Murojat uchun tel\uD83D\uDCDE\uD83C\uDDFA\uD83C\uDDFF:")){
                    SendMessage sendMessage=new SendMessage();
                    sendMessage.setText("Doston: +99890***-13-16");

                    sendMessage.setChatId(String.valueOf(message.getChatId()));

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }








                else if (text.equals("_DuBaI_\uD83C\uDDE6\uD83C\uDDEA")||text.equals("⬅ortga")) {

                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("Assalomu alaykum _DuBaI_\uD83C\uDDE6\uD83C\uDDEA bo'limiga hush kelibsiz. Juda ajoyib shaharni tanladengiz, _DuBaI_\uD83C\uDDE6\uD83C\uDDEA hozirgi rivojlangan davlatlar orasida oldi o'zinlarda turadi va turizm jihatdan eng rivojlangan davlat.");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true);
                    replyKeyboardMarkup.setSelective(true);

                    List<KeyboardRow> keyboardRowList = new ArrayList<>();
                    KeyboardRow keyboardRow = new KeyboardRow();
                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton = new KeyboardButton();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    keyboardButton.setText("Murojat uchun tel\uD83D\uDCDE:");
                    keyboardButton1.setText("Photo lavhalar");
                    keyboardButton2.setText("⬅ortga");
                    keyboardRow.add(keyboardButton);
                    keyboardRow.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRowList.add(keyboardRow);
                    keyboardRowList.add(keyboardRow1);
                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);


                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }else if (text.equals("Photo lavhalar")||text.equals("⬅ortga")){
                    SendMessage sendMessage=new SendMessage();
                    sendMessage.setText("\uD83D\uDC47Dubaiga oid rasmlarni ko'rishengiz mumkin\uD83D\uDC47");
                    sendMessage.setChatId(String.valueOf(message.getChatId()));


                    InlineKeyboardMarkup inlineKeyboardMarkup=new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>>inlineButton=new ArrayList<>();
                    List<InlineKeyboardButton>inlineKeyboardButtons=new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton=new InlineKeyboardButton();
                    inlineKeyboardButton.setText("Photo lavhalar");
                    inlineKeyboardButton.setUrl("https://www.google.com/search?q=dubai+photos&sxsrf=ALeKk01dSW_7HBichsmKlLe7y_LvCygUEg:1623319144621&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjdkeOH54zxAhXro4sKHZXbBQ4Q_AUoAXoECAEQAw&biw=1022&bih=608");

                    inlineKeyboardButtons.add(inlineKeyboardButton);
                    inlineButton.add(inlineKeyboardButtons);
                    inlineKeyboardMarkup.setKeyboard(inlineButton);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }else if (text.equals("Murojat uchun tel\uD83D\uDCDE:")){
                    SendMessage sendMessage=new SendMessage();
                    sendMessage.setText("Umidjon: +998904975353");

                    sendMessage.setChatId(String.valueOf(message.getChatId()));

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }






                else if (text.equals("_RoSSiA_\uD83C\uDDF7\uD83C\uDDFA")||text.equals("⬅ortga")) {

                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("Assalomu alaykum _RoSSiA_\uD83C\uDDF7\uD83C\uDDFA bo'limiga hush kelibsiz");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));

//                KeyboardButton
//                InlineKeyboardButton
                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true);
                    replyKeyboardMarkup.setSelective(true);

                    List<KeyboardRow> keyboardRowList = new ArrayList<>();
                    KeyboardRow keyboardRow = new KeyboardRow();
                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton = new KeyboardButton();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    keyboardButton.setText("Murojat uchun tel\uD83D\uDCDE\uD83C\uDDF7\uD83C\uDDFA:");
                    keyboardButton1.setText("Photo lavhalar _RoSSiA_\uD83C\uDDF7\uD83C\uDDFA");
                    keyboardButton2.setText("⬅ortga");
                    keyboardRow.add(keyboardButton);
                    keyboardRow.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRowList.add(keyboardRow);
                    keyboardRowList.add(keyboardRow1);
                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);


                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }



                else if (text.equals("Photo lavhalar _RoSSiA_\uD83C\uDDF7\uD83C\uDDFA")||text.equals("⬅ortga")){
                    SendMessage sendMessage=new SendMessage();
                    sendMessage.setText("\uD83D\uDC47RoSSiya oid rasmlarni ko'rishengiz mumkin\uD83D\uDC47");
                    sendMessage.setChatId(String.valueOf(message.getChatId()));


                    InlineKeyboardMarkup inlineKeyboardMarkup=new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>>inlineButton=new ArrayList<>();
                    List<InlineKeyboardButton>inlineKeyboardButtons=new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton=new InlineKeyboardButton();
                    inlineKeyboardButton.setText("Photo lavhalar");
                    inlineKeyboardButton.setUrl("https://www.google.com/search?q=rossiya+shaharlari&tbm=isch&ved=2ahUKEwj1i43m9IzxAhWMCHcKHSs3BS4Q2-cCegQIABAA&oq=rossiya+&gs_lcp=CgNpbWcQARgDMgQIIxAnMgQIIxAnMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCAA6BAgAEAI6BggAEAgQHjoECAAQGFD4jAJY3JICYKe5AmgAcAB4AIABngGIAdgGkgEDMC42mAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=0PDBYPXjBYyR3AOr7pTwAg&bih=608&biw=1022");

                    inlineKeyboardButton.setSwitchInlineQueryCurrentChat("123");
                    inlineKeyboardButtons.add(inlineKeyboardButton);
                    inlineButton.add(inlineKeyboardButtons);
                    inlineKeyboardMarkup.setKeyboard(inlineButton);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }else if (text.equals("Murojat uchun tel\uD83D\uDCDE\uD83C\uDDF7\uD83C\uDDFA:")){
                    SendMessage sendMessage=new SendMessage();
                    sendMessage.setText("Abdulazim: +99899***-17-71");

                    sendMessage.setChatId(String.valueOf(message.getChatId()));

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }









                else if (text.equals("_TuRkiA_\uD83C\uDDF9\uD83C\uDDF7")||text.equals("⬅ortga")) {

                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("Assalomu alaykum _TuRkiA_\uD83C\uDDF9\uD83C\uDDF7 bo'limiga hush kelibsiz");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));

//                KeyboardButton
//                InlineKeyboardButton
                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true);
                    replyKeyboardMarkup.setSelective(true);

                    List<KeyboardRow> keyboardRowList = new ArrayList<>();
                    KeyboardRow keyboardRow = new KeyboardRow();
                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton = new KeyboardButton();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    keyboardButton.setText("Murojat uchun tel\uD83D\uDCDE\uD83C\uDDF9\uD83C\uDDF7:");
                    keyboardButton1.setText("Photo lavhalar\uD83C\uDDF9\uD83C\uDDF7");
                    keyboardButton2.setText("⬅ortga");
                    keyboardRow.add(keyboardButton);
                    keyboardRow.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRowList.add(keyboardRow);
                    keyboardRowList.add(keyboardRow1);
                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);


                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("Photo lavhalar\uD83C\uDDF9\uD83C\uDDF7")||text.equals("⬅ortga")){
                    SendMessage sendMessage=new SendMessage();
                    sendMessage.setText("\uD83D\uDC47Turkiyaga oid rasmlarni ko'rishengiz mumkin\uD83D\uDC47");
                    sendMessage.setChatId(String.valueOf(message.getChatId()));


                    InlineKeyboardMarkup inlineKeyboardMarkup=new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>>inlineButton=new ArrayList<>();
                    List<InlineKeyboardButton>inlineKeyboardButtons=new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton=new InlineKeyboardButton();
                    inlineKeyboardButton.setText("Photo lavhalar\uD83C\uDDF9\uD83C\uDDF7");
                    inlineKeyboardButton.setUrl("https://www.google.com/search?q=turkiya+shaharlari&tbm=isch&ved=2ahUKEwjT56z69IzxAhXXvCoKHQIsCvkQ2-cCegQIABAA&oq=turki+shaharlari&gs_lcp=CgNpbWcQARgAMgYIABAHEB4yBggAEAcQHjIGCAAQBxAeMggIABAHEAUQHjoCCAA6CAgAEAgQBxAeOgQIABAYULTWOVip-jlgq546aAFwAHgAgAG1AYgB6Q-SAQQwLjEzmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=-vDBYNOCItf5qgGC2KjIDw&bih=608&biw=1022");

                    inlineKeyboardButton.setSwitchInlineQueryCurrentChat("123");
                    inlineKeyboardButtons.add(inlineKeyboardButton);
                    inlineButton.add(inlineKeyboardButtons);
                    inlineKeyboardMarkup.setKeyboard(inlineButton);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }else if (text.equals("Murojat uchun tel\uD83D\uDCDE\uD83C\uDDF9\uD83C\uDDF7:")){
                    SendMessage sendMessage=new SendMessage();
                    sendMessage.setText("Sanjar: +99890***-50-50");

                    sendMessage.setChatId(String.valueOf(message.getChatId()));

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }















            }

        }
    }


}




