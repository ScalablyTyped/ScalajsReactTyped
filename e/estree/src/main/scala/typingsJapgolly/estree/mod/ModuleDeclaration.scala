package typingsJapgolly.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.estree.mod.ImportDeclaration
  - typingsJapgolly.estree.mod.ExportNamedDeclaration
  - typingsJapgolly.estree.mod.ExportDefaultDeclaration
  - typingsJapgolly.estree.mod.ExportAllDeclaration
*/
trait ModuleDeclaration extends StObject
object ModuleDeclaration {
  
  inline def ExportAllDeclaration(source: Literal): typingsJapgolly.estree.mod.ExportAllDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], exported = null)
    __obj.updateDynamic("type")("ExportAllDeclaration")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.ExportAllDeclaration]
  }
  
  inline def ExportDefaultDeclaration(declaration: Declaration | Expression): typingsJapgolly.estree.mod.ExportDefaultDeclaration = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDefaultDeclaration")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.ExportDefaultDeclaration]
  }
  
  inline def ExportNamedDeclaration(specifiers: js.Array[ExportSpecifier]): typingsJapgolly.estree.mod.ExportNamedDeclaration = {
    val __obj = js.Dynamic.literal(specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportNamedDeclaration")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.ExportNamedDeclaration]
  }
  
  inline def ImportDeclaration(
    source: Literal,
    specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier]
  ): typingsJapgolly.estree.mod.ImportDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDeclaration")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.ImportDeclaration]
  }
}
