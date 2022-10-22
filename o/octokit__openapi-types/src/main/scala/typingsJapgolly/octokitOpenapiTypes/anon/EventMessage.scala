package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.DISMISS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventMessage extends StObject {
  
  /**
    * @example "DISMISS"
    * @enum {string}
    */
  var event: js.UndefOr[DISMISS] = js.undefined
  
  /** @description The message for the pull request review dismissal */
  var message: String
}
object EventMessage {
  
  inline def apply(message: String): EventMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMessage]
  }
  
  extension [Self <: EventMessage](x: Self) {
    
    inline def setEvent(value: DISMISS): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
