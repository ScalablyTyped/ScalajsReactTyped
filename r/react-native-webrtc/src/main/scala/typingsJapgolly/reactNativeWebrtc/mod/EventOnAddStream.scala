package typingsJapgolly.reactNativeWebrtc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventOnAddStream extends StObject {
  
  var stream: MediaStream
}
object EventOnAddStream {
  
  inline def apply(stream: MediaStream): EventOnAddStream = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventOnAddStream]
  }
  
  extension [Self <: EventOnAddStream](x: Self) {
    
    inline def setStream(value: MediaStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
