package typingsJapgolly.vueTestUtils.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Emit extends StObject {
  
  @JSName("$emit")
  def $emit(event: Any, args: Any*): Unit
}
object Emit {
  
  inline def apply($emit: (Any, /* repeated */ Any) => Callback): Emit = {
    val __obj = js.Dynamic.literal($emit = js.Any.fromFunction2((t0: Any, t1: /* repeated */ Any) => ($emit(t0, t1)).runNow()))
    __obj.asInstanceOf[Emit]
  }
  
  extension [Self <: Emit](x: Self) {
    
    inline def set$emit(value: (Any, /* repeated */ Any) => Callback): Self = StObject.set(x, "$emit", js.Any.fromFunction2((t0: Any, t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
  }
}
