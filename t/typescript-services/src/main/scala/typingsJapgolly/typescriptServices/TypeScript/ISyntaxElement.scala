package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyntaxElement extends js.Object {
  def childAt(index: Double): ISyntaxElement
  def childCount(): Double
  def collectTextElements(elements: js.Array[String]): Unit
  def firstToken(): ISyntaxToken
  def fullText(): String
  def fullWidth(): Double
  def isIncrementallyUnusable(): Boolean
  def isList(): Boolean
  def isNode(): Boolean
  def isSeparatedList(): Boolean
  def isToken(): Boolean
  def isTypeScriptSpecific(): Boolean
  def kind(): SyntaxKind
  def lastToken(): ISyntaxToken
  def leadingTrivia(): ISyntaxTriviaList
  def leadingTriviaWidth(): Double
  def trailingTrivia(): ISyntaxTriviaList
  def trailingTriviaWidth(): Double
  def width(): Double
}

object ISyntaxElement {
  @scala.inline
  def apply(
    childAt: Double => CallbackTo[ISyntaxElement],
    childCount: CallbackTo[Double],
    collectTextElements: js.Array[String] => Callback,
    firstToken: CallbackTo[ISyntaxToken],
    fullText: CallbackTo[String],
    fullWidth: CallbackTo[Double],
    isIncrementallyUnusable: CallbackTo[Boolean],
    isList: CallbackTo[Boolean],
    isNode: CallbackTo[Boolean],
    isSeparatedList: CallbackTo[Boolean],
    isToken: CallbackTo[Boolean],
    isTypeScriptSpecific: CallbackTo[Boolean],
    kind: CallbackTo[SyntaxKind],
    lastToken: CallbackTo[ISyntaxToken],
    leadingTrivia: CallbackTo[ISyntaxTriviaList],
    leadingTriviaWidth: CallbackTo[Double],
    trailingTrivia: CallbackTo[ISyntaxTriviaList],
    trailingTriviaWidth: CallbackTo[Double],
    width: CallbackTo[Double]
  ): ISyntaxElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("childAt")(js.Any.fromFunction1((t0: scala.Double) => childAt(t0).runNow()))
    __obj.updateDynamic("childCount")(childCount.toJsFn)
    __obj.updateDynamic("collectTextElements")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => collectTextElements(t0).runNow()))
    __obj.updateDynamic("firstToken")(firstToken.toJsFn)
    __obj.updateDynamic("fullText")(fullText.toJsFn)
    __obj.updateDynamic("fullWidth")(fullWidth.toJsFn)
    __obj.updateDynamic("isIncrementallyUnusable")(isIncrementallyUnusable.toJsFn)
    __obj.updateDynamic("isList")(isList.toJsFn)
    __obj.updateDynamic("isNode")(isNode.toJsFn)
    __obj.updateDynamic("isSeparatedList")(isSeparatedList.toJsFn)
    __obj.updateDynamic("isToken")(isToken.toJsFn)
    __obj.updateDynamic("isTypeScriptSpecific")(isTypeScriptSpecific.toJsFn)
    __obj.updateDynamic("kind")(kind.toJsFn)
    __obj.updateDynamic("lastToken")(lastToken.toJsFn)
    __obj.updateDynamic("leadingTrivia")(leadingTrivia.toJsFn)
    __obj.updateDynamic("leadingTriviaWidth")(leadingTriviaWidth.toJsFn)
    __obj.updateDynamic("trailingTrivia")(trailingTrivia.toJsFn)
    __obj.updateDynamic("trailingTriviaWidth")(trailingTriviaWidth.toJsFn)
    __obj.updateDynamic("width")(width.toJsFn)
    __obj.asInstanceOf[ISyntaxElement]
  }
}

