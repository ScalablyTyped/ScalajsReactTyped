package typingsJapgolly.gestalt.anon

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var event: ReactEventFrom[HTMLInputElement]
  
  var value: String
}
object Value {
  
  inline def apply(event: ReactEventFrom[HTMLInputElement], value: String): Value = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setEvent(value: ReactEventFrom[HTMLInputElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
