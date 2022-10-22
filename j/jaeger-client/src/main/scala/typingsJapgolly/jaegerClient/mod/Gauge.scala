package typingsJapgolly.jaegerClient.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gauge extends StObject {
  
  // Update the gauge to the value passed in.
  def update(value: Double): Unit
}
object Gauge {
  
  inline def apply(update: Double => Callback): Gauge = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction1((t0: Double) => update(t0).runNow()))
    __obj.asInstanceOf[Gauge]
  }
  
  extension [Self <: Gauge](x: Self) {
    
    inline def setUpdate(value: Double => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
