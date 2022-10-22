package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaKeySessionEventMap extends StObject {
  
  /* standard dom */
  var keystatuseschange: org.scalajs.dom.Event
  
  /* standard dom */
  var message: MediaKeyMessageEvent
}
object MediaKeySessionEventMap {
  
  inline def apply(keystatuseschange: org.scalajs.dom.Event, message: MediaKeyMessageEvent): MediaKeySessionEventMap = {
    val __obj = js.Dynamic.literal(keystatuseschange = keystatuseschange.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaKeySessionEventMap]
  }
  
  extension [Self <: MediaKeySessionEventMap](x: Self) {
    
    inline def setKeystatuseschange(value: org.scalajs.dom.Event): Self = StObject.set(x, "keystatuseschange", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: MediaKeyMessageEvent): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
