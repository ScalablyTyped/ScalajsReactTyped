package typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod

import typingsJapgolly.typescript.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.LocalTypeValueReference
  - typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ImportedTypeValueReference
  - typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.UnavailableTypeValueReference
*/
trait TypeValueReference extends StObject
object TypeValueReference {
  
  inline def ImportedTypeValueReference(importedName: String, moduleName: String, valueDeclaration: DeclarationNode): typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ImportedTypeValueReference = {
    val __obj = js.Dynamic.literal(importedName = importedName.asInstanceOf[js.Any], kind = 1, moduleName = moduleName.asInstanceOf[js.Any], valueDeclaration = valueDeclaration.asInstanceOf[js.Any], nestedPath = null)
    __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ImportedTypeValueReference]
  }
  
  inline def LocalTypeValueReference(expression: Expression): typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.LocalTypeValueReference = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], kind = 0, defaultImportStatement = null)
    __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.LocalTypeValueReference]
  }
  
  inline def UnavailableTypeValueReference(reason: UnavailableValue): typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.UnavailableTypeValueReference = {
    val __obj = js.Dynamic.literal(kind = 2, reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.UnavailableTypeValueReference]
  }
}
