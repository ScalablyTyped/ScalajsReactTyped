package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompiler.mod.AST
import typingsJapgolly.angularCompiler.mod.LiteralPrimitive
import typingsJapgolly.angularCompiler.mod.PropertyRead
import typingsJapgolly.angularCompiler.mod.PropertyWrite
import typingsJapgolly.angularCompiler.mod.SafePropertyRead
import typingsJapgolly.angularCompiler.mod.TmplAstNode
import typingsJapgolly.angularCompiler.mod.TmplAstTemplate
import typingsJapgolly.angularCompiler.mod.TmplAstTextAttribute
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiCompletionMod.GlobalCompletion
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.TcbLocation
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckSrcContextMod.TemplateData
import typingsJapgolly.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckSrcCompletionMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/completion", "CompletionEngine")
  @js.native
  open class CompletionEngine protected () extends StObject {
    def this(tcb: Node, data: TemplateData, tcbPath: AbsoluteFsPath, tcbIsShim: Boolean) = this()
    
    /* private */ var componentContext: Any = js.native
    
    /* private */ var data: Any = js.native
    
    /* private */ var expressionCompletionCache: Any = js.native
    
    def getExpressionCompletionLocation(expr: PropertyRead): TcbLocation | Null = js.native
    def getExpressionCompletionLocation(expr: PropertyWrite): TcbLocation | Null = js.native
    def getExpressionCompletionLocation(expr: SafePropertyRead): TcbLocation | Null = js.native
    
    def getGlobalCompletions(context: Null, node: AST): GlobalCompletion | Null = js.native
    def getGlobalCompletions(context: Null, node: TmplAstNode): GlobalCompletion | Null = js.native
    /**
      * Get global completions within the given template context and AST node.
      *
      * @param context the given template context - either a `TmplAstTemplate` embedded view, or `null`
      *     for the root
      * template context.
      * @param node the given AST node
      */
    def getGlobalCompletions(context: TmplAstTemplate, node: AST): GlobalCompletion | Null = js.native
    def getGlobalCompletions(context: TmplAstTemplate, node: TmplAstNode): GlobalCompletion | Null = js.native
    
    def getLiteralCompletionLocation(expr: LiteralPrimitive): TcbLocation | Null = js.native
    def getLiteralCompletionLocation(expr: TmplAstTextAttribute): TcbLocation | Null = js.native
    
    /**
      * Get global completions within the given template context - either a `TmplAstTemplate` embedded
      * view, or `null` for the root context.
      */
    /* private */ var getTemplateContextCompletions: Any = js.native
    
    /* private */ var tcb: Any = js.native
    
    /* private */ var tcbIsShim: Any = js.native
    
    /* private */ var tcbPath: Any = js.native
    
    /**
      * Cache of completions for various levels of the template, including the root template (`null`).
      * Memoizes `getTemplateContextCompletions`.
      */
    /* private */ var templateContextCache: Any = js.native
  }
}
