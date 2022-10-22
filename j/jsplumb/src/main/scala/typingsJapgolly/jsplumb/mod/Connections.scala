package typingsJapgolly.jsplumb.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connections extends StObject {
  
  def detach(): Unit
  
  def each(e: js.Function1[/* c */ Connection, Unit]): Unit
  
  var length: Double
}
object Connections {
  
  inline def apply(detach: Callback, each: js.Function1[/* c */ Connection, Unit] => Callback, length: Double): Connections = {
    val __obj = js.Dynamic.literal(detach = detach.toJsFn, each = js.Any.fromFunction1((t0: js.Function1[/* c */ Connection, Unit]) => each(t0).runNow()), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connections]
  }
  
  extension [Self <: Connections](x: Self) {
    
    inline def setDetach(value: Callback): Self = StObject.set(x, "detach", value.toJsFn)
    
    inline def setEach(value: js.Function1[/* c */ Connection, Unit] => Callback): Self = StObject.set(x, "each", js.Any.fromFunction1((t0: js.Function1[/* c */ Connection, Unit]) => value(t0).runNow()))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
