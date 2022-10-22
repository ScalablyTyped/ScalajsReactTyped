package typingsJapgolly.webrtc

import typingsJapgolly.std.EventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#idl-def-rtcerroreventinit
trait RTCErrorEventInit
  extends StObject
     with EventInit {
  
  var error: RTCError
}
object RTCErrorEventInit {
  
  inline def apply(error: RTCError): RTCErrorEventInit = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCErrorEventInit]
  }
  
  extension [Self <: RTCErrorEventInit](x: Self) {
    
    inline def setError(value: RTCError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
