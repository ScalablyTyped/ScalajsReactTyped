package typingsJapgolly.reactMapGl.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasOverlayProps
  extends StObject
     with BaseControlProps {
  
  def redraw(opts: CanvasRedrawOptions): Unit
}
object CanvasOverlayProps {
  
  inline def apply(redraw: CanvasRedrawOptions => Callback): CanvasOverlayProps = {
    val __obj = js.Dynamic.literal(redraw = js.Any.fromFunction1((t0: CanvasRedrawOptions) => redraw(t0).runNow()))
    __obj.asInstanceOf[CanvasOverlayProps]
  }
  
  extension [Self <: CanvasOverlayProps](x: Self) {
    
    inline def setRedraw(value: CanvasRedrawOptions => Callback): Self = StObject.set(x, "redraw", js.Any.fromFunction1((t0: CanvasRedrawOptions) => value(t0).runNow()))
  }
}
