package typingsJapgolly.angularCompiler.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angularCompiler.angularCompilerStrings.ngmodule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3DeclareNgModuleDependencyMetadata
  extends StObject
     with R3DeclareTemplateDependencyMetadata {
  
  var kind: ngmodule
  
  var `type`: Expression | js.Function0[Expression]
}
object R3DeclareNgModuleDependencyMetadata {
  
  inline def apply(`type`: Expression | js.Function0[Expression]): R3DeclareNgModuleDependencyMetadata = {
    val __obj = js.Dynamic.literal(kind = "ngmodule")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DeclareNgModuleDependencyMetadata]
  }
  
  extension [Self <: R3DeclareNgModuleDependencyMetadata](x: Self) {
    
    inline def setKind(value: ngmodule): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setType(value: Expression | js.Function0[Expression]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeCallbackTo(value: CallbackTo[Expression]): Self = StObject.set(x, "type", value.toJsFn)
  }
}
