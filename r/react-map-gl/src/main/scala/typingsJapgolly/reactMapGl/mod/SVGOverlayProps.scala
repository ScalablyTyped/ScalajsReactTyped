package typingsJapgolly.reactMapGl.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGOverlayProps
  extends StObject
     with BaseControlProps {
  
  def redraw(opts: SVGRedrawOptions): Unit
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object SVGOverlayProps {
  
  inline def apply(redraw: SVGRedrawOptions => Callback): SVGOverlayProps = {
    val __obj = js.Dynamic.literal(redraw = js.Any.fromFunction1((t0: SVGRedrawOptions) => redraw(t0).runNow()))
    __obj.asInstanceOf[SVGOverlayProps]
  }
  
  extension [Self <: SVGOverlayProps](x: Self) {
    
    inline def setRedraw(value: SVGRedrawOptions => Callback): Self = StObject.set(x, "redraw", js.Any.fromFunction1((t0: SVGRedrawOptions) => value(t0).runNow()))
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
