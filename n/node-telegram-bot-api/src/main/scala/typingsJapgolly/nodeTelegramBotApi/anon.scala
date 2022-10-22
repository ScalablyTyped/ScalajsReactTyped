package typingsJapgolly.nodeTelegramBotApi

import typingsJapgolly.nodeTelegramBotApi.mod.BotCommandScope
import typingsJapgolly.nodeTelegramBotApi.mod.ChatAdministratorRights
import typingsJapgolly.nodeTelegramBotApi.mod.MenuButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var chat_id: js.UndefOr[Double] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setChat_id(value: Double): Self = StObject.set(x, "chat_id", value.asInstanceOf[js.Any])
      
      inline def setChat_idUndefined: Self = StObject.set(x, "chat_id", js.undefined)
    }
  }
  
  trait `1` extends StObject {
    
    var for_channels: js.UndefOr[Boolean] = js.undefined
  }
  object `1` {
    
    inline def apply(): `1` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`1`]
    }
    
    extension [Self <: `1`](x: Self) {
      
      inline def setFor_channels(value: Boolean): Self = StObject.set(x, "for_channels", value.asInstanceOf[js.Any])
      
      inline def setFor_channelsUndefined: Self = StObject.set(x, "for_channels", js.undefined)
    }
  }
  
  trait Chatid extends StObject {
    
    var chat_id: js.UndefOr[Double] = js.undefined
    
    var menu_button: js.UndefOr[MenuButton] = js.undefined
  }
  object Chatid {
    
    inline def apply(): Chatid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Chatid]
    }
    
    extension [Self <: Chatid](x: Self) {
      
      inline def setChat_id(value: Double): Self = StObject.set(x, "chat_id", value.asInstanceOf[js.Any])
      
      inline def setChat_idUndefined: Self = StObject.set(x, "chat_id", js.undefined)
      
      inline def setMenu_button(value: MenuButton): Self = StObject.set(x, "menu_button", value.asInstanceOf[js.Any])
      
      inline def setMenu_buttonUndefined: Self = StObject.set(x, "menu_button", js.undefined)
    }
  }
  
  trait Forchannels extends StObject {
    
    var for_channels: js.UndefOr[Boolean] = js.undefined
    
    var rights: js.UndefOr[ChatAdministratorRights] = js.undefined
  }
  object Forchannels {
    
    inline def apply(): Forchannels = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Forchannels]
    }
    
    extension [Self <: Forchannels](x: Self) {
      
      inline def setFor_channels(value: Boolean): Self = StObject.set(x, "for_channels", value.asInstanceOf[js.Any])
      
      inline def setFor_channelsUndefined: Self = StObject.set(x, "for_channels", js.undefined)
      
      inline def setRights(value: ChatAdministratorRights): Self = StObject.set(x, "rights", value.asInstanceOf[js.Any])
      
      inline def setRightsUndefined: Self = StObject.set(x, "rights", js.undefined)
    }
  }
  
  trait Languagecode extends StObject {
    
    var language_code: js.UndefOr[String] = js.undefined
    
    var scope: js.UndefOr[BotCommandScope] = js.undefined
  }
  object Languagecode {
    
    inline def apply(): Languagecode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Languagecode]
    }
    
    extension [Self <: Languagecode](x: Self) {
      
      inline def setLanguage_code(value: String): Self = StObject.set(x, "language_code", value.asInstanceOf[js.Any])
      
      inline def setLanguage_codeUndefined: Self = StObject.set(x, "language_code", js.undefined)
      
      inline def setScope(value: BotCommandScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  /* Inlined std.Partial<node-telegram-bot-api.node-telegram-bot-api.AnswerCallbackQueryOptions> */
  trait PartialAnswerCallbackQuer extends StObject {
    
    var cache_time: js.UndefOr[Double] = js.undefined
    
    var callback_query_id: js.UndefOr[String] = js.undefined
    
    var show_alert: js.UndefOr[Boolean] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object PartialAnswerCallbackQuer {
    
    inline def apply(): PartialAnswerCallbackQuer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialAnswerCallbackQuer]
    }
    
    extension [Self <: PartialAnswerCallbackQuer](x: Self) {
      
      inline def setCache_time(value: Double): Self = StObject.set(x, "cache_time", value.asInstanceOf[js.Any])
      
      inline def setCache_timeUndefined: Self = StObject.set(x, "cache_time", js.undefined)
      
      inline def setCallback_query_id(value: String): Self = StObject.set(x, "callback_query_id", value.asInstanceOf[js.Any])
      
      inline def setCallback_query_idUndefined: Self = StObject.set(x, "callback_query_id", js.undefined)
      
      inline def setShow_alert(value: Boolean): Self = StObject.set(x, "show_alert", value.asInstanceOf[js.Any])
      
      inline def setShow_alertUndefined: Self = StObject.set(x, "show_alert", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
