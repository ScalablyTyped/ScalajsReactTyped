package typingsJapgolly.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleNameModuleReferenceSyntax
  extends StObject
     with SyntaxNode
     with IModuleReferenceSyntax {
  
  var moduleName: INameSyntax = js.native
  
  def update(moduleName: INameSyntax): ModuleNameModuleReferenceSyntax = js.native
  
  def withModuleName(moduleName: INameSyntax): ModuleNameModuleReferenceSyntax = js.native
}
