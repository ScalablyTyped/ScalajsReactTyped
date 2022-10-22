package typingsJapgolly.grammarkdown

import typingsJapgolly.grammarkdown.distNodesMod.Argument
import typingsJapgolly.grammarkdown.distNodesMod.ArgumentList
import typingsJapgolly.grammarkdown.distNodesMod.ButNotSymbol
import typingsJapgolly.grammarkdown.distNodesMod.Constraints
import typingsJapgolly.grammarkdown.distNodesMod.Define
import typingsJapgolly.grammarkdown.distNodesMod.EmptyAssertion
import typingsJapgolly.grammarkdown.distNodesMod.Identifier
import typingsJapgolly.grammarkdown.distNodesMod.Import
import typingsJapgolly.grammarkdown.distNodesMod.InvalidAssertion
import typingsJapgolly.grammarkdown.distNodesMod.InvalidSymbol
import typingsJapgolly.grammarkdown.distNodesMod.LexicalGoalAssertion
import typingsJapgolly.grammarkdown.distNodesMod.Line
import typingsJapgolly.grammarkdown.distNodesMod.LinkReference
import typingsJapgolly.grammarkdown.distNodesMod.LookaheadAssertion
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
import typingsJapgolly.grammarkdown.distNodesMod.SourceFile
import typingsJapgolly.grammarkdown.distNodesMod.StringLiteral
import typingsJapgolly.grammarkdown.distNodesMod.SymbolSet
import typingsJapgolly.grammarkdown.distNodesMod.SymbolSpan
import typingsJapgolly.grammarkdown.distNodesMod.Terminal
import typingsJapgolly.grammarkdown.distNodesMod.TerminalLiteral
import typingsJapgolly.grammarkdown.distNodesMod.Token
import typingsJapgolly.grammarkdown.distNodesMod.UnicodeCharacterLiteral
import typingsJapgolly.grammarkdown.distNodesMod.UnicodeCharacterRange
import typingsJapgolly.grammarkdown.distTokensMod.ProseFragmentLiteralKind
import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind
import typingsJapgolly.grammarkdown.distTokensMod.TokenKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVisitorMod {
  
  /* note: abstract class */ @JSImport("grammarkdown/dist/visitor", "NodeVisitor")
  @js.native
  open class NodeVisitor () extends StObject {
    
    def visit[T /* <: Node[SyntaxKind] */](): js.UndefOr[T] = js.native
    def visit[T /* <: Node[SyntaxKind] */](node: T): js.UndefOr[T] = js.native
    
    def visitArgument(node: Argument): Argument = js.native
    
    def visitArgumentList(node: ArgumentList): ArgumentList = js.native
    
    def visitButNotSymbol(node: ButNotSymbol): ButNotSymbol = js.native
    
    def visitConstraints(node: Constraints): Constraints = js.native
    
    def visitDefine(node: Define): Define = js.native
    
    def visitEach[T /* <: Node[SyntaxKind] */](): js.UndefOr[js.Array[T]] = js.native
    def visitEach[T /* <: Node[SyntaxKind] */](nodes: js.Array[T]): js.UndefOr[js.Array[T]] = js.native
    @JSName("visitEach")
    def visitEach_T_Array[T /* <: Node[SyntaxKind] */](nodes: js.Array[T]): js.Array[T] = js.native
    
    def visitEmptyAssertion(node: EmptyAssertion): EmptyAssertion = js.native
    
    def visitExtension[T /* <: Node[SyntaxKind] */](node: T): T = js.native
    
    def visitIdentifier(node: Identifier): Identifier = js.native
    
    def visitImport(node: Import): Import = js.native
    
    def visitInvalidAssertion(node: InvalidAssertion): InvalidAssertion = js.native
    
    def visitInvalidSymbol(node: InvalidSymbol): InvalidSymbol = js.native
    
    def visitLexicalGoalAssertion(node: LexicalGoalAssertion): LexicalGoalAssertion = js.native
    
    def visitLine(node: Line): Line = js.native
    
    def visitLinkReference(node: LinkReference): LinkReference = js.native
    
    def visitLookaheadAssertion(node: LookaheadAssertion): LookaheadAssertion = js.native
    
    def visitNoSymbolHereAssertion(node: NoSymbolHereAssertion): NoSymbolHereAssertion = js.native
    
    def visitNonterminal(node: Nonterminal): Nonterminal = js.native
    
    def visitNumberLiteral(node: NumberLiteral): NumberLiteral = js.native
    
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
    
    def visitTerminalLiteral(node: TerminalLiteral): TerminalLiteral = js.native
    
    def visitToken[TKind /* <: TokenKind */](node: Token[TKind]): Token[TKind] = js.native
    
    def visitUnicodeCharacterLiteral(node: UnicodeCharacterLiteral): UnicodeCharacterLiteral = js.native
    
    def visitUnicodeCharacterRange(node: UnicodeCharacterRange): UnicodeCharacterRange = js.native
    
    @JSName("visit")
    def visit_T_T[T /* <: Node[SyntaxKind] */](node: T): T = js.native
  }
}
