package typingsJapgolly.chartJs.anon

import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.chartJs.mod.ChartType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chart extends StObject {
  
  var chart: typingsJapgolly.chartJs.mod.Chart[ChartType, typingsJapgolly.chartJs.mod.DefaultDataPoint[ChartType], Any]
  
  var ctx: CanvasRenderingContext2D
  
  var id: String
  
  var `type`: String
}
object Chart {
  
  inline def apply(
    chart: typingsJapgolly.chartJs.mod.Chart[ChartType, typingsJapgolly.chartJs.mod.DefaultDataPoint[ChartType], Any],
    ctx: CanvasRenderingContext2D,
    id: String,
    `type`: String
  ): Chart = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chart]
  }
  
  extension [Self <: Chart](x: Self) {
    
    inline def setChart(
      value: typingsJapgolly.chartJs.mod.Chart[ChartType, typingsJapgolly.chartJs.mod.DefaultDataPoint[ChartType], Any]
    ): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setCtx(value: CanvasRenderingContext2D): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
