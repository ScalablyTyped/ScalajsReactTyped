package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Common read methods for ES6 Map/Set. */
trait ReadonlyCollection[K] extends StObject {
  
  def has(key: K): Boolean
  
  def keys(): Iterator[K]
  
  val size: Double
}
object ReadonlyCollection {
  
  inline def apply[K](has: K => Boolean, keys: CallbackTo[Iterator[K]], size: Double): ReadonlyCollection[K] = {
    val __obj = js.Dynamic.literal(has = js.Any.fromFunction1(has), keys = keys.toJsFn, size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyCollection[K]]
  }
  
  extension [Self <: ReadonlyCollection[?], K](x: Self & ReadonlyCollection[K]) {
    
    inline def setHas(value: K => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setKeys(value: CallbackTo[Iterator[K]]): Self = StObject.set(x, "keys", value.toJsFn)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
