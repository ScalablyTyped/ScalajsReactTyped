package typingsJapgolly.sharepoint.CUI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.IEnumerable
import typingsJapgolly.sharepoint.IEnumerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait List[T]
  extends StObject
     with IEnumerable[T] {
  
  def add(data: T): scala.Unit
  
  def clear(): scala.Unit
  
  def getEnumeratorAtPos(): ListEnumerator[T]
  
  def get_count(): Double
  
  def get_item(index: Double): T
  
  def indexOf(data: T): Double
  
  def insert(index: Double, data: T): scala.Unit
  
  def remove(data: T): scala.Unit
}
object List {
  
  inline def apply[T](
    add: T => Callback,
    clear: Callback,
    getEnumerator: CallbackTo[IEnumerator[T]],
    getEnumeratorAtPos: CallbackTo[ListEnumerator[T]],
    get_count: CallbackTo[Double],
    get_item: Double => T,
    indexOf: T => Double,
    insert: (Double, T) => Callback,
    remove: T => Callback
  ): typingsJapgolly.sharepoint.CUI.List[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: T) => add(t0).runNow()), clear = clear.toJsFn, getEnumerator = getEnumerator.toJsFn, getEnumeratorAtPos = getEnumeratorAtPos.toJsFn, get_count = get_count.toJsFn, get_item = js.Any.fromFunction1(get_item), indexOf = js.Any.fromFunction1(indexOf), insert = js.Any.fromFunction2((t0: Double, t1: T) => (insert(t0, t1)).runNow()), remove = js.Any.fromFunction1((t0: T) => remove(t0).runNow()))
    __obj.asInstanceOf[typingsJapgolly.sharepoint.CUI.List[T]]
  }
  
  extension [Self <: typingsJapgolly.sharepoint.CUI.List[?], T](x: Self & typingsJapgolly.sharepoint.CUI.List[T]) {
    
    inline def setAdd(value: T => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setGetEnumeratorAtPos(value: CallbackTo[ListEnumerator[T]]): Self = StObject.set(x, "getEnumeratorAtPos", value.toJsFn)
    
    inline def setGet_count(value: CallbackTo[Double]): Self = StObject.set(x, "get_count", value.toJsFn)
    
    inline def setGet_item(value: Double => T): Self = StObject.set(x, "get_item", js.Any.fromFunction1(value))
    
    inline def setIndexOf(value: T => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
    
    inline def setInsert(value: (Double, T) => Callback): Self = StObject.set(x, "insert", js.Any.fromFunction2((t0: Double, t1: T) => (value(t0, t1)).runNow()))
    
    inline def setRemove(value: T => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
  }
}
