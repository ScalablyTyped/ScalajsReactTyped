package typingsJapgolly.reactSvgPanZoomLoader.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactSvgPanZoomLoader.mod.SvgLoaderSelectElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SvgLoaderSelectElement {
  
  inline def apply(selector: String): Builder = {
    val __props = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SvgLoaderSelectElementProps]))
  }
  
  @JSImport("react-svg-pan-zoom-loader", "SvgLoaderSelectElement")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def children(value: String): this.type = set("children", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SvgLoaderSelectElementProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
