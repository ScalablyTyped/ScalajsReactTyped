package typingsJapgolly.knockout.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindingChildContextOptions[T] extends StObject {
  
  var as: js.UndefOr[String] = js.undefined
  
  var extend: js.UndefOr[BindingContextExtendCallback[T]] = js.undefined
  
  var noChildContext: js.UndefOr[Boolean] = js.undefined
}
object BindingChildContextOptions {
  
  inline def apply[T](): BindingChildContextOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindingChildContextOptions[T]]
  }
  
  extension [Self <: BindingChildContextOptions[?], T](x: Self & BindingChildContextOptions[T]) {
    
    inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setExtend(value: (/* self */ BindingContext[T], /* parentContext */ BindingContext[T] | Null, T) => Callback): Self = StObject.set(x, "extend", js.Any.fromFunction3((t0: /* self */ BindingContext[T], t1: /* parentContext */ BindingContext[T] | Null, t2: T) => (value(t0, t1, t2)).runNow()))
    
    inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    inline def setNoChildContext(value: Boolean): Self = StObject.set(x, "noChildContext", value.asInstanceOf[js.Any])
    
    inline def setNoChildContextUndefined: Self = StObject.set(x, "noChildContext", js.undefined)
  }
}
