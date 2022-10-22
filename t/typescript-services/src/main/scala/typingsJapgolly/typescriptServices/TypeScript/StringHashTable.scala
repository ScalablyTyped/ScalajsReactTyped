package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringHashTable[T]
  extends StObject
     with IHashTable[T] {
  
  /* private */ var itemCount: Any
  
  def remove(key: String): Unit
  
  /* private */ var table: Any
}
object StringHashTable {
  
  inline def apply[T](
    add: (String, T) => Boolean,
    addOrUpdate: (String, T) => Boolean,
    count: CallbackTo[Double],
    every: (js.Function3[/* k */ String, T, /* context */ Any, Unit], Any) => Boolean,
    getAllKeys: CallbackTo[js.Array[String]],
    itemCount: Any,
    lookup: String => T,
    map: (js.Function3[/* k */ String, T, /* context */ Any, Unit], Any) => Callback,
    remove: String => Callback,
    some: (js.Function3[/* k */ String, T, /* context */ Any, Unit], Any) => Boolean,
    table: Any
  ): StringHashTable[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), addOrUpdate = js.Any.fromFunction2(addOrUpdate), count = count.toJsFn, every = js.Any.fromFunction2(every), getAllKeys = getAllKeys.toJsFn, itemCount = itemCount.asInstanceOf[js.Any], lookup = js.Any.fromFunction1(lookup), map = js.Any.fromFunction2((t0: js.Function3[/* k */ String, T, /* context */ Any, Unit], t1: Any) => (map(t0, t1)).runNow()), remove = js.Any.fromFunction1((t0: String) => remove(t0).runNow()), some = js.Any.fromFunction2(some), table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringHashTable[T]]
  }
  
  extension [Self <: StringHashTable[?], T](x: Self & StringHashTable[T]) {
    
    inline def setItemCount(value: Any): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: String => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setTable(value: Any): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
  }
}
