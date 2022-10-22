package typingsJapgolly.jssip.libRtcsessionMod

import typingsJapgolly.jssip.libRtcsessionMod.Originator.REMOTE
import typingsJapgolly.jssip.libSipmessageMod.IncomingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncomingAckEvent extends StObject {
  
  var ack: IncomingRequest
  
  var originator: REMOTE
}
object IncomingAckEvent {
  
  inline def apply(ack: IncomingRequest, originator: REMOTE): IncomingAckEvent = {
    val __obj = js.Dynamic.literal(ack = ack.asInstanceOf[js.Any], originator = originator.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingAckEvent]
  }
  
  extension [Self <: IncomingAckEvent](x: Self) {
    
    inline def setAck(value: IncomingRequest): Self = StObject.set(x, "ack", value.asInstanceOf[js.Any])
    
    inline def setOriginator(value: REMOTE): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
  }
}
