package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X3DChartWindowProvider extends StObject {
  
  def setWindow(window: Double): Unit
}
object X3DChartWindowProvider {
  
  inline def apply(setWindow: Double => Callback): X3DChartWindowProvider = {
    val __obj = js.Dynamic.literal(setWindow = js.Any.fromFunction1((t0: Double) => setWindow(t0).runNow()))
    __obj.asInstanceOf[X3DChartWindowProvider]
  }
  
  extension [Self <: X3DChartWindowProvider](x: Self) {
    
    inline def setSetWindow(value: Double => Callback): Self = StObject.set(x, "setWindow", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
