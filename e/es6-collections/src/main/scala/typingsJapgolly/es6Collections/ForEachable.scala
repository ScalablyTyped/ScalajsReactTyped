package typingsJapgolly.es6Collections

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForEachable[T] extends StObject {
  
  def forEach(callbackfn: js.Function1[/* value */ T, Unit]): Unit
}
object ForEachable {
  
  inline def apply[T](forEach: js.Function1[/* value */ T, Unit] => Callback): ForEachable[T] = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1((t0: js.Function1[/* value */ T, Unit]) => forEach(t0).runNow()))
    __obj.asInstanceOf[ForEachable[T]]
  }
  
  extension [Self <: ForEachable[?], T](x: Self & ForEachable[T]) {
    
    inline def setForEach(value: js.Function1[/* value */ T, Unit] => Callback): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: js.Function1[/* value */ T, Unit]) => value(t0).runNow()))
  }
}
