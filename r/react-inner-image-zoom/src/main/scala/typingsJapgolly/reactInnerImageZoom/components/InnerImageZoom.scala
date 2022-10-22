package typingsJapgolly.reactInnerImageZoom.components

import typingsJapgolly.reactInnerImageZoom.mod.InnerImageZoomProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InnerImageZoom {
  
  inline def apply(src: String): SharedBuilder_InnerImageZoomProps99278397[typingsJapgolly.reactInnerImageZoom.mod.InnerImageZoom] = {
    val __props = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    new SharedBuilder_InnerImageZoomProps99278397[typingsJapgolly.reactInnerImageZoom.mod.InnerImageZoom](js.Array(this.component, __props.asInstanceOf[InnerImageZoomProps]))
  }
  
  @JSImport("react-inner-image-zoom", "InnerImageZoom")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: InnerImageZoomProps): SharedBuilder_InnerImageZoomProps99278397[typingsJapgolly.reactInnerImageZoom.mod.InnerImageZoom] = new SharedBuilder_InnerImageZoomProps99278397[typingsJapgolly.reactInnerImageZoom.mod.InnerImageZoom](js.Array(this.component, p.asInstanceOf[js.Any]))
}
