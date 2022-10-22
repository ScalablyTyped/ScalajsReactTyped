package typingsJapgolly.jaegerClient.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timer extends StObject {
  
  // Records the time passed in.
  def record(value: Double): Unit
}
object Timer {
  
  inline def apply(record: Double => Callback): Timer = {
    val __obj = js.Dynamic.literal(record = js.Any.fromFunction1((t0: Double) => record(t0).runNow()))
    __obj.asInstanceOf[Timer]
  }
  
  extension [Self <: Timer](x: Self) {
    
    inline def setRecord(value: Double => Callback): Self = StObject.set(x, "record", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
