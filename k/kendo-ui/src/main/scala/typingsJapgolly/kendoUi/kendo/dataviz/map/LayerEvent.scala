package typingsJapgolly.kendoUi.kendo.dataviz.map

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerEvent extends StObject {
  
  def isDefaultPrevented(): Boolean
  
  var preventDefault: js.Function
  
  var sender: Layer_
}
object LayerEvent {
  
  inline def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: Layer_): LayerEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerEvent]
  }
  
  extension [Self <: LayerEvent](x: Self) {
    
    inline def setIsDefaultPrevented(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDefaultPrevented", value.toJsFn)
    
    inline def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Layer_): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
