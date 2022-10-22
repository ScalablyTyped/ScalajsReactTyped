package typingsJapgolly.teechart.Tee

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TOOLS
trait IDragTool
  extends StObject
     with ITool {
  
  var series: ISeries
}
object IDragTool {
  
  inline def apply(
    active: Boolean,
    chart: IChart,
    clicked: IPoint => Boolean,
    draw: Callback,
    mousedown: Any => Boolean,
    mousemove: Any => Boolean,
    series: ISeries
  ): IDragTool = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], clicked = js.Any.fromFunction1(clicked), draw = draw.toJsFn, mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDragTool]
  }
  
  extension [Self <: IDragTool](x: Self) {
    
    inline def setSeries(value: ISeries): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
  }
}
