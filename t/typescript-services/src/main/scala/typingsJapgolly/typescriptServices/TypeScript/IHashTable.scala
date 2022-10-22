package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHashTable[T] extends StObject {
  
  def add(key: String, data: T): Boolean
  
  def addOrUpdate(key: String, data: T): Boolean
  
  def count(): Double
  
  def every(fn: js.Function3[/* k */ String, /* value */ T, /* context */ Any, Unit], context: Any): Boolean
  
  def getAllKeys(): js.Array[String]
  
  def lookup(key: String): T
  
  def map(fn: js.Function3[/* k */ String, /* value */ T, /* context */ Any, Unit], context: Any): Unit
  
  def some(fn: js.Function3[/* k */ String, /* value */ T, /* context */ Any, Unit], context: Any): Boolean
}
object IHashTable {
  
  inline def apply[T](
    add: (String, T) => Boolean,
    addOrUpdate: (String, T) => Boolean,
    count: CallbackTo[Double],
    every: (js.Function3[/* k */ String, /* value */ T, /* context */ Any, Unit], Any) => Boolean,
    getAllKeys: CallbackTo[js.Array[String]],
    lookup: String => T,
    map: (js.Function3[/* k */ String, /* value */ T, /* context */ Any, Unit], Any) => Callback,
    some: (js.Function3[/* k */ String, /* value */ T, /* context */ Any, Unit], Any) => Boolean
  ): IHashTable[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), addOrUpdate = js.Any.fromFunction2(addOrUpdate), count = count.toJsFn, every = js.Any.fromFunction2(every), getAllKeys = getAllKeys.toJsFn, lookup = js.Any.fromFunction1(lookup), map = js.Any.fromFunction2((t0: js.Function3[/* k */ String, /* value */ T, /* context */ Any, Unit], t1: Any) => (map(t0, t1)).runNow()), some = js.Any.fromFunction2(some))
    __obj.asInstanceOf[IHashTable[T]]
  }
  
  extension [Self <: IHashTable[?], T](x: Self & IHashTable[T]) {
    
    inline def setAdd(value: (String, T) => Boolean): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setAddOrUpdate(value: (String, T) => Boolean): Self = StObject.set(x, "addOrUpdate", js.Any.fromFunction2(value))
    
    inline def setCount(value: CallbackTo[Double]): Self = StObject.set(x, "count", value.toJsFn)
    
    inline def setEvery(value: (js.Function3[/* k */ String, /* value */ T, /* context */ Any, Unit], Any) => Boolean): Self = StObject.set(x, "every", js.Any.fromFunction2(value))
    
    inline def setGetAllKeys(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getAllKeys", value.toJsFn)
    
    inline def setLookup(value: String => T): Self = StObject.set(x, "lookup", js.Any.fromFunction1(value))
    
    inline def setMap(value: (js.Function3[/* k */ String, /* value */ T, /* context */ Any, Unit], Any) => Callback): Self = StObject.set(x, "map", js.Any.fromFunction2((t0: js.Function3[/* k */ String, /* value */ T, /* context */ Any, Unit], t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setSome(value: (js.Function3[/* k */ String, /* value */ T, /* context */ Any, Unit], Any) => Boolean): Self = StObject.set(x, "some", js.Any.fromFunction2(value))
  }
}
