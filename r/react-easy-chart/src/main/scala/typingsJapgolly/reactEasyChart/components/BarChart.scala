package typingsJapgolly.reactEasyChart.components

import org.scalajs.dom.MouseEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactEasyChart.anon.Bottom
import typingsJapgolly.reactEasyChart.anon.X
import typingsJapgolly.reactEasyChart.mod.BarChartProps
import typingsJapgolly.reactEasyChart.mod.BarData
import typingsJapgolly.reactEasyChart.mod.LineData
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.linear
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.text
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BarChart {
  
  inline def apply(data: js.Array[BarData]): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BarChartProps]))
  }
  
  @JSImport("react-easy-chart", "BarChart")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactEasyChart.mod.BarChart] {
    
    inline def axes(value: Boolean): this.type = set("axes", value.asInstanceOf[js.Any])
    
    inline def axisLabels(value: X): this.type = set("axisLabels", value.asInstanceOf[js.Any])
    
    inline def barWidth(value: Double): this.type = set("barWidth", value.asInstanceOf[js.Any])
    
    inline def clickHandler(value: (/* data */ BarData, /* mouseEvent */ MouseEvent) => Any): this.type = set("clickHandler", js.Any.fromFunction2(value))
    
    inline def colorBars(value: Boolean): this.type = set("colorBars", value.asInstanceOf[js.Any])
    
    inline def datePattern(value: String): this.type = set("datePattern", value.asInstanceOf[js.Any])
    
    inline def grid(value: Boolean): this.type = set("grid", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def interpolate(value: String): this.type = set("interpolate", value.asInstanceOf[js.Any])
    
    inline def lineData(value: js.Array[LineData]): this.type = set("lineData", value.asInstanceOf[js.Any])
    
    inline def lineDataVarargs(value: LineData*): this.type = set("lineData", js.Array(value*))
    
    inline def margin(value: Bottom): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def mouseMoveHandler(value: (/* data */ BarData, /* mouseEvent */ MouseEvent) => Any): this.type = set("mouseMoveHandler", js.Any.fromFunction2(value))
    
    inline def mouseOutHandler(value: (/* data */ BarData, /* mouseEvent */ MouseEvent) => Any): this.type = set("mouseOutHandler", js.Any.fromFunction2(value))
    
    inline def mouseOverHandler(value: (/* data */ BarData, /* mouseEvent */ MouseEvent) => Any): this.type = set("mouseOverHandler", js.Any.fromFunction2(value))
    
    inline def tickTimeDisplayFormat(value: String): this.type = set("tickTimeDisplayFormat", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def xDomainRange(value: js.Array[js.Date | Double | String]): this.type = set("xDomainRange", value.asInstanceOf[js.Any])
    
    inline def xDomainRangeVarargs(value: (js.Date | Double | String)*): this.type = set("xDomainRange", js.Array(value*))
    
    inline def xTickNumber(value: Double): this.type = set("xTickNumber", value.asInstanceOf[js.Any])
    
    inline def xType(value: time | text | linear): this.type = set("xType", value.asInstanceOf[js.Any])
    
    inline def y2Type(value: time | text | linear): this.type = set("y2Type", value.asInstanceOf[js.Any])
    
    inline def yAxisOrientRight(value: Boolean): this.type = set("yAxisOrientRight", value.asInstanceOf[js.Any])
    
    inline def yDomainRange(value: js.Array[Double]): this.type = set("yDomainRange", value.asInstanceOf[js.Any])
    
    inline def yDomainRangeVarargs(value: Double*): this.type = set("yDomainRange", js.Array(value*))
    
    inline def yTickNumber(value: Double): this.type = set("yTickNumber", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BarChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
