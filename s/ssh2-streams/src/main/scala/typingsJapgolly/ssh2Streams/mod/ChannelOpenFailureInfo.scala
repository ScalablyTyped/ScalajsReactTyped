package typingsJapgolly.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelOpenFailureInfo extends StObject {
  
  var description: String
  
  var reason: String
  
  var reasonCode: Double
  
  var recipient: Double
}
object ChannelOpenFailureInfo {
  
  inline def apply(description: String, reason: String, reasonCode: Double, recipient: Double): ChannelOpenFailureInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], reasonCode = reasonCode.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelOpenFailureInfo]
  }
  
  extension [Self <: ChannelOpenFailureInfo](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonCode(value: Double): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setRecipient(value: Double): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
  }
}
