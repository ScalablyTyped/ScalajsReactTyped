package typingsJapgolly.angularCore.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angularCore.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CtorParameters extends StObject {
  
  var ctorParameters: js.UndefOr[js.Function0[js.Array[Any]]] = js.undefined
  
  var decorators: js.Array[Any]
  
  var propDecorators: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var `type`: Type[Any]
}
object CtorParameters {
  
  inline def apply(decorators: js.Array[Any], `type`: Type[Any]): CtorParameters = {
    val __obj = js.Dynamic.literal(decorators = decorators.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CtorParameters]
  }
  
  extension [Self <: CtorParameters](x: Self) {
    
    inline def setCtorParameters(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "ctorParameters", value.toJsFn)
    
    inline def setCtorParametersUndefined: Self = StObject.set(x, "ctorParameters", js.undefined)
    
    inline def setDecorators(value: js.Array[Any]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    inline def setDecoratorsVarargs(value: Any*): Self = StObject.set(x, "decorators", js.Array(value*))
    
    inline def setPropDecorators(value: StringDictionary[Any]): Self = StObject.set(x, "propDecorators", value.asInstanceOf[js.Any])
    
    inline def setPropDecoratorsUndefined: Self = StObject.set(x, "propDecorators", js.undefined)
    
    inline def setType(value: Type[Any]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
