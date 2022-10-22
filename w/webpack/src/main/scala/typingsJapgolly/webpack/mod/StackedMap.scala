package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Map
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackedMap[K, V] extends StObject {
  
  def asArray(): js.Array[K]
  
  def asMap(): Map[K, Cell[V]]
  
  def asPairArray(): js.Array[js.Tuple2[K, Cell[V]]]
  
  def asSet(): Set[K]
  
  def createChild(): StackedMap[K, V]
  
  def delete(item: K): Unit
  
  def get(item: K): Cell[V]
  
  def has(item: K): Boolean
  
  var map: Map[K, InternalCell[V]]
  
  def set(item: K, value: V): Unit
  
  val size: Double
  
  var stack: js.Array[Map[K, InternalCell[V]]]
}
object StackedMap {
  
  inline def apply[K, V](
    asArray: CallbackTo[js.Array[K]],
    asMap: CallbackTo[Map[K, Cell[V]]],
    asPairArray: CallbackTo[js.Array[js.Tuple2[K, Cell[V]]]],
    asSet: CallbackTo[Set[K]],
    createChild: CallbackTo[StackedMap[K, V]],
    delete: K => Callback,
    get: K => Cell[V],
    has: K => Boolean,
    map: Map[K, InternalCell[V]],
    set: (K, V) => Callback,
    size: Double,
    stack: js.Array[Map[K, InternalCell[V]]]
  ): StackedMap[K, V] = {
    val __obj = js.Dynamic.literal(asArray = asArray.toJsFn, asMap = asMap.toJsFn, asPairArray = asPairArray.toJsFn, asSet = asSet.toJsFn, createChild = createChild.toJsFn, delete = js.Any.fromFunction1((t0: K) => delete(t0).runNow()), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), map = map.asInstanceOf[js.Any], set = js.Any.fromFunction2((t0: K, t1: V) => (set(t0, t1)).runNow()), size = size.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackedMap[K, V]]
  }
  
  extension [Self <: StackedMap[?, ?], K, V](x: Self & (StackedMap[K, V])) {
    
    inline def setAsArray(value: CallbackTo[js.Array[K]]): Self = StObject.set(x, "asArray", value.toJsFn)
    
    inline def setAsMap(value: CallbackTo[Map[K, Cell[V]]]): Self = StObject.set(x, "asMap", value.toJsFn)
    
    inline def setAsPairArray(value: CallbackTo[js.Array[js.Tuple2[K, Cell[V]]]]): Self = StObject.set(x, "asPairArray", value.toJsFn)
    
    inline def setAsSet(value: CallbackTo[Set[K]]): Self = StObject.set(x, "asSet", value.toJsFn)
    
    inline def setCreateChild(value: CallbackTo[StackedMap[K, V]]): Self = StObject.set(x, "createChild", value.toJsFn)
    
    inline def setDelete(value: K => Callback): Self = StObject.set(x, "delete", js.Any.fromFunction1((t0: K) => value(t0).runNow()))
    
    inline def setGet(value: K => Cell[V]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setHas(value: K => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setMap(value: Map[K, InternalCell[V]]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setSet(value: (K, V) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: K, t1: V) => (value(t0, t1)).runNow()))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setStack(value: js.Array[Map[K, InternalCell[V]]]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackVarargs(value: (Map[K, InternalCell[V]])*): Self = StObject.set(x, "stack", js.Array(value*))
  }
}
