package typingsJapgolly.angularCore.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angularCore.angularCoreStrings.pipe
import typingsJapgolly.angularCore.mod.OpaqueValue
import typingsJapgolly.angularCore.mod.R3DeclareTemplateDependencyFacade
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @angular/core.@angular/core.R3DeclarePipeDependencyFacade & {  kind :string} */
trait R3DeclarePipeDependencyFa
  extends StObject
     with R3DeclareTemplateDependencyFacade {
  
  var kind: js.UndefOr[pipe] & String
  
  var name: String
  
  var `type`: OpaqueValue | js.Function0[OpaqueValue]
}
object R3DeclarePipeDependencyFa {
  
  inline def apply(kind: js.UndefOr[pipe] & String, name: String, `type`: OpaqueValue | js.Function0[OpaqueValue]): R3DeclarePipeDependencyFa = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DeclarePipeDependencyFa]
  }
  
  extension [Self <: R3DeclarePipeDependencyFa](x: Self) {
    
    inline def setKind(value: js.UndefOr[pipe] & String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: OpaqueValue | js.Function0[OpaqueValue]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeCallbackTo(value: CallbackTo[OpaqueValue]): Self = StObject.set(x, "type", value.toJsFn)
  }
}
