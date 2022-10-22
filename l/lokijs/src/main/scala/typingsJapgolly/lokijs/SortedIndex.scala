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

trait SortedIndex extends StObject {
  
  def bs(): js.Function2[/* array */ js.Array[Any], /* item */ Any, Found]
  
  // clear will zap the index
  def clear(): Unit
  
  var field: String
  
  // get all values which have a key == the given key
  def get(key: Any): js.Array[Any]
  
  // get all vals from start to end
  def getAll(key: Any, start: Double, end: Double): js.Array[Any]
  
  // get all values which have a key > the given key
  def getGt(key: Any): js.Array[Any]
  
  // get all values which have a key < the given key
  def getLt(key: Any): js.Array[Any]
  
  // just in case someone wants to do something smart with ranges
  def getPos(key: Any): Found
  
  var keys: js.Array[Any]
  
  // remove the value from the index, if the value was the last one, remove the key
  def remove(key: Any, value: Any): Unit
  
  // add the value you want returned  to the key in the index
  def set(key: Any, value: Any): Unit
  
  // and allow override of the default sort
  def setSort(fun: js.Function2[/* target */ Any, /* test */ Any, Double]): Unit
  
  // set the default sort
  def sort(a: Any, b: Any): `-1` | `0` | `1`
  
  var values: js.Array[Any]
}
object SortedIndex {
  
  inline def apply(
    bs: CallbackTo[js.Function2[/* array */ js.Array[Any], /* item */ Any, Found]],
    clear: Callback,
    field: String,
    get: Any => js.Array[Any],
    getAll: (Any, Double, Double) => js.Array[Any],
    getGt: Any => js.Array[Any],
    getLt: Any => js.Array[Any],
    getPos: Any => Found,
    keys: js.Array[Any],
    remove: (Any, Any) => Callback,
    set: (Any, Any) => Callback,
    setSort: js.Function2[/* target */ Any, /* test */ Any, Double] => Callback,
    sort: (Any, Any) => `-1` | `0` | `1`,
    values: js.Array[Any]
  ): SortedIndex = {
    val __obj = js.Dynamic.literal(bs = bs.toJsFn, clear = clear.toJsFn, field = field.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getAll = js.Any.fromFunction3(getAll), getGt = js.Any.fromFunction1(getGt), getLt = js.Any.fromFunction1(getLt), getPos = js.Any.fromFunction1(getPos), keys = keys.asInstanceOf[js.Any], remove = js.Any.fromFunction2((t0: Any, t1: Any) => (remove(t0, t1)).runNow()), set = js.Any.fromFunction2((t0: Any, t1: Any) => (set(t0, t1)).runNow()), setSort = js.Any.fromFunction1((t0: js.Function2[/* target */ Any, /* test */ Any, Double]) => setSort(t0).runNow()), sort = js.Any.fromFunction2(sort), values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortedIndex]
  }
  
  extension [Self <: SortedIndex](x: Self) {
    
    inline def setBs(value: CallbackTo[js.Function2[/* array */ js.Array[Any], /* item */ Any, Found]]): Self = StObject.set(x, "bs", value.toJsFn)
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Any => js.Array[Any]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetAll(value: (Any, Double, Double) => js.Array[Any]): Self = StObject.set(x, "getAll", js.Any.fromFunction3(value))
    
    inline def setGetGt(value: Any => js.Array[Any]): Self = StObject.set(x, "getGt", js.Any.fromFunction1(value))
    
    inline def setGetLt(value: Any => js.Array[Any]): Self = StObject.set(x, "getLt", js.Any.fromFunction1(value))
    
    inline def setGetPos(value: Any => Found): Self = StObject.set(x, "getPos", js.Any.fromFunction1(value))
    
    inline def setKeys(value: js.Array[Any]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: Any*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setRemove(value: (Any, Any) => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setSet(value: (Any, Any) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setSetSort(value: js.Function2[/* target */ Any, /* test */ Any, Double] => Callback): Self = StObject.set(x, "setSort", js.Any.fromFunction1((t0: js.Function2[/* target */ Any, /* test */ Any, Double]) => value(t0).runNow()))
    
    inline def setSort(value: (Any, Any) => `-1` | `0` | `1`): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
    
    inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
