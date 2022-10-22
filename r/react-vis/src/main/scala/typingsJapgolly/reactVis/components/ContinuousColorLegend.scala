package typingsJapgolly.reactVis.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactVis.mod.ContinuousColorLegendProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ContinuousColorLegend {
  
  inline def apply(endTitle: Double | String, startTitle: Double | String): Builder = {
    val __props = js.Dynamic.literal(endTitle = endTitle.asInstanceOf[js.Any], startTitle = startTitle.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ContinuousColorLegendProps]))
  }
  
  @JSImport("react-vis", "ContinuousColorLegend")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def endColor(value: String): this.type = set("endColor", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def midColor(value: String): this.type = set("midColor", value.asInstanceOf[js.Any])
    
    inline def midTitle(value: Double | String): this.type = set("midTitle", value.asInstanceOf[js.Any])
    
    inline def startColor(value: String): this.type = set("startColor", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ContinuousColorLegendProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
