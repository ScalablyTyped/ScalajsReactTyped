package typingsJapgolly.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ReturnStatementSyntax")
@js.native
class ReturnStatementSyntax protected ()
  extends SyntaxNode
     with IStatementSyntax {
  def this(
    returnKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
  var expression: IExpressionSyntax = js.native
  var returnKeyword: ISyntaxToken = js.native
  var semicolonToken: ISyntaxToken = js.native
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
  /* CompleteClass */
  override def isIncrementallyUnusable(): Boolean = js.native
  /* CompleteClass */
  override def isList(): Boolean = js.native
  /* CompleteClass */
  override def isNode(): Boolean = js.native
  /* CompleteClass */
  override def isSeparatedList(): Boolean = js.native
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  /* CompleteClass */
  override def isToken(): Boolean = js.native
  /* CompleteClass */
  override def isTypeScriptSpecific(): Boolean = js.native
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
  def update(returnKeyword: ISyntaxToken, expression: IExpressionSyntax, semicolonToken: ISyntaxToken): ReturnStatementSyntax = js.native
  /* CompleteClass */
  override def width(): Double = js.native
  def withExpression(expression: IExpressionSyntax): ReturnStatementSyntax = js.native
  /* CompleteClass */
  override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  def withReturnKeyword(returnKeyword: ISyntaxToken): ReturnStatementSyntax = js.native
  def withSemicolonToken(semicolonToken: ISyntaxToken): ReturnStatementSyntax = js.native
  /* CompleteClass */
  override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
}

/* static members */
@JSGlobal("TypeScript.ReturnStatementSyntax")
@js.native
object ReturnStatementSyntax extends js.Object {
  def create(returnKeyword: ISyntaxToken, semicolonToken: ISyntaxToken): ReturnStatementSyntax = js.native
  def create1(): ReturnStatementSyntax = js.native
}

