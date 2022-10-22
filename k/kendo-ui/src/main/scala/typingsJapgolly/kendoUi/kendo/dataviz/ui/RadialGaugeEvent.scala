package typingsJapgolly.kendoUi.kendo.dataviz.ui

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadialGaugeEvent extends StObject {
  
  def isDefaultPrevented(): Boolean
  
  var preventDefault: js.Function
  
  var sender: RadialGauge
}
object RadialGaugeEvent {
  
  inline def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: RadialGauge): RadialGaugeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialGaugeEvent]
  }
  
  extension [Self <: RadialGaugeEvent](x: Self) {
    
    inline def setIsDefaultPrevented(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDefaultPrevented", value.toJsFn)
    
    inline def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setSender(value: RadialGauge): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
