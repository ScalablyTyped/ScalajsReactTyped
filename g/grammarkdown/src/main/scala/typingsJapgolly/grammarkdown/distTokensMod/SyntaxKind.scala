package typingsJapgolly.grammarkdown.distTokensMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SyntaxKind extends StObject
@JSImport("grammarkdown/dist/tokens", "SyntaxKind")
@js.native
object SyntaxKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SyntaxKind & Double] = js.native
  
  @js.native
  sealed trait Argument
    extends StObject
       with SyntaxKind
  /* 65 */ val Argument: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.Argument & Double = js.native
  
  @js.native
  sealed trait ArgumentList
    extends StObject
       with SyntaxKind
  /* 66 */ val ArgumentList: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.ArgumentList & Double = js.native
  
  @js.native
  sealed trait AtToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 7 */ val AtToken: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.AtToken & Double = js.native
  
  @js.native
  sealed trait ButKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 31 */ val ButKeyword: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.ButKeyword & Double = js.native
  
  @js.native
  sealed trait ButNotSymbol
    extends StObject
       with SyntaxKind
       with _LexicalSymbolKind
  /* 74 */ val ButNotSymbol: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.ButNotSymbol & Double = js.native
  
  @js.native
  sealed trait CloseBraceToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 9 */ val CloseBraceToken: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.CloseBraceToken & Double = js.native
  
  @js.native
  sealed trait CloseBracketToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 12 */ val CloseBracketToken: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken & Double = js.native
  
  @js.native
  sealed trait CloseParenToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 15 */ val CloseParenToken: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.CloseParenToken & Double = js.native
  
  @js.native
  sealed trait ColonColonColonToken
    extends StObject
       with SyntaxKind
       with ProductionSeperatorKind
       with PunctuationKind
  /* 18 */ val ColonColonColonToken: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.ColonColonColonToken & Double = js.native
  
  @js.native
  sealed trait ColonColonToken
    extends StObject
       with SyntaxKind
       with ProductionSeperatorKind
       with PunctuationKind
  /* 17 */ val ColonColonToken: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.ColonColonToken & Double = js.native
  
  @js.native
  sealed trait ColonToken
    extends StObject
       with SyntaxKind
       with ProductionSeperatorKind
       with PunctuationKind
  /* 16 */ val ColonToken: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.ColonToken & Double = js.native
  
  @js.native
  sealed trait CommaToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 19 */ val CommaToken: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.CommaToken & Double = js.native
  
  @js.native
  sealed trait Constraints
    extends StObject
       with SyntaxKind
  /* 71 */ val Constraints: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.Constraints & Double = js.native
  
  @js.native
  sealed trait DefaultKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 33 */ val DefaultKeyword: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.DefaultKeyword & Double = js.native
  
  @js.native
  sealed trait Define
    extends StObject
       with SyntaxKind
       with MetaElementKind
  /* 60 */ val Define: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.Define & Double = js.native
  
  @js.native
  sealed trait DefineKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 32 */ val DefineKeyword: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.DefineKeyword & Double = js.native
  
  @js.native
  sealed trait ElementOfToken
    extends StObject
       with SyntaxKind
       with LookaheadOperatorKind
       with PunctuationKind
  /* 29 */ val ElementOfToken: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.ElementOfToken & Double = js.native
  
  @js.native
  sealed trait EmptyAssertion
    extends StObject
       with SyntaxKind
       with AssertionKind
  /* 81 */ val EmptyAssertion: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.EmptyAssertion & Double = js.native
  
  @js.native
  sealed trait EmptyKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 34 */ val EmptyKeyword: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.EmptyKeyword & Double = js.native
  
  @js.native
  sealed trait EndOfFileToken
    extends StObject
       with SyntaxKind
       with TokenKind
  /* 6 */ val EndOfFileToken: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.EndOfFileToken & Double = js.native
  
  @js.native
  sealed trait EqualsEqualsToken
    extends StObject
       with SyntaxKind
       with LookaheadOperatorKind
       with PunctuationKind
  /* 24 */ val EqualsEqualsToken: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.EqualsEqualsToken & Double = js.native
  
  @js.native
  sealed trait EqualsToken
    extends StObject
       with SyntaxKind
       with LookaheadOperatorKind
       with PunctuationKind
  /* 23 */ val EqualsToken: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.EqualsToken & Double = js.native
  
  @js.native
  sealed trait ExclamationEqualsToken
    extends StObject
       with SyntaxKind
       with LookaheadOperatorKind
       with PunctuationKind
  /* 25 */ val ExclamationEqualsToken: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.ExclamationEqualsToken & Double = js.native
  
  @js.native
  sealed trait FalseKeyword
    extends StObject
       with SyntaxKind
       with BooleanKind
       with KeywordKind
  /* 35 */ val FalseKeyword: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.FalseKeyword & Double = js.native
  
  @js.native
  sealed trait FirstCommentTrivia
    extends StObject
       with SyntaxKind
  /* 1 */ val FirstCommentTrivia: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.FirstCommentTrivia & Double = js.native
  
  @js.native
  sealed trait FirstErrorNode
    extends StObject
       with SyntaxKind
  /* 86 */ val FirstErrorNode: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.FirstErrorNode & Double = js.native
  
  @js.native
  sealed trait FirstHtmlTagTrivia
    extends StObject
       with SyntaxKind
  /* 4 */ val FirstHtmlTagTrivia: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.FirstHtmlTagTrivia & Double = js.native
  
  @js.native
  sealed trait FirstHtmlTrivia
    extends StObject
       with SyntaxKind
  /* 3 */ val FirstHtmlTrivia: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.FirstHtmlTrivia & Double = js.native
  
  @js.native
  sealed trait FirstKeyword
    extends StObject
       with SyntaxKind
  /* 31 */ val FirstKeyword: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.FirstKeyword & Double = js.native
  
  @js.native
  sealed trait FirstLiteral
    extends StObject
       with SyntaxKind
  /* 49 */ val FirstLiteral: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.FirstLiteral & Double = js.native
  
  @js.native
  sealed trait FirstProseFragmentLiteral
    extends StObject
       with SyntaxKind
  /* 53 */ val FirstProseFragmentLiteral: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.FirstProseFragmentLiteral & Double = js.native
  
  @js.native
  sealed trait FirstPunctuation
    extends StObject
       with SyntaxKind
  /* 7 */ val FirstPunctuation: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.FirstPunctuation & Double = js.native
  
  @js.native
  sealed trait FirstTextContent
    extends StObject
       with SyntaxKind
  /* 49 */ val FirstTextContent: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.FirstTextContent & Double = js.native
  
  @js.native
  sealed trait FirstToken
    extends StObject
       with SyntaxKind
  /* 6 */ val FirstToken: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.FirstToken & Double = js.native
  
  @js.native
  sealed trait FirstTrivia
    extends StObject
       with SyntaxKind
  /* 1 */ val FirstTrivia: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.FirstTrivia & Double = js.native
  
  @js.native
  sealed trait GoalKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 36 */ val GoalKeyword: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.GoalKeyword & Double = js.native
  
  @js.native
  sealed trait GreaterThanToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 13 */ val GreaterThanToken: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.GreaterThanToken & Double = js.native
  
  @js.native
  sealed trait HereKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 37 */ val HereKeyword: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.HereKeyword & Double = js.native
  
  @js.native
  sealed trait HtmlCloseTagTrivia
    extends StObject
       with SyntaxKind
       with HtmlTagTriviaKind
       with HtmlTriviaKind
  /* 5 */ val HtmlCloseTagTrivia: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.HtmlCloseTagTrivia & Double = js.native
  
  @js.native
  sealed trait HtmlCommentTrivia
    extends StObject
       with SyntaxKind
       with HtmlTriviaKind
  /* 3 */ val HtmlCommentTrivia: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.HtmlCommentTrivia & Double = js.native
  
  @js.native
  sealed trait HtmlOpenTagTrivia
    extends StObject
       with SyntaxKind
       with HtmlTagTriviaKind
       with HtmlTriviaKind
  /* 4 */ val HtmlOpenTagTrivia: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.HtmlOpenTagTrivia & Double = js.native
  
  @js.native
  sealed trait Identifier
    extends StObject
       with SyntaxKind
       with TextContentKind
  /* 57 */ val Identifier: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.Identifier & Double = js.native
  
  @js.native
  sealed trait Import
    extends StObject
       with SyntaxKind
       with MetaElementKind
  /* 59 */ val Import: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.Import & Double = js.native
  
  @js.native
  sealed trait ImportKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 38 */ val ImportKeyword: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.ImportKeyword & Double = js.native
  
  @js.native
  sealed trait InvalidAssertion
    extends StObject
       with SyntaxKind
       with AssertionKind
  /* 87 */ val InvalidAssertion: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.InvalidAssertion & Double = js.native
  
  @js.native
  sealed trait InvalidSymbol
    extends StObject
       with SyntaxKind
       with _LexicalSymbolKind
  /* 86 */ val InvalidSymbol: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.InvalidSymbol & Double = js.native
  
  @js.native
  sealed trait LastCommentTrivia
    extends StObject
       with SyntaxKind
  /* 2 */ val LastCommentTrivia: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.LastCommentTrivia & Double = js.native
  
  @js.native
  sealed trait LastErrorNode
    extends StObject
       with SyntaxKind
  /* 87 */ val LastErrorNode: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.LastErrorNode & Double = js.native
  
  @js.native
  sealed trait LastHtmlTagTrivia
    extends StObject
       with SyntaxKind
  /* 5 */ val LastHtmlTagTrivia: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.LastHtmlTagTrivia & Double = js.native
  
  @js.native
  sealed trait LastHtmlTrivia
    extends StObject
       with SyntaxKind
  /* 5 */ val LastHtmlTrivia: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.LastHtmlTrivia & Double = js.native
  
  @js.native
  sealed trait LastKeyword
    extends StObject
       with SyntaxKind
  /* 48 */ val LastKeyword: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.LastKeyword & Double = js.native
  
  @js.native
  sealed trait LastLiteral
    extends StObject
       with SyntaxKind
  /* 52 */ val LastLiteral: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.LastLiteral & Double = js.native
  
  @js.native
  sealed trait LastProseFragmentLiteral
    extends StObject
       with SyntaxKind
  /* 56 */ val LastProseFragmentLiteral: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.LastProseFragmentLiteral & Double = js.native
  
  @js.native
  sealed trait LastPunctuation
    extends StObject
       with SyntaxKind
  /* 30 */ val LastPunctuation: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.LastPunctuation & Double = js.native
  
  @js.native
  sealed trait LastTextContent
    extends StObject
       with SyntaxKind
  /* 57 */ val LastTextContent: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.LastTextContent & Double = js.native
  
  @js.native
  sealed trait LastToken
    extends StObject
       with SyntaxKind
  /* 48 */ val LastToken: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.LastToken & Double = js.native
  
  @js.native
  sealed trait LastTrivia
    extends StObject
       with SyntaxKind
  /* 5 */ val LastTrivia: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.LastTrivia & Double = js.native
  
  @js.native
  sealed trait LessThanExclamationToken
    extends StObject
       with SyntaxKind
       with LookaheadOperatorKind
       with PunctuationKind
  /* 26 */ val LessThanExclamationToken: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.LessThanExclamationToken & Double = js.native
  
  @js.native
  sealed trait LessThanMinusToken
    extends StObject
       with SyntaxKind
       with LookaheadOperatorKind
       with PunctuationKind
  /* 27 */ val LessThanMinusToken: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.LessThanMinusToken & Double = js.native
  
  @js.native
  sealed trait LexicalGoalAssertion
    extends StObject
       with SyntaxKind
       with AssertionKind
  /* 83 */ val LexicalGoalAssertion: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.LexicalGoalAssertion & Double = js.native
  
  @js.native
  sealed trait LexicalKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 39 */ val LexicalKeyword: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.LexicalKeyword & Double = js.native
  
  @js.native
  sealed trait Line
    extends StObject
       with SyntaxKind
       with MetaElementKind
  /* 61 */ val Line: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.Line & Double = js.native
  
  @js.native
  sealed trait LineKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 40 */ val LineKeyword: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.LineKeyword & Double = js.native
  
  @js.native
  sealed trait LinkReference
    extends StObject
       with SyntaxKind
  /* 67 */ val LinkReference: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.LinkReference & Double = js.native
  
  @js.native
  sealed trait LookaheadAssertion
    extends StObject
       with SyntaxKind
       with AssertionKind
  /* 82 */ val LookaheadAssertion: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.LookaheadAssertion & Double = js.native
  
  @js.native
  sealed trait LookaheadKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 41 */ val LookaheadKeyword: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.LookaheadKeyword & Double = js.native
  
  @js.native
  sealed trait MultiLineCommentTrivia
    extends StObject
       with SyntaxKind
       with CommentTriviaKind
  /* 2 */ val MultiLineCommentTrivia: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.MultiLineCommentTrivia & Double = js.native
  
  @js.native
  sealed trait NoKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 42 */ val NoKeyword: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.NoKeyword & Double = js.native
  
  @js.native
  sealed trait NoSymbolHereAssertion
    extends StObject
       with SyntaxKind
       with AssertionKind
  /* 84 */ val NoSymbolHereAssertion: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.NoSymbolHereAssertion & Double = js.native
  
  @js.native
  sealed trait Nonterminal
    extends StObject
       with SyntaxKind
       with OptionalSymbolKind
       with ProseFragmentKind
  /* 78 */ val Nonterminal: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.Nonterminal & Double = js.native
  
  @js.native
  sealed trait NotAnElementOfToken
    extends StObject
       with SyntaxKind
       with LookaheadOperatorKind
       with PunctuationKind
  /* 30 */ val NotAnElementOfToken: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.NotAnElementOfToken & Double = js.native
  
  @js.native
  sealed trait NotEqualToToken
    extends StObject
       with SyntaxKind
       with LookaheadOperatorKind
       with PunctuationKind
  /* 28 */ val NotEqualToToken: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.NotEqualToToken & Double = js.native
  
  @js.native
  sealed trait NotKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 43 */ val NotKeyword: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.NotKeyword & Double = js.native
  
  @js.native
  sealed trait NumberLiteral
    extends StObject
       with SyntaxKind
       with TextContentKind
  /* 50 */ val NumberLiteral: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.NumberLiteral & Double = js.native
  
  @js.native
  sealed trait OfKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 44 */ val OfKeyword: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.OfKeyword & Double = js.native
  
  @js.native
  sealed trait OneKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 45 */ val OneKeyword: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.OneKeyword & Double = js.native
  
  @js.native
  sealed trait OneOfList
    extends StObject
       with SyntaxKind
       with ProductionBodyKind
  /* 68 */ val OneOfList: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.OneOfList & Double = js.native
  
  @js.native
  sealed trait OneOfSymbol
    extends StObject
       with SyntaxKind
       with _LexicalSymbolKind
  /* 76 */ val OneOfSymbol: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.OneOfSymbol & Double = js.native
  
  @js.native
  sealed trait OpenBraceToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 8 */ val OpenBraceToken: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.OpenBraceToken & Double = js.native
  
  @js.native
  sealed trait OpenBracketGreaterThanToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 11 */ val OpenBracketGreaterThanToken: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.OpenBracketGreaterThanToken & Double = js.native
  
  @js.native
  sealed trait OpenBracketToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 10 */ val OpenBracketToken: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken & Double = js.native
  
  @js.native
  sealed trait OpenParenToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 14 */ val OpenParenToken: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.OpenParenToken & Double = js.native
  
  @js.native
  sealed trait OrKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 46 */ val OrKeyword: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.OrKeyword & Double = js.native
  
  @js.native
  sealed trait Parameter
    extends StObject
       with SyntaxKind
  /* 63 */ val Parameter: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.Parameter & Double = js.native
  
  @js.native
  sealed trait ParameterList
    extends StObject
       with SyntaxKind
  /* 64 */ val ParameterList: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.ParameterList & Double = js.native
  
  @js.native
  sealed trait PlaceholderSymbol
    extends StObject
       with SyntaxKind
       with _LexicalSymbolKind
  /* 77 */ val PlaceholderSymbol: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.PlaceholderSymbol & Double = js.native
  
  @js.native
  sealed trait PlusToken
    extends StObject
       with SyntaxKind
       with ArgumentOperatorKind
       with ParameterOperatorKind
       with PunctuationKind
  /* 20 */ val PlusToken: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.PlusToken & Double = js.native
  
  @js.native
  sealed trait Production
    extends StObject
       with SyntaxKind
       with SourceElementKind
  /* 62 */ val Production: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.Production & Double = js.native
  
  @js.native
  sealed trait Prose
    extends StObject
       with SyntaxKind
       with _LexicalSymbolKind
  /* 80 */ val Prose: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.Prose & Double = js.native
  
  @js.native
  sealed trait ProseAssertion
    extends StObject
       with SyntaxKind
       with AssertionKind
  /* 85 */ val ProseAssertion: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.ProseAssertion & Double = js.native
  
  @js.native
  sealed trait ProseFull
    extends StObject
       with SyntaxKind
       with ProseFragmentLiteralKind
  /* 56 */ val ProseFull: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.ProseFull & Double = js.native
  
  @js.native
  sealed trait ProseHead
    extends StObject
       with SyntaxKind
       with ProseFragmentLiteralKind
  /* 53 */ val ProseHead: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.ProseHead & Double = js.native
  
  @js.native
  sealed trait ProseMiddle
    extends StObject
       with SyntaxKind
       with ProseFragmentLiteralKind
  /* 54 */ val ProseMiddle: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.ProseMiddle & Double = js.native
  
  @js.native
  sealed trait ProseTail
    extends StObject
       with SyntaxKind
       with ProseFragmentLiteralKind
  /* 55 */ val ProseTail: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.ProseTail & Double = js.native
  
  @js.native
  sealed trait QuestionToken
    extends StObject
       with SyntaxKind
       with ArgumentOperatorKind
       with PunctuationKind
  /* 22 */ val QuestionToken: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.QuestionToken & Double = js.native
  
  @js.native
  sealed trait RightHandSide
    extends StObject
       with SyntaxKind
       with ProductionBodyKind
  /* 70 */ val RightHandSide: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.RightHandSide & Double = js.native
  
  @js.native
  sealed trait RightHandSideList
    extends StObject
       with SyntaxKind
       with ProductionBodyKind
  /* 69 */ val RightHandSideList: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.RightHandSideList & Double = js.native
  
  @js.native
  sealed trait SingleLineCommentTrivia
    extends StObject
       with SyntaxKind
       with CommentTriviaKind
  /* 1 */ val SingleLineCommentTrivia: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.SingleLineCommentTrivia & Double = js.native
  
  @js.native
  sealed trait SourceFile
    extends StObject
       with SyntaxKind
  /* 58 */ val SourceFile: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.SourceFile & Double = js.native
  
  @js.native
  sealed trait StringLiteral
    extends StObject
       with SyntaxKind
       with TextContentKind
  /* 49 */ val StringLiteral: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.StringLiteral & Double = js.native
  
  @js.native
  sealed trait SymbolSet
    extends StObject
       with SyntaxKind
  /* 73 */ val SymbolSet: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.SymbolSet & Double = js.native
  
  @js.native
  sealed trait SymbolSpan
    extends StObject
       with SyntaxKind
  /* 72 */ val SymbolSpan: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.SymbolSpan & Double = js.native
  
  @js.native
  sealed trait Terminal
    extends StObject
       with SyntaxKind
       with OptionalSymbolKind
       with ProseFragmentKind
  /* 79 */ val Terminal: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.Terminal & Double = js.native
  
  @js.native
  sealed trait TerminalLiteral
    extends StObject
       with SyntaxKind
       with TextContentKind
  /* 51 */ val TerminalLiteral: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.TerminalLiteral & Double = js.native
  
  @js.native
  sealed trait ThroughKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 47 */ val ThroughKeyword: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.ThroughKeyword & Double = js.native
  
  @js.native
  sealed trait TildeToken
    extends StObject
       with SyntaxKind
       with ArgumentOperatorKind
       with ParameterOperatorKind
       with PunctuationKind
  /* 21 */ val TildeToken: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.TildeToken & Double = js.native
  
  @js.native
  sealed trait TrueKeyword
    extends StObject
       with SyntaxKind
       with BooleanKind
       with KeywordKind
  /* 48 */ val TrueKeyword: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.TrueKeyword & Double = js.native
  
  @js.native
  sealed trait UnicodeCharacterLiteral
    extends StObject
       with SyntaxKind
       with TextContentKind
  /* 52 */ val UnicodeCharacterLiteral: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.UnicodeCharacterLiteral & Double = js.native
  
  @js.native
  sealed trait UnicodeCharacterRange
    extends StObject
       with SyntaxKind
       with _LexicalSymbolKind
  /* 75 */ val UnicodeCharacterRange: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.UnicodeCharacterRange & Double = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with SyntaxKind
  /* 0 */ val Unknown: typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.Unknown & Double = js.native
}
