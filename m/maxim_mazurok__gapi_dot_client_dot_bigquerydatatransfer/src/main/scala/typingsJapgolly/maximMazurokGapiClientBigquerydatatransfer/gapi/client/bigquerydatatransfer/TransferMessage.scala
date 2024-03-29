package typingsJapgolly.maximMazurokGapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferMessage extends StObject {
  
  /** Message text. */
  var messageText: js.UndefOr[String] = js.undefined
  
  /** Time when message was logged. */
  var messageTime: js.UndefOr[String] = js.undefined
  
  /** Message severity. */
  var severity: js.UndefOr[String] = js.undefined
}
object TransferMessage {
  
  inline def apply(): TransferMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferMessage]
  }
  
  extension [Self <: TransferMessage](x: Self) {
    
    inline def setMessageText(value: String): Self = StObject.set(x, "messageText", value.asInstanceOf[js.Any])
    
    inline def setMessageTextUndefined: Self = StObject.set(x, "messageText", js.undefined)
    
    inline def setMessageTime(value: String): Self = StObject.set(x, "messageTime", value.asInstanceOf[js.Any])
    
    inline def setMessageTimeUndefined: Self = StObject.set(x, "messageTime", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
  }
}
