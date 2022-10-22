package typingsJapgolly.grammarkdown

import typingsJapgolly.esfxAsyncCanceltoken.mod.CancelToken
import typingsJapgolly.esfxCancelable.mod.Cancelable
import typingsJapgolly.grammarkdown.distCheckerMod.Resolver
import typingsJapgolly.grammarkdown.distDiagnosticsMod.DiagnosticMessages
import typingsJapgolly.grammarkdown.distNodesMod.Argument
import typingsJapgolly.grammarkdown.distNodesMod.ArgumentList
import typingsJapgolly.grammarkdown.distNodesMod.ButNotSymbol
import typingsJapgolly.grammarkdown.distNodesMod.Constraints
import typingsJapgolly.grammarkdown.distNodesMod.Define
import typingsJapgolly.grammarkdown.distNodesMod.EmptyAssertion
import typingsJapgolly.grammarkdown.distNodesMod.HtmlCloseTagTrivia
import typingsJapgolly.grammarkdown.distNodesMod.HtmlCommentTrivia
import typingsJapgolly.grammarkdown.distNodesMod.HtmlOpenTagTrivia
import typingsJapgolly.grammarkdown.distNodesMod.Identifier
import typingsJapgolly.grammarkdown.distNodesMod.Import
import typingsJapgolly.grammarkdown.distNodesMod.LexicalGoalAssertion
import typingsJapgolly.grammarkdown.distNodesMod.Line
import typingsJapgolly.grammarkdown.distNodesMod.LinkReference
import typingsJapgolly.grammarkdown.distNodesMod.LookaheadAssertion
import typingsJapgolly.grammarkdown.distNodesMod.MultiLineCommentTrivia
import typingsJapgolly.grammarkdown.distNodesMod.NoSymbolHereAssertion
import typingsJapgolly.grammarkdown.distNodesMod.Node
import typingsJapgolly.grammarkdown.distNodesMod.Nonterminal
import typingsJapgolly.grammarkdown.distNodesMod.NumberLiteral
import typingsJapgolly.grammarkdown.distNodesMod.OneOfList
import typingsJapgolly.grammarkdown.distNodesMod.OneOfSymbol
import typingsJapgolly.grammarkdown.distNodesMod.Parameter
import typingsJapgolly.grammarkdown.distNodesMod.ParameterList
import typingsJapgolly.grammarkdown.distNodesMod.PlaceholderSymbol
import typingsJapgolly.grammarkdown.distNodesMod.Production
import typingsJapgolly.grammarkdown.distNodesMod.Prose
import typingsJapgolly.grammarkdown.distNodesMod.ProseAssertion
import typingsJapgolly.grammarkdown.distNodesMod.ProseFragmentLiteral
import typingsJapgolly.grammarkdown.distNodesMod.RightHandSide
import typingsJapgolly.grammarkdown.distNodesMod.RightHandSideList
import typingsJapgolly.grammarkdown.distNodesMod.SingleLineCommentTrivia
import typingsJapgolly.grammarkdown.distNodesMod.SourceFile
import typingsJapgolly.grammarkdown.distNodesMod.StringLiteral
import typingsJapgolly.grammarkdown.distNodesMod.SymbolSet
import typingsJapgolly.grammarkdown.distNodesMod.SymbolSpan
import typingsJapgolly.grammarkdown.distNodesMod.Terminal
import typingsJapgolly.grammarkdown.distNodesMod.TerminalLiteral
import typingsJapgolly.grammarkdown.distNodesMod.TextContent
import typingsJapgolly.grammarkdown.distNodesMod.Trivia
import typingsJapgolly.grammarkdown.distNodesMod.UnicodeCharacterLiteral
import typingsJapgolly.grammarkdown.distNodesMod.UnicodeCharacterRange
import typingsJapgolly.grammarkdown.distOptionsMod.CompilerOptions
import typingsJapgolly.grammarkdown.distStringwriterMod.StringWriter
import typingsJapgolly.grammarkdown.distTokensMod.ProseFragmentLiteralKind
import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind
import typingsJapgolly.grammarkdown.distTypesMod.TextRange
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEmitterEmitterMod {
  
  @JSImport("grammarkdown/dist/emitter/emitter", "Emitter")
  @js.native
  open class Emitter protected () extends StObject {
    def this(options: CompilerOptions) = this()
    
    /* private */ var _cancelToken: Any = js.native
    
    /* private */ var _diagnostics: Any = js.native
    
    /* private */ var _sourceFile: Any = js.native
    
    /* private */ var _triviaPos: Any = js.native
    
    /* protected */ def afterEmitNode(node: Node[SyntaxKind]): Unit = js.native
    
    /* protected */ def afterEmitTrivia(node: Trivia): Unit = js.native
    
    /* protected */ def beforeEmitNode(node: Node[SyntaxKind]): Unit = js.native
    
    /* protected */ def beforeEmitTrivia(node: Trivia): Unit = js.native
    
    /* protected */ def createWriter(options: CompilerOptions): StringWriter = js.native
    
    def emit(
      node: SourceFile,
      resolver: Resolver,
      diagnostics: DiagnosticMessages,
      writeFile: js.Function3[
          /* file */ String, 
          /* text */ String, 
          /* cancelToken */ js.UndefOr[CancelToken], 
          Unit | PromiseLike[Unit]
        ]
    ): js.Promise[Unit] = js.native
    def emit(
      node: SourceFile,
      resolver: Resolver,
      diagnostics: DiagnosticMessages,
      writeFile: js.Function3[
          /* file */ String, 
          /* text */ String, 
          /* cancelToken */ js.UndefOr[CancelToken], 
          Unit | PromiseLike[Unit]
        ],
      cancelable: Cancelable
    ): js.Promise[Unit] = js.native
    
    /* protected */ def emitArgument(node: Argument): Unit = js.native
    
    /* protected */ def emitArgumentList(node: ArgumentList): Unit = js.native
    
    /* protected */ def emitButNotSymbol(node: ButNotSymbol): Unit = js.native
    
    /* protected */ def emitChildren(node: Node[SyntaxKind]): Unit = js.native
    
    /* protected */ def emitConstraints(node: Constraints): Unit = js.native
    
    /* protected */ def emitDefine(node: Define): Unit = js.native
    
    /* protected */ def emitDetachedTriviaOfNode(node: Node[SyntaxKind]): Unit = js.native
    
    /* protected */ def emitEmptyAssertion(node: EmptyAssertion): Unit = js.native
    
    /* protected */ def emitHtmlCloseTagTrivia(node: HtmlCloseTagTrivia): Unit = js.native
    
    /* protected */ def emitHtmlCommentTrivia(node: HtmlCommentTrivia): Unit = js.native
    
    /* protected */ def emitHtmlOpenTagTrivia(node: HtmlOpenTagTrivia): Unit = js.native
    
    /* protected */ def emitIdentifier(node: Identifier): Unit = js.native
    
    /* protected */ def emitImport(node: Import): Unit = js.native
    
    /* protected */ def emitKeyword(node: Node[SyntaxKind]): Unit = js.native
    
    /* protected */ def emitLeadingTriviaOfNode(node: Node[SyntaxKind]): Unit = js.native
    
    /* protected */ def emitLexicalGoalAssertion(node: LexicalGoalAssertion): Unit = js.native
    
    /* protected */ def emitLine(node: Line): Unit = js.native
    
    /* protected */ def emitLinkReference(node: LinkReference): Unit = js.native
    
    /* protected */ def emitLookaheadAssertion(node: LookaheadAssertion): Unit = js.native
    
    /* protected */ def emitMultiLineCommentTrivia(node: MultiLineCommentTrivia): Unit = js.native
    
    /* protected */ def emitNoSymbolHereAssertion(node: NoSymbolHereAssertion): Unit = js.native
    
    /* protected */ def emitNode(): Unit = js.native
    /* protected */ def emitNode(node: Node[SyntaxKind]): Unit = js.native
    
    /* protected */ def emitNodeCore(node: Node[SyntaxKind]): Unit = js.native
    
    /* protected */ def emitNodes(nodes: js.Iterable[Node[SyntaxKind]]): Unit = js.native
    
    /* protected */ def emitNonterminal(node: Nonterminal): Unit = js.native
    
    /* protected */ def emitNumberLiteral(node: NumberLiteral): Unit = js.native
    
    /* protected */ def emitOneOfList(node: OneOfList): Unit = js.native
    
    /* protected */ def emitOneOfSymbol(node: OneOfSymbol): Unit = js.native
    
    /* protected */ def emitParameter(node: Parameter): Unit = js.native
    
    /* protected */ def emitParameterList(node: ParameterList): Unit = js.native
    
    /* protected */ def emitPlaceholder(node: PlaceholderSymbol): Unit = js.native
    
    /* protected */ def emitProduction(node: Production): Unit = js.native
    
    /* protected */ def emitProse(node: Prose): Unit = js.native
    
    /* protected */ def emitProseAssertion(node: ProseAssertion): Unit = js.native
    
    /* protected */ def emitProseFragmentLiteral(node: ProseFragmentLiteral[ProseFragmentLiteralKind]): Unit = js.native
    
    /* protected */ def emitRightHandSide(node: RightHandSide): Unit = js.native
    
    /* protected */ def emitRightHandSideList(node: RightHandSideList): Unit = js.native
    
    /* protected */ def emitSingleLineCommentTrivia(node: SingleLineCommentTrivia): Unit = js.native
    
    /* protected */ def emitSourceFile(node: SourceFile): Unit = js.native
    
    def emitString(sourceFile: SourceFile, resolver: Resolver, diagnostics: DiagnosticMessages): String = js.native
    def emitString(
      sourceFile: SourceFile,
      resolver: Resolver,
      diagnostics: DiagnosticMessages,
      cancelable: Unit,
      node: Node[SyntaxKind]
    ): String = js.native
    def emitString(
      sourceFile: SourceFile,
      resolver: Resolver,
      diagnostics: DiagnosticMessages,
      cancelable: Cancelable
    ): String = js.native
    def emitString(
      sourceFile: SourceFile,
      resolver: Resolver,
      diagnostics: DiagnosticMessages,
      cancelable: Cancelable,
      node: Node[SyntaxKind]
    ): String = js.native
    
    /* protected */ def emitStringLiteral(node: StringLiteral): Unit = js.native
    
    /* protected */ def emitSymbolSet(node: SymbolSet): Unit = js.native
    
    /* protected */ def emitSymbolSpan(node: SymbolSpan): Unit = js.native
    
    /* protected */ def emitTerminal(node: Terminal): Unit = js.native
    
    /* protected */ def emitTerminalLiteral(node: TerminalLiteral): Unit = js.native
    
    /* protected */ def emitTextContent(node: TextContent): Unit = js.native
    
    /* protected */ def emitTextRange(range: TextRange): Unit = js.native
    
    /* protected */ def emitToken(): Unit = js.native
    /* protected */ def emitToken(node: Node[SyntaxKind]): Unit = js.native
    
    /* protected */ def emitTokenKind(kind: SyntaxKind): Unit = js.native
    
    /* protected */ def emitTrailingTriviaOfNode(node: Node[SyntaxKind]): Unit = js.native
    
    /* protected */ def emitTrivia(node: Trivia): Unit = js.native
    
    /* protected */ def emitTriviaCore(node: Trivia): Unit = js.native
    
    /* protected */ def emitTriviaNodes(): Unit = js.native
    /* protected */ def emitTriviaNodes(nodes: js.Array[Trivia]): Unit = js.native
    
    /* protected */ def emitUnicodeCharacterLiteral(node: UnicodeCharacterLiteral): Unit = js.native
    
    /* protected */ def emitUnicodeCharacterRange(node: UnicodeCharacterRange): Unit = js.native
    
    /* protected */ def encode(text: String): String = js.native
    
    /* protected */ var `extension`: String = js.native
    
    /* protected */ def getOutputFilename(node: SourceFile): String = js.native
    
    /* protected */ var options: CompilerOptions = js.native
    
    /* protected */ var resolver: Resolver = js.native
    
    /* protected */ def sourceFile: js.UndefOr[SourceFile] = js.native
    
    /* protected */ var writer: StringWriter = js.native
  }
}
