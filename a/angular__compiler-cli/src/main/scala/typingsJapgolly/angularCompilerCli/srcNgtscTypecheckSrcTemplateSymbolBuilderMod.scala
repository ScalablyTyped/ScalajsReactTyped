package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompiler.mod.AST
import typingsJapgolly.angularCompiler.mod.TmplAstElement
import typingsJapgolly.angularCompiler.mod.TmplAstNode
import typingsJapgolly.angularCompiler.mod.TmplAstReference
import typingsJapgolly.angularCompiler.mod.TmplAstTemplate
import typingsJapgolly.angularCompiler.mod.TmplAstVariable
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typingsJapgolly.angularCompilerCli.srcNgtscScopeSrcApiMod.ComponentScopeReader
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.ElementSymbol
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.ReferenceSymbol
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.Symbol
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.TemplateSymbol
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.VariableSymbol
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckSrcContextMod.TemplateData
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckSrcTemplateSymbolBuilderMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/template_symbol_builder", "SymbolBuilder")
  @js.native
  open class SymbolBuilder protected () extends StObject {
    def this(
      tcbPath: AbsoluteFsPath,
      tcbIsShim: Boolean,
      typeCheckBlock: Node,
      templateData: TemplateData,
      componentScopeReader: ComponentScopeReader,
      getTypeChecker: js.Function0[TypeChecker]
    ) = this()
    
    /* private */ val componentScopeReader: Any = js.native
    
    /* private */ var getDirectiveMeta: Any = js.native
    
    /* private */ var getDirectiveModule: Any = js.native
    
    /* private */ var getDirectiveSymbolForAccessExpression: Any = js.native
    
    /* private */ var getDirectivesOfNode: Any = js.native
    
    def getSymbol(node: AST): Symbol | Null = js.native
    def getSymbol(node: TmplAstElement): TemplateSymbol | ElementSymbol | Null = js.native
    def getSymbol(node: TmplAstNode): Symbol | Null = js.native
    def getSymbol(node: TmplAstReference): ReferenceSymbol | VariableSymbol | Null = js.native
    def getSymbol(node: TmplAstTemplate): TemplateSymbol | ElementSymbol | Null = js.native
    def getSymbol(node: TmplAstVariable): ReferenceSymbol | VariableSymbol | Null = js.native
    
    /* private */ var getSymbolOfAstTemplate: Any = js.native
    
    /* private */ var getSymbolOfBoundEvent: Any = js.native
    
    /* private */ var getSymbolOfElement: Any = js.native
    
    /* private */ var getSymbolOfInputBinding: Any = js.native
    
    /* private */ var getSymbolOfPipe: Any = js.native
    
    /* private */ var getSymbolOfReference: Any = js.native
    
    /* private */ var getSymbolOfTemplateExpression: Any = js.native
    
    /* private */ var getSymbolOfTsNode: Any = js.native
    
    /* private */ var getSymbolOfVariable: Any = js.native
    
    /* private */ var getTcbPositionForNode: Any = js.native
    
    /* private */ val getTypeChecker: Any = js.native
    
    /* private */ var symbolCache: Any = js.native
    
    /* private */ val tcbIsShim: Any = js.native
    
    /* private */ val tcbPath: Any = js.native
    
    /* private */ val templateData: Any = js.native
    
    /* private */ val typeCheckBlock: Any = js.native
  }
}
