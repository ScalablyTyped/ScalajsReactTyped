package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntSet extends StObject {
  
  def add(value: Double): Boolean
  
  var array: js.Array[Double]
  
  def clear(): Unit
  
  def contains(value: Double): Boolean
  
  def remove(value: Double): Unit
}
object IntSet {
  
  inline def apply(
    add: Double => Boolean,
    array: js.Array[Double],
    clear: Callback,
    contains: Double => Boolean,
    remove: Double => Callback
  ): IntSet = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), array = array.asInstanceOf[js.Any], clear = clear.toJsFn, contains = js.Any.fromFunction1(contains), remove = js.Any.fromFunction1((t0: Double) => remove(t0).runNow()))
    __obj.asInstanceOf[IntSet]
  }
  
  extension [Self <: IntSet](x: Self) {
    
    inline def setAdd(value: Double => Boolean): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setArray(value: js.Array[Double]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayVarargs(value: Double*): Self = StObject.set(x, "array", js.Array(value*))
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setContains(value: Double => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
