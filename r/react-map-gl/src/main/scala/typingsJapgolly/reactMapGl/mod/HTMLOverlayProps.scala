package typingsJapgolly.reactMapGl.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLOverlayProps
  extends StObject
     with BaseControlProps {
  
  def redraw(opts: HTMLRedrawOptions): Unit
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object HTMLOverlayProps {
  
  inline def apply(redraw: HTMLRedrawOptions => Callback): HTMLOverlayProps = {
    val __obj = js.Dynamic.literal(redraw = js.Any.fromFunction1((t0: HTMLRedrawOptions) => redraw(t0).runNow()))
    __obj.asInstanceOf[HTMLOverlayProps]
  }
  
  extension [Self <: HTMLOverlayProps](x: Self) {
    
    inline def setRedraw(value: HTMLRedrawOptions => Callback): Self = StObject.set(x, "redraw", js.Any.fromFunction1((t0: HTMLRedrawOptions) => value(t0).runNow()))
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
