package typingsJapgolly.ahooks.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIndex[T] extends StObject {
  
  def getIndex(key: Double): Double
  
  def getKey(index: Double): Double
  
  def insert(index: Double, item: T): Unit
  
  var list: js.Array[T]
  
  def merge(index: Double, items: js.Array[T]): Unit
  
  def move(oldIndex: Double, newIndex: Double): Unit
  
  def pop(): Unit
  
  def push(item: T): Unit
  
  def remove(index: Double): Unit
  
  def replace(index: Double, item: T): Unit
  
  def resetList(newList: js.Array[T]): Unit
  
  def shift(): Unit
  
  def sortList(result: js.Array[T]): js.Array[T]
  
  def unshift(item: T): Unit
}
object GetIndex {
  
  inline def apply[T](
    getIndex: Double => Double,
    getKey: Double => Double,
    insert: (Double, T) => Callback,
    list: js.Array[T],
    merge: (Double, js.Array[T]) => Callback,
    move: (Double, Double) => Callback,
    pop: Callback,
    push: T => Callback,
    remove: Double => Callback,
    replace: (Double, T) => Callback,
    resetList: js.Array[T] => Callback,
    shift: Callback,
    sortList: js.Array[T] => js.Array[T],
    unshift: T => Callback
  ): GetIndex[T] = {
    val __obj = js.Dynamic.literal(getIndex = js.Any.fromFunction1(getIndex), getKey = js.Any.fromFunction1(getKey), insert = js.Any.fromFunction2((t0: Double, t1: T) => (insert(t0, t1)).runNow()), list = list.asInstanceOf[js.Any], merge = js.Any.fromFunction2((t0: Double, t1: js.Array[T]) => (merge(t0, t1)).runNow()), move = js.Any.fromFunction2((t0: Double, t1: Double) => (move(t0, t1)).runNow()), pop = pop.toJsFn, push = js.Any.fromFunction1((t0: T) => push(t0).runNow()), remove = js.Any.fromFunction1((t0: Double) => remove(t0).runNow()), replace = js.Any.fromFunction2((t0: Double, t1: T) => (replace(t0, t1)).runNow()), resetList = js.Any.fromFunction1((t0: js.Array[T]) => resetList(t0).runNow()), shift = shift.toJsFn, sortList = js.Any.fromFunction1(sortList), unshift = js.Any.fromFunction1((t0: T) => unshift(t0).runNow()))
    __obj.asInstanceOf[GetIndex[T]]
  }
  
  extension [Self <: GetIndex[?], T](x: Self & GetIndex[T]) {
    
    inline def setGetIndex(value: Double => Double): Self = StObject.set(x, "getIndex", js.Any.fromFunction1(value))
    
    inline def setGetKey(value: Double => Double): Self = StObject.set(x, "getKey", js.Any.fromFunction1(value))
    
    inline def setInsert(value: (Double, T) => Callback): Self = StObject.set(x, "insert", js.Any.fromFunction2((t0: Double, t1: T) => (value(t0, t1)).runNow()))
    
    inline def setList(value: js.Array[T]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListVarargs(value: T*): Self = StObject.set(x, "list", js.Array(value*))
    
    inline def setMerge(value: (Double, js.Array[T]) => Callback): Self = StObject.set(x, "merge", js.Any.fromFunction2((t0: Double, t1: js.Array[T]) => (value(t0, t1)).runNow()))
    
    inline def setMove(value: (Double, Double) => Callback): Self = StObject.set(x, "move", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setPop(value: Callback): Self = StObject.set(x, "pop", value.toJsFn)
    
    inline def setPush(value: T => Callback): Self = StObject.set(x, "push", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setReplace(value: (Double, T) => Callback): Self = StObject.set(x, "replace", js.Any.fromFunction2((t0: Double, t1: T) => (value(t0, t1)).runNow()))
    
    inline def setResetList(value: js.Array[T] => Callback): Self = StObject.set(x, "resetList", js.Any.fromFunction1((t0: js.Array[T]) => value(t0).runNow()))
    
    inline def setShift(value: Callback): Self = StObject.set(x, "shift", value.toJsFn)
    
    inline def setSortList(value: js.Array[T] => js.Array[T]): Self = StObject.set(x, "sortList", js.Any.fromFunction1(value))
    
    inline def setUnshift(value: T => Callback): Self = StObject.set(x, "unshift", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
  }
}
