package com.example.android5teamwork1.data

import androidx.lifecycle.MutableLiveData
import com.example.android5teamwork1.data.model.AnimeModel

class AnimeData {

    private val list = ArrayList<AnimeModel>()

    fun setList(): MutableLiveData<ArrayList<AnimeModel>> {
        list.add(
            AnimeModel(
                title = "Человек за окном",
                detail =
                "Однажды холодным зимним вечером некая шестнадцатилетняя девушка была дома одна и смотрела телевизор. Ее родители уехали на праздник к друзьям. Весь день шёл густой снег, но девушка чувствовала себя хорошо и уютно, сидя на диване в гостиной, завернувшись в теплое шерстяное одеяло. К полуночи родители еще не вернулись, и она стала чувствовать себя тревожно. Звонить им она не хотела, чтобы они не подумали, будто она не может сама о себе позаботиться.\n" +
                        "\n" +
                        "Телевизор стоял в углу комнаты рядом с большим окном. Она смотрела очередной фильм, когда вдруг краем глаза заметила, как что-то движется в окне. В темноте среди падающего снега она различила фигуру мужчины, идущего в её сторону. Когда он приблизился, она смогла разглядеть его лицо. Оно было покрыто шрамами, а губы были растянуты в зловещей улыбке. Испугавшись, девушка замерла, не смея зашевелиться. Человек так и стоял и молча смотрел на неё через стекло. Затем он вдруг сунул руку в карман пальто и что-то вытащил. Это был нож...\n" +
                        "\n" +
                        "Не выдержав, девушка схватила телефон со столика у дивана, набрала номер полиции и затаила дыхание в ожидании ответа.\n" +
                        "- У меня за окном стоит человек, - прошептала она, не сводя взгляд с жуткого гостя. - У него нож. Пожалуйста, приезжайте побыстрее. Мой адрес...\n" +
                        "\n" +
                        "Она сидела неподвижно, минуты проходили одна за другой. Человек за окном всё так же стоял и смотрел прямо на неё. В конце концов, девушка услышала снаружи звуки сирены и полицейские начали стучаться в дверь.\n" +
                        "\n" +
                        "Девушка бросилась ко входной двери, впуская полицейских. Те сказали ей, что не видели никого возле дома и не нашли никаких следов.\n" +
                        "\n" +
                        "- Не может быть, - сказала девушка, указывая на окно. - Он только что стоял там, когда вы стучались. Вы не могли его не заметить.\n" +
                        "- Это невозможно, - сказал офицер. - Никого не было, да и снег остался нетронутым. При таком снеге, если даже там кто-то недавно был, он бы оставил отчётливые следы.\n" +
                        "- Но я видела его своими собственными глазами! - настаивала девушка.\n" +
                        "- Вы знаете, ваши глаза могут сыграть с вами злую шутку, - усмехнулся офицер. - Может быть, вы смотрите слишком много фильмов?\n" +
                        "\n" +
                        "Полицейские уже собирались уйти, когда, вдруг один из офицеров заметил что-то неладное. Он нахмурился и обошёл диван, на котором сидела девушка. На ковре за диваном остались мокрые следы и брошенный нож.\n" +
                        "- Вы видели человека не за окном, - сказал офицер. - Вы смотрели на его отражение. Всё это время он стоял в двух шагах за вашей спиной.\n" +
                        "Подробнее - на сайте \"Страшилка\", посмотри, не пожалеешь: http://www.strashilka.com/creative/2826-chelovek-za-oknom.html"

            )
        )
        val liveData = MutableLiveData<ArrayList<AnimeModel>>()
        liveData.value = list
        return liveData
    }
}