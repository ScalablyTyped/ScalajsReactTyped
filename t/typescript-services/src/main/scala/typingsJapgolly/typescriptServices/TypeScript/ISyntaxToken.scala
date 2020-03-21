package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyntaxToken extends IPrimaryExpressionSyntax {
  var tokenKind: SyntaxKind
  def hasLeadingComment(): Boolean
  def hasLeadingNewLine(): Boolean
  def hasLeadingSkippedText(): Boolean
  def hasLeadingTrivia(): Boolean
  def hasSkippedToken(): Boolean
  def hasTrailingComment(): Boolean
  def hasTrailingNewLine(): Boolean
  def hasTrailingSkippedText(): Boolean
  def hasTrailingTrivia(): Boolean
  def text(): String
  def value(): js.Any
  def valueText(): String
}

object ISyntaxToken {
  @scala.inline
  def apply(
    accept: ISyntaxVisitor => CallbackTo[js.Any],
    childAt: Double => CallbackTo[ISyntaxElement],
    childCount: CallbackTo[Double],
    collectTextElements: js.Array[String] => Callback,
    firstToken: CallbackTo[ISyntaxToken],
    fullText: CallbackTo[String],
    fullWidth: CallbackTo[Double],
    hasLeadingComment: CallbackTo[Boolean],
    hasLeadingNewLine: CallbackTo[Boolean],
    hasLeadingSkippedText: CallbackTo[Boolean],
    hasLeadingTrivia: CallbackTo[Boolean],
    hasSkippedToken: CallbackTo[Boolean],
    hasTrailingComment: CallbackTo[Boolean],
    hasTrailingNewLine: CallbackTo[Boolean],
    hasTrailingSkippedText: CallbackTo[Boolean],
    hasTrailingTrivia: CallbackTo[Boolean],
    isExpression: CallbackTo[Boolean],
    isIncrementallyUnusable: CallbackTo[Boolean],
    isList: CallbackTo[Boolean],
    isMemberExpression: CallbackTo[Boolean],
    isNode: CallbackTo[Boolean],
    isPostfixExpression: CallbackTo[Boolean],
    isPrimaryExpression: CallbackTo[Boolean],
    isSeparatedList: CallbackTo[Boolean],
    isToken: CallbackTo[Boolean],
    isTypeScriptSpecific: CallbackTo[Boolean],
    isUnaryExpression: CallbackTo[Boolean],
    kind: CallbackTo[SyntaxKind],
    lastToken: CallbackTo[ISyntaxToken],
    leadingTrivia: CallbackTo[ISyntaxTriviaList],
    leadingTriviaWidth: CallbackTo[Double],
    text: CallbackTo[String],
    tokenKind: SyntaxKind,
    trailingTrivia: CallbackTo[ISyntaxTriviaList],
    trailingTriviaWidth: CallbackTo[Double],
    value: CallbackTo[js.Any],
    valueText: CallbackTo[String],
    width: CallbackTo[Double],
    withLeadingTrivia: ISyntaxTriviaList => CallbackTo[ISyntaxNodeOrToken],
    withTrailingTrivia: ISyntaxTriviaList => CallbackTo[ISyntaxNodeOrToken]
  ): ISyntaxToken = {
    val __obj = js.Dynamic.literal(tokenKind = tokenKind.asInstanceOf[js.Any])
    __obj.updateDynamic("accept")(js.Any.fromFunction1((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxVisitor) => accept(t0).runNow()))
    __obj.updateDynamic("childAt")(js.Any.fromFunction1((t0: scala.Double) => childAt(t0).runNow()))
    __obj.updateDynamic("childCount")(childCount.toJsFn)
    __obj.updateDynamic("collectTextElements")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => collectTextElements(t0).runNow()))
    __obj.updateDynamic("firstToken")(firstToken.toJsFn)
    __obj.updateDynamic("fullText")(fullText.toJsFn)
    __obj.updateDynamic("fullWidth")(fullWidth.toJsFn)
    __obj.updateDynamic("hasLeadingComment")(hasLeadingComment.toJsFn)
    __obj.updateDynamic("hasLeadingNewLine")(hasLeadingNewLine.toJsFn)
    __obj.updateDynamic("hasLeadingSkippedText")(hasLeadingSkippedText.toJsFn)
    __obj.updateDynamic("hasLeadingTrivia")(hasLeadingTrivia.toJsFn)
    __obj.updateDynamic("hasSkippedToken")(hasSkippedToken.toJsFn)
    __obj.updateDynamic("hasTrailingComment")(hasTrailingComment.toJsFn)
    __obj.updateDynamic("hasTrailingNewLine")(hasTrailingNewLine.toJsFn)
    __obj.updateDynamic("hasTrailingSkippedText")(hasTrailingSkippedText.toJsFn)
    __obj.updateDynamic("hasTrailingTrivia")(hasTrailingTrivia.toJsFn)
    __obj.updateDynamic("isExpression")(isExpression.toJsFn)
    __obj.updateDynamic("isIncrementallyUnusable")(isIncrementallyUnusable.toJsFn)
    __obj.updateDynamic("isList")(isList.toJsFn)
    __obj.updateDynamic("isMemberExpression")(isMemberExpression.toJsFn)
    __obj.updateDynamic("isNode")(isNode.toJsFn)
    __obj.updateDynamic("isPostfixExpression")(isPostfixExpression.toJsFn)
    __obj.updateDynamic("isPrimaryExpression")(isPrimaryExpression.toJsFn)
    __obj.updateDynamic("isSeparatedList")(isSeparatedList.toJsFn)
    __obj.updateDynamic("isToken")(isToken.toJsFn)
    __obj.updateDynamic("isTypeScriptSpecific")(isTypeScriptSpecific.toJsFn)
    __obj.updateDynamic("isUnaryExpression")(isUnaryExpression.toJsFn)
    __obj.updateDynamic("kind")(kind.toJsFn)
    __obj.updateDynamic("lastToken")(lastToken.toJsFn)
    __obj.updateDynamic("leadingTrivia")(leadingTrivia.toJsFn)
    __obj.updateDynamic("leadingTriviaWidth")(leadingTriviaWidth.toJsFn)
    __obj.updateDynamic("text")(text.toJsFn)
    __obj.updateDynamic("trailingTrivia")(trailingTrivia.toJsFn)
    __obj.updateDynamic("trailingTriviaWidth")(trailingTriviaWidth.toJsFn)
    __obj.updateDynamic("value")(value.toJsFn)
    __obj.updateDynamic("valueText")(valueText.toJsFn)
    __obj.updateDynamic("width")(width.toJsFn)
    __obj.updateDynamic("withLeadingTrivia")(js.Any.fromFunction1((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxTriviaList) => withLeadingTrivia(t0).runNow()))
    __obj.updateDynamic("withTrailingTrivia")(js.Any.fromFunction1((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxTriviaList) => withTrailingTrivia(t0).runNow()))
    __obj.asInstanceOf[ISyntaxToken]
  }
}

