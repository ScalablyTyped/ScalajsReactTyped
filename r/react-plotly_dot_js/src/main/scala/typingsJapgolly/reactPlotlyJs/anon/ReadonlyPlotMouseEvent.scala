package typingsJapgolly.reactPlotlyJs.anon

import org.scalajs.dom.MouseEvent
import typingsJapgolly.plotlyJs.mod.PlotDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<plotly.js.plotly.js.PlotMouseEvent> */
trait ReadonlyPlotMouseEvent extends StObject {
  
  val event: MouseEvent
  
  val points: js.Array[PlotDatum]
}
object ReadonlyPlotMouseEvent {
  
  inline def apply(event: MouseEvent, points: js.Array[PlotDatum]): ReadonlyPlotMouseEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyPlotMouseEvent]
  }
  
  extension [Self <: ReadonlyPlotMouseEvent](x: Self) {
    
    inline def setEvent(value: MouseEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setPoints(value: js.Array[PlotDatum]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: PlotDatum*): Self = StObject.set(x, "points", js.Array(value*))
  }
}
