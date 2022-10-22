package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragOver extends StObject {
  
  def beginDrag(hasDataHook: `12`): js.Promise[Unit]
  
  def dragOver(hasDataHookOffset: Offset): js.Promise[Unit]
  
  def endDrag(): Any
}
object DragOver {
  
  inline def apply(
    beginDrag: `12` => js.Promise[Unit],
    dragOver: Offset => js.Promise[Unit],
    endDrag: CallbackTo[Any]
  ): DragOver = {
    val __obj = js.Dynamic.literal(beginDrag = js.Any.fromFunction1(beginDrag), dragOver = js.Any.fromFunction1(dragOver), endDrag = endDrag.toJsFn)
    __obj.asInstanceOf[DragOver]
  }
  
  extension [Self <: DragOver](x: Self) {
    
    inline def setBeginDrag(value: `12` => js.Promise[Unit]): Self = StObject.set(x, "beginDrag", js.Any.fromFunction1(value))
    
    inline def setDragOver(value: Offset => js.Promise[Unit]): Self = StObject.set(x, "dragOver", js.Any.fromFunction1(value))
    
    inline def setEndDrag(value: CallbackTo[Any]): Self = StObject.set(x, "endDrag", value.toJsFn)
  }
}
