package typingsJapgolly.flot

import org.scalajs.dom.HTMLElement
import typingsJapgolly.flot.jquery.flot.dataSeries
import typingsJapgolly.flot.jquery.flot.plotOptions
import typingsJapgolly.flot.jquery.flot.plotStatic
import typingsJapgolly.jquery.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  def plot(placeholder: JQuery[HTMLElement], data: js.Array[Any | dataSeries]): typingsJapgolly.flot.jquery.flot.plot
  def plot(placeholder: JQuery[HTMLElement], data: js.Array[Any | dataSeries], options: plotOptions): typingsJapgolly.flot.jquery.flot.plot
  @JSName("plot")
  var plot_Original: plotStatic
}
object JQueryStatic {
  
  inline def apply(plot: plotStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(plot = plot.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setPlot(value: plotStatic): Self = StObject.set(x, "plot", value.asInstanceOf[js.Any])
  }
}
