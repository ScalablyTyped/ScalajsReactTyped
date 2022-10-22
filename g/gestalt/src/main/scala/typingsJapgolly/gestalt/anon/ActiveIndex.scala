package typingsJapgolly.gestalt.anon

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveIndex extends StObject {
  
  var activeIndex: Double
  
  var event: ReactEventFrom[ReactMouseEventFrom[Element] & Element]
}
object ActiveIndex {
  
  inline def apply(activeIndex: Double, event: ReactEventFrom[ReactMouseEventFrom[Element] & Element]): ActiveIndex = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveIndex]
  }
  
  extension [Self <: ActiveIndex](x: Self) {
    
    inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: ReactEventFrom[ReactMouseEventFrom[Element] & Element]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
