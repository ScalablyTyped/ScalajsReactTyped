package typingsJapgolly.atom.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetailedMessage extends StObject {
  
  var buttons: js.UndefOr[StringDictionary[js.Function0[Unit]]] = js.undefined
  
  var detailedMessage: js.UndefOr[String] = js.undefined
  
  var message: String
}
object DetailedMessage {
  
  inline def apply(message: String): DetailedMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedMessage]
  }
  
  extension [Self <: DetailedMessage](x: Self) {
    
    inline def setButtons(value: StringDictionary[js.Function0[Unit]]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setDetailedMessage(value: String): Self = StObject.set(x, "detailedMessage", value.asInstanceOf[js.Any])
    
    inline def setDetailedMessageUndefined: Self = StObject.set(x, "detailedMessage", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
