package typingsJapgolly.angularCompiler.mod

import typingsJapgolly.angularCompiler.angularCompilerStrings.component
import typingsJapgolly.angularCompiler.angularCompilerStrings.directive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularCompiler.mod.R3DeclareDirectiveDependencyMetadata
  - typingsJapgolly.angularCompiler.mod.R3DeclarePipeDependencyMetadata
  - typingsJapgolly.angularCompiler.mod.R3DeclareNgModuleDependencyMetadata
*/
trait R3DeclareTemplateDependencyMetadata extends StObject
object R3DeclareTemplateDependencyMetadata {
  
  inline def R3DeclareDirectiveDependencyMetadata(kind: directive | component, selector: String, `type`: Expression | js.Function0[Expression]): typingsJapgolly.angularCompiler.mod.R3DeclareDirectiveDependencyMetadata = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCompiler.mod.R3DeclareDirectiveDependencyMetadata]
  }
  
  inline def R3DeclareNgModuleDependencyMetadata(`type`: Expression | js.Function0[Expression]): typingsJapgolly.angularCompiler.mod.R3DeclareNgModuleDependencyMetadata = {
    val __obj = js.Dynamic.literal(kind = "ngmodule")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCompiler.mod.R3DeclareNgModuleDependencyMetadata]
  }
  
  inline def R3DeclarePipeDependencyMetadata(name: String, `type`: Expression | js.Function0[Expression]): typingsJapgolly.angularCompiler.mod.R3DeclarePipeDependencyMetadata = {
    val __obj = js.Dynamic.literal(kind = "pipe", name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCompiler.mod.R3DeclarePipeDependencyMetadata]
  }
}
