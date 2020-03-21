package typingsJapgolly.grammarkdown

import typingsJapgolly.grammarkdown.checkerMod.Resolver
import typingsJapgolly.grammarkdown.coreMod.TextRange
import typingsJapgolly.grammarkdown.diagnosticsMod.DiagnosticMessages
import typingsJapgolly.grammarkdown.nodesMod.Argument
import typingsJapgolly.grammarkdown.nodesMod.ArgumentList
import typingsJapgolly.grammarkdown.nodesMod.ButNotSymbol
import typingsJapgolly.grammarkdown.nodesMod.Constraints
import typingsJapgolly.grammarkdown.nodesMod.EmptyAssertion
import typingsJapgolly.grammarkdown.nodesMod.Identifier
import typingsJapgolly.grammarkdown.nodesMod.Import
import typingsJapgolly.grammarkdown.nodesMod.LexicalGoalAssertion
import typingsJapgolly.grammarkdown.nodesMod.LookaheadAssertion
import typingsJapgolly.grammarkdown.nodesMod.NoSymbolHereAssertion
import typingsJapgolly.grammarkdown.nodesMod.Node
import typingsJapgolly.grammarkdown.nodesMod.Nonterminal
import typingsJapgolly.grammarkdown.nodesMod.OneOfList
import typingsJapgolly.grammarkdown.nodesMod.OneOfSymbol
import typingsJapgolly.grammarkdown.nodesMod.Parameter
import typingsJapgolly.grammarkdown.nodesMod.ParameterList
import typingsJapgolly.grammarkdown.nodesMod.PlaceholderSymbol
import typingsJapgolly.grammarkdown.nodesMod.Production
import typingsJapgolly.grammarkdown.nodesMod.Prose
import typingsJapgolly.grammarkdown.nodesMod.ProseAssertion
import typingsJapgolly.grammarkdown.nodesMod.ProseFragmentLiteral
import typingsJapgolly.grammarkdown.nodesMod.RightHandSide
import typingsJapgolly.grammarkdown.nodesMod.RightHandSideList
import typingsJapgolly.grammarkdown.nodesMod.SourceFile
import typingsJapgolly.grammarkdown.nodesMod.SymbolSet
import typingsJapgolly.grammarkdown.nodesMod.SymbolSpan
import typingsJapgolly.grammarkdown.nodesMod.Terminal
import typingsJapgolly.grammarkdown.nodesMod.TextContent
import typingsJapgolly.grammarkdown.nodesMod.UnicodeCharacterLiteral
import typingsJapgolly.grammarkdown.nodesMod.UnicodeCharacterRange
import typingsJapgolly.grammarkdown.optionsMod.CompilerOptions
import typingsJapgolly.grammarkdown.stringwriterMod.StringWriter
import typingsJapgolly.grammarkdown.tokensMod.ProseFragmentLiteralKind
import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind
import typingsJapgolly.prex.mod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/emitter/emitter", JSImport.Namespace)
@js.native
object emitterEmitterMod extends js.Object {
  @js.native
  class Emitter protected () extends js.Object {
    def this(options: CompilerOptions) = this()
    var cancellationToken: js.Any = js.native
    var diagnostics: js.Any = js.native
    var extension: String = js.native
    var options: CompilerOptions = js.native
    var resolver: Resolver = js.native
    var sourceFile: js.Any = js.native
    var triviaPos: js.Any = js.native
    var writer: StringWriter = js.native
    /* protected */ def afterEmitNode(node: Node[SyntaxKind]): Unit = js.native
    /* protected */ def beforeEmitNode(node: Node[SyntaxKind]): Unit = js.native
    /* protected */ def createWriter(options: CompilerOptions): StringWriter = js.native
    def emit(
      node: SourceFile,
      resolver: Resolver,
      diagnostics: DiagnosticMessages,
      writeFile: js.Function3[
          /* file */ String, 
          /* text */ String, 
          /* cancellationToken */ js.UndefOr[CancellationToken], 
          Unit | js.Promise[Unit]
        ]
    ): Unit | js.Promise[Unit] = js.native
    def emit(
      node: SourceFile,
      resolver: Resolver,
      diagnostics: DiagnosticMessages,
      writeFile: js.Function3[
          /* file */ String, 
          /* text */ String, 
          /* cancellationToken */ js.UndefOr[CancellationToken], 
          Unit | js.Promise[Unit]
        ],
      cancellationToken: CancellationToken
    ): Unit | js.Promise[Unit] = js.native
    /* protected */ def emitArgument(node: Argument): Unit = js.native
    /* protected */ def emitArgumentList(node: ArgumentList): Unit = js.native
    /* protected */ def emitButNotSymbol(node: ButNotSymbol): Unit = js.native
    /* protected */ def emitConstraints(node: Constraints): Unit = js.native
    /* protected */ def emitEmptyAssertion(node: EmptyAssertion): Unit = js.native
    /* protected */ def emitHtmlTrivia(range: TextRange): Unit = js.native
    /* protected */ def emitIdentifier(node: Identifier): Unit = js.native
    /* protected */ def emitImport(node: Import): Unit = js.native
    /* protected */ def emitKeyword(node: Node[SyntaxKind]): Unit = js.native
    /* protected */ def emitLeadingHtmlTriviaOfNode(node: Node[SyntaxKind]): Unit = js.native
    /* protected */ def emitLexicalGoalAssertion(node: LexicalGoalAssertion): Unit = js.native
    /* protected */ def emitLookaheadAssertion(node: LookaheadAssertion): Unit = js.native
    /* protected */ def emitNoSymbolHereAssertion(node: NoSymbolHereAssertion): Unit = js.native
    /* protected */ def emitNode(): Unit = js.native
    /* protected */ def emitNode(node: Node[SyntaxKind]): Unit = js.native
    /* protected */ def emitNonterminal(node: Nonterminal): Unit = js.native
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
    /* protected */ def emitSourceFile(node: SourceFile): Unit = js.native
    def emitString(node: SourceFile, resolver: Resolver, diagnostics: DiagnosticMessages): String = js.native
    def emitString(
      node: SourceFile,
      resolver: Resolver,
      diagnostics: DiagnosticMessages,
      cancellationToken: CancellationToken
    ): String = js.native
    /* protected */ def emitSymbolSet(node: SymbolSet): Unit = js.native
    /* protected */ def emitSymbolSpan(node: SymbolSpan): Unit = js.native
    def emitSync(
      node: SourceFile,
      resolver: Resolver,
      diagnostics: DiagnosticMessages,
      writeFile: js.Function3[
          /* file */ String, 
          /* text */ String, 
          /* cancellationToken */ js.UndefOr[CancellationToken], 
          Unit
        ]
    ): Unit = js.native
    def emitSync(
      node: SourceFile,
      resolver: Resolver,
      diagnostics: DiagnosticMessages,
      writeFile: js.Function3[
          /* file */ String, 
          /* text */ String, 
          /* cancellationToken */ js.UndefOr[CancellationToken], 
          Unit
        ],
      cancellationToken: CancellationToken
    ): Unit = js.native
    /* protected */ def emitTerminal(node: Terminal): Unit = js.native
    /* protected */ def emitTextContent(node: TextContent): Unit = js.native
    /* protected */ def emitToken(): Unit = js.native
    /* protected */ def emitToken(node: Node[SyntaxKind]): Unit = js.native
    /* protected */ def emitTrailingHtmlTriviaOfNode(node: Node[SyntaxKind]): Unit = js.native
    /* protected */ def emitUnicodeCharacterLiteral(node: UnicodeCharacterLiteral): Unit = js.native
    /* protected */ def emitUnicodeCharacterRange(node: UnicodeCharacterRange): Unit = js.native
    /* protected */ def encode(text: String): String = js.native
    /* protected */ def getOutputFilename(node: SourceFile): String = js.native
  }
  
}

