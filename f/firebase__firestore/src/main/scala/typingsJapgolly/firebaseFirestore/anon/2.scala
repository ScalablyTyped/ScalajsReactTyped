package typingsJapgolly.firebaseFirestore.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`[R] extends StObject {
  
  def forEach(cb: js.Function1[/* r */ R, Unit]): Unit
}
object `2` {
  
  inline def apply[R](forEach: js.Function1[/* r */ R, Unit] => Callback): `2`[R] = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1((t0: js.Function1[/* r */ R, Unit]) => forEach(t0).runNow()))
    __obj.asInstanceOf[`2`[R]]
  }
  
  extension [Self <: `2`[?], R](x: Self & `2`[R]) {
    
    inline def setForEach(value: js.Function1[/* r */ R, Unit] => Callback): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: js.Function1[/* r */ R, Unit]) => value(t0).runNow()))
  }
}
