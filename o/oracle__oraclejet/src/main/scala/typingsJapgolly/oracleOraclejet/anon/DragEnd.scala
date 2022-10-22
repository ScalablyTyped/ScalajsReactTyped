package typingsJapgolly.oracleOraclejet.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragEnd extends StObject {
  
  var dataTypes: String | js.Array[String]
  
  def drag(param0: org.scalajs.dom.Event): Unit
  
  def dragEnd(param0: org.scalajs.dom.Event): Unit
  
  def dragStart(param0: org.scalajs.dom.Event, param1: js.Object): Unit
  
  def linkStyle(param0: js.Object): Unit
  
  var selector: String
}
object DragEnd {
  
  inline def apply(
    dataTypes: String | js.Array[String],
    drag: org.scalajs.dom.Event => Callback,
    dragEnd: org.scalajs.dom.Event => Callback,
    dragStart: (org.scalajs.dom.Event, js.Object) => Callback,
    linkStyle: js.Object => Callback,
    selector: String
  ): DragEnd = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any], drag = js.Any.fromFunction1((t0: org.scalajs.dom.Event) => drag(t0).runNow()), dragEnd = js.Any.fromFunction1((t0: org.scalajs.dom.Event) => dragEnd(t0).runNow()), dragStart = js.Any.fromFunction2((t0: org.scalajs.dom.Event, t1: js.Object) => (dragStart(t0, t1)).runNow()), linkStyle = js.Any.fromFunction1((t0: js.Object) => linkStyle(t0).runNow()), selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragEnd]
  }
  
  extension [Self <: DragEnd](x: Self) {
    
    inline def setDataTypes(value: String | js.Array[String]): Self = StObject.set(x, "dataTypes", value.asInstanceOf[js.Any])
    
    inline def setDataTypesVarargs(value: String*): Self = StObject.set(x, "dataTypes", js.Array(value*))
    
    inline def setDrag(value: org.scalajs.dom.Event => Callback): Self = StObject.set(x, "drag", js.Any.fromFunction1((t0: org.scalajs.dom.Event) => value(t0).runNow()))
    
    inline def setDragEnd(value: org.scalajs.dom.Event => Callback): Self = StObject.set(x, "dragEnd", js.Any.fromFunction1((t0: org.scalajs.dom.Event) => value(t0).runNow()))
    
    inline def setDragStart(value: (org.scalajs.dom.Event, js.Object) => Callback): Self = StObject.set(x, "dragStart", js.Any.fromFunction2((t0: org.scalajs.dom.Event, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setLinkStyle(value: js.Object => Callback): Self = StObject.set(x, "linkStyle", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
  }
}
