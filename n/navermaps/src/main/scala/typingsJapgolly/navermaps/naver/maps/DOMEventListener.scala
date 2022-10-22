package typingsJapgolly.navermaps.naver.maps

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMEventListener extends StObject {
  
  var eventName: String
  
  def listener(): Any
  
  var target: HTMLElement
}
object DOMEventListener {
  
  inline def apply(eventName: String, listener: CallbackTo[Any], target: HTMLElement): DOMEventListener = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], listener = listener.toJsFn, target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMEventListener]
  }
  
  extension [Self <: DOMEventListener](x: Self) {
    
    inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setListener(value: CallbackTo[Any]): Self = StObject.set(x, "listener", value.toJsFn)
    
    inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
