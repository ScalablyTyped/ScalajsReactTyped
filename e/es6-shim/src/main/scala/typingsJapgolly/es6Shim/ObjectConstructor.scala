package typingsJapgolly.es6Shim

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectConstructor extends StObject {
  
  /**
    * Copy the values of all of the enumerable own properties from one or more source objects to a
    * target object. Returns the target object.
    * @param target The target object to copy to.
    * @param sources One or more source objects to copy properties from.
    */
  def assign(target: Any, sources: Any*): Any
  
  /**
    * Returns true if the values are the same value, false otherwise.
    * @param value1 The first value.
    * @param value2 The second value.
    */
  def is(value1: Any, value2: Any): Boolean
  
  /**
    * Sets the prototype of a specified object o to  object proto or null. Returns the object o.
    * @param o The object to change its prototype.
    * @param proto The value of the new prototype or null.
    * @remarks Requires `__proto__` support.
    */
  def setPrototypeOf(o: Any, proto: Any): Any
}
object ObjectConstructor {
  
  inline def apply(
    assign: (Any, /* repeated */ Any) => Any,
    is: (Any, Any) => Boolean,
    setPrototypeOf: (Any, Any) => Any
  ): ObjectConstructor = {
    val __obj = js.Dynamic.literal(assign = js.Any.fromFunction2(assign), is = js.Any.fromFunction2(is), setPrototypeOf = js.Any.fromFunction2(setPrototypeOf))
    __obj.asInstanceOf[ObjectConstructor]
  }
  
  extension [Self <: ObjectConstructor](x: Self) {
    
    inline def setAssign(value: (Any, /* repeated */ Any) => Any): Self = StObject.set(x, "assign", js.Any.fromFunction2(value))
    
    inline def setIs(value: (Any, Any) => Boolean): Self = StObject.set(x, "is", js.Any.fromFunction2(value))
    
    inline def setSetPrototypeOf(value: (Any, Any) => Any): Self = StObject.set(x, "setPrototypeOf", js.Any.fromFunction2(value))
  }
}
