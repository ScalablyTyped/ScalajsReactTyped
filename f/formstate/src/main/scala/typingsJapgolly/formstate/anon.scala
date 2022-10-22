package typingsJapgolly.formstate

import japgolly.scalajs.react.Callback
import typingsJapgolly.formstate.formstateBooleans.`false`
import typingsJapgolly.formstate.formstateBooleans.`true`
import typingsJapgolly.formstate.libCoreFormStateLazyMod.ValidatableArray
import typingsJapgolly.formstate.libCoreFormStateMod.ValidatableMapOrArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait HasError extends StObject {
    
    var hasError: `true`
  }
  object HasError {
    
    inline def apply(): HasError = {
      val __obj = js.Dynamic.literal(hasError = true)
      __obj.asInstanceOf[HasError]
    }
    
    extension [Self <: HasError](x: Self) {
      
      inline def setHasError(value: `true`): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
    }
  }
  
  trait HasErrorValue[TValue /* <: ValidatableMapOrArray */] extends StObject {
    
    var hasError: `false`
    
    var value: TValue
  }
  object HasErrorValue {
    
    inline def apply[TValue /* <: ValidatableMapOrArray */](value: TValue): HasErrorValue[TValue] = {
      val __obj = js.Dynamic.literal(hasError = false, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[HasErrorValue[TValue]]
    }
    
    extension [Self <: HasErrorValue[?], TValue /* <: ValidatableMapOrArray */](x: Self & HasErrorValue[TValue]) {
      
      inline def setHasError(value: `false`): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
      
      inline def setValue(value: TValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait NewValue[TValue] extends StObject {
    
    var newValue: TValue
    
    var oldValue: TValue
  }
  object NewValue {
    
    inline def apply[TValue](newValue: TValue, oldValue: TValue): NewValue[TValue] = {
      val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewValue[TValue]]
    }
    
    extension [Self <: NewValue[?], TValue](x: Self & NewValue[TValue]) {
      
      inline def setNewValue(value: TValue): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setOldValue(value: TValue): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnReinit extends StObject {
    
    @JSName("on$Reinit")
    def on$Reinit(): Unit
    
    @JSName("on$ValidationPass")
    def on$ValidationPass(): Unit
  }
  object OnReinit {
    
    inline def apply(on$Reinit: Callback, on$ValidationPass: Callback): OnReinit = {
      val __obj = js.Dynamic.literal(on$Reinit = on$Reinit.toJsFn, on$ValidationPass = on$ValidationPass.toJsFn)
      __obj.asInstanceOf[OnReinit]
    }
    
    extension [Self <: OnReinit](x: Self) {
      
      inline def setOn$Reinit(value: Callback): Self = StObject.set(x, "on$Reinit", value.toJsFn)
      
      inline def setOn$ValidationPass(value: Callback): Self = StObject.set(x, "on$ValidationPass", value.toJsFn)
    }
  }
  
  trait Value[TValue] extends StObject {
    
    var hasError: `false`
    
    var value: TValue
  }
  object Value {
    
    inline def apply[TValue](value: TValue): Value[TValue] = {
      val __obj = js.Dynamic.literal(hasError = false, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value[TValue]]
    }
    
    extension [Self <: Value[?], TValue](x: Self & Value[TValue]) {
      
      inline def setHasError(value: `false`): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
      
      inline def setValue(value: TValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValueTValue[TValue /* <: ValidatableArray */] extends StObject {
    
    var hasError: `false`
    
    var value: TValue
  }
  object ValueTValue {
    
    inline def apply[TValue /* <: ValidatableArray */](value: TValue): ValueTValue[TValue] = {
      val __obj = js.Dynamic.literal(hasError = false, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueTValue[TValue]]
    }
    
    extension [Self <: ValueTValue[?], TValue /* <: ValidatableArray */](x: Self & ValueTValue[TValue]) {
      
      inline def setHasError(value: `false`): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
      
      inline def setValue(value: TValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
