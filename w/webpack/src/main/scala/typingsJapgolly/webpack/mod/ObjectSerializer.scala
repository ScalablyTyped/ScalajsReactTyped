package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectSerializer extends StObject {
  
  def deserialize(arg0: ObjectDeserializerContext): Any
  
  def serialize(arg0: Any, arg1: ObjectSerializerContext): Unit
}
object ObjectSerializer {
  
  inline def apply(
    deserialize: ObjectDeserializerContext => Any,
    serialize: (Any, ObjectSerializerContext) => Callback
  ): ObjectSerializer = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), serialize = js.Any.fromFunction2((t0: Any, t1: ObjectSerializerContext) => (serialize(t0, t1)).runNow()))
    __obj.asInstanceOf[ObjectSerializer]
  }
  
  extension [Self <: ObjectSerializer](x: Self) {
    
    inline def setDeserialize(value: ObjectDeserializerContext => Any): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
    
    inline def setSerialize(value: (Any, ObjectSerializerContext) => Callback): Self = StObject.set(x, "serialize", js.Any.fromFunction2((t0: Any, t1: ObjectSerializerContext) => (value(t0, t1)).runNow()))
  }
}
