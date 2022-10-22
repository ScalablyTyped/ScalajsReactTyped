package typingsJapgolly.ionicAngular.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefineCustomElementFn extends StObject {
  
  var defineCustomElementFn: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var inputs: js.UndefOr[Any] = js.undefined
  
  var methods: js.UndefOr[Any] = js.undefined
}
object DefineCustomElementFn {
  
  inline def apply(): DefineCustomElementFn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefineCustomElementFn]
  }
  
  extension [Self <: DefineCustomElementFn](x: Self) {
    
    inline def setDefineCustomElementFn(value: Callback): Self = StObject.set(x, "defineCustomElementFn", value.toJsFn)
    
    inline def setDefineCustomElementFnUndefined: Self = StObject.set(x, "defineCustomElementFn", js.undefined)
    
    inline def setInputs(value: Any): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setMethods(value: Any): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
  }
}
