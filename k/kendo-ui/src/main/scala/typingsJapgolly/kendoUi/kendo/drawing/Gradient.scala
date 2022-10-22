package typingsJapgolly.kendoUi.kendo.drawing

import japgolly.scalajs.react.Callback
import typingsJapgolly.kendoUi.kendo.Class
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gradient
  extends StObject
     with Class {
  
  def addStop(offset: Double, color: String, opacity: Double): GradientStop
  
  var options: GradientOptions
  
  def removeStop(stop: GradientStop): Unit
  
  var stops: Any
}
object Gradient {
  
  inline def apply(
    addStop: (Double, String, Double) => GradientStop,
    options: GradientOptions,
    removeStop: GradientStop => Callback,
    stops: Any
  ): Gradient = {
    val __obj = js.Dynamic.literal(addStop = js.Any.fromFunction3(addStop), options = options.asInstanceOf[js.Any], removeStop = js.Any.fromFunction1((t0: GradientStop) => removeStop(t0).runNow()), stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gradient]
  }
  
  extension [Self <: Gradient](x: Self) {
    
    inline def setAddStop(value: (Double, String, Double) => GradientStop): Self = StObject.set(x, "addStop", js.Any.fromFunction3(value))
    
    inline def setOptions(value: GradientOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRemoveStop(value: GradientStop => Callback): Self = StObject.set(x, "removeStop", js.Any.fromFunction1((t0: GradientStop) => value(t0).runNow()))
    
    inline def setStops(value: Any): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
  }
}
