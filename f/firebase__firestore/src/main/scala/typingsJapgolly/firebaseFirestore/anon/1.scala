package typingsJapgolly.firebaseFirestore.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`[R, S] extends StObject {
  
  def forEach(cb: js.Function2[/* r */ R, /* s */ S, Unit]): Unit
}
object `1` {
  
  inline def apply[R, S](forEach: js.Function2[/* r */ R, /* s */ S, Unit] => Callback): `1`[R, S] = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1((t0: js.Function2[/* r */ R, /* s */ S, Unit]) => forEach(t0).runNow()))
    __obj.asInstanceOf[`1`[R, S]]
  }
  
  extension [Self <: `1`[?, ?], R, S](x: Self & (`1`[R, S])) {
    
    inline def setForEach(value: js.Function2[/* r */ R, /* s */ S, Unit] => Callback): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: js.Function2[/* r */ R, /* s */ S, Unit]) => value(t0).runNow()))
  }
}
