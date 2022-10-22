package typingsJapgolly.reactBeautifulDnd.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responders extends StObject {
  
  var onBeforeCapture: js.UndefOr[OnBeforeCaptureResponder] = js.undefined
  
  var onBeforeDragStart: js.UndefOr[OnBeforeDragStartResponder] = js.undefined
  
  // always required
  var onDragEnd: OnDragEndResponder
  
  var onDragStart: js.UndefOr[OnDragStartResponder] = js.undefined
  
  var onDragUpdate: js.UndefOr[OnDragUpdateResponder] = js.undefined
}
object Responders {
  
  inline def apply(onDragEnd: (/* result */ DropResult, /* provided */ ResponderProvided) => Callback): Responders = {
    val __obj = js.Dynamic.literal(onDragEnd = js.Any.fromFunction2((t0: /* result */ DropResult, t1: /* provided */ ResponderProvided) => (onDragEnd(t0, t1)).runNow()))
    __obj.asInstanceOf[Responders]
  }
  
  extension [Self <: Responders](x: Self) {
    
    inline def setOnBeforeCapture(value: /* before */ BeforeCapture => Callback): Self = StObject.set(x, "onBeforeCapture", js.Any.fromFunction1((t0: /* before */ BeforeCapture) => value(t0).runNow()))
    
    inline def setOnBeforeCaptureUndefined: Self = StObject.set(x, "onBeforeCapture", js.undefined)
    
    inline def setOnBeforeDragStart(value: /* start */ DragStart => Callback): Self = StObject.set(x, "onBeforeDragStart", js.Any.fromFunction1((t0: /* start */ DragStart) => value(t0).runNow()))
    
    inline def setOnBeforeDragStartUndefined: Self = StObject.set(x, "onBeforeDragStart", js.undefined)
    
    inline def setOnDragEnd(value: (/* result */ DropResult, /* provided */ ResponderProvided) => Callback): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction2((t0: /* result */ DropResult, t1: /* provided */ ResponderProvided) => (value(t0, t1)).runNow()))
    
    inline def setOnDragStart(value: (/* start */ DragStart, /* provided */ ResponderProvided) => Callback): Self = StObject.set(x, "onDragStart", js.Any.fromFunction2((t0: /* start */ DragStart, t1: /* provided */ ResponderProvided) => (value(t0, t1)).runNow()))
    
    inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    inline def setOnDragUpdate(value: (/* update */ DragUpdate, /* provided */ ResponderProvided) => Callback): Self = StObject.set(x, "onDragUpdate", js.Any.fromFunction2((t0: /* update */ DragUpdate, t1: /* provided */ ResponderProvided) => (value(t0, t1)).runNow()))
    
    inline def setOnDragUpdateUndefined: Self = StObject.set(x, "onDragUpdate", js.undefined)
  }
}
