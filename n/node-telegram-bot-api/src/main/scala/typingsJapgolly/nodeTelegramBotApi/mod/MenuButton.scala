package typingsJapgolly.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeTelegramBotApi.mod.MenuButtonCommands
  - typingsJapgolly.nodeTelegramBotApi.mod.MenuButtonWebApp
  - typingsJapgolly.nodeTelegramBotApi.mod.MenuButtonDefault
*/
trait MenuButton extends StObject
object MenuButton {
  
  inline def MenuButtonCommands(): typingsJapgolly.nodeTelegramBotApi.mod.MenuButtonCommands = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("commands")
    __obj.asInstanceOf[typingsJapgolly.nodeTelegramBotApi.mod.MenuButtonCommands]
  }
  
  inline def MenuButtonDefault(): typingsJapgolly.nodeTelegramBotApi.mod.MenuButtonDefault = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("default")
    __obj.asInstanceOf[typingsJapgolly.nodeTelegramBotApi.mod.MenuButtonDefault]
  }
  
  inline def MenuButtonWebApp(text: String, web_app: WebAppInfo): typingsJapgolly.nodeTelegramBotApi.mod.MenuButtonWebApp = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], web_app = web_app.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("web_app")
    __obj.asInstanceOf[typingsJapgolly.nodeTelegramBotApi.mod.MenuButtonWebApp]
  }
}
