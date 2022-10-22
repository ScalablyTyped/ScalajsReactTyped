package typingsJapgolly.angularCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseFactory extends StObject {
  
  var deps: js.UndefOr[js.Array[Any]] = js.undefined
  
  var useFactory: js.UndefOr[js.Function] = js.undefined
  
  var useValue: js.UndefOr[Any] = js.undefined
}
object UseFactory {
  
  inline def apply(): UseFactory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseFactory]
  }
  
  extension [Self <: UseFactory](x: Self) {
    
    inline def setDeps(value: js.Array[Any]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
    
    inline def setDepsVarargs(value: Any*): Self = StObject.set(x, "deps", js.Array(value*))
    
    inline def setUseFactory(value: js.Function): Self = StObject.set(x, "useFactory", value.asInstanceOf[js.Any])
    
    inline def setUseFactoryUndefined: Self = StObject.set(x, "useFactory", js.undefined)
    
    inline def setUseValue(value: Any): Self = StObject.set(x, "useValue", value.asInstanceOf[js.Any])
    
    inline def setUseValueUndefined: Self = StObject.set(x, "useValue", js.undefined)
  }
}
