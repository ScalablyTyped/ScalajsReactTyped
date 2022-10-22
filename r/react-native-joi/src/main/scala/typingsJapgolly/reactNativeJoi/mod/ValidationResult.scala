package typingsJapgolly.reactNativeJoi.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<std.Promise<T>, 'then' | 'catch'> */
trait ValidationResult[T] extends StObject {
  
  def `catch`[TResult](): js.Promise[T | TResult]
  @JSName("catch")
  var catch_Original: js.Function0[js.Promise[T | scala.Nothing]]
  
  var error: ValidationError
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
  @JSName("then")
  var then_Original: js.Function0[js.Promise[T | scala.Nothing]]
  
  var value: T
}
object ValidationResult {
  
  inline def apply[T](
    `catch`: CallbackTo[js.Promise[T | scala.Nothing]],
    error: ValidationError,
    `then`: CallbackTo[js.Promise[T | scala.Nothing]],
    value: T
  ): ValidationResult[T] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ValidationResult[T]]
  }
  
  extension [Self <: ValidationResult[?], T](x: Self & ValidationResult[T]) {
    
    inline def setCatch(value: CallbackTo[js.Promise[T | scala.Nothing]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setError(value: ValidationError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setThen(value: CallbackTo[js.Promise[T | scala.Nothing]]): Self = StObject.set(x, "then", value.toJsFn)
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
