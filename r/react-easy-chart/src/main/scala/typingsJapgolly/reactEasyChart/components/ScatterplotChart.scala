package typingsJapgolly.reactEasyChart.components

import org.scalajs.dom.MouseEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactEasyChart.anon.Bottom
import typingsJapgolly.reactEasyChart.anon.Stroke
import typingsJapgolly.reactEasyChart.anon.Y
import typingsJapgolly.reactEasyChart.mod.ScatterplotChartProps
import typingsJapgolly.reactEasyChart.mod.ScatterplotData
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.linear
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.text
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScatterplotChart {
  
  inline def apply(data: js.Array[ScatterplotData]): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ScatterplotChartProps]))
  }
  
  @JSImport("react-easy-chart", "ScatterplotChart")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactEasyChart.mod.ScatterplotChart] {
    
    inline def axes(value: Boolean): this.type = set("axes", value.asInstanceOf[js.Any])
    
    inline def axisLabels(value: Y): this.type = set("axisLabels", value.asInstanceOf[js.Any])
    
    inline def clickHandler(value: (/* data */ ScatterplotData, /* mouseEvent */ MouseEvent) => Any): this.type = set("clickHandler", js.Any.fromFunction2(value))
    
    inline def config(value: js.Array[Stroke]): this.type = set("config", value.asInstanceOf[js.Any])
    
    inline def configVarargs(value: Stroke*): this.type = set("config", js.Array(value*))
    
    inline def dotRadius(value: Double): this.type = set("dotRadius", value.asInstanceOf[js.Any])
    
    inline def grid(value: Boolean): this.type = set("grid", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def margin(value: Bottom): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def mouseMoveHandler(value: (/* data */ ScatterplotData, /* mouseEvent */ MouseEvent) => Any): this.type = set("mouseMoveHandler", js.Any.fromFunction2(value))
    
    inline def mouseOutHandler(value: (/* data */ ScatterplotData, /* mouseEvent */ MouseEvent) => Any): this.type = set("mouseOutHandler", js.Any.fromFunction2(value))
    
    inline def mouseOverHandler(value: (/* data */ ScatterplotData, /* mouseEvent */ MouseEvent) => Any): this.type = set("mouseOverHandler", js.Any.fromFunction2(value))
    
    inline def verticalGrid(value: Boolean): this.type = set("verticalGrid", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def xDomainRange(value: js.Array[js.Date | Double | String]): this.type = set("xDomainRange", value.asInstanceOf[js.Any])
    
    inline def xDomainRangeVarargs(value: (js.Date | Double | String)*): this.type = set("xDomainRange", js.Array(value*))
    
    inline def xType(value: time | text | linear): this.type = set("xType", value.asInstanceOf[js.Any])
    
    inline def yAxisOrientRight(value: Boolean): this.type = set("yAxisOrientRight", value.asInstanceOf[js.Any])
    
    inline def yDomainRange(value: js.Array[js.Date | Double | String]): this.type = set("yDomainRange", value.asInstanceOf[js.Any])
    
    inline def yDomainRangeVarargs(value: (js.Date | Double | String)*): this.type = set("yDomainRange", js.Array(value*))
    
    inline def yType(value: time | text | linear): this.type = set("yType", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ScatterplotChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
