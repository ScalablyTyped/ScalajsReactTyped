package typingsJapgolly.nodeTelegramBotApi.mod

import typingsJapgolly.nodeTelegramBotApi.nodeTelegramBotApiStrings.commands
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuButtonCommands
  extends StObject
     with MenuButton {
  
  var `type`: commands
}
object MenuButtonCommands {
  
  inline def apply(): MenuButtonCommands = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("commands")
    __obj.asInstanceOf[MenuButtonCommands]
  }
  
  extension [Self <: MenuButtonCommands](x: Self) {
    
    inline def setType(value: commands): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
