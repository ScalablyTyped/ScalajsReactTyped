package typingsJapgolly.ariaQuery.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapLike[Key, Value] extends StObject {
  
  def entries(): js.Array[js.Tuple2[Key, Value]]
  
  def get(key: Key): js.UndefOr[Value]
  
  def has(key: Key): Boolean
  
  def keys(): js.Array[Key]
  
  def values(): js.Array[Value]
}
object MapLike {
  
  inline def apply[Key, Value](
    entries: CallbackTo[js.Array[js.Tuple2[Key, Value]]],
    get: Key => js.UndefOr[Value],
    has: Key => Boolean,
    keys: CallbackTo[js.Array[Key]],
    values: CallbackTo[js.Array[Value]]
  ): MapLike[Key, Value] = {
    val __obj = js.Dynamic.literal(entries = entries.toJsFn, get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = keys.toJsFn, values = values.toJsFn)
    __obj.asInstanceOf[MapLike[Key, Value]]
  }
  
  extension [Self <: MapLike[?, ?], Key, Value](x: Self & (MapLike[Key, Value])) {
    
    inline def setEntries(value: CallbackTo[js.Array[js.Tuple2[Key, Value]]]): Self = StObject.set(x, "entries", value.toJsFn)
    
    inline def setGet(value: Key => js.UndefOr[Value]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setHas(value: Key => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setKeys(value: CallbackTo[js.Array[Key]]): Self = StObject.set(x, "keys", value.toJsFn)
    
    inline def setValues(value: CallbackTo[js.Array[Value]]): Self = StObject.set(x, "values", value.toJsFn)
  }
}
