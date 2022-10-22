package typingsJapgolly.reactAsync.anon

import org.scalajs.dom.AbortController
import typingsJapgolly.reactAsync.mod.AsyncProps
import typingsJapgolly.reactAsync.mod.PromiseFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitialValue[T] extends StObject {
  
  var initialValue: js.UndefOr[js.Error | T] = js.undefined
  
  var promise: js.UndefOr[js.Promise[T]] = js.undefined
  
  var promiseFn: js.UndefOr[PromiseFn[T]] = js.undefined
}
object InitialValue {
  
  inline def apply[T](): InitialValue[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitialValue[T]]
  }
  
  extension [Self <: InitialValue[?], T](x: Self & InitialValue[T]) {
    
    inline def setInitialValue(value: js.Error | T): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
    
    inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
    
    inline def setPromise(value: js.Promise[T]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    inline def setPromiseFn(value: (/* props */ AsyncProps[T], /* controller */ AbortController) => js.Promise[T]): Self = StObject.set(x, "promiseFn", js.Any.fromFunction2(value))
    
    inline def setPromiseFnUndefined: Self = StObject.set(x, "promiseFn", js.undefined)
    
    inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
  }
}
