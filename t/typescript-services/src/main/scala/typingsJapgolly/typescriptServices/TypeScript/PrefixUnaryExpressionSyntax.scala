package typingsJapgolly.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PrefixUnaryExpressionSyntax")
@js.native
class PrefixUnaryExpressionSyntax protected ()
  extends SyntaxNode
     with IUnaryExpressionSyntax {
  def this(
    kind: SyntaxKind,
    operatorToken: ISyntaxToken,
    operand: IUnaryExpressionSyntax,
    parsedInStrictMode: Boolean
  ) = this()
  var _kind: js.Any = js.native
  var operand: IUnaryExpressionSyntax = js.native
  var operatorToken: ISyntaxToken = js.native
  /* CompleteClass */
  override def accept(visitor: ISyntaxVisitor): js.Any = js.native
  /* CompleteClass */
  override def childAt(index: Double): ISyntaxElement = js.native
  /* CompleteClass */
  override def childCount(): Double = js.native
  /* CompleteClass */
  override def collectTextElements(elements: js.Array[String]): Unit = js.native
  /* CompleteClass */
  override def firstToken(): ISyntaxToken = js.native
  /* CompleteClass */
  override def fullText(): String = js.native
  /* CompleteClass */
  override def fullWidth(): Double = js.native
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  /* CompleteClass */
  override def isIncrementallyUnusable(): Boolean = js.native
  /* CompleteClass */
  override def isList(): Boolean = js.native
  /* CompleteClass */
  override def isNode(): Boolean = js.native
  /* CompleteClass */
  override def isSeparatedList(): Boolean = js.native
  /* CompleteClass */
  override def isToken(): Boolean = js.native
  /* CompleteClass */
  override def isTypeScriptSpecific(): Boolean = js.native
  /* CompleteClass */
  override def isUnaryExpression(): Boolean = js.native
  /* CompleteClass */
  override def kind(): SyntaxKind = js.native
  /* CompleteClass */
  override def lastToken(): ISyntaxToken = js.native
  /* CompleteClass */
  override def leadingTrivia(): ISyntaxTriviaList = js.native
  /* CompleteClass */
  override def leadingTriviaWidth(): Double = js.native
  /* CompleteClass */
  override def trailingTrivia(): ISyntaxTriviaList = js.native
  /* CompleteClass */
  override def trailingTriviaWidth(): Double = js.native
  def update(kind: SyntaxKind, operatorToken: ISyntaxToken, operand: IUnaryExpressionSyntax): PrefixUnaryExpressionSyntax = js.native
  /* CompleteClass */
  override def width(): Double = js.native
  def withKind(kind: SyntaxKind): PrefixUnaryExpressionSyntax = js.native
  /* CompleteClass */
  override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  def withOperand(operand: IUnaryExpressionSyntax): PrefixUnaryExpressionSyntax = js.native
  def withOperatorToken(operatorToken: ISyntaxToken): PrefixUnaryExpressionSyntax = js.native
  /* CompleteClass */
  override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
}

