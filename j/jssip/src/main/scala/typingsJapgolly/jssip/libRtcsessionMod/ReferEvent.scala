package typingsJapgolly.jssip.libRtcsessionMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jssip.libSipmessageMod.IncomingRequest
import typingsJapgolly.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferEvent extends StObject {
  
  var accept: js.Function
  
  def reject(): Unit
  @JSName("reject")
  var reject_Original: VoidFunction
  
  var request: IncomingRequest
}
object ReferEvent {
  
  inline def apply(accept: js.Function, reject: Callback, request: IncomingRequest): ReferEvent = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], reject = reject.toJsFn, request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferEvent]
  }
  
  extension [Self <: ReferEvent](x: Self) {
    
    inline def setAccept(value: js.Function): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    inline def setReject(value: Callback): Self = StObject.set(x, "reject", value.toJsFn)
    
    inline def setRequest(value: IncomingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
