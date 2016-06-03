
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class testRecordingBBCUk extends Simulation {

	val httpProtocol = http
		.baseURL("http://bbc.co.uk")
		.inferHtmlResources(BlackList(""".*\.css""", """.*\.js""", """.*\.ico"""), WhiteList())
		.disableAutoReferer
		.acceptHeader("image/png,image/*;q=0.8,*/*;q=0.5")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-GB,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:46.0) Gecko/20100101 Firefox/46.0")

	val headers_0 = Map("Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")

	val headers_1 = Map(
		"Accept" -> "*/*",
		"Referer" -> "http://www.bbc.co.uk/")

	val headers_5 = Map("Referer" -> "http://static.bbc.co.uk/id/0.35.12/style/id-cta.css")

	val headers_6 = Map("Referer" -> "http://nav.files.bbci.co.uk/orbit/1.0.0-238.1be4a35/css/orb.min.css")

	val headers_8 = Map("Referer" -> "http://www.bbc.co.uk/")

	val headers_9 = Map("Referer" -> "http://homepage.files.bbci.co.uk/s/homepage-v5/2183/styles/main.css")

	val headers_17 = Map(
		"Accept" -> "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8",
		"Accept-Encoding" -> "identity",
		"Origin" -> "http://www.bbc.co.uk",
		"Referer" -> "http://homepage.files.bbci.co.uk/s/homepage-v5/2183/styles/main.css")

	val headers_36 = Map("Referer" -> "http://nav.files.bbci.co.uk/orbit/1.0.0-238.1be4a35/css/bbccookies.min.css")

    val uri1 = "http://homepage.files.bbci.co.uk/s/homepage-v5/2183"
    val uri2 = "http://www.bbc.co.uk/idcta"
    val uri3 = "bbc.co.uk"
    val uri4 = "http://sa.bbc.co.uk/bbc/bbc/s"
    val uri5 = "http://nav.files.bbci.co.uk/orbit/1.0.0-238.1be4a35"
    val uri6 = "http://ichef.bbci.co.uk"
    val uri7 = "http://static.bbc.co.uk/id/0.35.12"
    val uri8 = "http://service.maxymiser.net/cg/v5"
    val uri9 = "http://mybbc.files.bbci.co.uk/s/notification-ui/1.4.4"

	val scn = scenario("testRecordingBBCUk")
		.exec(http("request_0")
			.get("/")
			.headers(headers_0)
			.resources(http("request_1")
			.get(uri2 + "/config?callback&locale=en-GB&ptrt=http://www.bbc.co.uk/")
			.headers(headers_1),
            http("request_2")
			.get(uri2 + "/translations?callback&locale=en-GB")
			.headers(headers_1),
            http("request_3")
			.get(uri8 + "/?fv=dmn%3Dm.bbc.co.uk%3Bref%3D%3Burl%3Dhttp%253A%252F%252Fwww.bbc.co.uk%252F%3Bscrw%3D1024%3Bscrh%3D768%3Bclrd%3D24%3Bcok%3D1%3B&tst=0.860&jsver=5.17&ri=1&rul=")
			.headers(headers_1),
            http("request_4")
			.get(uri8 + "/?fv=dmn%3Dm.bbc.co.uk%3Bref%3D%3Burl%3Dhttp%253A%252F%252Fwww.bbc.co.uk%252F%3Bscrw%3D1024%3Bscrh%3D768%3Bclrd%3D24%3Bcok%3D1%3B&uat=SignInState1st%3DLoggedOut%3BSignInState%3DLoggedOut%3BLanguage%3Den%3B&tst=0.860&jsver=5.17&mmid=262906810%7CAQAAAAoiinuKaA0AAA%3D%3D&pd=1623275089%7CAQAAAAoBQiKKe4poDWayffIBAOS7DOqrhNNIDwAAAOS7DOqrhNNIAAAAAP%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FAAZEaXJlY3QBaA0BAAAAAAAAAAEAAP%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwIAqmsAAAB5K1JvaA0AnZIAAAVoDWgN%2F%2F8BAAABAAAAAAEYMgEA%2BYoBAABKdwAAAJZo4wloDQD%2F%2F%2F%2F%2FAWgNaA3%2F%2FwEAAAEAAAAAAy9OAQD6qwEAME4BAPyrAQAxTgEA%2FqsBAAAAAAABRQ%3D%3D&srv=ldnvwcgeu13&mm_pc=SignInState1st%3DLoggedOut%26SignInState%3DLoggedOut%26Language%3Den&pageid=AsyncWholeSite&ri=2&rul=")
			.headers(headers_1),
            http("request_5")
			.get(uri7 + "/svg/icon-sprite.svg")
			.headers(headers_5),
            http("request_6")
			.get(uri5 + "/img/blq-orbit-blocks_grey_alpha.png")
			.headers(headers_6),
            http("request_7")
			.get(uri5 + "/img/orb-sprite.gif")
			.headers(headers_6),
            http("request_8")
			.get(uri5 + "/img/orb-search-dark.png")
			.headers(headers_8),
            http("request_9")
			.get(uri1 + "/images/right-arrow--grey.svg")
			.headers(headers_9),
            http("request_10")
			.get(uri1 + "/images/live-withpadding.svg")
			.headers(headers_9),
            http("request_11")
			.get(uri1 + "/images/audio-cta-black.svg")
			.headers(headers_9),
            http("request_12")
			.get(uri1 + "/images/video-cta-black.svg")
			.headers(headers_9),
            http("request_13")
			.get(uri1 + "/images/right-arrow--tower-grey.svg")
			.headers(headers_9),
            http("request_14")
			.get(uri1 + "/images/right-arrow--pale-blue.svg")
			.headers(headers_9),
            http("request_15")
			.get(uri1 + "/images/iplayer-radio-black.svg")
			.headers(headers_9),
            http("request_16")
			.get(uri1 + "/images/cog.svg")
			.headers(headers_9),
            http("request_17")
			.get(uri1 + "/fonts/GillSansW01Light.woff2")
			.headers(headers_17),
            http("request_18")
			.get(uri4 + "?name=home.page&ml_name=webmodule&ml_version=50&blq_e=orbit&blq_r=orbit&blq_s=orbit&blq_v=default&language=en&bbc_mc=ad1ps1pf1&app_type=responsive&location_name=&screen_resolution=1024x768&bbc_site=homepage&ns_ti=BBC%20-%20Home&ns_c=UTF-8&ns__t=1464187829679&ns_jspageurl=http%3A%2F%2Fwww.bbc.co.uk%2F&ns_referrer=")
			.headers(headers_8),
            http("request_19")
			.get(uri6 + "/curationkit-ichef/384x216/cpsprodpb/72EB/production/_89791492_shutterstock_391745191.jpg")
			.headers(headers_8),
            http("request_20")
			.get(uri6 + "/curationkit-ichef/384x216/cpsprodpb/A76B/production/_89795824_9239ea70-0109-4f26-bf01-96cb6a0fcf4f.jpg")
			.headers(headers_8),
            http("request_21")
			.get(uri6 + "/curationkit-ichef/384x216/cpsprodpb/13DB1/production/_89792318_watson_shot_getty.jpg")
			.headers(headers_8),
            http("request_22")
			.get(uri6 + "/curationkit-ichef/384x216/cpsprodpb/13447/production/_89791987_gettyimagef.jpg")
			.headers(headers_8),
            http("request_23")
			.get(uri6 + "/images/ic/416xn/p03w74c3.jpg")
			.headers(headers_8),
            http("request_24")
			.get(uri6 + "/images/ic/336xn/p03w75ft.jpg")
			.headers(headers_8),
            http("request_25")
			.get(uri6 + "/images/ic/336xn/p03w6rry.jpg")
			.headers(headers_8),
            http("request_26")
			.get(uri4 + "?name=home.page&default_modules=1&ns_type=hidden&action_name=page-load&action_type=load&ml_name=webmodule&ml_version=50&blq_e=orbit&blq_r=orbit&blq_s=orbit&blq_v=default&language=en&bbc_mc=ad1ps1pf1&app_type=responsive&location_name=&screen_resolution=1024x768&bbc_site=homepage&ns_ti=BBC%20-%20Home&ns_c=UTF-8&ns__t=1464187829993&ns_jspageurl=http%3A%2F%2Fwww.bbc.co.uk%2F&ns_referrer=")
			.headers(headers_8),
            http("request_27")
			.get(uri6 + "/curationkit-ichef/384x216/cpsprodpb/973F/production/_89791783_mounrinhorex.jpg")
			.headers(headers_8),
            http("request_28")
			.get(uri1 + "/images/cross_icon_small--soft-blue.svg")
			.headers(headers_9),
            http("request_29")
			.get(uri1 + "/images/right-arrow--soft-blue.svg")
			.headers(headers_9),
            http("request_30")
			.get(uri1 + "/images/plus.svg")
			.headers(headers_9),
            http("request_31")
			.get(uri1 + "/images/cross_icon_small--grey.svg")
			.headers(headers_9),
            http("request_32")
			.get(uri1 + "/images/cross_icon_small--tower-grey.svg")
			.headers(headers_9),
            http("request_33")
			.get(uri1 + "/images/cross_icon_small--pale-blue.svg")
			.headers(headers_9),
            http("request_34")
			.get(uri8 + "/?fv=dmn%3Dm.bbc.co.uk%3Bref%3D%3Burl%3Dhttp%253A%252F%252Fwww.bbc.co.uk%252F%3Bscrw%3D1024%3Bscrh%3D768%3Bclrd%3D24%3Bcok%3D1%3B&uv=HomeVisit%3D1%2CLoggedOut%3B&uat=SignInState1st%3DLoggedOut%3BSignInState%3DLoggedOut%3BLanguage%3Den%3B&tst=0.860&jsver=5.17&mmid=-570720201%7CAgAAAAoiinuKaA0AAA%3D%3D&pd=62205441%7CAgAAAAoBQiKKe4poDWayffIBAMyJJOqrhNNIDwAAAOS7DOqrhNNIAAAAAP%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FAAZEaXJlY3QBaA0BAAAAAAAAAAAAAP%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwIAqmsAAAB5K1JvaA0AnZIAAAVoDWgN%2F%2F8CAAABAAAAAAEYMgEA%2BYoBAABKdwAAAJZo4wloDQD%2F%2F%2F%2F%2FAWgNaA3%2F%2FwEAAAEAAAAAAy9OAQD6qwEAME4BAPyrAQAxTgEA%2FqsBAAAAAAABRQ%3D%3D&srv=ldnvwcgeu13&mm_pc=SignInState1st%3DLoggedOut%26SignInState%3DLoggedOut%26Language%3Den&pageid=mmevents&ri=3&rul=")
			.headers(headers_1),
            http("request_35")
			.get(uri5 + "/cookie-prompt/en.js?callback=cookiePrompt")
			.headers(headers_1),
            http("request_36")
			.get(uri5 + "/img/bbccookies/cookie_prompt_sprite.png")
			.headers(headers_36),
            http("request_37")
			.get(uri4 + "?name=home.page&ns_m2=yes&ns_setsiteck=35.60.105745BBB500FCF4019E24C72985&ml_name=webmodule&ml_version=50&blq_e=orbit&blq_r=orbit&blq_s=orbit&blq_v=default&language=en&bbc_mc=ad1ps1pf1&app_type=responsive&location_name=&screen_resolution=1024x768&bbc_site=homepage&ns_ti=BBC%20-%20Home&ns_c=UTF-8&ns__t=1464187829679&ns_jspageurl=http%3A%2F%2Fwww.bbc.co.uk%2F&ns_referrer=")
			.headers(headers_8)))
		.pause(1)
		.exec(http("request_38")
			.get(uri4 + "?name=home.page&hp_module_name=gb%20hero&link_location=hero-module&hp_module_template=1&hp_module_position=3&ns_type=hidden&action_name=module-loaded&action_type=view&ml_name=webmodule&ml_version=50&blq_e=orbit&blq_r=orbit&blq_s=orbit&blq_v=default&language=en&bbc_mc=ad1ps1pf1&app_type=responsive&location_name=&screen_resolution=1024x768&bbc_site=homepage&ns_ti=BBC%20-%20Home&ns_c=UTF-8&ns__t=1464187832170&ns_jspageurl=http%3A%2F%2Fwww.bbc.co.uk%2F&ns_referrer=")
			.headers(headers_8)
			.resources(http("request_39")
			.get(uri4 + "?name=home.page&hp_link_url=http%3A%2F%2Fwww.bbc.co.uk%2Fsport%2Flive%2Ftennis%2F36025398&hp_story_headline=Follow%20Murray%20in%20French%20Open%20second%20round&hp_story_attribution=Tennis&hp_story_position=1&hp_module_name=gb%20hero&link_location=hero-module&hp_module_template=1&hp_module_position=3&ns_type=hidden&action_name=story-loaded&action_type=view&ml_name=webmodule&ml_version=50&blq_e=orbit&blq_r=orbit&blq_s=orbit&blq_v=default&language=en&bbc_mc=ad1ps1pf1&app_type=responsive&location_name=&screen_resolution=1024x768&bbc_site=homepage&ns_ti=BBC%20-%20Home&ns_c=UTF-8&ns__t=1464187832179&ns_jspageurl=http%3A%2F%2Fwww.bbc.co.uk%2F&ns_referrer=")
			.headers(headers_8),
            http("request_40")
			.get(uri4 + "?name=home.page&hp_link_url=http%3A%2F%2Fwww.bbc.co.uk%2Fnews%2Felection-us-2016-36376491&hp_story_headline=Violent%20clashes%20erupt%20at%20Trump%20New%20Mexico%20rally&hp_story_attribution=US%20Election%202016&hp_story_position=2&hp_module_name=gb%20hero&link_location=hero-module&hp_module_template=1&hp_module_position=3&ns_type=hidden&action_name=story-loaded&action_type=view&ml_name=webmodule&ml_version=50&blq_e=orbit&blq_r=orbit&blq_s=orbit&blq_v=default&language=en&bbc_mc=ad1ps1pf1&app_type=responsive&location_name=&screen_resolution=1024x768&bbc_site=homepage&ns_ti=BBC%20-%20Home&ns_c=UTF-8&ns__t=1464187832189&ns_jspageurl=http%3A%2F%2Fwww.bbc.co.uk%2F&ns_referrer=")
			.headers(headers_8),
            http("request_41")
			.get(uri4 + "?name=home.page&hp_link_url=http%3A%2F%2Fwww.bbc.co.uk%2Fnews%2Fworld-europe-36377407&hp_story_headline=20%20cars%20fall%20into%20650ft%20hole%20as%20road%20collapses&hp_story_attribution=Europe&hp_story_position=3&hp_module_name=gb%20hero&link_location=hero-module&hp_module_template=1&hp_module_position=3&ns_type=hidden&action_name=story-loaded&action_type=view&ml_name=webmodule&ml_version=50&blq_e=orbit&blq_r=orbit&blq_s=orbit&blq_v=default&language=en&bbc_mc=ad1ps1pf1&app_type=responsive&location_name=&screen_resolution=1024x768&bbc_site=homepage&ns_ti=BBC%20-%20Home&ns_c=UTF-8&ns__t=1464187832201&ns_jspageurl=http%3A%2F%2Fwww.bbc.co.uk%2F&ns_referrer=")
			.headers(headers_8),
            http("request_42")
			.get(uri1 + "/images/cog-active.svg")
			.headers(headers_9)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}