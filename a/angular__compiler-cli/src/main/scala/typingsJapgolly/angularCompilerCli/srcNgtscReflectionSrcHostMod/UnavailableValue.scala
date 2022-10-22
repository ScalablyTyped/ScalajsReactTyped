package typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod

import typingsJapgolly.typescript.mod.ImportClause
import typingsJapgolly.typescript.mod.ImportSpecifier
import typingsJapgolly.typescript.mod.TypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.UnsupportedType
  - typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.NoValueDeclaration
  - typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.TypeOnlyImport
  - typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.NamespaceImport
  - typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.UnknownReference
  - typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.MissingType
*/
trait UnavailableValue extends StObject
object UnavailableValue {
  
  inline def MissingType(): typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.MissingType = {
    val __obj = js.Dynamic.literal(kind = 0)
    __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.MissingType]
  }
  
  inline def NamespaceImport(importClause: ImportClause, typeNode: TypeNode): typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.NamespaceImport = {
    val __obj = js.Dynamic.literal(importClause = importClause.asInstanceOf[js.Any], kind = 4, typeNode = typeNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.NamespaceImport]
  }
  
  inline def NoValueDeclaration(typeNode: TypeNode): typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.NoValueDeclaration = {
    val __obj = js.Dynamic.literal(kind = 1, typeNode = typeNode.asInstanceOf[js.Any], decl = null)
    __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.NoValueDeclaration]
  }
  
  inline def TypeOnlyImport(node: ImportClause | ImportSpecifier, typeNode: TypeNode): typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.TypeOnlyImport = {
    val __obj = js.Dynamic.literal(kind = 2, node = node.asInstanceOf[js.Any], typeNode = typeNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.TypeOnlyImport]
  }
  
  inline def UnknownReference(typeNode: TypeNode): typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.UnknownReference = {
    val __obj = js.Dynamic.literal(kind = 3, typeNode = typeNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.UnknownReference]
  }
  
  inline def UnsupportedType(typeNode: TypeNode): typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.UnsupportedType = {
    val __obj = js.Dynamic.literal(kind = 5, typeNode = typeNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.UnsupportedType]
  }
}
