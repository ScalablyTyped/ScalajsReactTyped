package typingsJapgolly.wordpressComponents.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactDragEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.DragEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnDraggableEnd extends StObject {
  
  var onDraggableEnd: DragEventHandler[Element]
  
  var onDraggableStart: DragEventHandler[Element]
}
object OnDraggableEnd {
  
  inline def apply(
    onDraggableEnd: ReactDragEventFrom[Element & Element] => Callback,
    onDraggableStart: ReactDragEventFrom[Element & Element] => Callback
  ): OnDraggableEnd = {
    val __obj = js.Dynamic.literal(onDraggableEnd = js.Any.fromFunction1((t0: ReactDragEventFrom[Element & Element]) => onDraggableEnd(t0).runNow()), onDraggableStart = js.Any.fromFunction1((t0: ReactDragEventFrom[Element & Element]) => onDraggableStart(t0).runNow()))
    __obj.asInstanceOf[OnDraggableEnd]
  }
  
  extension [Self <: OnDraggableEnd](x: Self) {
    
    inline def setOnDraggableEnd(value: ReactDragEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onDraggableEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def setOnDraggableStart(value: ReactDragEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onDraggableStart", js.Any.fromFunction1((t0: ReactDragEventFrom[Element & Element]) => value(t0).runNow()))
  }
}
