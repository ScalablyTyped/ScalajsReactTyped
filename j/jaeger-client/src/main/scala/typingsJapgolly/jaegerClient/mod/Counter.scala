package typingsJapgolly.jaegerClient.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Counter extends StObject {
  
  // Adds the given value to the counter.
  def increment(delta: Double): Unit
}
object Counter {
  
  inline def apply(increment: Double => Callback): Counter = {
    val __obj = js.Dynamic.literal(increment = js.Any.fromFunction1((t0: Double) => increment(t0).runNow()))
    __obj.asInstanceOf[Counter]
  }
  
  extension [Self <: Counter](x: Self) {
    
    inline def setIncrement(value: Double => Callback): Self = StObject.set(x, "increment", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
