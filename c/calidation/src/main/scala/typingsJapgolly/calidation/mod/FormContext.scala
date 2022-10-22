package typingsJapgolly.calidation.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormContext[T /* <: js.Object */] extends StObject {
  
  var dirty: Dirty[T]
  
  var errors: Errors[T]
  
  var fields: Fields[T]
  
  var isValid: Boolean
  
  def register(config: FieldsConfig[T], transforms: Transforms[T], initialValues: T): Unit
  
  def resetAll(): Unit
  
  def setError(delta: Errors[T]): Unit
  
  def setField(delta: Partial[T]): Unit
  
  def submit(): Unit
  
  var submitted: Boolean
  
  def unregister(config: FieldsConfig[T]): Unit
}
object FormContext {
  
  inline def apply[T /* <: js.Object */](
    dirty: Dirty[T],
    errors: Errors[T],
    fields: Fields[T],
    isValid: Boolean,
    register: (FieldsConfig[T], Transforms[T], T) => Callback,
    resetAll: Callback,
    setError: Errors[T] => Callback,
    setField: Partial[T] => Callback,
    submit: Callback,
    submitted: Boolean,
    unregister: FieldsConfig[T] => Callback
  ): FormContext[T] = {
    val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], register = js.Any.fromFunction3((t0: FieldsConfig[T], t1: Transforms[T], t2: T) => (register(t0, t1, t2)).runNow()), resetAll = resetAll.toJsFn, setError = js.Any.fromFunction1((t0: Errors[T]) => setError(t0).runNow()), setField = js.Any.fromFunction1((t0: Partial[T]) => setField(t0).runNow()), submit = submit.toJsFn, submitted = submitted.asInstanceOf[js.Any], unregister = js.Any.fromFunction1((t0: FieldsConfig[T]) => unregister(t0).runNow()))
    __obj.asInstanceOf[FormContext[T]]
  }
  
  extension [Self <: FormContext[?], T /* <: js.Object */](x: Self & FormContext[T]) {
    
    inline def setDirty(value: Dirty[T]): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: Errors[T]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setFields(value: Fields[T]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setRegister(value: (FieldsConfig[T], Transforms[T], T) => Callback): Self = StObject.set(x, "register", js.Any.fromFunction3((t0: FieldsConfig[T], t1: Transforms[T], t2: T) => (value(t0, t1, t2)).runNow()))
    
    inline def setResetAll(value: Callback): Self = StObject.set(x, "resetAll", value.toJsFn)
    
    inline def setSetError(value: Errors[T] => Callback): Self = StObject.set(x, "setError", js.Any.fromFunction1((t0: Errors[T]) => value(t0).runNow()))
    
    inline def setSetField(value: Partial[T] => Callback): Self = StObject.set(x, "setField", js.Any.fromFunction1((t0: Partial[T]) => value(t0).runNow()))
    
    inline def setSubmit(value: Callback): Self = StObject.set(x, "submit", value.toJsFn)
    
    inline def setSubmitted(value: Boolean): Self = StObject.set(x, "submitted", value.asInstanceOf[js.Any])
    
    inline def setUnregister(value: FieldsConfig[T] => Callback): Self = StObject.set(x, "unregister", js.Any.fromFunction1((t0: FieldsConfig[T]) => value(t0).runNow()))
  }
}
