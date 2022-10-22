package typingsJapgolly.winrtUwp.Windows.ApplicationModel.VoiceCommands

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The message that is spoken by Cortana and shown on the Cortana canvas. */
trait VoiceCommandUserMessage extends StObject {
  
  /** Gets or sets the message that is shown on the Cortana canvas. */
  var displayMessage: String
  
  /** The message that is spoken by Cortana. */
  var spokenMessage: String
}
object VoiceCommandUserMessage {
  
  inline def apply(displayMessage: String, spokenMessage: String): VoiceCommandUserMessage = {
    val __obj = js.Dynamic.literal(displayMessage = displayMessage.asInstanceOf[js.Any], spokenMessage = spokenMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceCommandUserMessage]
  }
  
  extension [Self <: VoiceCommandUserMessage](x: Self) {
    
    inline def setDisplayMessage(value: String): Self = StObject.set(x, "displayMessage", value.asInstanceOf[js.Any])
    
    inline def setSpokenMessage(value: String): Self = StObject.set(x, "spokenMessage", value.asInstanceOf[js.Any])
  }
}
