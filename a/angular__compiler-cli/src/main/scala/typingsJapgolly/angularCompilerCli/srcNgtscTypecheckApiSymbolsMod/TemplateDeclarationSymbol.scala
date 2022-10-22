package typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod

import typingsJapgolly.angularCompiler.mod.TmplAstElement
import typingsJapgolly.angularCompiler.mod.TmplAstReference
import typingsJapgolly.angularCompiler.mod.TmplAstTemplate
import typingsJapgolly.angularCompiler.mod.TmplAstVariable
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Reference
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Variable
import typingsJapgolly.typescript.mod.ClassDeclaration
import typingsJapgolly.typescript.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.ReferenceSymbol
  - typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.VariableSymbol
*/
trait TemplateDeclarationSymbol extends StObject
object TemplateDeclarationSymbol {
  
  inline def ReferenceSymbol(
    declaration: TmplAstReference,
    kind: Reference,
    referenceVarLocation: TcbLocation,
    target: TmplAstElement | TmplAstTemplate | ClassDeclaration,
    targetLocation: TcbLocation,
    tsSymbol: typingsJapgolly.typescript.mod.Symbol,
    tsType: Type
  ): typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.ReferenceSymbol = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], referenceVarLocation = referenceVarLocation.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetLocation = targetLocation.asInstanceOf[js.Any], tsSymbol = tsSymbol.asInstanceOf[js.Any], tsType = tsType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.ReferenceSymbol]
  }
  
  inline def VariableSymbol(
    declaration: TmplAstVariable,
    initializerLocation: TcbLocation,
    kind: Variable,
    localVarLocation: TcbLocation,
    tsType: Type
  ): typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.VariableSymbol = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], initializerLocation = initializerLocation.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], localVarLocation = localVarLocation.asInstanceOf[js.Any], tsType = tsType.asInstanceOf[js.Any], tsSymbol = null)
    __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.VariableSymbol]
  }
}
