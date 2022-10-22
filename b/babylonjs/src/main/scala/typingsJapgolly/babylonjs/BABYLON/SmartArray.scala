package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartArray[T]
  extends StObject
     with ISmartArrayLike[T] {
  
  /* protected */ var _id: Double
  
  /**
    * Concats the active data with a given array.
    * @param array defines the data to concatenate with.
    */
  def concat(array: Any): Unit
  
  /**
    * Returns whether an element is part of the active data.
    * @param value defines the value to look for
    * @returns true if found in the active data otherwise false
    */
  def contains(value: T): Boolean
  
  /**
    * Releases all the data from the array as well as the array.
    */
  def dispose(): Unit
  
  /**
    * Iterates over the active data and apply the lambda to them.
    * @param func defines the action to apply on each value.
    */
  def forEach(func: js.Function1[/* content */ T, Unit]): Unit
  
  /**
    * Returns the position of a value in the active data.
    * @param value defines the value to find the index for
    * @returns the index if found in the active data otherwise -1
    */
  def indexOf(value: T): Double
  
  /**
    * Pushes a value at the end of the active data.
    * @param value defines the object to push in the array.
    */
  def push(value: T): Unit
  
  /**
    * Resets the active data to an empty array.
    */
  def reset(): Unit
  
  /**
    * Sorts the full sets of data.
    * @param compareFn defines the comparison function to apply.
    */
  def sort(compareFn: js.Function2[/* a */ T, /* b */ T, Double]): Unit
}
object SmartArray {
  
  inline def apply[T](
    _id: Double,
    concat: Any => Callback,
    contains: T => Boolean,
    data: js.Array[T],
    dispose: Callback,
    forEach: js.Function1[/* content */ T, Unit] => Callback,
    indexOf: T => Double,
    length: Double,
    push: T => Callback,
    reset: Callback,
    sort: js.Function2[/* a */ T, /* b */ T, Double] => Callback
  ): SmartArray[T] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], concat = js.Any.fromFunction1((t0: Any) => concat(t0).runNow()), contains = js.Any.fromFunction1(contains), data = data.asInstanceOf[js.Any], dispose = dispose.toJsFn, forEach = js.Any.fromFunction1((t0: js.Function1[/* content */ T, Unit]) => forEach(t0).runNow()), indexOf = js.Any.fromFunction1(indexOf), length = length.asInstanceOf[js.Any], push = js.Any.fromFunction1((t0: T) => push(t0).runNow()), reset = reset.toJsFn, sort = js.Any.fromFunction1((t0: js.Function2[/* a */ T, /* b */ T, Double]) => sort(t0).runNow()))
    __obj.asInstanceOf[SmartArray[T]]
  }
  
  extension [Self <: SmartArray[?], T](x: Self & SmartArray[T]) {
    
    inline def setConcat(value: Any => Callback): Self = StObject.set(x, "concat", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setContains(value: T => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setForEach(value: js.Function1[/* content */ T, Unit] => Callback): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: js.Function1[/* content */ T, Unit]) => value(t0).runNow()))
    
    inline def setIndexOf(value: T => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
    
    inline def setPush(value: T => Callback): Self = StObject.set(x, "push", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSort(value: js.Function2[/* a */ T, /* b */ T, Double] => Callback): Self = StObject.set(x, "sort", js.Any.fromFunction1((t0: js.Function2[/* a */ T, /* b */ T, Double]) => value(t0).runNow()))
    
    inline def set_id(value: Double): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
