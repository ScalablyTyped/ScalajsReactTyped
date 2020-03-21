package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IArrowFunctionExpressionSyntax extends IUnaryExpressionSyntax {
  var block: BlockSyntax
  var equalsGreaterThanToken: ISyntaxToken
  var expression: IExpressionSyntax
  def isArrowFunctionExpression(): Boolean
}

object IArrowFunctionExpressionSyntax {
  @scala.inline
  def apply(
    accept: ISyntaxVisitor => CallbackTo[js.Any],
    block: BlockSyntax,
    childAt: Double => CallbackTo[ISyntaxElement],
    childCount: CallbackTo[Double],
    collectTextElements: js.Array[String] => Callback,
    equalsGreaterThanToken: ISyntaxToken,
    expression: IExpressionSyntax,
    firstToken: CallbackTo[ISyntaxToken],
    fullText: CallbackTo[String],
    fullWidth: CallbackTo[Double],
    isArrowFunctionExpression: CallbackTo[Boolean],
    isExpression: CallbackTo[Boolean],
    isIncrementallyUnusable: CallbackTo[Boolean],
    isList: CallbackTo[Boolean],
    isNode: CallbackTo[Boolean],
    isSeparatedList: CallbackTo[Boolean],
    isToken: CallbackTo[Boolean],
    isTypeScriptSpecific: CallbackTo[Boolean],
    isUnaryExpression: CallbackTo[Boolean],
    kind: CallbackTo[SyntaxKind],
    lastToken: CallbackTo[ISyntaxToken],
    leadingTrivia: CallbackTo[ISyntaxTriviaList],
    leadingTriviaWidth: CallbackTo[Double],
    trailingTrivia: CallbackTo[ISyntaxTriviaList],
    trailingTriviaWidth: CallbackTo[Double],
    width: CallbackTo[Double],
    withLeadingTrivia: ISyntaxTriviaList => CallbackTo[ISyntaxNodeOrToken],
    withTrailingTrivia: ISyntaxTriviaList => CallbackTo[ISyntaxNodeOrToken]
  ): IArrowFunctionExpressionSyntax = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], equalsGreaterThanToken = equalsGreaterThanToken.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("accept")(js.Any.fromFunction1((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxVisitor) => accept(t0).runNow()))
    __obj.updateDynamic("childAt")(js.Any.fromFunction1((t0: scala.Double) => childAt(t0).runNow()))
    __obj.updateDynamic("childCount")(childCount.toJsFn)
    __obj.updateDynamic("collectTextElements")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => collectTextElements(t0).runNow()))
    __obj.updateDynamic("firstToken")(firstToken.toJsFn)
    __obj.updateDynamic("fullText")(fullText.toJsFn)
    __obj.updateDynamic("fullWidth")(fullWidth.toJsFn)
    __obj.updateDynamic("isArrowFunctionExpression")(isArrowFunctionExpression.toJsFn)
    __obj.updateDynamic("isExpression")(isExpression.toJsFn)
    __obj.updateDynamic("isIncrementallyUnusable")(isIncrementallyUnusable.toJsFn)
    __obj.updateDynamic("isList")(isList.toJsFn)
    __obj.updateDynamic("isNode")(isNode.toJsFn)
    __obj.updateDynamic("isSeparatedList")(isSeparatedList.toJsFn)
    __obj.updateDynamic("isToken")(isToken.toJsFn)
    __obj.updateDynamic("isTypeScriptSpecific")(isTypeScriptSpecific.toJsFn)
    __obj.updateDynamic("isUnaryExpression")(isUnaryExpression.toJsFn)
    __obj.updateDynamic("kind")(kind.toJsFn)
    __obj.updateDynamic("lastToken")(lastToken.toJsFn)
    __obj.updateDynamic("leadingTrivia")(leadingTrivia.toJsFn)
    __obj.updateDynamic("leadingTriviaWidth")(leadingTriviaWidth.toJsFn)
    __obj.updateDynamic("trailingTrivia")(trailingTrivia.toJsFn)
    __obj.updateDynamic("trailingTriviaWidth")(trailingTriviaWidth.toJsFn)
    __obj.updateDynamic("width")(width.toJsFn)
    __obj.updateDynamic("withLeadingTrivia")(js.Any.fromFunction1((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxTriviaList) => withLeadingTrivia(t0).runNow()))
    __obj.updateDynamic("withTrailingTrivia")(js.Any.fromFunction1((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxTriviaList) => withTrailingTrivia(t0).runNow()))
    __obj.asInstanceOf[IArrowFunctionExpressionSyntax]
  }
}

