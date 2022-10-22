package typingsJapgolly.lokijs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.lokijs.anon.Found
import typingsJapgolly.lokijs.lokijsInts.`-1`
import typingsJapgolly.lokijs.lokijsInts.`0`
import typingsJapgolly.lokijs.lokijsInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyValueStore extends StObject {
  
  def bs(): js.Function2[/* array */ js.Array[Any], /* item */ Any, Found]
  
  def get(key: Any): js.Array[Any]
  
  var keys: js.Array[Any]
  
  def set(key: Any, value: Any): Unit
  
  def setSort(fun: js.Function2[/* target */ Any, /* test */ Any, Any]): Unit
  
  def sort(a: Any, b: Any): `-1` | `0` | `1`
  
  var values: js.Array[Any]
}
object KeyValueStore {
  
  inline def apply(
    bs: CallbackTo[js.Function2[/* array */ js.Array[Any], /* item */ Any, Found]],
    get: Any => js.Array[Any],
    keys: js.Array[Any],
    set: (Any, Any) => Callback,
    setSort: js.Function2[/* target */ Any, /* test */ Any, Any] => Callback,
    sort: (Any, Any) => `-1` | `0` | `1`,
    values: js.Array[Any]
  ): KeyValueStore = {
    val __obj = js.Dynamic.literal(bs = bs.toJsFn, get = js.Any.fromFunction1(get), keys = keys.asInstanceOf[js.Any], set = js.Any.fromFunction2((t0: Any, t1: Any) => (set(t0, t1)).runNow()), setSort = js.Any.fromFunction1((t0: js.Function2[/* target */ Any, /* test */ Any, Any]) => setSort(t0).runNow()), sort = js.Any.fromFunction2(sort), values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValueStore]
  }
  
  extension [Self <: KeyValueStore](x: Self) {
    
    inline def setBs(value: CallbackTo[js.Function2[/* array */ js.Array[Any], /* item */ Any, Found]]): Self = StObject.set(x, "bs", value.toJsFn)
    
    inline def setGet(value: Any => js.Array[Any]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setKeys(value: js.Array[Any]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: Any*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setSet(value: (Any, Any) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setSetSort(value: js.Function2[/* target */ Any, /* test */ Any, Any] => Callback): Self = StObject.set(x, "setSort", js.Any.fromFunction1((t0: js.Function2[/* target */ Any, /* test */ Any, Any]) => value(t0).runNow()))
    
    inline def setSort(value: (Any, Any) => `-1` | `0` | `1`): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
    
    inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
