package typingsJapgolly.es6Shim

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IterableShim[T] extends StObject {
  
  /**
    * Shim for an ES6 iterable. Not intended for direct use by user code.
    */
  def `_es6-shim iterator_`(): Iterator[T]
}
object IterableShim {
  
  inline def apply[T](`_es6-shim iterator_`: CallbackTo[Iterator[T]]): IterableShim[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_es6-shim iterator_")((`_es6-shim iterator_`).toJsFn)
    __obj.asInstanceOf[IterableShim[T]]
  }
  
  extension [Self <: IterableShim[?], T](x: Self & IterableShim[T]) {
    
    inline def `set_es6-shim iterator_`(value: CallbackTo[Iterator[T]]): Self = StObject.set(x, "_es6-shim iterator_", value.toJsFn)
  }
}
