package typingsJapgolly.jssip.libRtcsessionMod

import typingsJapgolly.jssip.libRtcsessionMod.Originator.REMOTE
import typingsJapgolly.jssip.libSipmessageMod.IncomingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncomingInfoEvent extends StObject {
  
  var info: Info
  
  var originator: REMOTE
  
  var request: IncomingRequest
}
object IncomingInfoEvent {
  
  inline def apply(info: Info, originator: REMOTE, request: IncomingRequest): IncomingInfoEvent = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], originator = originator.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingInfoEvent]
  }
  
  extension [Self <: IncomingInfoEvent](x: Self) {
    
    inline def setInfo(value: Info): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setOriginator(value: REMOTE): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: IncomingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
