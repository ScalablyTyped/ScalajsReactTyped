package typingsJapgolly.peculiarJsonSchema

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesTypesMod {
  
  type IEmptyConstructor[T] = Instantiable0[T]
  
  trait IJsonConverter[T, S] extends StObject {
    
    def fromJSON(value: S, target: Any): T
    
    def toJSON(value: T, target: Any): S
  }
  object IJsonConverter {
    
    inline def apply[T, S](fromJSON: (S, Any) => T, toJSON: (T, Any) => S): IJsonConverter[T, S] = {
      val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction2(fromJSON), toJSON = js.Any.fromFunction2(toJSON))
      __obj.asInstanceOf[IJsonConverter[T, S]]
    }
    
    extension [Self <: IJsonConverter[?, ?], T, S](x: Self & (IJsonConverter[T, S])) {
      
      inline def setFromJSON(value: (S, Any) => T): Self = StObject.set(x, "fromJSON", js.Any.fromFunction2(value))
      
      inline def setToJSON(value: (T, Any) => S): Self = StObject.set(x, "toJSON", js.Any.fromFunction2(value))
    }
  }
  
  trait IJsonConvertible[T] extends StObject {
    
    def fromJSON(json: T): this.type
    
    def toJSON(): T
  }
  object IJsonConvertible {
    
    inline def apply[T](fromJSON: T => IJsonConvertible[T], toJSON: CallbackTo[T]): IJsonConvertible[T] = {
      val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON), toJSON = toJSON.toJsFn)
      __obj.asInstanceOf[IJsonConvertible[T]]
    }
    
    extension [Self <: IJsonConvertible[?], T](x: Self & IJsonConvertible[T]) {
      
      inline def setFromJSON(value: T => IJsonConvertible[T]): Self = StObject.set(x, "fromJSON", js.Any.fromFunction1(value))
      
      inline def setToJSON(value: CallbackTo[T]): Self = StObject.set(x, "toJSON", value.toJsFn)
    }
  }
  
  trait IValidation extends StObject {
    
    def validate(value: Any): Unit
  }
  object IValidation {
    
    inline def apply(validate: Any => Callback): IValidation = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1((t0: Any) => validate(t0).runNow()))
      __obj.asInstanceOf[IValidation]
    }
    
    extension [Self <: IValidation](x: Self) {
      
      inline def setValidate(value: Any => Callback): Self = StObject.set(x, "validate", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
}
