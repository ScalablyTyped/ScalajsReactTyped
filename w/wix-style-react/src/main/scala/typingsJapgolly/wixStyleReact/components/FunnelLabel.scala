package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesFunnelChartFunnelLabelMod.FunnelLabelProps
import typingsJapgolly.wixStyleReact.distTypesFunnelChartFunnelLabelMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FunnelLabel {
  
  inline def apply(label: String): Builder = {
    val __props = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FunnelLabelProps]))
  }
  
  @JSImport("wix-style-react/dist/types/FunnelChart/FunnelLabel", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def displayValue(value: String): this.type = set("displayValue", value.asInstanceOf[js.Any])
    
    inline def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FunnelLabelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
