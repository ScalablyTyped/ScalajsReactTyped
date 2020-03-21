package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyntaxTriviaList extends js.Object {
  def collectTextElements(elements: js.Array[String]): Unit
  def concat(trivia: ISyntaxTriviaList): ISyntaxTriviaList
  def count(): Double
  def fullText(): String
  def fullWidth(): Double
  def hasComment(): Boolean
  def hasNewLine(): Boolean
  def hasSkippedToken(): Boolean
  def last(): ISyntaxTrivia
  def syntaxTriviaAt(index: Double): ISyntaxTrivia
  def toArray(): js.Array[ISyntaxTrivia]
}

object ISyntaxTriviaList {
  @scala.inline
  def apply(
    collectTextElements: js.Array[String] => Callback,
    concat: ISyntaxTriviaList => CallbackTo[ISyntaxTriviaList],
    count: CallbackTo[Double],
    fullText: CallbackTo[String],
    fullWidth: CallbackTo[Double],
    hasComment: CallbackTo[Boolean],
    hasNewLine: CallbackTo[Boolean],
    hasSkippedToken: CallbackTo[Boolean],
    last: CallbackTo[ISyntaxTrivia],
    syntaxTriviaAt: Double => CallbackTo[ISyntaxTrivia],
    toArray: CallbackTo[js.Array[ISyntaxTrivia]]
  ): ISyntaxTriviaList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collectTextElements")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => collectTextElements(t0).runNow()))
    __obj.updateDynamic("concat")(js.Any.fromFunction1((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxTriviaList) => concat(t0).runNow()))
    __obj.updateDynamic("count")(count.toJsFn)
    __obj.updateDynamic("fullText")(fullText.toJsFn)
    __obj.updateDynamic("fullWidth")(fullWidth.toJsFn)
    __obj.updateDynamic("hasComment")(hasComment.toJsFn)
    __obj.updateDynamic("hasNewLine")(hasNewLine.toJsFn)
    __obj.updateDynamic("hasSkippedToken")(hasSkippedToken.toJsFn)
    __obj.updateDynamic("last")(last.toJsFn)
    __obj.updateDynamic("syntaxTriviaAt")(js.Any.fromFunction1((t0: scala.Double) => syntaxTriviaAt(t0).runNow()))
    __obj.updateDynamic("toArray")(toArray.toJsFn)
    __obj.asInstanceOf[ISyntaxTriviaList]
  }
}

