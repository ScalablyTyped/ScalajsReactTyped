package typingsJapgolly.angularCore.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angularCore.angularCoreStrings.component
import typingsJapgolly.angularCore.angularCoreStrings.directive
import typingsJapgolly.angularCore.mod.OpaqueValue
import typingsJapgolly.angularCore.mod.R3DeclareTemplateDependencyFacade
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @angular/core.@angular/core.R3DeclareDirectiveDependencyFacade & {  kind :string} */
trait R3DeclareDirectiveDepende
  extends StObject
     with R3DeclareTemplateDependencyFacade {
  
  var exportAs: js.UndefOr[js.Array[String]] = js.undefined
  
  var inputs: js.UndefOr[js.Array[String]] = js.undefined
  
  var kind: (js.UndefOr[directive | component]) & String
  
  var outputs: js.UndefOr[js.Array[String]] = js.undefined
  
  var selector: String
  
  var `type`: OpaqueValue | js.Function0[OpaqueValue]
}
object R3DeclareDirectiveDepende {
  
  inline def apply(
    kind: (js.UndefOr[directive | component]) & String,
    selector: String,
    `type`: OpaqueValue | js.Function0[OpaqueValue]
  ): R3DeclareDirectiveDepende = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DeclareDirectiveDepende]
  }
  
  extension [Self <: R3DeclareDirectiveDepende](x: Self) {
    
    inline def setExportAs(value: js.Array[String]): Self = StObject.set(x, "exportAs", value.asInstanceOf[js.Any])
    
    inline def setExportAsUndefined: Self = StObject.set(x, "exportAs", js.undefined)
    
    inline def setExportAsVarargs(value: String*): Self = StObject.set(x, "exportAs", js.Array(value*))
    
    inline def setInputs(value: js.Array[String]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setInputsVarargs(value: String*): Self = StObject.set(x, "inputs", js.Array(value*))
    
    inline def setKind(value: (js.UndefOr[directive | component]) & String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: js.Array[String]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    inline def setOutputsVarargs(value: String*): Self = StObject.set(x, "outputs", js.Array(value*))
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setType(value: OpaqueValue | js.Function0[OpaqueValue]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeCallbackTo(value: CallbackTo[OpaqueValue]): Self = StObject.set(x, "type", value.toJsFn)
  }
}
