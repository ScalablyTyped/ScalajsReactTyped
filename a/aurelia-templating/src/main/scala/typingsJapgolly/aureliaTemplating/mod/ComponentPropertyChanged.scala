package typingsJapgolly.aureliaTemplating.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentPropertyChanged extends StObject {
  
  def propertyChanged(name: String, newValue: Any, oldValue: Any): Unit
}
object ComponentPropertyChanged {
  
  inline def apply(propertyChanged: (String, Any, Any) => Callback): ComponentPropertyChanged = {
    val __obj = js.Dynamic.literal(propertyChanged = js.Any.fromFunction3((t0: String, t1: Any, t2: Any) => (propertyChanged(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[ComponentPropertyChanged]
  }
  
  extension [Self <: ComponentPropertyChanged](x: Self) {
    
    inline def setPropertyChanged(value: (String, Any, Any) => Callback): Self = StObject.set(x, "propertyChanged", js.Any.fromFunction3((t0: String, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
  }
}
