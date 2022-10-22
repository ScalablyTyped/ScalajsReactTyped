package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartArrayNoDuplicate[T]
  extends StObject
     with SmartArray[T] {
  
  /* private */ var _duplicateId: Any
  
  /**
    * Concats the active data with a given array.
    * This ensures no duplicate will be present in the result.
    * @param array defines the data to concatenate with.
    */
  def concatWithNoDuplicate(array: Any): Unit
  
  /**
    * Pushes a value at the end of the active data.
    * If the data is already present, it won t be added again
    * @param value defines the object to push in the array.
    * @returns true if added false if it was already present
    */
  def pushNoDuplicate(value: T): Boolean
}
object SmartArrayNoDuplicate {
  
  inline def apply[T](
    _duplicateId: Any,
    _id: Double,
    concat: Any => Callback,
    concatWithNoDuplicate: Any => Callback,
    contains: T => Boolean,
    data: js.Array[T],
    dispose: Callback,
    forEach: js.Function1[T, Unit] => Callback,
    indexOf: T => Double,
    length: Double,
    push: T => Callback,
    pushNoDuplicate: T => Boolean,
    reset: Callback,
    sort: js.Function2[T, T, Double] => Callback
  ): SmartArrayNoDuplicate[T] = {
    val __obj = js.Dynamic.literal(_duplicateId = _duplicateId.asInstanceOf[js.Any], _id = _id.asInstanceOf[js.Any], concat = js.Any.fromFunction1((t0: Any) => concat(t0).runNow()), concatWithNoDuplicate = js.Any.fromFunction1((t0: Any) => concatWithNoDuplicate(t0).runNow()), contains = js.Any.fromFunction1(contains), data = data.asInstanceOf[js.Any], dispose = dispose.toJsFn, forEach = js.Any.fromFunction1((t0: js.Function1[T, Unit]) => forEach(t0).runNow()), indexOf = js.Any.fromFunction1(indexOf), length = length.asInstanceOf[js.Any], push = js.Any.fromFunction1((t0: T) => push(t0).runNow()), pushNoDuplicate = js.Any.fromFunction1(pushNoDuplicate), reset = reset.toJsFn, sort = js.Any.fromFunction1((t0: js.Function2[T, T, Double]) => sort(t0).runNow()))
    __obj.asInstanceOf[SmartArrayNoDuplicate[T]]
  }
  
  extension [Self <: SmartArrayNoDuplicate[?], T](x: Self & SmartArrayNoDuplicate[T]) {
    
    inline def setConcatWithNoDuplicate(value: Any => Callback): Self = StObject.set(x, "concatWithNoDuplicate", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setPushNoDuplicate(value: T => Boolean): Self = StObject.set(x, "pushNoDuplicate", js.Any.fromFunction1(value))
    
    inline def set_duplicateId(value: Any): Self = StObject.set(x, "_duplicateId", value.asInstanceOf[js.Any])
  }
}
