package typingsJapgolly.grammarkdown

import typingsJapgolly.grammarkdown.nodesMod.Argument
import typingsJapgolly.grammarkdown.nodesMod.ArgumentList
import typingsJapgolly.grammarkdown.nodesMod.ButNotSymbol
import typingsJapgolly.grammarkdown.nodesMod.Constraints
import typingsJapgolly.grammarkdown.nodesMod.Define
import typingsJapgolly.grammarkdown.nodesMod.EmptyAssertion
import typingsJapgolly.grammarkdown.nodesMod.Identifier
import typingsJapgolly.grammarkdown.nodesMod.Import
import typingsJapgolly.grammarkdown.nodesMod.InvalidAssertion
import typingsJapgolly.grammarkdown.nodesMod.InvalidSymbol
import typingsJapgolly.grammarkdown.nodesMod.LexicalGoalAssertion
import typingsJapgolly.grammarkdown.nodesMod.LinkReference
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
import typingsJapgolly.grammarkdown.nodesMod.StringLiteral
import typingsJapgolly.grammarkdown.nodesMod.SymbolSet
import typingsJapgolly.grammarkdown.nodesMod.SymbolSpan
import typingsJapgolly.grammarkdown.nodesMod.Terminal
import typingsJapgolly.grammarkdown.nodesMod.Token
import typingsJapgolly.grammarkdown.nodesMod.UnicodeCharacterLiteral
import typingsJapgolly.grammarkdown.nodesMod.UnicodeCharacterRange
import typingsJapgolly.grammarkdown.tokensMod.ProseFragmentLiteralKind
import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind
import typingsJapgolly.grammarkdown.tokensMod.TokenKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/visitor", JSImport.Namespace)
@js.native
object visitorMod extends js.Object {
  @js.native
  abstract class NodeVisitor () extends js.Object {
    def visit[T /* <: Node[SyntaxKind] */](): js.UndefOr[T] = js.native
    def visit[T /* <: Node[SyntaxKind] */](node: T): T = js.native
    def visitArgument(node: Argument): Argument = js.native
    def visitArgumentList(node: ArgumentList): ArgumentList = js.native
    def visitButNotSymbol(node: ButNotSymbol): ButNotSymbol = js.native
    def visitConstraints(node: Constraints): Constraints = js.native
    def visitDefine(node: Define): Define = js.native
    def visitEach[T /* <: Node[SyntaxKind] */](): js.UndefOr[js.Array[T]] = js.native
    def visitEach[T /* <: Node[SyntaxKind] */](nodes: js.Array[T]): js.UndefOr[js.Array[T]] = js.native
    @JSName("visitEach")
    def visitEach_T_NodeSyntaxKind_Array[T /* <: Node[SyntaxKind] */](nodes: js.Array[T]): js.Array[T] = js.native
    def visitEmptyAssertion(node: EmptyAssertion): EmptyAssertion = js.native
    def visitExtension[T /* <: Node[SyntaxKind] */](node: T): T = js.native
    def visitIdentifier(node: Identifier): Identifier = js.native
    def visitImport(node: Import): Import = js.native
    def visitInvalidAssertion(node: InvalidAssertion): InvalidAssertion = js.native
    def visitInvalidSymbol(node: InvalidSymbol): InvalidSymbol = js.native
    def visitLexicalGoalAssertion(node: LexicalGoalAssertion): LexicalGoalAssertion = js.native
    def visitLinkReference(node: LinkReference): LinkReference = js.native
    def visitLookaheadAssertion(node: LookaheadAssertion): LookaheadAssertion = js.native
    def visitNoSymbolHereAssertion(node: NoSymbolHereAssertion): NoSymbolHereAssertion = js.native
    def visitNonterminal(node: Nonterminal): Nonterminal = js.native
    def visitOneOfList(node: OneOfList): OneOfList = js.native
    def visitOneOfSymbol(node: OneOfSymbol): OneOfSymbol = js.native
    def visitParameter(node: Parameter): Parameter = js.native
    def visitParameterList(node: ParameterList): ParameterList = js.native
    def visitPlaceholderSymbol(node: PlaceholderSymbol): PlaceholderSymbol = js.native
    def visitProduction(node: Production): Production = js.native
    def visitProse(node: Prose): Prose = js.native
    def visitProseAssertion(node: ProseAssertion): ProseAssertion = js.native
    def visitProseFragmentLiteral(node: ProseFragmentLiteral[ProseFragmentLiteralKind]): ProseFragmentLiteral[ProseFragmentLiteralKind] = js.native
    def visitRightHandSide(node: RightHandSide): RightHandSide = js.native
    def visitRightHandSideList(node: RightHandSideList): RightHandSideList = js.native
    def visitSourceFile(node: SourceFile): SourceFile = js.native
    def visitStringLiteral(node: StringLiteral): StringLiteral = js.native
    def visitSymbolSet(node: SymbolSet): SymbolSet = js.native
    def visitSymbolSpan(node: SymbolSpan): SymbolSpan = js.native
    def visitTerminal(node: Terminal): Terminal = js.native
    def visitToken[TKind /* <: TokenKind */](node: Token[TKind]): Token[TKind] = js.native
    def visitUnicodeCharacterLiteral(node: UnicodeCharacterLiteral): UnicodeCharacterLiteral = js.native
    def visitUnicodeCharacterRange(node: UnicodeCharacterRange): UnicodeCharacterRange = js.native
    @JSName("visit")
    def visit_T_NodeSyntaxKind_Union[T /* <: Node[SyntaxKind] */](node: T): js.UndefOr[T] = js.native
  }
  
}

