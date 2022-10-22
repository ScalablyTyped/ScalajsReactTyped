package typingsJapgolly.reactSvgRadarChart.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactSvgRadarChart.mod.ChartData
import typingsJapgolly.reactSvgRadarChart.mod.ChartOptionsProps
import typingsJapgolly.reactSvgRadarChart.mod.ChartProps
import typingsJapgolly.reactSvgRadarChart.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactSvgRadarChart {
  
  inline def apply(data: js.Array[ChartData], size: Double): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ChartProps]))
  }
  
  @JSImport("react-svg-radar-chart", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def options(value: ChartOptionsProps): this.type = set("options", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
