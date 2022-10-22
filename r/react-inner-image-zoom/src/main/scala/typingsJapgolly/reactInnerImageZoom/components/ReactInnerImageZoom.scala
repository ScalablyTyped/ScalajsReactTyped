package typingsJapgolly.reactInnerImageZoom.components

import typingsJapgolly.reactInnerImageZoom.mod.InnerImageZoomProps
import typingsJapgolly.reactInnerImageZoom.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactInnerImageZoom {
  
  inline def apply(src: String): SharedBuilder_InnerImageZoomProps99278397[default] = {
    val __props = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    new SharedBuilder_InnerImageZoomProps99278397[default](js.Array(this.component, __props.asInstanceOf[InnerImageZoomProps]))
  }
  
  @JSImport("react-inner-image-zoom", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: InnerImageZoomProps): SharedBuilder_InnerImageZoomProps99278397[default] = new SharedBuilder_InnerImageZoomProps99278397[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
