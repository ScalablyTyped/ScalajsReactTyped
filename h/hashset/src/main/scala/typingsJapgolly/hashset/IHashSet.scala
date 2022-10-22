package typingsJapgolly.hashset

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHashSet[TValue] extends StObject {
  
  def add(value: TValue): Unit
  
  def addAll(arr: js.Array[TValue]): Unit
  
  def clear(): Unit
  
  def complement(set: IHashSet[TValue]): IHashSet[TValue]
  
  def contains(value: TValue): Boolean
  
  def intersection(set: IHashSet[TValue]): IHashSet[TValue]
  
  def isEmpty(): Boolean
  
  def isSubsetOf(set: IHashSet[TValue]): Boolean
  
  def remove(value: TValue): Unit
  
  def size(): Double
  
  def union(set: IHashSet[TValue]): IHashSet[TValue]
  
  def values(): js.Array[TValue]
}
object IHashSet {
  
  inline def apply[TValue](
    add: TValue => Callback,
    addAll: js.Array[TValue] => Callback,
    clear: Callback,
    complement: IHashSet[TValue] => IHashSet[TValue],
    contains: TValue => Boolean,
    intersection: IHashSet[TValue] => IHashSet[TValue],
    isEmpty: CallbackTo[Boolean],
    isSubsetOf: IHashSet[TValue] => Boolean,
    remove: TValue => Callback,
    size: CallbackTo[Double],
    union: IHashSet[TValue] => IHashSet[TValue],
    values: CallbackTo[js.Array[TValue]]
  ): IHashSet[TValue] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: TValue) => add(t0).runNow()), addAll = js.Any.fromFunction1((t0: js.Array[TValue]) => addAll(t0).runNow()), clear = clear.toJsFn, complement = js.Any.fromFunction1(complement), contains = js.Any.fromFunction1(contains), intersection = js.Any.fromFunction1(intersection), isEmpty = isEmpty.toJsFn, isSubsetOf = js.Any.fromFunction1(isSubsetOf), remove = js.Any.fromFunction1((t0: TValue) => remove(t0).runNow()), size = size.toJsFn, union = js.Any.fromFunction1(union), values = values.toJsFn)
    __obj.asInstanceOf[IHashSet[TValue]]
  }
  
  extension [Self <: IHashSet[?], TValue](x: Self & IHashSet[TValue]) {
    
    inline def setAdd(value: TValue => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: TValue) => value(t0).runNow()))
    
    inline def setAddAll(value: js.Array[TValue] => Callback): Self = StObject.set(x, "addAll", js.Any.fromFunction1((t0: js.Array[TValue]) => value(t0).runNow()))
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setComplement(value: IHashSet[TValue] => IHashSet[TValue]): Self = StObject.set(x, "complement", js.Any.fromFunction1(value))
    
    inline def setContains(value: TValue => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setIntersection(value: IHashSet[TValue] => IHashSet[TValue]): Self = StObject.set(x, "intersection", js.Any.fromFunction1(value))
    
    inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmpty", value.toJsFn)
    
    inline def setIsSubsetOf(value: IHashSet[TValue] => Boolean): Self = StObject.set(x, "isSubsetOf", js.Any.fromFunction1(value))
    
    inline def setRemove(value: TValue => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: TValue) => value(t0).runNow()))
    
    inline def setSize(value: CallbackTo[Double]): Self = StObject.set(x, "size", value.toJsFn)
    
    inline def setUnion(value: IHashSet[TValue] => IHashSet[TValue]): Self = StObject.set(x, "union", js.Any.fromFunction1(value))
    
    inline def setValues(value: CallbackTo[js.Array[TValue]]): Self = StObject.set(x, "values", value.toJsFn)
  }
}
