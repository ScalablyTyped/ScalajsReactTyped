package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesRadarChartMod.DataPoint
import typingsJapgolly.wixStyleReact.distTypesRadarChartMod.RadarChartProps
import typingsJapgolly.wixStyleReact.distTypesRadarChartMod.ScalePoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadarChart {
  
  @JSImport("wix-style-react", "RadarChart")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.RadarChart] {
    
    inline def data(value: js.Array[DataPoint]): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def dataVarargs(value: DataPoint*): this.type = set("data", js.Array(value*))
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def hoverIndex(value: Double): this.type = set("hoverIndex", value.asInstanceOf[js.Any])
    
    inline def hoverIndexNull: this.type = set("hoverIndex", null)
    
    inline def labelDistance(value: Double): this.type = set("labelDistance", value.asInstanceOf[js.Any])
    
    inline def onDataPointHover(value: Callback): this.type = set("onDataPointHover", value.toJsFn)
    
    inline def scale(value: js.Array[ScalePoint]): this.type = set("scale", value.asInstanceOf[js.Any])
    
    inline def scaleVarargs(value: ScalePoint*): this.type = set("scale", js.Array(value*))
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: RadarChart.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RadarChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
