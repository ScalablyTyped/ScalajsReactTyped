package typingsJapgolly.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignalEventDefinition
  extends StObject
     with BaseElement {
  
  var signalRef: Signal
}
object SignalEventDefinition {
  
  inline def apply($parent: TypeDerived, $type: ElementType, id: String, signalRef: Signal): SignalEventDefinition = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], signalRef = signalRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalEventDefinition]
  }
  
  extension [Self <: SignalEventDefinition](x: Self) {
    
    inline def setSignalRef(value: Signal): Self = StObject.set(x, "signalRef", value.asInstanceOf[js.Any])
  }
}
