package typingsJapgolly.angularCore.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angularCore.angularCoreStrings.ngmodule
import typingsJapgolly.angularCore.mod.OpaqueValue
import typingsJapgolly.angularCore.mod.R3DeclareTemplateDependencyFacade
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @angular/core.@angular/core.R3DeclareNgModuleDependencyFacade & {  kind :string} */
trait R3DeclareNgModuleDependen
  extends StObject
     with R3DeclareTemplateDependencyFacade {
  
  var kind: ngmodule & String
  
  var `type`: OpaqueValue | js.Function0[OpaqueValue]
}
object R3DeclareNgModuleDependen {
  
  inline def apply(kind: ngmodule & String, `type`: OpaqueValue | js.Function0[OpaqueValue]): R3DeclareNgModuleDependen = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DeclareNgModuleDependen]
  }
  
  extension [Self <: R3DeclareNgModuleDependen](x: Self) {
    
    inline def setKind(value: ngmodule & String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setType(value: OpaqueValue | js.Function0[OpaqueValue]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeCallbackTo(value: CallbackTo[OpaqueValue]): Self = StObject.set(x, "type", value.toJsFn)
  }
}
