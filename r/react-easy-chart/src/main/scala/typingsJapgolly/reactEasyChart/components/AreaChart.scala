package typingsJapgolly.reactEasyChart.components

import org.scalajs.dom.MouseEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactEasyChart.anon.Bottom
import typingsJapgolly.reactEasyChart.anon.Y
import typingsJapgolly.reactEasyChart.mod.AreaChartProps
import typingsJapgolly.reactEasyChart.mod.LineData
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.`basis-closed`
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.`basis-open`
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.`cardinal-closed`
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.`cardinal-open`
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.`linear-closed`
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.`step-after`
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.`step-before`
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.basis
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.bundle
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.cardinal
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.linear
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.monotone
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.step
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.text
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AreaChart {
  
  inline def apply(data: js.Array[js.Array[LineData]]): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AreaChartProps]))
  }
  
  @JSImport("react-easy-chart", "AreaChart")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactEasyChart.mod.AreaChart] {
    
    inline def axes(value: Boolean): this.type = set("axes", value.asInstanceOf[js.Any])
    
    inline def axisLabels(value: Y): this.type = set("axisLabels", value.asInstanceOf[js.Any])
    
    inline def clickHandler(value: (/* data */ LineData, /* mouseEvent */ MouseEvent) => Any): this.type = set("clickHandler", js.Any.fromFunction2(value))
    
    inline def dataPoints(value: Boolean): this.type = set("dataPoints", value.asInstanceOf[js.Any])
    
    inline def grid(value: Boolean): this.type = set("grid", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def interpolate(
      value: linear | `linear-closed` | step | `step-before` | `step-after` | basis | `basis-open` | `basis-closed` | bundle | cardinal | `cardinal-open` | `cardinal-closed` | monotone
    ): this.type = set("interpolate", value.asInstanceOf[js.Any])
    
    inline def lineColors(value: js.Array[String]): this.type = set("lineColors", value.asInstanceOf[js.Any])
    
    inline def lineColorsVarargs(value: String*): this.type = set("lineColors", js.Array(value*))
    
    inline def margin(value: Bottom): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def mouseMoveHandler(value: (/* data */ LineData, /* mouseEvent */ MouseEvent) => Any): this.type = set("mouseMoveHandler", js.Any.fromFunction2(value))
    
    inline def mouseOutHandler(value: (/* data */ LineData, /* mouseEvent */ MouseEvent) => Any): this.type = set("mouseOutHandler", js.Any.fromFunction2(value))
    
    inline def mouseOverHandler(value: (/* data */ LineData, /* mouseEvent */ MouseEvent) => Any): this.type = set("mouseOverHandler", js.Any.fromFunction2(value))
    
    inline def noAreaGradient(value: Boolean): this.type = set("noAreaGradient", value.asInstanceOf[js.Any])
    
    inline def tickTimeDisplayFormat(value: String): this.type = set("tickTimeDisplayFormat", value.asInstanceOf[js.Any])
    
    inline def verticalGrid(value: Boolean): this.type = set("verticalGrid", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def xDomainRange(value: js.Array[js.Date | Double | String]): this.type = set("xDomainRange", value.asInstanceOf[js.Any])
    
    inline def xDomainRangeVarargs(value: (js.Date | Double | String)*): this.type = set("xDomainRange", js.Array(value*))
    
    inline def xTicks(value: Double): this.type = set("xTicks", value.asInstanceOf[js.Any])
    
    inline def xType(value: time | text | linear): this.type = set("xType", value.asInstanceOf[js.Any])
    
    inline def yAxisOrientRight(value: Boolean): this.type = set("yAxisOrientRight", value.asInstanceOf[js.Any])
    
    inline def yDomainRange(value: js.Array[Double | String]): this.type = set("yDomainRange", value.asInstanceOf[js.Any])
    
    inline def yDomainRangeVarargs(value: (Double | String)*): this.type = set("yDomainRange", js.Array(value*))
    
    inline def yTicks(value: Double): this.type = set("yTicks", value.asInstanceOf[js.Any])
    
    inline def yType(value: time | text | linear): this.type = set("yType", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AreaChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
