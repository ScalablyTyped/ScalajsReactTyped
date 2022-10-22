package typingsJapgolly.reactLeafletPixiOverlay.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactLeafletPixiOverlay.mod.MarkersPropsPixiOverlay
import typingsJapgolly.reactLeafletPixiOverlay.mod.PixiOverlayProps
import typingsJapgolly.reactLeafletPixiOverlay.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactLeafletPixiOverlay {
  
  inline def apply(markers: MarkersPropsPixiOverlay): Default[default] = {
    val __props = js.Dynamic.literal(markers = markers.asInstanceOf[js.Any])
    new Default[default](js.Array(this.component, __props.asInstanceOf[PixiOverlayProps]))
  }
  
  @JSImport("react-leaflet-pixi-overlay", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PixiOverlayProps): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
