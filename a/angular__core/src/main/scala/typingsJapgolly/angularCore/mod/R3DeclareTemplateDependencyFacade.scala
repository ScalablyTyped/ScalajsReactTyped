package typingsJapgolly.angularCore.mod

import typingsJapgolly.angularCore.angularCoreStrings.component
import typingsJapgolly.angularCore.angularCoreStrings.directive
import typingsJapgolly.angularCore.angularCoreStrings.ngmodule
import typingsJapgolly.angularCore.angularCoreStrings.pipe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularCore.anon.R3DeclareDirectiveDepende
  - typingsJapgolly.angularCore.anon.R3DeclarePipeDependencyFa
  - typingsJapgolly.angularCore.anon.R3DeclareNgModuleDependen
*/
trait R3DeclareTemplateDependencyFacade extends StObject
object R3DeclareTemplateDependencyFacade {
  
  inline def R3DeclareDirectiveDepende(
    kind: (js.UndefOr[directive | component]) & String,
    selector: String,
    `type`: OpaqueValue | js.Function0[OpaqueValue]
  ): typingsJapgolly.angularCore.anon.R3DeclareDirectiveDepende = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCore.anon.R3DeclareDirectiveDepende]
  }
  
  inline def R3DeclareNgModuleDependen(kind: ngmodule & String, `type`: OpaqueValue | js.Function0[OpaqueValue]): typingsJapgolly.angularCore.anon.R3DeclareNgModuleDependen = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCore.anon.R3DeclareNgModuleDependen]
  }
  
  inline def R3DeclarePipeDependencyFa(kind: js.UndefOr[pipe] & String, name: String, `type`: OpaqueValue | js.Function0[OpaqueValue]): typingsJapgolly.angularCore.anon.R3DeclarePipeDependencyFa = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCore.anon.R3DeclarePipeDependencyFa]
  }
}
