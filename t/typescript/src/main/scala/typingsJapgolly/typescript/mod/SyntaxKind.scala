package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SyntaxKind extends StObject
@JSImport("typescript", "SyntaxKind")
@js.native
object SyntaxKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SyntaxKind & Double] = js.native
  
  @js.native
  sealed trait AbstractKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with ModifierSyntaxKind
  /* 126 */ val AbstractKeyword: typingsJapgolly.typescript.mod.SyntaxKind.AbstractKeyword & Double = js.native
  
  @js.native
  sealed trait AmpersandAmpersandEqualsToken
    extends StObject
       with SyntaxKind
       with CompoundAssignmentOperator
       with LogicalOrCoalescingAssignmentOperator
  /* 76 */ val AmpersandAmpersandEqualsToken: typingsJapgolly.typescript.mod.SyntaxKind.AmpersandAmpersandEqualsToken & Double = js.native
  
  @js.native
  sealed trait AmpersandAmpersandToken
    extends StObject
       with SyntaxKind
       with LogicalOperator
       with PunctuationSyntaxKind
  /* 55 */ val AmpersandAmpersandToken: typingsJapgolly.typescript.mod.SyntaxKind.AmpersandAmpersandToken & Double = js.native
  
  @js.native
  sealed trait AmpersandEqualsToken
    extends StObject
       with SyntaxKind
       with CompoundAssignmentOperator
       with PunctuationSyntaxKind
  /* 73 */ val AmpersandEqualsToken: typingsJapgolly.typescript.mod.SyntaxKind.AmpersandEqualsToken & Double = js.native
  
  @js.native
  sealed trait AmpersandToken
    extends StObject
       with SyntaxKind
       with BitwiseOperator
       with PunctuationSyntaxKind
  /* 50 */ val AmpersandToken: typingsJapgolly.typescript.mod.SyntaxKind.AmpersandToken & Double = js.native
  
  @js.native
  sealed trait AnyKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with KeywordTypeSyntaxKind
  /* 130 */ val AnyKeyword: typingsJapgolly.typescript.mod.SyntaxKind.AnyKeyword & Double = js.native
  
  @js.native
  sealed trait ArrayBindingPattern
    extends StObject
       with SyntaxKind
  /* 202 */ val ArrayBindingPattern: typingsJapgolly.typescript.mod.SyntaxKind.ArrayBindingPattern & Double = js.native
  
  @js.native
  sealed trait ArrayLiteralExpression
    extends StObject
       with SyntaxKind
  /* 204 */ val ArrayLiteralExpression: typingsJapgolly.typescript.mod.SyntaxKind.ArrayLiteralExpression & Double = js.native
  
  @js.native
  sealed trait ArrayType
    extends StObject
       with SyntaxKind
  /* 183 */ val ArrayType: typingsJapgolly.typescript.mod.SyntaxKind.ArrayType & Double = js.native
  
  @js.native
  sealed trait ArrowFunction
    extends StObject
       with SyntaxKind
  /* 214 */ val ArrowFunction: typingsJapgolly.typescript.mod.SyntaxKind.ArrowFunction & Double = js.native
  
  @js.native
  sealed trait AsExpression
    extends StObject
       with SyntaxKind
  /* 229 */ val AsExpression: typingsJapgolly.typescript.mod.SyntaxKind.AsExpression & Double = js.native
  
  @js.native
  sealed trait AsKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 127 */ val AsKeyword: typingsJapgolly.typescript.mod.SyntaxKind.AsKeyword & Double = js.native
  
  @js.native
  sealed trait AssertClause
    extends StObject
       with SyntaxKind
  /* 293 */ val AssertClause: typingsJapgolly.typescript.mod.SyntaxKind.AssertClause & Double = js.native
  
  @js.native
  sealed trait AssertEntry
    extends StObject
       with SyntaxKind
  /* 294 */ val AssertEntry: typingsJapgolly.typescript.mod.SyntaxKind.AssertEntry & Double = js.native
  
  @js.native
  sealed trait AssertKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 129 */ val AssertKeyword: typingsJapgolly.typescript.mod.SyntaxKind.AssertKeyword & Double = js.native
  
  @js.native
  sealed trait AssertsKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 128 */ val AssertsKeyword: typingsJapgolly.typescript.mod.SyntaxKind.AssertsKeyword & Double = js.native
  
  @js.native
  sealed trait AsteriskAsteriskEqualsToken
    extends StObject
       with SyntaxKind
       with CompoundAssignmentOperator
       with PunctuationSyntaxKind
  /* 67 */ val AsteriskAsteriskEqualsToken: typingsJapgolly.typescript.mod.SyntaxKind.AsteriskAsteriskEqualsToken & Double = js.native
  
  @js.native
  sealed trait AsteriskAsteriskToken
    extends StObject
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 42 */ val AsteriskAsteriskToken: typingsJapgolly.typescript.mod.SyntaxKind.AsteriskAsteriskToken & Double = js.native
  
  @js.native
  sealed trait AsteriskEqualsToken
    extends StObject
       with SyntaxKind
       with CompoundAssignmentOperator
       with PunctuationSyntaxKind
  /* 66 */ val AsteriskEqualsToken: typingsJapgolly.typescript.mod.SyntaxKind.AsteriskEqualsToken & Double = js.native
  
  @js.native
  sealed trait AsteriskToken
    extends StObject
       with SyntaxKind
       with JSDocSyntaxKind
       with MultiplicativeOperator
       with PunctuationSyntaxKind
  /* 41 */ val AsteriskToken: typingsJapgolly.typescript.mod.SyntaxKind.AsteriskToken & Double = js.native
  
  @js.native
  sealed trait AsyncKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with ModifierSyntaxKind
  /* 131 */ val AsyncKeyword: typingsJapgolly.typescript.mod.SyntaxKind.AsyncKeyword & Double = js.native
  
  @js.native
  sealed trait AtToken
    extends StObject
       with SyntaxKind
       with JSDocSyntaxKind
       with PunctuationSyntaxKind
  /* 59 */ val AtToken: typingsJapgolly.typescript.mod.SyntaxKind.AtToken & Double = js.native
  
  @js.native
  sealed trait AwaitExpression
    extends StObject
       with SyntaxKind
  /* 218 */ val AwaitExpression: typingsJapgolly.typescript.mod.SyntaxKind.AwaitExpression & Double = js.native
  
  @js.native
  sealed trait AwaitKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 132 */ val AwaitKeyword: typingsJapgolly.typescript.mod.SyntaxKind.AwaitKeyword & Double = js.native
  
  /** Only the JSDoc scanner produces BacktickToken. The normal scanner produces NoSubstitutionTemplateLiteral and related kinds. */
  @js.native
  sealed trait BacktickToken
    extends StObject
       with SyntaxKind
       with JSDocSyntaxKind
       with PunctuationSyntaxKind
  /* 61 */ val BacktickToken: typingsJapgolly.typescript.mod.SyntaxKind.BacktickToken & Double = js.native
  
  @js.native
  sealed trait BarBarEqualsToken
    extends StObject
       with SyntaxKind
       with CompoundAssignmentOperator
       with LogicalOrCoalescingAssignmentOperator
  /* 75 */ val BarBarEqualsToken: typingsJapgolly.typescript.mod.SyntaxKind.BarBarEqualsToken & Double = js.native
  
  @js.native
  sealed trait BarBarToken
    extends StObject
       with SyntaxKind
       with LogicalOperator
       with PunctuationSyntaxKind
  /* 56 */ val BarBarToken: typingsJapgolly.typescript.mod.SyntaxKind.BarBarToken & Double = js.native
  
  @js.native
  sealed trait BarEqualsToken
    extends StObject
       with SyntaxKind
       with CompoundAssignmentOperator
       with PunctuationSyntaxKind
  /* 74 */ val BarEqualsToken: typingsJapgolly.typescript.mod.SyntaxKind.BarEqualsToken & Double = js.native
  
  @js.native
  sealed trait BarToken
    extends StObject
       with SyntaxKind
       with BitwiseOperator
       with PunctuationSyntaxKind
  /* 51 */ val BarToken: typingsJapgolly.typescript.mod.SyntaxKind.BarToken & Double = js.native
  
  @js.native
  sealed trait BigIntKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with KeywordTypeSyntaxKind
  /* 158 */ val BigIntKeyword: typingsJapgolly.typescript.mod.SyntaxKind.BigIntKeyword & Double = js.native
  
  @js.native
  sealed trait BigIntLiteral
    extends StObject
       with SyntaxKind
       with LiteralSyntaxKind
  /* 9 */ val BigIntLiteral: typingsJapgolly.typescript.mod.SyntaxKind.BigIntLiteral & Double = js.native
  
  @js.native
  sealed trait BinaryExpression
    extends StObject
       with SyntaxKind
  /* 221 */ val BinaryExpression: typingsJapgolly.typescript.mod.SyntaxKind.BinaryExpression & Double = js.native
  
  @js.native
  sealed trait BindingElement
    extends StObject
       with SyntaxKind
  /* 203 */ val BindingElement: typingsJapgolly.typescript.mod.SyntaxKind.BindingElement & Double = js.native
  
  @js.native
  sealed trait Block
    extends StObject
       with SyntaxKind
  /* 235 */ val Block: typingsJapgolly.typescript.mod.SyntaxKind.Block & Double = js.native
  
  @js.native
  sealed trait BooleanKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with KeywordTypeSyntaxKind
  /* 133 */ val BooleanKeyword: typingsJapgolly.typescript.mod.SyntaxKind.BooleanKeyword & Double = js.native
  
  @js.native
  sealed trait BreakKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 81 */ val BreakKeyword: typingsJapgolly.typescript.mod.SyntaxKind.BreakKeyword & Double = js.native
  
  @js.native
  sealed trait BreakStatement
    extends StObject
       with SyntaxKind
  /* 246 */ val BreakStatement: typingsJapgolly.typescript.mod.SyntaxKind.BreakStatement & Double = js.native
  
  @js.native
  sealed trait Bundle
    extends StObject
       with SyntaxKind
  /* 306 */ val Bundle: typingsJapgolly.typescript.mod.SyntaxKind.Bundle & Double = js.native
  
  @js.native
  sealed trait CallExpression
    extends StObject
       with SyntaxKind
  /* 208 */ val CallExpression: typingsJapgolly.typescript.mod.SyntaxKind.CallExpression & Double = js.native
  
  @js.native
  sealed trait CallSignature
    extends StObject
       with SyntaxKind
  /* 174 */ val CallSignature: typingsJapgolly.typescript.mod.SyntaxKind.CallSignature & Double = js.native
  
  @js.native
  sealed trait CaretEqualsToken
    extends StObject
       with SyntaxKind
       with CompoundAssignmentOperator
       with PunctuationSyntaxKind
  /* 78 */ val CaretEqualsToken: typingsJapgolly.typescript.mod.SyntaxKind.CaretEqualsToken & Double = js.native
  
  @js.native
  sealed trait CaretToken
    extends StObject
       with SyntaxKind
       with BitwiseOperator
       with PunctuationSyntaxKind
  /* 52 */ val CaretToken: typingsJapgolly.typescript.mod.SyntaxKind.CaretToken & Double = js.native
  
  @js.native
  sealed trait CaseBlock
    extends StObject
       with SyntaxKind
  /* 263 */ val CaseBlock: typingsJapgolly.typescript.mod.SyntaxKind.CaseBlock & Double = js.native
  
  @js.native
  sealed trait CaseClause
    extends StObject
       with SyntaxKind
  /* 289 */ val CaseClause: typingsJapgolly.typescript.mod.SyntaxKind.CaseClause & Double = js.native
  
  @js.native
  sealed trait CaseKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 82 */ val CaseKeyword: typingsJapgolly.typescript.mod.SyntaxKind.CaseKeyword & Double = js.native
  
  @js.native
  sealed trait CatchClause
    extends StObject
       with SyntaxKind
  /* 292 */ val CatchClause: typingsJapgolly.typescript.mod.SyntaxKind.CatchClause & Double = js.native
  
  @js.native
  sealed trait CatchKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 83 */ val CatchKeyword: typingsJapgolly.typescript.mod.SyntaxKind.CatchKeyword & Double = js.native
  
  @js.native
  sealed trait ClassDeclaration
    extends StObject
       with SyntaxKind
  /* 257 */ val ClassDeclaration: typingsJapgolly.typescript.mod.SyntaxKind.ClassDeclaration & Double = js.native
  
  @js.native
  sealed trait ClassExpression
    extends StObject
       with SyntaxKind
  /* 226 */ val ClassExpression: typingsJapgolly.typescript.mod.SyntaxKind.ClassExpression & Double = js.native
  
  @js.native
  sealed trait ClassKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 84 */ val ClassKeyword: typingsJapgolly.typescript.mod.SyntaxKind.ClassKeyword & Double = js.native
  
  @js.native
  sealed trait ClassStaticBlockDeclaration
    extends StObject
       with SyntaxKind
  /* 170 */ val ClassStaticBlockDeclaration: typingsJapgolly.typescript.mod.SyntaxKind.ClassStaticBlockDeclaration & Double = js.native
  
  @js.native
  sealed trait CloseBraceToken
    extends StObject
       with SyntaxKind
       with JSDocSyntaxKind
       with PunctuationSyntaxKind
  /* 19 */ val CloseBraceToken: typingsJapgolly.typescript.mod.SyntaxKind.CloseBraceToken & Double = js.native
  
  @js.native
  sealed trait CloseBracketToken
    extends StObject
       with SyntaxKind
       with JSDocSyntaxKind
       with PunctuationSyntaxKind
  /* 23 */ val CloseBracketToken: typingsJapgolly.typescript.mod.SyntaxKind.CloseBracketToken & Double = js.native
  
  @js.native
  sealed trait CloseParenToken
    extends StObject
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 21 */ val CloseParenToken: typingsJapgolly.typescript.mod.SyntaxKind.CloseParenToken & Double = js.native
  
  @js.native
  sealed trait ColonToken
    extends StObject
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 58 */ val ColonToken: typingsJapgolly.typescript.mod.SyntaxKind.ColonToken & Double = js.native
  
  @js.native
  sealed trait CommaListExpression
    extends StObject
       with SyntaxKind
  /* 351 */ val CommaListExpression: typingsJapgolly.typescript.mod.SyntaxKind.CommaListExpression & Double = js.native
  
  @js.native
  sealed trait CommaToken
    extends StObject
       with SyntaxKind
       with JSDocSyntaxKind
       with PunctuationSyntaxKind
       with _BinaryOperator
  /* 27 */ val CommaToken: typingsJapgolly.typescript.mod.SyntaxKind.CommaToken & Double = js.native
  
  @js.native
  sealed trait ComputedPropertyName
    extends StObject
       with SyntaxKind
  /* 162 */ val ComputedPropertyName: typingsJapgolly.typescript.mod.SyntaxKind.ComputedPropertyName & Double = js.native
  
  @js.native
  sealed trait ConditionalExpression
    extends StObject
       with SyntaxKind
  /* 222 */ val ConditionalExpression: typingsJapgolly.typescript.mod.SyntaxKind.ConditionalExpression & Double = js.native
  
  @js.native
  sealed trait ConditionalType
    extends StObject
       with SyntaxKind
  /* 189 */ val ConditionalType: typingsJapgolly.typescript.mod.SyntaxKind.ConditionalType & Double = js.native
  
  @js.native
  sealed trait ConflictMarkerTrivia
    extends StObject
       with SyntaxKind
       with JsxTokenSyntaxKind
       with TriviaSyntaxKind
  /* 7 */ val ConflictMarkerTrivia: typingsJapgolly.typescript.mod.SyntaxKind.ConflictMarkerTrivia & Double = js.native
  
  @js.native
  sealed trait ConstKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with ModifierSyntaxKind
  /* 85 */ val ConstKeyword: typingsJapgolly.typescript.mod.SyntaxKind.ConstKeyword & Double = js.native
  
  @js.native
  sealed trait ConstructSignature
    extends StObject
       with SyntaxKind
  /* 175 */ val ConstructSignature: typingsJapgolly.typescript.mod.SyntaxKind.ConstructSignature & Double = js.native
  
  @js.native
  sealed trait Constructor
    extends StObject
       with SyntaxKind
  /* 171 */ val Constructor: typingsJapgolly.typescript.mod.SyntaxKind.Constructor & Double = js.native
  
  @js.native
  sealed trait ConstructorKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 134 */ val ConstructorKeyword: typingsJapgolly.typescript.mod.SyntaxKind.ConstructorKeyword & Double = js.native
  
  @js.native
  sealed trait ConstructorType
    extends StObject
       with SyntaxKind
  /* 180 */ val ConstructorType: typingsJapgolly.typescript.mod.SyntaxKind.ConstructorType & Double = js.native
  
  @js.native
  sealed trait ContinueKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 86 */ val ContinueKeyword: typingsJapgolly.typescript.mod.SyntaxKind.ContinueKeyword & Double = js.native
  
  @js.native
  sealed trait ContinueStatement
    extends StObject
       with SyntaxKind
  /* 245 */ val ContinueStatement: typingsJapgolly.typescript.mod.SyntaxKind.ContinueStatement & Double = js.native
  
  @js.native
  sealed trait Count
    extends StObject
       with SyntaxKind
  /* 355 */ val Count: typingsJapgolly.typescript.mod.SyntaxKind.Count & Double = js.native
  
  @js.native
  sealed trait DebuggerKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 87 */ val DebuggerKeyword: typingsJapgolly.typescript.mod.SyntaxKind.DebuggerKeyword & Double = js.native
  
  @js.native
  sealed trait DebuggerStatement
    extends StObject
       with SyntaxKind
  /* 253 */ val DebuggerStatement: typingsJapgolly.typescript.mod.SyntaxKind.DebuggerStatement & Double = js.native
  
  @js.native
  sealed trait DeclareKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with ModifierSyntaxKind
  /* 135 */ val DeclareKeyword: typingsJapgolly.typescript.mod.SyntaxKind.DeclareKeyword & Double = js.native
  
  @js.native
  sealed trait Decorator
    extends StObject
       with SyntaxKind
  /* 165 */ val Decorator: typingsJapgolly.typescript.mod.SyntaxKind.Decorator & Double = js.native
  
  @js.native
  sealed trait DefaultClause
    extends StObject
       with SyntaxKind
  /* 290 */ val DefaultClause: typingsJapgolly.typescript.mod.SyntaxKind.DefaultClause & Double = js.native
  
  @js.native
  sealed trait DefaultKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with ModifierSyntaxKind
  /* 88 */ val DefaultKeyword: typingsJapgolly.typescript.mod.SyntaxKind.DefaultKeyword & Double = js.native
  
  @js.native
  sealed trait DeleteExpression
    extends StObject
       with SyntaxKind
  /* 215 */ val DeleteExpression: typingsJapgolly.typescript.mod.SyntaxKind.DeleteExpression & Double = js.native
  
  @js.native
  sealed trait DeleteKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 89 */ val DeleteKeyword: typingsJapgolly.typescript.mod.SyntaxKind.DeleteKeyword & Double = js.native
  
  @js.native
  sealed trait DoKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 90 */ val DoKeyword: typingsJapgolly.typescript.mod.SyntaxKind.DoKeyword & Double = js.native
  
  @js.native
  sealed trait DoStatement
    extends StObject
       with SyntaxKind
  /* 240 */ val DoStatement: typingsJapgolly.typescript.mod.SyntaxKind.DoStatement & Double = js.native
  
  @js.native
  sealed trait DotDotDotToken
    extends StObject
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 25 */ val DotDotDotToken: typingsJapgolly.typescript.mod.SyntaxKind.DotDotDotToken & Double = js.native
  
  @js.native
  sealed trait DotToken
    extends StObject
       with SyntaxKind
       with JSDocSyntaxKind
       with PunctuationSyntaxKind
  /* 24 */ val DotToken: typingsJapgolly.typescript.mod.SyntaxKind.DotToken & Double = js.native
  
  @js.native
  sealed trait ElementAccessExpression
    extends StObject
       with SyntaxKind
  /* 207 */ val ElementAccessExpression: typingsJapgolly.typescript.mod.SyntaxKind.ElementAccessExpression & Double = js.native
  
  @js.native
  sealed trait ElseKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 91 */ val ElseKeyword: typingsJapgolly.typescript.mod.SyntaxKind.ElseKeyword & Double = js.native
  
  @js.native
  sealed trait EmptyStatement
    extends StObject
       with SyntaxKind
  /* 236 */ val EmptyStatement: typingsJapgolly.typescript.mod.SyntaxKind.EmptyStatement & Double = js.native
  
  @js.native
  sealed trait EndOfDeclarationMarker
    extends StObject
       with SyntaxKind
  /* 353 */ val EndOfDeclarationMarker: typingsJapgolly.typescript.mod.SyntaxKind.EndOfDeclarationMarker & Double = js.native
  
  @js.native
  sealed trait EndOfFileToken
    extends StObject
       with SyntaxKind
       with JSDocSyntaxKind
       with JsxTokenSyntaxKind
       with TokenSyntaxKind
  /* 1 */ val EndOfFileToken: typingsJapgolly.typescript.mod.SyntaxKind.EndOfFileToken & Double = js.native
  
  @js.native
  sealed trait EnumDeclaration
    extends StObject
       with SyntaxKind
  /* 260 */ val EnumDeclaration: typingsJapgolly.typescript.mod.SyntaxKind.EnumDeclaration & Double = js.native
  
  @js.native
  sealed trait EnumKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 92 */ val EnumKeyword: typingsJapgolly.typescript.mod.SyntaxKind.EnumKeyword & Double = js.native
  
  @js.native
  sealed trait EnumMember
    extends StObject
       with SyntaxKind
  /* 299 */ val EnumMember: typingsJapgolly.typescript.mod.SyntaxKind.EnumMember & Double = js.native
  
  @js.native
  sealed trait EqualsEqualsEqualsToken
    extends StObject
       with SyntaxKind
       with EqualityOperator
       with PunctuationSyntaxKind
  /* 36 */ val EqualsEqualsEqualsToken: typingsJapgolly.typescript.mod.SyntaxKind.EqualsEqualsEqualsToken & Double = js.native
  
  @js.native
  sealed trait EqualsEqualsToken
    extends StObject
       with SyntaxKind
       with EqualityOperator
       with PunctuationSyntaxKind
  /* 34 */ val EqualsEqualsToken: typingsJapgolly.typescript.mod.SyntaxKind.EqualsEqualsToken & Double = js.native
  
  @js.native
  sealed trait EqualsGreaterThanToken
    extends StObject
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 38 */ val EqualsGreaterThanToken: typingsJapgolly.typescript.mod.SyntaxKind.EqualsGreaterThanToken & Double = js.native
  
  @js.native
  sealed trait EqualsToken
    extends StObject
       with SyntaxKind
       with AssignmentOperator
       with JSDocSyntaxKind
       with PunctuationSyntaxKind
  /* 63 */ val EqualsToken: typingsJapgolly.typescript.mod.SyntaxKind.EqualsToken & Double = js.native
  
  @js.native
  sealed trait ExclamationEqualsEqualsToken
    extends StObject
       with SyntaxKind
       with EqualityOperator
       with PunctuationSyntaxKind
  /* 37 */ val ExclamationEqualsEqualsToken: typingsJapgolly.typescript.mod.SyntaxKind.ExclamationEqualsEqualsToken & Double = js.native
  
  @js.native
  sealed trait ExclamationEqualsToken
    extends StObject
       with SyntaxKind
       with EqualityOperator
       with PunctuationSyntaxKind
  /* 35 */ val ExclamationEqualsToken: typingsJapgolly.typescript.mod.SyntaxKind.ExclamationEqualsToken & Double = js.native
  
  @js.native
  sealed trait ExclamationToken
    extends StObject
       with SyntaxKind
       with PrefixUnaryOperator
       with PunctuationSyntaxKind
  /* 53 */ val ExclamationToken: typingsJapgolly.typescript.mod.SyntaxKind.ExclamationToken & Double = js.native
  
  @js.native
  sealed trait ExportAssignment
    extends StObject
       with SyntaxKind
  /* 271 */ val ExportAssignment: typingsJapgolly.typescript.mod.SyntaxKind.ExportAssignment & Double = js.native
  
  @js.native
  sealed trait ExportDeclaration
    extends StObject
       with SyntaxKind
  /* 272 */ val ExportDeclaration: typingsJapgolly.typescript.mod.SyntaxKind.ExportDeclaration & Double = js.native
  
  @js.native
  sealed trait ExportKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with ModifierSyntaxKind
  /* 93 */ val ExportKeyword: typingsJapgolly.typescript.mod.SyntaxKind.ExportKeyword & Double = js.native
  
  @js.native
  sealed trait ExportSpecifier
    extends StObject
       with SyntaxKind
  /* 275 */ val ExportSpecifier: typingsJapgolly.typescript.mod.SyntaxKind.ExportSpecifier & Double = js.native
  
  @js.native
  sealed trait ExpressionStatement
    extends StObject
       with SyntaxKind
  /* 238 */ val ExpressionStatement: typingsJapgolly.typescript.mod.SyntaxKind.ExpressionStatement & Double = js.native
  
  @js.native
  sealed trait ExpressionWithTypeArguments
    extends StObject
       with SyntaxKind
  /* 228 */ val ExpressionWithTypeArguments: typingsJapgolly.typescript.mod.SyntaxKind.ExpressionWithTypeArguments & Double = js.native
  
  @js.native
  sealed trait ExtendsKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 94 */ val ExtendsKeyword: typingsJapgolly.typescript.mod.SyntaxKind.ExtendsKeyword & Double = js.native
  
  @js.native
  sealed trait ExternalModuleReference
    extends StObject
       with SyntaxKind
  /* 277 */ val ExternalModuleReference: typingsJapgolly.typescript.mod.SyntaxKind.ExternalModuleReference & Double = js.native
  
  @js.native
  sealed trait FalseKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 95 */ val FalseKeyword: typingsJapgolly.typescript.mod.SyntaxKind.FalseKeyword & Double = js.native
  
  @js.native
  sealed trait FinallyKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 96 */ val FinallyKeyword: typingsJapgolly.typescript.mod.SyntaxKind.FinallyKeyword & Double = js.native
  
  @js.native
  sealed trait FirstAssignment
    extends StObject
       with SyntaxKind
  /* 63 */ val FirstAssignment: typingsJapgolly.typescript.mod.SyntaxKind.FirstAssignment & Double = js.native
  
  @js.native
  sealed trait FirstBinaryOperator
    extends StObject
       with SyntaxKind
  /* 29 */ val FirstBinaryOperator: typingsJapgolly.typescript.mod.SyntaxKind.FirstBinaryOperator & Double = js.native
  
  @js.native
  sealed trait FirstCompoundAssignment
    extends StObject
       with SyntaxKind
  /* 64 */ val FirstCompoundAssignment: typingsJapgolly.typescript.mod.SyntaxKind.FirstCompoundAssignment & Double = js.native
  
  @js.native
  sealed trait FirstFutureReservedWord
    extends StObject
       with SyntaxKind
  /* 117 */ val FirstFutureReservedWord: typingsJapgolly.typescript.mod.SyntaxKind.FirstFutureReservedWord & Double = js.native
  
  @js.native
  sealed trait FirstJSDocNode
    extends StObject
       with SyntaxKind
  /* 309 */ val FirstJSDocNode: typingsJapgolly.typescript.mod.SyntaxKind.FirstJSDocNode & Double = js.native
  
  @js.native
  sealed trait FirstJSDocTagNode
    extends StObject
       with SyntaxKind
  /* 327 */ val FirstJSDocTagNode: typingsJapgolly.typescript.mod.SyntaxKind.FirstJSDocTagNode & Double = js.native
  
  @js.native
  sealed trait FirstKeyword
    extends StObject
       with SyntaxKind
  /* 81 */ val FirstKeyword: typingsJapgolly.typescript.mod.SyntaxKind.FirstKeyword & Double = js.native
  
  @js.native
  sealed trait FirstLiteralToken
    extends StObject
       with SyntaxKind
  /* 8 */ val FirstLiteralToken: typingsJapgolly.typescript.mod.SyntaxKind.FirstLiteralToken & Double = js.native
  
  @js.native
  sealed trait FirstNode
    extends StObject
       with SyntaxKind
  /* 161 */ val FirstNode: typingsJapgolly.typescript.mod.SyntaxKind.FirstNode & Double = js.native
  
  @js.native
  sealed trait FirstPunctuation
    extends StObject
       with SyntaxKind
  /* 18 */ val FirstPunctuation: typingsJapgolly.typescript.mod.SyntaxKind.FirstPunctuation & Double = js.native
  
  @js.native
  sealed trait FirstReservedWord
    extends StObject
       with SyntaxKind
  /* 81 */ val FirstReservedWord: typingsJapgolly.typescript.mod.SyntaxKind.FirstReservedWord & Double = js.native
  
  @js.native
  sealed trait FirstStatement
    extends StObject
       with SyntaxKind
  /* 237 */ val FirstStatement: typingsJapgolly.typescript.mod.SyntaxKind.FirstStatement & Double = js.native
  
  @js.native
  sealed trait FirstTemplateToken
    extends StObject
       with SyntaxKind
  /* 14 */ val FirstTemplateToken: typingsJapgolly.typescript.mod.SyntaxKind.FirstTemplateToken & Double = js.native
  
  @js.native
  sealed trait FirstToken
    extends StObject
       with SyntaxKind
  /* 0 */ val FirstToken: typingsJapgolly.typescript.mod.SyntaxKind.FirstToken & Double = js.native
  
  @js.native
  sealed trait FirstTriviaToken
    extends StObject
       with SyntaxKind
  /* 2 */ val FirstTriviaToken: typingsJapgolly.typescript.mod.SyntaxKind.FirstTriviaToken & Double = js.native
  
  @js.native
  sealed trait FirstTypeNode
    extends StObject
       with SyntaxKind
  /* 177 */ val FirstTypeNode: typingsJapgolly.typescript.mod.SyntaxKind.FirstTypeNode & Double = js.native
  
  @js.native
  sealed trait ForInStatement
    extends StObject
       with SyntaxKind
  /* 243 */ val ForInStatement: typingsJapgolly.typescript.mod.SyntaxKind.ForInStatement & Double = js.native
  
  @js.native
  sealed trait ForKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 97 */ val ForKeyword: typingsJapgolly.typescript.mod.SyntaxKind.ForKeyword & Double = js.native
  
  @js.native
  sealed trait ForOfStatement
    extends StObject
       with SyntaxKind
  /* 244 */ val ForOfStatement: typingsJapgolly.typescript.mod.SyntaxKind.ForOfStatement & Double = js.native
  
  @js.native
  sealed trait ForStatement
    extends StObject
       with SyntaxKind
  /* 242 */ val ForStatement: typingsJapgolly.typescript.mod.SyntaxKind.ForStatement & Double = js.native
  
  @js.native
  sealed trait FromKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 156 */ val FromKeyword: typingsJapgolly.typescript.mod.SyntaxKind.FromKeyword & Double = js.native
  
  @js.native
  sealed trait FunctionDeclaration
    extends StObject
       with SyntaxKind
  /* 256 */ val FunctionDeclaration: typingsJapgolly.typescript.mod.SyntaxKind.FunctionDeclaration & Double = js.native
  
  @js.native
  sealed trait FunctionExpression
    extends StObject
       with SyntaxKind
  /* 213 */ val FunctionExpression: typingsJapgolly.typescript.mod.SyntaxKind.FunctionExpression & Double = js.native
  
  @js.native
  sealed trait FunctionKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 98 */ val FunctionKeyword: typingsJapgolly.typescript.mod.SyntaxKind.FunctionKeyword & Double = js.native
  
  @js.native
  sealed trait FunctionType
    extends StObject
       with SyntaxKind
  /* 179 */ val FunctionType: typingsJapgolly.typescript.mod.SyntaxKind.FunctionType & Double = js.native
  
  @js.native
  sealed trait GetAccessor
    extends StObject
       with SyntaxKind
  /* 172 */ val GetAccessor: typingsJapgolly.typescript.mod.SyntaxKind.GetAccessor & Double = js.native
  
  @js.native
  sealed trait GetKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 136 */ val GetKeyword: typingsJapgolly.typescript.mod.SyntaxKind.GetKeyword & Double = js.native
  
  @js.native
  sealed trait GlobalKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 157 */ val GlobalKeyword: typingsJapgolly.typescript.mod.SyntaxKind.GlobalKeyword & Double = js.native
  
  @js.native
  sealed trait GreaterThanEqualsToken
    extends StObject
       with SyntaxKind
       with PunctuationSyntaxKind
       with RelationalOperator
  /* 33 */ val GreaterThanEqualsToken: typingsJapgolly.typescript.mod.SyntaxKind.GreaterThanEqualsToken & Double = js.native
  
  @js.native
  sealed trait GreaterThanGreaterThanEqualsToken
    extends StObject
       with SyntaxKind
       with CompoundAssignmentOperator
       with PunctuationSyntaxKind
  /* 71 */ val GreaterThanGreaterThanEqualsToken: typingsJapgolly.typescript.mod.SyntaxKind.GreaterThanGreaterThanEqualsToken & Double = js.native
  
  @js.native
  sealed trait GreaterThanGreaterThanGreaterThanEqualsToken
    extends StObject
       with SyntaxKind
       with CompoundAssignmentOperator
       with PunctuationSyntaxKind
  /* 72 */ val GreaterThanGreaterThanGreaterThanEqualsToken: typingsJapgolly.typescript.mod.SyntaxKind.GreaterThanGreaterThanGreaterThanEqualsToken & Double = js.native
  
  @js.native
  sealed trait GreaterThanGreaterThanGreaterThanToken
    extends StObject
       with SyntaxKind
       with PunctuationSyntaxKind
       with ShiftOperator
  /* 49 */ val GreaterThanGreaterThanGreaterThanToken: typingsJapgolly.typescript.mod.SyntaxKind.GreaterThanGreaterThanGreaterThanToken & Double = js.native
  
  @js.native
  sealed trait GreaterThanGreaterThanToken
    extends StObject
       with SyntaxKind
       with PunctuationSyntaxKind
       with ShiftOperator
  /* 48 */ val GreaterThanGreaterThanToken: typingsJapgolly.typescript.mod.SyntaxKind.GreaterThanGreaterThanToken & Double = js.native
  
  @js.native
  sealed trait GreaterThanToken
    extends StObject
       with SyntaxKind
       with JSDocSyntaxKind
       with PunctuationSyntaxKind
       with RelationalOperator
  /* 31 */ val GreaterThanToken: typingsJapgolly.typescript.mod.SyntaxKind.GreaterThanToken & Double = js.native
  
  /** Only the JSDoc scanner produces HashToken. The normal scanner produces PrivateIdentifier. */
  @js.native
  sealed trait HashToken
    extends StObject
       with SyntaxKind
       with JSDocSyntaxKind
       with PunctuationSyntaxKind
  /* 62 */ val HashToken: typingsJapgolly.typescript.mod.SyntaxKind.HashToken & Double = js.native
  
  @js.native
  sealed trait HeritageClause
    extends StObject
       with SyntaxKind
  /* 291 */ val HeritageClause: typingsJapgolly.typescript.mod.SyntaxKind.HeritageClause & Double = js.native
  
  @js.native
  sealed trait Identifier
    extends StObject
       with SyntaxKind
       with JSDocSyntaxKind
       with TokenSyntaxKind
  /* 79 */ val Identifier: typingsJapgolly.typescript.mod.SyntaxKind.Identifier & Double = js.native
  
  @js.native
  sealed trait IfKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 99 */ val IfKeyword: typingsJapgolly.typescript.mod.SyntaxKind.IfKeyword & Double = js.native
  
  @js.native
  sealed trait IfStatement
    extends StObject
       with SyntaxKind
  /* 239 */ val IfStatement: typingsJapgolly.typescript.mod.SyntaxKind.IfStatement & Double = js.native
  
  @js.native
  sealed trait ImplementsKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 117 */ val ImplementsKeyword: typingsJapgolly.typescript.mod.SyntaxKind.ImplementsKeyword & Double = js.native
  
  @js.native
  sealed trait ImportClause
    extends StObject
       with SyntaxKind
  /* 267 */ val ImportClause: typingsJapgolly.typescript.mod.SyntaxKind.ImportClause & Double = js.native
  
  @js.native
  sealed trait ImportDeclaration
    extends StObject
       with SyntaxKind
  /* 266 */ val ImportDeclaration: typingsJapgolly.typescript.mod.SyntaxKind.ImportDeclaration & Double = js.native
  
  @js.native
  sealed trait ImportEqualsDeclaration
    extends StObject
       with SyntaxKind
  /* 265 */ val ImportEqualsDeclaration: typingsJapgolly.typescript.mod.SyntaxKind.ImportEqualsDeclaration & Double = js.native
  
  @js.native
  sealed trait ImportKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 100 */ val ImportKeyword: typingsJapgolly.typescript.mod.SyntaxKind.ImportKeyword & Double = js.native
  
  @js.native
  sealed trait ImportSpecifier
    extends StObject
       with SyntaxKind
  /* 270 */ val ImportSpecifier: typingsJapgolly.typescript.mod.SyntaxKind.ImportSpecifier & Double = js.native
  
  @js.native
  sealed trait ImportType
    extends StObject
       with SyntaxKind
  /* 200 */ val ImportType: typingsJapgolly.typescript.mod.SyntaxKind.ImportType & Double = js.native
  
  @js.native
  sealed trait ImportTypeAssertionContainer
    extends StObject
       with SyntaxKind
  /* 295 */ val ImportTypeAssertionContainer: typingsJapgolly.typescript.mod.SyntaxKind.ImportTypeAssertionContainer & Double = js.native
  
  @js.native
  sealed trait InKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with ModifierSyntaxKind
       with RelationalOperator
  /* 101 */ val InKeyword: typingsJapgolly.typescript.mod.SyntaxKind.InKeyword & Double = js.native
  
  @js.native
  sealed trait IndexSignature
    extends StObject
       with SyntaxKind
  /* 176 */ val IndexSignature: typingsJapgolly.typescript.mod.SyntaxKind.IndexSignature & Double = js.native
  
  @js.native
  sealed trait IndexedAccessType
    extends StObject
       with SyntaxKind
  /* 194 */ val IndexedAccessType: typingsJapgolly.typescript.mod.SyntaxKind.IndexedAccessType & Double = js.native
  
  @js.native
  sealed trait InferKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 137 */ val InferKeyword: typingsJapgolly.typescript.mod.SyntaxKind.InferKeyword & Double = js.native
  
  @js.native
  sealed trait InferType
    extends StObject
       with SyntaxKind
  /* 190 */ val InferType: typingsJapgolly.typescript.mod.SyntaxKind.InferType & Double = js.native
  
  @js.native
  sealed trait InputFiles
    extends StObject
       with SyntaxKind
  /* 308 */ val InputFiles: typingsJapgolly.typescript.mod.SyntaxKind.InputFiles & Double = js.native
  
  @js.native
  sealed trait InstanceOfKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with RelationalOperator
  /* 102 */ val InstanceOfKeyword: typingsJapgolly.typescript.mod.SyntaxKind.InstanceOfKeyword & Double = js.native
  
  @js.native
  sealed trait InterfaceDeclaration
    extends StObject
       with SyntaxKind
  /* 258 */ val InterfaceDeclaration: typingsJapgolly.typescript.mod.SyntaxKind.InterfaceDeclaration & Double = js.native
  
  @js.native
  sealed trait InterfaceKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 118 */ val InterfaceKeyword: typingsJapgolly.typescript.mod.SyntaxKind.InterfaceKeyword & Double = js.native
  
  @js.native
  sealed trait IntersectionType
    extends StObject
       with SyntaxKind
  /* 188 */ val IntersectionType: typingsJapgolly.typescript.mod.SyntaxKind.IntersectionType & Double = js.native
  
  @js.native
  sealed trait IntrinsicKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with KeywordTypeSyntaxKind
  /* 138 */ val IntrinsicKeyword: typingsJapgolly.typescript.mod.SyntaxKind.IntrinsicKeyword & Double = js.native
  
  @js.native
  sealed trait IsKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 139 */ val IsKeyword: typingsJapgolly.typescript.mod.SyntaxKind.IsKeyword & Double = js.native
  
  @js.native
  sealed trait JSDoc
    extends StObject
       with SyntaxKind
  /* 320 */ val JSDoc: typingsJapgolly.typescript.mod.SyntaxKind.JSDoc & Double = js.native
  
  @js.native
  sealed trait JSDocAllType
    extends StObject
       with SyntaxKind
  /* 312 */ val JSDocAllType: typingsJapgolly.typescript.mod.SyntaxKind.JSDocAllType & Double = js.native
  
  @js.native
  sealed trait JSDocAugmentsTag
    extends StObject
       with SyntaxKind
  /* 328 */ val JSDocAugmentsTag: typingsJapgolly.typescript.mod.SyntaxKind.JSDocAugmentsTag & Double = js.native
  
  @js.native
  sealed trait JSDocAuthorTag
    extends StObject
       with SyntaxKind
  /* 330 */ val JSDocAuthorTag: typingsJapgolly.typescript.mod.SyntaxKind.JSDocAuthorTag & Double = js.native
  
  @js.native
  sealed trait JSDocCallbackTag
    extends StObject
       with SyntaxKind
  /* 338 */ val JSDocCallbackTag: typingsJapgolly.typescript.mod.SyntaxKind.JSDocCallbackTag & Double = js.native
  
  @js.native
  sealed trait JSDocClassTag
    extends StObject
       with SyntaxKind
  /* 332 */ val JSDocClassTag: typingsJapgolly.typescript.mod.SyntaxKind.JSDocClassTag & Double = js.native
  
  /** @deprecated Use SyntaxKind.JSDoc */
  @js.native
  sealed trait JSDocComment
    extends StObject
       with SyntaxKind
  /* 320 */ val JSDocComment: typingsJapgolly.typescript.mod.SyntaxKind.JSDocComment & Double = js.native
  
  @js.native
  sealed trait JSDocDeprecatedTag
    extends StObject
       with SyntaxKind
  /* 331 */ val JSDocDeprecatedTag: typingsJapgolly.typescript.mod.SyntaxKind.JSDocDeprecatedTag & Double = js.native
  
  @js.native
  sealed trait JSDocEnumTag
    extends StObject
       with SyntaxKind
  /* 339 */ val JSDocEnumTag: typingsJapgolly.typescript.mod.SyntaxKind.JSDocEnumTag & Double = js.native
  
  @js.native
  sealed trait JSDocFunctionType
    extends StObject
       with SyntaxKind
  /* 317 */ val JSDocFunctionType: typingsJapgolly.typescript.mod.SyntaxKind.JSDocFunctionType & Double = js.native
  
  @js.native
  sealed trait JSDocImplementsTag
    extends StObject
       with SyntaxKind
  /* 329 */ val JSDocImplementsTag: typingsJapgolly.typescript.mod.SyntaxKind.JSDocImplementsTag & Double = js.native
  
  @js.native
  sealed trait JSDocLink
    extends StObject
       with SyntaxKind
  /* 324 */ val JSDocLink: typingsJapgolly.typescript.mod.SyntaxKind.JSDocLink & Double = js.native
  
  @js.native
  sealed trait JSDocLinkCode
    extends StObject
       with SyntaxKind
  /* 325 */ val JSDocLinkCode: typingsJapgolly.typescript.mod.SyntaxKind.JSDocLinkCode & Double = js.native
  
  @js.native
  sealed trait JSDocLinkPlain
    extends StObject
       with SyntaxKind
  /* 326 */ val JSDocLinkPlain: typingsJapgolly.typescript.mod.SyntaxKind.JSDocLinkPlain & Double = js.native
  
  @js.native
  sealed trait JSDocMemberName
    extends StObject
       with SyntaxKind
  /* 311 */ val JSDocMemberName: typingsJapgolly.typescript.mod.SyntaxKind.JSDocMemberName & Double = js.native
  
  @js.native
  sealed trait JSDocNameReference
    extends StObject
       with SyntaxKind
  /* 310 */ val JSDocNameReference: typingsJapgolly.typescript.mod.SyntaxKind.JSDocNameReference & Double = js.native
  
  @js.native
  sealed trait JSDocNamepathType
    extends StObject
       with SyntaxKind
  /* 319 */ val JSDocNamepathType: typingsJapgolly.typescript.mod.SyntaxKind.JSDocNamepathType & Double = js.native
  
  @js.native
  sealed trait JSDocNonNullableType
    extends StObject
       with SyntaxKind
  /* 315 */ val JSDocNonNullableType: typingsJapgolly.typescript.mod.SyntaxKind.JSDocNonNullableType & Double = js.native
  
  @js.native
  sealed trait JSDocNullableType
    extends StObject
       with SyntaxKind
  /* 314 */ val JSDocNullableType: typingsJapgolly.typescript.mod.SyntaxKind.JSDocNullableType & Double = js.native
  
  @js.native
  sealed trait JSDocOptionalType
    extends StObject
       with SyntaxKind
  /* 316 */ val JSDocOptionalType: typingsJapgolly.typescript.mod.SyntaxKind.JSDocOptionalType & Double = js.native
  
  @js.native
  sealed trait JSDocOverrideTag
    extends StObject
       with SyntaxKind
  /* 337 */ val JSDocOverrideTag: typingsJapgolly.typescript.mod.SyntaxKind.JSDocOverrideTag & Double = js.native
  
  @js.native
  sealed trait JSDocParameterTag
    extends StObject
       with SyntaxKind
  /* 340 */ val JSDocParameterTag: typingsJapgolly.typescript.mod.SyntaxKind.JSDocParameterTag & Double = js.native
  
  @js.native
  sealed trait JSDocPrivateTag
    extends StObject
       with SyntaxKind
  /* 334 */ val JSDocPrivateTag: typingsJapgolly.typescript.mod.SyntaxKind.JSDocPrivateTag & Double = js.native
  
  @js.native
  sealed trait JSDocPropertyTag
    extends StObject
       with SyntaxKind
  /* 347 */ val JSDocPropertyTag: typingsJapgolly.typescript.mod.SyntaxKind.JSDocPropertyTag & Double = js.native
  
  @js.native
  sealed trait JSDocProtectedTag
    extends StObject
       with SyntaxKind
  /* 335 */ val JSDocProtectedTag: typingsJapgolly.typescript.mod.SyntaxKind.JSDocProtectedTag & Double = js.native
  
  @js.native
  sealed trait JSDocPublicTag
    extends StObject
       with SyntaxKind
  /* 333 */ val JSDocPublicTag: typingsJapgolly.typescript.mod.SyntaxKind.JSDocPublicTag & Double = js.native
  
  @js.native
  sealed trait JSDocReadonlyTag
    extends StObject
       with SyntaxKind
  /* 336 */ val JSDocReadonlyTag: typingsJapgolly.typescript.mod.SyntaxKind.JSDocReadonlyTag & Double = js.native
  
  @js.native
  sealed trait JSDocReturnTag
    extends StObject
       with SyntaxKind
  /* 341 */ val JSDocReturnTag: typingsJapgolly.typescript.mod.SyntaxKind.JSDocReturnTag & Double = js.native
  
  @js.native
  sealed trait JSDocSeeTag
    extends StObject
       with SyntaxKind
  /* 346 */ val JSDocSeeTag: typingsJapgolly.typescript.mod.SyntaxKind.JSDocSeeTag & Double = js.native
  
  @js.native
  sealed trait JSDocSignature
    extends StObject
       with SyntaxKind
  /* 323 */ val JSDocSignature: typingsJapgolly.typescript.mod.SyntaxKind.JSDocSignature & Double = js.native
  
  @js.native
  sealed trait JSDocTag
    extends StObject
       with SyntaxKind
  /* 327 */ val JSDocTag: typingsJapgolly.typescript.mod.SyntaxKind.JSDocTag & Double = js.native
  
  @js.native
  sealed trait JSDocTemplateTag
    extends StObject
       with SyntaxKind
  /* 344 */ val JSDocTemplateTag: typingsJapgolly.typescript.mod.SyntaxKind.JSDocTemplateTag & Double = js.native
  
  @js.native
  sealed trait JSDocText
    extends StObject
       with SyntaxKind
  /* 321 */ val JSDocText: typingsJapgolly.typescript.mod.SyntaxKind.JSDocText & Double = js.native
  
  @js.native
  sealed trait JSDocThisTag
    extends StObject
       with SyntaxKind
  /* 342 */ val JSDocThisTag: typingsJapgolly.typescript.mod.SyntaxKind.JSDocThisTag & Double = js.native
  
  @js.native
  sealed trait JSDocTypeExpression
    extends StObject
       with SyntaxKind
  /* 309 */ val JSDocTypeExpression: typingsJapgolly.typescript.mod.SyntaxKind.JSDocTypeExpression & Double = js.native
  
  @js.native
  sealed trait JSDocTypeLiteral
    extends StObject
       with SyntaxKind
  /* 322 */ val JSDocTypeLiteral: typingsJapgolly.typescript.mod.SyntaxKind.JSDocTypeLiteral & Double = js.native
  
  @js.native
  sealed trait JSDocTypeTag
    extends StObject
       with SyntaxKind
  /* 343 */ val JSDocTypeTag: typingsJapgolly.typescript.mod.SyntaxKind.JSDocTypeTag & Double = js.native
  
  @js.native
  sealed trait JSDocTypedefTag
    extends StObject
       with SyntaxKind
  /* 345 */ val JSDocTypedefTag: typingsJapgolly.typescript.mod.SyntaxKind.JSDocTypedefTag & Double = js.native
  
  @js.native
  sealed trait JSDocUnknownType
    extends StObject
       with SyntaxKind
  /* 313 */ val JSDocUnknownType: typingsJapgolly.typescript.mod.SyntaxKind.JSDocUnknownType & Double = js.native
  
  @js.native
  sealed trait JSDocVariadicType
    extends StObject
       with SyntaxKind
  /* 318 */ val JSDocVariadicType: typingsJapgolly.typescript.mod.SyntaxKind.JSDocVariadicType & Double = js.native
  
  @js.native
  sealed trait JsxAttribute
    extends StObject
       with SyntaxKind
  /* 285 */ val JsxAttribute: typingsJapgolly.typescript.mod.SyntaxKind.JsxAttribute & Double = js.native
  
  @js.native
  sealed trait JsxAttributes
    extends StObject
       with SyntaxKind
  /* 286 */ val JsxAttributes: typingsJapgolly.typescript.mod.SyntaxKind.JsxAttributes & Double = js.native
  
  @js.native
  sealed trait JsxClosingElement
    extends StObject
       with SyntaxKind
  /* 281 */ val JsxClosingElement: typingsJapgolly.typescript.mod.SyntaxKind.JsxClosingElement & Double = js.native
  
  @js.native
  sealed trait JsxClosingFragment
    extends StObject
       with SyntaxKind
  /* 284 */ val JsxClosingFragment: typingsJapgolly.typescript.mod.SyntaxKind.JsxClosingFragment & Double = js.native
  
  @js.native
  sealed trait JsxElement
    extends StObject
       with SyntaxKind
  /* 278 */ val JsxElement: typingsJapgolly.typescript.mod.SyntaxKind.JsxElement & Double = js.native
  
  @js.native
  sealed trait JsxExpression
    extends StObject
       with SyntaxKind
  /* 288 */ val JsxExpression: typingsJapgolly.typescript.mod.SyntaxKind.JsxExpression & Double = js.native
  
  @js.native
  sealed trait JsxFragment
    extends StObject
       with SyntaxKind
  /* 282 */ val JsxFragment: typingsJapgolly.typescript.mod.SyntaxKind.JsxFragment & Double = js.native
  
  @js.native
  sealed trait JsxOpeningElement
    extends StObject
       with SyntaxKind
  /* 280 */ val JsxOpeningElement: typingsJapgolly.typescript.mod.SyntaxKind.JsxOpeningElement & Double = js.native
  
  @js.native
  sealed trait JsxOpeningFragment
    extends StObject
       with SyntaxKind
  /* 283 */ val JsxOpeningFragment: typingsJapgolly.typescript.mod.SyntaxKind.JsxOpeningFragment & Double = js.native
  
  @js.native
  sealed trait JsxSelfClosingElement
    extends StObject
       with SyntaxKind
  /* 279 */ val JsxSelfClosingElement: typingsJapgolly.typescript.mod.SyntaxKind.JsxSelfClosingElement & Double = js.native
  
  @js.native
  sealed trait JsxSpreadAttribute
    extends StObject
       with SyntaxKind
  /* 287 */ val JsxSpreadAttribute: typingsJapgolly.typescript.mod.SyntaxKind.JsxSpreadAttribute & Double = js.native
  
  @js.native
  sealed trait JsxText
    extends StObject
       with SyntaxKind
       with JsxTokenSyntaxKind
       with LiteralSyntaxKind
  /* 11 */ val JsxText: typingsJapgolly.typescript.mod.SyntaxKind.JsxText & Double = js.native
  
  @js.native
  sealed trait JsxTextAllWhiteSpaces
    extends StObject
       with SyntaxKind
       with JsxTokenSyntaxKind
       with LiteralSyntaxKind
  /* 12 */ val JsxTextAllWhiteSpaces: typingsJapgolly.typescript.mod.SyntaxKind.JsxTextAllWhiteSpaces & Double = js.native
  
  @js.native
  sealed trait KeyOfKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 140 */ val KeyOfKeyword: typingsJapgolly.typescript.mod.SyntaxKind.KeyOfKeyword & Double = js.native
  
  @js.native
  sealed trait LabeledStatement
    extends StObject
       with SyntaxKind
  /* 250 */ val LabeledStatement: typingsJapgolly.typescript.mod.SyntaxKind.LabeledStatement & Double = js.native
  
  @js.native
  sealed trait LastAssignment
    extends StObject
       with SyntaxKind
  /* 78 */ val LastAssignment: typingsJapgolly.typescript.mod.SyntaxKind.LastAssignment & Double = js.native
  
  @js.native
  sealed trait LastBinaryOperator
    extends StObject
       with SyntaxKind
  /* 78 */ val LastBinaryOperator: typingsJapgolly.typescript.mod.SyntaxKind.LastBinaryOperator & Double = js.native
  
  @js.native
  sealed trait LastCompoundAssignment
    extends StObject
       with SyntaxKind
  /* 78 */ val LastCompoundAssignment: typingsJapgolly.typescript.mod.SyntaxKind.LastCompoundAssignment & Double = js.native
  
  @js.native
  sealed trait LastFutureReservedWord
    extends StObject
       with SyntaxKind
  /* 125 */ val LastFutureReservedWord: typingsJapgolly.typescript.mod.SyntaxKind.LastFutureReservedWord & Double = js.native
  
  @js.native
  sealed trait LastJSDocNode
    extends StObject
       with SyntaxKind
  /* 347 */ val LastJSDocNode: typingsJapgolly.typescript.mod.SyntaxKind.LastJSDocNode & Double = js.native
  
  @js.native
  sealed trait LastJSDocTagNode
    extends StObject
       with SyntaxKind
  /* 347 */ val LastJSDocTagNode: typingsJapgolly.typescript.mod.SyntaxKind.LastJSDocTagNode & Double = js.native
  
  @js.native
  sealed trait LastKeyword
    extends StObject
       with SyntaxKind
  /* 160 */ val LastKeyword: typingsJapgolly.typescript.mod.SyntaxKind.LastKeyword & Double = js.native
  
  @js.native
  sealed trait LastLiteralToken
    extends StObject
       with SyntaxKind
  /* 14 */ val LastLiteralToken: typingsJapgolly.typescript.mod.SyntaxKind.LastLiteralToken & Double = js.native
  
  @js.native
  sealed trait LastPunctuation
    extends StObject
       with SyntaxKind
  /* 78 */ val LastPunctuation: typingsJapgolly.typescript.mod.SyntaxKind.LastPunctuation & Double = js.native
  
  @js.native
  sealed trait LastReservedWord
    extends StObject
       with SyntaxKind
  /* 116 */ val LastReservedWord: typingsJapgolly.typescript.mod.SyntaxKind.LastReservedWord & Double = js.native
  
  @js.native
  sealed trait LastStatement
    extends StObject
       with SyntaxKind
  /* 253 */ val LastStatement: typingsJapgolly.typescript.mod.SyntaxKind.LastStatement & Double = js.native
  
  @js.native
  sealed trait LastTemplateToken
    extends StObject
       with SyntaxKind
  /* 17 */ val LastTemplateToken: typingsJapgolly.typescript.mod.SyntaxKind.LastTemplateToken & Double = js.native
  
  @js.native
  sealed trait LastToken
    extends StObject
       with SyntaxKind
  /* 160 */ val LastToken: typingsJapgolly.typescript.mod.SyntaxKind.LastToken & Double = js.native
  
  @js.native
  sealed trait LastTriviaToken
    extends StObject
       with SyntaxKind
  /* 7 */ val LastTriviaToken: typingsJapgolly.typescript.mod.SyntaxKind.LastTriviaToken & Double = js.native
  
  @js.native
  sealed trait LastTypeNode
    extends StObject
       with SyntaxKind
  /* 200 */ val LastTypeNode: typingsJapgolly.typescript.mod.SyntaxKind.LastTypeNode & Double = js.native
  
  @js.native
  sealed trait LessThanEqualsToken
    extends StObject
       with SyntaxKind
       with PunctuationSyntaxKind
       with RelationalOperator
  /* 32 */ val LessThanEqualsToken: typingsJapgolly.typescript.mod.SyntaxKind.LessThanEqualsToken & Double = js.native
  
  @js.native
  sealed trait LessThanLessThanEqualsToken
    extends StObject
       with SyntaxKind
       with CompoundAssignmentOperator
       with PunctuationSyntaxKind
  /* 70 */ val LessThanLessThanEqualsToken: typingsJapgolly.typescript.mod.SyntaxKind.LessThanLessThanEqualsToken & Double = js.native
  
  @js.native
  sealed trait LessThanLessThanToken
    extends StObject
       with SyntaxKind
       with PunctuationSyntaxKind
       with ShiftOperator
  /* 47 */ val LessThanLessThanToken: typingsJapgolly.typescript.mod.SyntaxKind.LessThanLessThanToken & Double = js.native
  
  @js.native
  sealed trait LessThanSlashToken
    extends StObject
       with SyntaxKind
       with JsxTokenSyntaxKind
       with PunctuationSyntaxKind
  /* 30 */ val LessThanSlashToken: typingsJapgolly.typescript.mod.SyntaxKind.LessThanSlashToken & Double = js.native
  
  @js.native
  sealed trait LessThanToken
    extends StObject
       with SyntaxKind
       with JSDocSyntaxKind
       with JsxTokenSyntaxKind
       with PunctuationSyntaxKind
       with RelationalOperator
  /* 29 */ val LessThanToken: typingsJapgolly.typescript.mod.SyntaxKind.LessThanToken & Double = js.native
  
  @js.native
  sealed trait LetKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 119 */ val LetKeyword: typingsJapgolly.typescript.mod.SyntaxKind.LetKeyword & Double = js.native
  
  @js.native
  sealed trait LiteralType
    extends StObject
       with SyntaxKind
  /* 196 */ val LiteralType: typingsJapgolly.typescript.mod.SyntaxKind.LiteralType & Double = js.native
  
  @js.native
  sealed trait MappedType
    extends StObject
       with SyntaxKind
  /* 195 */ val MappedType: typingsJapgolly.typescript.mod.SyntaxKind.MappedType & Double = js.native
  
  @js.native
  sealed trait MergeDeclarationMarker
    extends StObject
       with SyntaxKind
  /* 352 */ val MergeDeclarationMarker: typingsJapgolly.typescript.mod.SyntaxKind.MergeDeclarationMarker & Double = js.native
  
  @js.native
  sealed trait MetaProperty
    extends StObject
       with SyntaxKind
  /* 231 */ val MetaProperty: typingsJapgolly.typescript.mod.SyntaxKind.MetaProperty & Double = js.native
  
  @js.native
  sealed trait MethodDeclaration
    extends StObject
       with SyntaxKind
  /* 169 */ val MethodDeclaration: typingsJapgolly.typescript.mod.SyntaxKind.MethodDeclaration & Double = js.native
  
  @js.native
  sealed trait MethodSignature
    extends StObject
       with SyntaxKind
  /* 168 */ val MethodSignature: typingsJapgolly.typescript.mod.SyntaxKind.MethodSignature & Double = js.native
  
  @js.native
  sealed trait MinusEqualsToken
    extends StObject
       with SyntaxKind
       with CompoundAssignmentOperator
       with PunctuationSyntaxKind
  /* 65 */ val MinusEqualsToken: typingsJapgolly.typescript.mod.SyntaxKind.MinusEqualsToken & Double = js.native
  
  @js.native
  sealed trait MinusMinusToken
    extends StObject
       with SyntaxKind
       with PostfixUnaryOperator
       with PrefixUnaryOperator
       with PunctuationSyntaxKind
  /* 46 */ val MinusMinusToken: typingsJapgolly.typescript.mod.SyntaxKind.MinusMinusToken & Double = js.native
  
  @js.native
  sealed trait MinusToken
    extends StObject
       with SyntaxKind
       with AdditiveOperator
       with PrefixUnaryOperator
       with PunctuationSyntaxKind
  /* 40 */ val MinusToken: typingsJapgolly.typescript.mod.SyntaxKind.MinusToken & Double = js.native
  
  @js.native
  sealed trait MissingDeclaration
    extends StObject
       with SyntaxKind
  /* 276 */ val MissingDeclaration: typingsJapgolly.typescript.mod.SyntaxKind.MissingDeclaration & Double = js.native
  
  @js.native
  sealed trait ModuleBlock
    extends StObject
       with SyntaxKind
  /* 262 */ val ModuleBlock: typingsJapgolly.typescript.mod.SyntaxKind.ModuleBlock & Double = js.native
  
  @js.native
  sealed trait ModuleDeclaration
    extends StObject
       with SyntaxKind
  /* 261 */ val ModuleDeclaration: typingsJapgolly.typescript.mod.SyntaxKind.ModuleDeclaration & Double = js.native
  
  @js.native
  sealed trait ModuleKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 141 */ val ModuleKeyword: typingsJapgolly.typescript.mod.SyntaxKind.ModuleKeyword & Double = js.native
  
  @js.native
  sealed trait MultiLineCommentTrivia
    extends StObject
       with SyntaxKind
       with CommentKind
       with TriviaSyntaxKind
  /* 3 */ val MultiLineCommentTrivia: typingsJapgolly.typescript.mod.SyntaxKind.MultiLineCommentTrivia & Double = js.native
  
  @js.native
  sealed trait NamedExports
    extends StObject
       with SyntaxKind
  /* 273 */ val NamedExports: typingsJapgolly.typescript.mod.SyntaxKind.NamedExports & Double = js.native
  
  @js.native
  sealed trait NamedImports
    extends StObject
       with SyntaxKind
  /* 269 */ val NamedImports: typingsJapgolly.typescript.mod.SyntaxKind.NamedImports & Double = js.native
  
  @js.native
  sealed trait NamedTupleMember
    extends StObject
       with SyntaxKind
  /* 197 */ val NamedTupleMember: typingsJapgolly.typescript.mod.SyntaxKind.NamedTupleMember & Double = js.native
  
  @js.native
  sealed trait NamespaceExport
    extends StObject
       with SyntaxKind
  /* 274 */ val NamespaceExport: typingsJapgolly.typescript.mod.SyntaxKind.NamespaceExport & Double = js.native
  
  @js.native
  sealed trait NamespaceExportDeclaration
    extends StObject
       with SyntaxKind
  /* 264 */ val NamespaceExportDeclaration: typingsJapgolly.typescript.mod.SyntaxKind.NamespaceExportDeclaration & Double = js.native
  
  @js.native
  sealed trait NamespaceImport
    extends StObject
       with SyntaxKind
  /* 268 */ val NamespaceImport: typingsJapgolly.typescript.mod.SyntaxKind.NamespaceImport & Double = js.native
  
  @js.native
  sealed trait NamespaceKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 142 */ val NamespaceKeyword: typingsJapgolly.typescript.mod.SyntaxKind.NamespaceKeyword & Double = js.native
  
  @js.native
  sealed trait NeverKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with KeywordTypeSyntaxKind
  /* 143 */ val NeverKeyword: typingsJapgolly.typescript.mod.SyntaxKind.NeverKeyword & Double = js.native
  
  @js.native
  sealed trait NewExpression
    extends StObject
       with SyntaxKind
  /* 209 */ val NewExpression: typingsJapgolly.typescript.mod.SyntaxKind.NewExpression & Double = js.native
  
  @js.native
  sealed trait NewKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 103 */ val NewKeyword: typingsJapgolly.typescript.mod.SyntaxKind.NewKeyword & Double = js.native
  
  @js.native
  sealed trait NewLineTrivia
    extends StObject
       with SyntaxKind
       with JSDocSyntaxKind
       with TriviaSyntaxKind
  /* 4 */ val NewLineTrivia: typingsJapgolly.typescript.mod.SyntaxKind.NewLineTrivia & Double = js.native
  
  @js.native
  sealed trait NoSubstitutionTemplateLiteral
    extends StObject
       with SyntaxKind
       with LiteralSyntaxKind
  /* 14 */ val NoSubstitutionTemplateLiteral: typingsJapgolly.typescript.mod.SyntaxKind.NoSubstitutionTemplateLiteral & Double = js.native
  
  @js.native
  sealed trait NonNullExpression
    extends StObject
       with SyntaxKind
  /* 230 */ val NonNullExpression: typingsJapgolly.typescript.mod.SyntaxKind.NonNullExpression & Double = js.native
  
  @js.native
  sealed trait NotEmittedStatement
    extends StObject
       with SyntaxKind
  /* 349 */ val NotEmittedStatement: typingsJapgolly.typescript.mod.SyntaxKind.NotEmittedStatement & Double = js.native
  
  @js.native
  sealed trait NullKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 104 */ val NullKeyword: typingsJapgolly.typescript.mod.SyntaxKind.NullKeyword & Double = js.native
  
  @js.native
  sealed trait NumberKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with KeywordTypeSyntaxKind
  /* 147 */ val NumberKeyword: typingsJapgolly.typescript.mod.SyntaxKind.NumberKeyword & Double = js.native
  
  @js.native
  sealed trait NumericLiteral
    extends StObject
       with SyntaxKind
       with LiteralSyntaxKind
  /* 8 */ val NumericLiteral: typingsJapgolly.typescript.mod.SyntaxKind.NumericLiteral & Double = js.native
  
  @js.native
  sealed trait ObjectBindingPattern
    extends StObject
       with SyntaxKind
  /* 201 */ val ObjectBindingPattern: typingsJapgolly.typescript.mod.SyntaxKind.ObjectBindingPattern & Double = js.native
  
  @js.native
  sealed trait ObjectKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with KeywordTypeSyntaxKind
  /* 148 */ val ObjectKeyword: typingsJapgolly.typescript.mod.SyntaxKind.ObjectKeyword & Double = js.native
  
  @js.native
  sealed trait ObjectLiteralExpression
    extends StObject
       with SyntaxKind
  /* 205 */ val ObjectLiteralExpression: typingsJapgolly.typescript.mod.SyntaxKind.ObjectLiteralExpression & Double = js.native
  
  @js.native
  sealed trait OfKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 160 */ val OfKeyword: typingsJapgolly.typescript.mod.SyntaxKind.OfKeyword & Double = js.native
  
  @js.native
  sealed trait OmittedExpression
    extends StObject
       with SyntaxKind
  /* 227 */ val OmittedExpression: typingsJapgolly.typescript.mod.SyntaxKind.OmittedExpression & Double = js.native
  
  @js.native
  sealed trait OpenBraceToken
    extends StObject
       with SyntaxKind
       with JSDocSyntaxKind
       with JsxTokenSyntaxKind
       with PunctuationSyntaxKind
  /* 18 */ val OpenBraceToken: typingsJapgolly.typescript.mod.SyntaxKind.OpenBraceToken & Double = js.native
  
  @js.native
  sealed trait OpenBracketToken
    extends StObject
       with SyntaxKind
       with JSDocSyntaxKind
       with PunctuationSyntaxKind
  /* 22 */ val OpenBracketToken: typingsJapgolly.typescript.mod.SyntaxKind.OpenBracketToken & Double = js.native
  
  @js.native
  sealed trait OpenParenToken
    extends StObject
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 20 */ val OpenParenToken: typingsJapgolly.typescript.mod.SyntaxKind.OpenParenToken & Double = js.native
  
  @js.native
  sealed trait OptionalType
    extends StObject
       with SyntaxKind
  /* 185 */ val OptionalType: typingsJapgolly.typescript.mod.SyntaxKind.OptionalType & Double = js.native
  
  @js.native
  sealed trait OutKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with ModifierSyntaxKind
  /* 144 */ val OutKeyword: typingsJapgolly.typescript.mod.SyntaxKind.OutKeyword & Double = js.native
  
  @js.native
  sealed trait OverrideKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with ModifierSyntaxKind
  /* 159 */ val OverrideKeyword: typingsJapgolly.typescript.mod.SyntaxKind.OverrideKeyword & Double = js.native
  
  @js.native
  sealed trait PackageKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 120 */ val PackageKeyword: typingsJapgolly.typescript.mod.SyntaxKind.PackageKeyword & Double = js.native
  
  @js.native
  sealed trait Parameter
    extends StObject
       with SyntaxKind
  /* 164 */ val Parameter: typingsJapgolly.typescript.mod.SyntaxKind.Parameter & Double = js.native
  
  @js.native
  sealed trait ParenthesizedExpression
    extends StObject
       with SyntaxKind
  /* 212 */ val ParenthesizedExpression: typingsJapgolly.typescript.mod.SyntaxKind.ParenthesizedExpression & Double = js.native
  
  @js.native
  sealed trait ParenthesizedType
    extends StObject
       with SyntaxKind
  /* 191 */ val ParenthesizedType: typingsJapgolly.typescript.mod.SyntaxKind.ParenthesizedType & Double = js.native
  
  @js.native
  sealed trait PartiallyEmittedExpression
    extends StObject
       with SyntaxKind
  /* 350 */ val PartiallyEmittedExpression: typingsJapgolly.typescript.mod.SyntaxKind.PartiallyEmittedExpression & Double = js.native
  
  @js.native
  sealed trait PercentEqualsToken
    extends StObject
       with SyntaxKind
       with CompoundAssignmentOperator
       with PunctuationSyntaxKind
  /* 69 */ val PercentEqualsToken: typingsJapgolly.typescript.mod.SyntaxKind.PercentEqualsToken & Double = js.native
  
  @js.native
  sealed trait PercentToken
    extends StObject
       with SyntaxKind
       with MultiplicativeOperator
       with PunctuationSyntaxKind
  /* 44 */ val PercentToken: typingsJapgolly.typescript.mod.SyntaxKind.PercentToken & Double = js.native
  
  @js.native
  sealed trait PlusEqualsToken
    extends StObject
       with SyntaxKind
       with CompoundAssignmentOperator
       with PunctuationSyntaxKind
  /* 64 */ val PlusEqualsToken: typingsJapgolly.typescript.mod.SyntaxKind.PlusEqualsToken & Double = js.native
  
  @js.native
  sealed trait PlusPlusToken
    extends StObject
       with SyntaxKind
       with PostfixUnaryOperator
       with PrefixUnaryOperator
       with PunctuationSyntaxKind
  /* 45 */ val PlusPlusToken: typingsJapgolly.typescript.mod.SyntaxKind.PlusPlusToken & Double = js.native
  
  @js.native
  sealed trait PlusToken
    extends StObject
       with SyntaxKind
       with AdditiveOperator
       with PrefixUnaryOperator
       with PunctuationSyntaxKind
  /* 39 */ val PlusToken: typingsJapgolly.typescript.mod.SyntaxKind.PlusToken & Double = js.native
  
  @js.native
  sealed trait PostfixUnaryExpression
    extends StObject
       with SyntaxKind
  /* 220 */ val PostfixUnaryExpression: typingsJapgolly.typescript.mod.SyntaxKind.PostfixUnaryExpression & Double = js.native
  
  @js.native
  sealed trait PrefixUnaryExpression
    extends StObject
       with SyntaxKind
  /* 219 */ val PrefixUnaryExpression: typingsJapgolly.typescript.mod.SyntaxKind.PrefixUnaryExpression & Double = js.native
  
  @js.native
  sealed trait PrivateIdentifier
    extends StObject
       with SyntaxKind
  /* 80 */ val PrivateIdentifier: typingsJapgolly.typescript.mod.SyntaxKind.PrivateIdentifier & Double = js.native
  
  @js.native
  sealed trait PrivateKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with ModifierSyntaxKind
  /* 121 */ val PrivateKeyword: typingsJapgolly.typescript.mod.SyntaxKind.PrivateKeyword & Double = js.native
  
  @js.native
  sealed trait PropertyAccessExpression
    extends StObject
       with SyntaxKind
  /* 206 */ val PropertyAccessExpression: typingsJapgolly.typescript.mod.SyntaxKind.PropertyAccessExpression & Double = js.native
  
  @js.native
  sealed trait PropertyAssignment
    extends StObject
       with SyntaxKind
  /* 296 */ val PropertyAssignment: typingsJapgolly.typescript.mod.SyntaxKind.PropertyAssignment & Double = js.native
  
  @js.native
  sealed trait PropertyDeclaration
    extends StObject
       with SyntaxKind
  /* 167 */ val PropertyDeclaration: typingsJapgolly.typescript.mod.SyntaxKind.PropertyDeclaration & Double = js.native
  
  @js.native
  sealed trait PropertySignature
    extends StObject
       with SyntaxKind
  /* 166 */ val PropertySignature: typingsJapgolly.typescript.mod.SyntaxKind.PropertySignature & Double = js.native
  
  @js.native
  sealed trait ProtectedKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with ModifierSyntaxKind
  /* 122 */ val ProtectedKeyword: typingsJapgolly.typescript.mod.SyntaxKind.ProtectedKeyword & Double = js.native
  
  @js.native
  sealed trait PublicKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with ModifierSyntaxKind
  /* 123 */ val PublicKeyword: typingsJapgolly.typescript.mod.SyntaxKind.PublicKeyword & Double = js.native
  
  @js.native
  sealed trait QualifiedName
    extends StObject
       with SyntaxKind
  /* 161 */ val QualifiedName: typingsJapgolly.typescript.mod.SyntaxKind.QualifiedName & Double = js.native
  
  @js.native
  sealed trait QuestionDotToken
    extends StObject
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 28 */ val QuestionDotToken: typingsJapgolly.typescript.mod.SyntaxKind.QuestionDotToken & Double = js.native
  
  @js.native
  sealed trait QuestionQuestionEqualsToken
    extends StObject
       with SyntaxKind
       with CompoundAssignmentOperator
       with LogicalOrCoalescingAssignmentOperator
  /* 77 */ val QuestionQuestionEqualsToken: typingsJapgolly.typescript.mod.SyntaxKind.QuestionQuestionEqualsToken & Double = js.native
  
  @js.native
  sealed trait QuestionQuestionToken
    extends StObject
       with SyntaxKind
       with PunctuationSyntaxKind
       with _AssignmentOperatorOrHigher
  /* 60 */ val QuestionQuestionToken: typingsJapgolly.typescript.mod.SyntaxKind.QuestionQuestionToken & Double = js.native
  
  @js.native
  sealed trait QuestionToken
    extends StObject
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 57 */ val QuestionToken: typingsJapgolly.typescript.mod.SyntaxKind.QuestionToken & Double = js.native
  
  @js.native
  sealed trait ReadonlyKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with ModifierSyntaxKind
  /* 145 */ val ReadonlyKeyword: typingsJapgolly.typescript.mod.SyntaxKind.ReadonlyKeyword & Double = js.native
  
  @js.native
  sealed trait RegularExpressionLiteral
    extends StObject
       with SyntaxKind
       with LiteralSyntaxKind
  /* 13 */ val RegularExpressionLiteral: typingsJapgolly.typescript.mod.SyntaxKind.RegularExpressionLiteral & Double = js.native
  
  @js.native
  sealed trait RequireKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 146 */ val RequireKeyword: typingsJapgolly.typescript.mod.SyntaxKind.RequireKeyword & Double = js.native
  
  @js.native
  sealed trait RestType
    extends StObject
       with SyntaxKind
  /* 186 */ val RestType: typingsJapgolly.typescript.mod.SyntaxKind.RestType & Double = js.native
  
  @js.native
  sealed trait ReturnKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 105 */ val ReturnKeyword: typingsJapgolly.typescript.mod.SyntaxKind.ReturnKeyword & Double = js.native
  
  @js.native
  sealed trait ReturnStatement
    extends StObject
       with SyntaxKind
  /* 247 */ val ReturnStatement: typingsJapgolly.typescript.mod.SyntaxKind.ReturnStatement & Double = js.native
  
  @js.native
  sealed trait SemicolonClassElement
    extends StObject
       with SyntaxKind
  /* 234 */ val SemicolonClassElement: typingsJapgolly.typescript.mod.SyntaxKind.SemicolonClassElement & Double = js.native
  
  @js.native
  sealed trait SemicolonToken
    extends StObject
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 26 */ val SemicolonToken: typingsJapgolly.typescript.mod.SyntaxKind.SemicolonToken & Double = js.native
  
  @js.native
  sealed trait SetAccessor
    extends StObject
       with SyntaxKind
  /* 173 */ val SetAccessor: typingsJapgolly.typescript.mod.SyntaxKind.SetAccessor & Double = js.native
  
  @js.native
  sealed trait SetKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 149 */ val SetKeyword: typingsJapgolly.typescript.mod.SyntaxKind.SetKeyword & Double = js.native
  
  @js.native
  sealed trait ShebangTrivia
    extends StObject
       with SyntaxKind
       with TriviaSyntaxKind
  /* 6 */ val ShebangTrivia: typingsJapgolly.typescript.mod.SyntaxKind.ShebangTrivia & Double = js.native
  
  @js.native
  sealed trait ShorthandPropertyAssignment
    extends StObject
       with SyntaxKind
  /* 297 */ val ShorthandPropertyAssignment: typingsJapgolly.typescript.mod.SyntaxKind.ShorthandPropertyAssignment & Double = js.native
  
  @js.native
  sealed trait SingleLineCommentTrivia
    extends StObject
       with SyntaxKind
       with CommentKind
       with TriviaSyntaxKind
  /* 2 */ val SingleLineCommentTrivia: typingsJapgolly.typescript.mod.SyntaxKind.SingleLineCommentTrivia & Double = js.native
  
  @js.native
  sealed trait SlashEqualsToken
    extends StObject
       with SyntaxKind
       with CompoundAssignmentOperator
       with PunctuationSyntaxKind
  /* 68 */ val SlashEqualsToken: typingsJapgolly.typescript.mod.SyntaxKind.SlashEqualsToken & Double = js.native
  
  @js.native
  sealed trait SlashToken
    extends StObject
       with SyntaxKind
       with MultiplicativeOperator
       with PunctuationSyntaxKind
  /* 43 */ val SlashToken: typingsJapgolly.typescript.mod.SyntaxKind.SlashToken & Double = js.native
  
  @js.native
  sealed trait SourceFile
    extends StObject
       with SyntaxKind
  /* 305 */ val SourceFile: typingsJapgolly.typescript.mod.SyntaxKind.SourceFile & Double = js.native
  
  @js.native
  sealed trait SpreadAssignment
    extends StObject
       with SyntaxKind
  /* 298 */ val SpreadAssignment: typingsJapgolly.typescript.mod.SyntaxKind.SpreadAssignment & Double = js.native
  
  @js.native
  sealed trait SpreadElement
    extends StObject
       with SyntaxKind
  /* 225 */ val SpreadElement: typingsJapgolly.typescript.mod.SyntaxKind.SpreadElement & Double = js.native
  
  @js.native
  sealed trait StaticKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with ModifierSyntaxKind
  /* 124 */ val StaticKeyword: typingsJapgolly.typescript.mod.SyntaxKind.StaticKeyword & Double = js.native
  
  @js.native
  sealed trait StringKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with KeywordTypeSyntaxKind
  /* 150 */ val StringKeyword: typingsJapgolly.typescript.mod.SyntaxKind.StringKeyword & Double = js.native
  
  @js.native
  sealed trait StringLiteral
    extends StObject
       with SyntaxKind
       with LiteralSyntaxKind
  /* 10 */ val StringLiteral: typingsJapgolly.typescript.mod.SyntaxKind.StringLiteral & Double = js.native
  
  @js.native
  sealed trait SuperKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 106 */ val SuperKeyword: typingsJapgolly.typescript.mod.SyntaxKind.SuperKeyword & Double = js.native
  
  @js.native
  sealed trait SwitchKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 107 */ val SwitchKeyword: typingsJapgolly.typescript.mod.SyntaxKind.SwitchKeyword & Double = js.native
  
  @js.native
  sealed trait SwitchStatement
    extends StObject
       with SyntaxKind
  /* 249 */ val SwitchStatement: typingsJapgolly.typescript.mod.SyntaxKind.SwitchStatement & Double = js.native
  
  @js.native
  sealed trait SymbolKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with KeywordTypeSyntaxKind
  /* 151 */ val SymbolKeyword: typingsJapgolly.typescript.mod.SyntaxKind.SymbolKeyword & Double = js.native
  
  @js.native
  sealed trait SyntaxList
    extends StObject
       with SyntaxKind
  /* 348 */ val SyntaxList: typingsJapgolly.typescript.mod.SyntaxKind.SyntaxList & Double = js.native
  
  @js.native
  sealed trait SyntheticExpression
    extends StObject
       with SyntaxKind
  /* 232 */ val SyntheticExpression: typingsJapgolly.typescript.mod.SyntaxKind.SyntheticExpression & Double = js.native
  
  @js.native
  sealed trait SyntheticReferenceExpression
    extends StObject
       with SyntaxKind
  /* 354 */ val SyntheticReferenceExpression: typingsJapgolly.typescript.mod.SyntaxKind.SyntheticReferenceExpression & Double = js.native
  
  @js.native
  sealed trait TaggedTemplateExpression
    extends StObject
       with SyntaxKind
  /* 210 */ val TaggedTemplateExpression: typingsJapgolly.typescript.mod.SyntaxKind.TaggedTemplateExpression & Double = js.native
  
  @js.native
  sealed trait TemplateExpression
    extends StObject
       with SyntaxKind
  /* 223 */ val TemplateExpression: typingsJapgolly.typescript.mod.SyntaxKind.TemplateExpression & Double = js.native
  
  @js.native
  sealed trait TemplateHead
    extends StObject
       with SyntaxKind
       with PseudoLiteralSyntaxKind
  /* 15 */ val TemplateHead: typingsJapgolly.typescript.mod.SyntaxKind.TemplateHead & Double = js.native
  
  @js.native
  sealed trait TemplateLiteralType
    extends StObject
       with SyntaxKind
  /* 198 */ val TemplateLiteralType: typingsJapgolly.typescript.mod.SyntaxKind.TemplateLiteralType & Double = js.native
  
  @js.native
  sealed trait TemplateLiteralTypeSpan
    extends StObject
       with SyntaxKind
  /* 199 */ val TemplateLiteralTypeSpan: typingsJapgolly.typescript.mod.SyntaxKind.TemplateLiteralTypeSpan & Double = js.native
  
  @js.native
  sealed trait TemplateMiddle
    extends StObject
       with SyntaxKind
       with PseudoLiteralSyntaxKind
  /* 16 */ val TemplateMiddle: typingsJapgolly.typescript.mod.SyntaxKind.TemplateMiddle & Double = js.native
  
  @js.native
  sealed trait TemplateSpan
    extends StObject
       with SyntaxKind
  /* 233 */ val TemplateSpan: typingsJapgolly.typescript.mod.SyntaxKind.TemplateSpan & Double = js.native
  
  @js.native
  sealed trait TemplateTail
    extends StObject
       with SyntaxKind
       with PseudoLiteralSyntaxKind
  /* 17 */ val TemplateTail: typingsJapgolly.typescript.mod.SyntaxKind.TemplateTail & Double = js.native
  
  @js.native
  sealed trait ThisKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 108 */ val ThisKeyword: typingsJapgolly.typescript.mod.SyntaxKind.ThisKeyword & Double = js.native
  
  @js.native
  sealed trait ThisType
    extends StObject
       with SyntaxKind
  /* 192 */ val ThisType: typingsJapgolly.typescript.mod.SyntaxKind.ThisType & Double = js.native
  
  @js.native
  sealed trait ThrowKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 109 */ val ThrowKeyword: typingsJapgolly.typescript.mod.SyntaxKind.ThrowKeyword & Double = js.native
  
  @js.native
  sealed trait ThrowStatement
    extends StObject
       with SyntaxKind
  /* 251 */ val ThrowStatement: typingsJapgolly.typescript.mod.SyntaxKind.ThrowStatement & Double = js.native
  
  @js.native
  sealed trait TildeToken
    extends StObject
       with SyntaxKind
       with PrefixUnaryOperator
       with PunctuationSyntaxKind
  /* 54 */ val TildeToken: typingsJapgolly.typescript.mod.SyntaxKind.TildeToken & Double = js.native
  
  @js.native
  sealed trait TrueKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 110 */ val TrueKeyword: typingsJapgolly.typescript.mod.SyntaxKind.TrueKeyword & Double = js.native
  
  @js.native
  sealed trait TryKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 111 */ val TryKeyword: typingsJapgolly.typescript.mod.SyntaxKind.TryKeyword & Double = js.native
  
  @js.native
  sealed trait TryStatement
    extends StObject
       with SyntaxKind
  /* 252 */ val TryStatement: typingsJapgolly.typescript.mod.SyntaxKind.TryStatement & Double = js.native
  
  @js.native
  sealed trait TupleType
    extends StObject
       with SyntaxKind
  /* 184 */ val TupleType: typingsJapgolly.typescript.mod.SyntaxKind.TupleType & Double = js.native
  
  @js.native
  sealed trait TypeAliasDeclaration
    extends StObject
       with SyntaxKind
  /* 259 */ val TypeAliasDeclaration: typingsJapgolly.typescript.mod.SyntaxKind.TypeAliasDeclaration & Double = js.native
  
  @js.native
  sealed trait TypeAssertionExpression
    extends StObject
       with SyntaxKind
  /* 211 */ val TypeAssertionExpression: typingsJapgolly.typescript.mod.SyntaxKind.TypeAssertionExpression & Double = js.native
  
  @js.native
  sealed trait TypeKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 152 */ val TypeKeyword: typingsJapgolly.typescript.mod.SyntaxKind.TypeKeyword & Double = js.native
  
  @js.native
  sealed trait TypeLiteral
    extends StObject
       with SyntaxKind
  /* 182 */ val TypeLiteral: typingsJapgolly.typescript.mod.SyntaxKind.TypeLiteral & Double = js.native
  
  @js.native
  sealed trait TypeOfExpression
    extends StObject
       with SyntaxKind
  /* 216 */ val TypeOfExpression: typingsJapgolly.typescript.mod.SyntaxKind.TypeOfExpression & Double = js.native
  
  @js.native
  sealed trait TypeOfKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 112 */ val TypeOfKeyword: typingsJapgolly.typescript.mod.SyntaxKind.TypeOfKeyword & Double = js.native
  
  @js.native
  sealed trait TypeOperator
    extends StObject
       with SyntaxKind
  /* 193 */ val TypeOperator: typingsJapgolly.typescript.mod.SyntaxKind.TypeOperator & Double = js.native
  
  @js.native
  sealed trait TypeParameter
    extends StObject
       with SyntaxKind
  /* 163 */ val TypeParameter: typingsJapgolly.typescript.mod.SyntaxKind.TypeParameter & Double = js.native
  
  @js.native
  sealed trait TypePredicate
    extends StObject
       with SyntaxKind
  /* 177 */ val TypePredicate: typingsJapgolly.typescript.mod.SyntaxKind.TypePredicate & Double = js.native
  
  @js.native
  sealed trait TypeQuery
    extends StObject
       with SyntaxKind
  /* 181 */ val TypeQuery: typingsJapgolly.typescript.mod.SyntaxKind.TypeQuery & Double = js.native
  
  @js.native
  sealed trait TypeReference
    extends StObject
       with SyntaxKind
  /* 178 */ val TypeReference: typingsJapgolly.typescript.mod.SyntaxKind.TypeReference & Double = js.native
  
  @js.native
  sealed trait UndefinedKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with KeywordTypeSyntaxKind
  /* 153 */ val UndefinedKeyword: typingsJapgolly.typescript.mod.SyntaxKind.UndefinedKeyword & Double = js.native
  
  @js.native
  sealed trait UnionType
    extends StObject
       with SyntaxKind
  /* 187 */ val UnionType: typingsJapgolly.typescript.mod.SyntaxKind.UnionType & Double = js.native
  
  @js.native
  sealed trait UniqueKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 154 */ val UniqueKeyword: typingsJapgolly.typescript.mod.SyntaxKind.UniqueKeyword & Double = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with SyntaxKind
       with JSDocSyntaxKind
       with TokenSyntaxKind
  /* 0 */ val Unknown: typingsJapgolly.typescript.mod.SyntaxKind.Unknown & Double = js.native
  
  @js.native
  sealed trait UnknownKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with KeywordTypeSyntaxKind
  /* 155 */ val UnknownKeyword: typingsJapgolly.typescript.mod.SyntaxKind.UnknownKeyword & Double = js.native
  
  @js.native
  sealed trait UnparsedInternalText
    extends StObject
       with SyntaxKind
  /* 303 */ val UnparsedInternalText: typingsJapgolly.typescript.mod.SyntaxKind.UnparsedInternalText & Double = js.native
  
  @js.native
  sealed trait UnparsedPrepend
    extends StObject
       with SyntaxKind
  /* 301 */ val UnparsedPrepend: typingsJapgolly.typescript.mod.SyntaxKind.UnparsedPrepend & Double = js.native
  
  @js.native
  sealed trait UnparsedPrologue
    extends StObject
       with SyntaxKind
  /* 300 */ val UnparsedPrologue: typingsJapgolly.typescript.mod.SyntaxKind.UnparsedPrologue & Double = js.native
  
  @js.native
  sealed trait UnparsedSource
    extends StObject
       with SyntaxKind
  /* 307 */ val UnparsedSource: typingsJapgolly.typescript.mod.SyntaxKind.UnparsedSource & Double = js.native
  
  @js.native
  sealed trait UnparsedSyntheticReference
    extends StObject
       with SyntaxKind
  /* 304 */ val UnparsedSyntheticReference: typingsJapgolly.typescript.mod.SyntaxKind.UnparsedSyntheticReference & Double = js.native
  
  @js.native
  sealed trait UnparsedText
    extends StObject
       with SyntaxKind
  /* 302 */ val UnparsedText: typingsJapgolly.typescript.mod.SyntaxKind.UnparsedText & Double = js.native
  
  @js.native
  sealed trait VarKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 113 */ val VarKeyword: typingsJapgolly.typescript.mod.SyntaxKind.VarKeyword & Double = js.native
  
  @js.native
  sealed trait VariableDeclaration
    extends StObject
       with SyntaxKind
  /* 254 */ val VariableDeclaration: typingsJapgolly.typescript.mod.SyntaxKind.VariableDeclaration & Double = js.native
  
  @js.native
  sealed trait VariableDeclarationList
    extends StObject
       with SyntaxKind
  /* 255 */ val VariableDeclarationList: typingsJapgolly.typescript.mod.SyntaxKind.VariableDeclarationList & Double = js.native
  
  @js.native
  sealed trait VariableStatement
    extends StObject
       with SyntaxKind
  /* 237 */ val VariableStatement: typingsJapgolly.typescript.mod.SyntaxKind.VariableStatement & Double = js.native
  
  @js.native
  sealed trait VoidExpression
    extends StObject
       with SyntaxKind
  /* 217 */ val VoidExpression: typingsJapgolly.typescript.mod.SyntaxKind.VoidExpression & Double = js.native
  
  @js.native
  sealed trait VoidKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with KeywordTypeSyntaxKind
  /* 114 */ val VoidKeyword: typingsJapgolly.typescript.mod.SyntaxKind.VoidKeyword & Double = js.native
  
  @js.native
  sealed trait WhileKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 115 */ val WhileKeyword: typingsJapgolly.typescript.mod.SyntaxKind.WhileKeyword & Double = js.native
  
  @js.native
  sealed trait WhileStatement
    extends StObject
       with SyntaxKind
  /* 241 */ val WhileStatement: typingsJapgolly.typescript.mod.SyntaxKind.WhileStatement & Double = js.native
  
  @js.native
  sealed trait WhitespaceTrivia
    extends StObject
       with SyntaxKind
       with JSDocSyntaxKind
       with TriviaSyntaxKind
  /* 5 */ val WhitespaceTrivia: typingsJapgolly.typescript.mod.SyntaxKind.WhitespaceTrivia & Double = js.native
  
  @js.native
  sealed trait WithKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 116 */ val WithKeyword: typingsJapgolly.typescript.mod.SyntaxKind.WithKeyword & Double = js.native
  
  @js.native
  sealed trait WithStatement
    extends StObject
       with SyntaxKind
  /* 248 */ val WithStatement: typingsJapgolly.typescript.mod.SyntaxKind.WithStatement & Double = js.native
  
  @js.native
  sealed trait YieldExpression
    extends StObject
       with SyntaxKind
  /* 224 */ val YieldExpression: typingsJapgolly.typescript.mod.SyntaxKind.YieldExpression & Double = js.native
  
  @js.native
  sealed trait YieldKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 125 */ val YieldKeyword: typingsJapgolly.typescript.mod.SyntaxKind.YieldKeyword & Double = js.native
}
