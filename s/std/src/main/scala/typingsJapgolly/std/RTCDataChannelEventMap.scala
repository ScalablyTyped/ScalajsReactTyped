package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCDataChannelEventMap extends StObject {
  
  /* standard dom */
  var bufferedamountlow: org.scalajs.dom.Event
  
  /* standard dom */
  var close: org.scalajs.dom.Event
  
  /* standard dom */
  var closing: org.scalajs.dom.Event
  
  /* standard dom */
  var error: org.scalajs.dom.Event
  
  /* standard dom */
  var message: org.scalajs.dom.MessageEvent
  
  /* standard dom */
  var open: org.scalajs.dom.Event
}
object RTCDataChannelEventMap {
  
  inline def apply(
    bufferedamountlow: org.scalajs.dom.Event,
    close: org.scalajs.dom.Event,
    closing: org.scalajs.dom.Event,
    error: org.scalajs.dom.Event,
    message: org.scalajs.dom.MessageEvent,
    open: org.scalajs.dom.Event
  ): RTCDataChannelEventMap = {
    val __obj = js.Dynamic.literal(bufferedamountlow = bufferedamountlow.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], closing = closing.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDataChannelEventMap]
  }
  
  extension [Self <: RTCDataChannelEventMap](x: Self) {
    
    inline def setBufferedamountlow(value: org.scalajs.dom.Event): Self = StObject.set(x, "bufferedamountlow", value.asInstanceOf[js.Any])
    
    inline def setClose(value: org.scalajs.dom.Event): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setClosing(value: org.scalajs.dom.Event): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
    
    inline def setError(value: org.scalajs.dom.Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: org.scalajs.dom.MessageEvent): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: org.scalajs.dom.Event): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
