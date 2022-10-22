package typingsJapgolly.angularCore.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angularCore.angularCoreStrings.component
import typingsJapgolly.angularCore.angularCoreStrings.directive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3DeclareDirectiveDependencyFacade extends StObject {
  
  var exportAs: js.UndefOr[js.Array[String]] = js.undefined
  
  var inputs: js.UndefOr[js.Array[String]] = js.undefined
  
  var kind: js.UndefOr[directive | component] = js.undefined
  
  var outputs: js.UndefOr[js.Array[String]] = js.undefined
  
  var selector: String
  
  var `type`: OpaqueValue | js.Function0[OpaqueValue]
}
object R3DeclareDirectiveDependencyFacade {
  
  inline def apply(selector: String, `type`: OpaqueValue | js.Function0[OpaqueValue]): R3DeclareDirectiveDependencyFacade = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DeclareDirectiveDependencyFacade]
  }
  
  extension [Self <: R3DeclareDirectiveDependencyFacade](x: Self) {
    
    inline def setExportAs(value: js.Array[String]): Self = StObject.set(x, "exportAs", value.asInstanceOf[js.Any])
    
    inline def setExportAsUndefined: Self = StObject.set(x, "exportAs", js.undefined)
    
    inline def setExportAsVarargs(value: String*): Self = StObject.set(x, "exportAs", js.Array(value*))
    
    inline def setInputs(value: js.Array[String]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setInputsVarargs(value: String*): Self = StObject.set(x, "inputs", js.Array(value*))
    
    inline def setKind(value: directive | component): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setOutputs(value: js.Array[String]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    inline def setOutputsVarargs(value: String*): Self = StObject.set(x, "outputs", js.Array(value*))
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setType(value: OpaqueValue | js.Function0[OpaqueValue]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeCallbackTo(value: CallbackTo[OpaqueValue]): Self = StObject.set(x, "type", value.toJsFn)
  }
}
