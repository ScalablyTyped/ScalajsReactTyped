package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompositionEnd extends StObject {
  
  def compositionEnd(): js.Promise[Unit]
  
  def compositionStart(): js.Promise[Unit]
  
  def mouseDown(eventData: Any): js.Promise[Unit]
  
  def mouseOut(eventData: Any): js.Promise[Unit]
  
  def mouseOver(eventData: Any): js.Promise[Unit]
}
object CompositionEnd {
  
  inline def apply(
    compositionEnd: CallbackTo[js.Promise[Unit]],
    compositionStart: CallbackTo[js.Promise[Unit]],
    mouseDown: Any => js.Promise[Unit],
    mouseOut: Any => js.Promise[Unit],
    mouseOver: Any => js.Promise[Unit]
  ): CompositionEnd = {
    val __obj = js.Dynamic.literal(compositionEnd = compositionEnd.toJsFn, compositionStart = compositionStart.toJsFn, mouseDown = js.Any.fromFunction1(mouseDown), mouseOut = js.Any.fromFunction1(mouseOut), mouseOver = js.Any.fromFunction1(mouseOver))
    __obj.asInstanceOf[CompositionEnd]
  }
  
  extension [Self <: CompositionEnd](x: Self) {
    
    inline def setCompositionEnd(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "compositionEnd", value.toJsFn)
    
    inline def setCompositionStart(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "compositionStart", value.toJsFn)
    
    inline def setMouseDown(value: Any => js.Promise[Unit]): Self = StObject.set(x, "mouseDown", js.Any.fromFunction1(value))
    
    inline def setMouseOut(value: Any => js.Promise[Unit]): Self = StObject.set(x, "mouseOut", js.Any.fromFunction1(value))
    
    inline def setMouseOver(value: Any => js.Promise[Unit]): Self = StObject.set(x, "mouseOver", js.Any.fromFunction1(value))
  }
}
