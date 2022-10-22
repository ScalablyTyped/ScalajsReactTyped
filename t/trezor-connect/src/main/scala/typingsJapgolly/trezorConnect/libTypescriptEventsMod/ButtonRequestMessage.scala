package typingsJapgolly.trezorConnect.libTypescriptEventsMod

import typingsJapgolly.trezorConnect.anon.OmitButtonRequestcodecodeCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonRequestMessage
  extends StObject
     with _UiEvent {
  
  var payload: OmitButtonRequestcodecodeCode
  
  var `type`: /* "ui-button" */ String
}
object ButtonRequestMessage {
  
  inline def apply(payload: OmitButtonRequestcodecodeCode, `type`: /* "ui-button" */ String): ButtonRequestMessage = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonRequestMessage]
  }
  
  extension [Self <: ButtonRequestMessage](x: Self) {
    
    inline def setPayload(value: OmitButtonRequestcodecodeCode): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "ui-button" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
