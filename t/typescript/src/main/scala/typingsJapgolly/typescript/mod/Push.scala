package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Array that is only intended to be pushed to, never read. */
trait Push[T] extends StObject {
  
  def push(values: T*): Unit
}
object Push {
  
  inline def apply[T](push: /* repeated */ T => Callback): Push[T] = {
    val __obj = js.Dynamic.literal(push = js.Any.fromFunction1((t0: /* repeated */ T) => push(t0).runNow()))
    __obj.asInstanceOf[Push[T]]
  }
  
  extension [Self <: Push[?], T](x: Self & Push[T]) {
    
    inline def setPush(value: /* repeated */ T => Callback): Self = StObject.set(x, "push", js.Any.fromFunction1((t0: /* repeated */ T) => value(t0).runNow()))
  }
}
