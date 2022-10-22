package typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod

import typingsJapgolly.angularCompiler.mod.TmplAstElement
import typingsJapgolly.angularCompiler.mod.TmplAstReference
import typingsJapgolly.angularCompiler.mod.TmplAstTemplate
import typingsJapgolly.angularCompiler.mod.TmplAstVariable
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Directive
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.DomBinding
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Element
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Expression
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Input
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Output
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Pipe
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Reference
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Template
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Variable
import typingsJapgolly.angularCompilerCli.srcNgtscUtilSrcTypescriptMod.SymbolWithValueDeclaration
import typingsJapgolly.typescript.mod.ClassDeclaration
import typingsJapgolly.typescript.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.InputBindingSymbol
  - typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.OutputBindingSymbol
  - typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.ElementSymbol
  - typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.ReferenceSymbol
  - typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.VariableSymbol
  - typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.ExpressionSymbol
  - typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.DirectiveSymbol
  - typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.TemplateSymbol
  - typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.DomBindingSymbol
  - typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.PipeSymbol
*/
trait Symbol extends StObject
object Symbol {
  
  inline def DirectiveSymbol(
    isComponent: Boolean,
    isStructural: Boolean,
    kind: Directive,
    selector: String,
    tcbLocation: TcbLocation,
    tsSymbol: SymbolWithValueDeclaration,
    tsType: Type
  ): typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.DirectiveSymbol = {
    val __obj = js.Dynamic.literal(isComponent = isComponent.asInstanceOf[js.Any], isStructural = isStructural.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], tcbLocation = tcbLocation.asInstanceOf[js.Any], tsSymbol = tsSymbol.asInstanceOf[js.Any], tsType = tsType.asInstanceOf[js.Any], ngModule = null)
    __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.DirectiveSymbol]
  }
  
  inline def DomBindingSymbol(host: ElementSymbol | TemplateSymbol, kind: DomBinding): typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.DomBindingSymbol = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.DomBindingSymbol]
  }
  
  inline def ElementSymbol(
    directives: js.Array[DirectiveSymbol],
    kind: Element,
    tcbLocation: TcbLocation,
    templateNode: TmplAstElement,
    tsType: Type
  ): typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.ElementSymbol = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], tcbLocation = tcbLocation.asInstanceOf[js.Any], templateNode = templateNode.asInstanceOf[js.Any], tsType = tsType.asInstanceOf[js.Any], tsSymbol = null)
    __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.ElementSymbol]
  }
  
  inline def ExpressionSymbol(kind: Expression, tcbLocation: TcbLocation, tsType: Type): typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.ExpressionSymbol = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], tcbLocation = tcbLocation.asInstanceOf[js.Any], tsType = tsType.asInstanceOf[js.Any], tsSymbol = null)
    __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.ExpressionSymbol]
  }
  
  inline def InputBindingSymbol(bindings: js.Array[BindingSymbol], kind: Input): typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.InputBindingSymbol = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.InputBindingSymbol]
  }
  
  inline def OutputBindingSymbol(bindings: js.Array[BindingSymbol], kind: Output): typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.OutputBindingSymbol = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.OutputBindingSymbol]
  }
  
  inline def PipeSymbol(classSymbol: ClassSymbol, kind: Pipe, tcbLocation: TcbLocation, tsType: Type): typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.PipeSymbol = {
    val __obj = js.Dynamic.literal(classSymbol = classSymbol.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], tcbLocation = tcbLocation.asInstanceOf[js.Any], tsType = tsType.asInstanceOf[js.Any], tsSymbol = null)
    __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.PipeSymbol]
  }
  
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
  
  inline def TemplateSymbol(directives: js.Array[DirectiveSymbol], kind: Template, templateNode: TmplAstTemplate): typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.TemplateSymbol = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], templateNode = templateNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.TemplateSymbol]
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
