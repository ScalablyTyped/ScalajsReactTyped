package typingsJapgolly.reactMapGl.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactMapGl.mod.SVGOverlayProps
import typingsJapgolly.reactMapGl.mod.SVGRedrawOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SVGOverlay {
  
  inline def apply(redraw: SVGRedrawOptions => Callback): Builder = {
    val __props = js.Dynamic.literal(redraw = js.Any.fromFunction1((t0: SVGRedrawOptions) => redraw(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[SVGOverlayProps]))
  }
  
  @JSImport("react-map-gl", "SVGOverlay")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactMapGl.mod.SVGOverlay] {
    
    inline def captureClick(value: Boolean): this.type = set("captureClick", value.asInstanceOf[js.Any])
    
    inline def captureDoubleClick(value: Boolean): this.type = set("captureDoubleClick", value.asInstanceOf[js.Any])
    
    inline def captureDrag(value: Boolean): this.type = set("captureDrag", value.asInstanceOf[js.Any])
    
    inline def captureScroll(value: Boolean): this.type = set("captureScroll", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SVGOverlayProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
