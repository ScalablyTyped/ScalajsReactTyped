package typingsJapgolly.nivoCore.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoCore.mod.DotsItemProps
import typingsJapgolly.nivoCore.mod.DotsItemSymbolComponent
import typingsJapgolly.nivoCore.nivoCoreStrings.end
import typingsJapgolly.nivoCore.nivoCoreStrings.middle
import typingsJapgolly.nivoCore.nivoCoreStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DotsItem {
  
  inline def apply(
    borderColor: String,
    borderWidth: Double,
    color: String,
    datum: Any,
    size: Double,
    x: Double,
    y: Double
  ): Builder = {
    val __props = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DotsItemProps[Any]]))
  }
  
  @JSImport("@nivo/core", "DotsItem")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def label(value: String | Double): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def labelTextAnchor(value: start | middle | end): this.type = set("labelTextAnchor", value.asInstanceOf[js.Any])
    
    inline def labelYOffset(value: Double): this.type = set("labelYOffset", value.asInstanceOf[js.Any])
    
    inline def symbol(value: DotsItemSymbolComponent): this.type = set("symbol", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DotsItemProps[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
