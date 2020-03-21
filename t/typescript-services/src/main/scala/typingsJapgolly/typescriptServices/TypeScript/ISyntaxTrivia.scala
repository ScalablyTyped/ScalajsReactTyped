package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyntaxTrivia extends js.Object {
  def fullText(): String
  def fullWidth(): Double
  def isComment(): Boolean
  def isNewLine(): Boolean
  def isSkippedToken(): Boolean
  def isWhitespace(): Boolean
  def kind(): SyntaxKind
  def skippedToken(): ISyntaxToken
}

object ISyntaxTrivia {
  @scala.inline
  def apply(
    fullText: CallbackTo[String],
    fullWidth: CallbackTo[Double],
    isComment: CallbackTo[Boolean],
    isNewLine: CallbackTo[Boolean],
    isSkippedToken: CallbackTo[Boolean],
    isWhitespace: CallbackTo[Boolean],
    kind: CallbackTo[SyntaxKind],
    skippedToken: CallbackTo[ISyntaxToken]
  ): ISyntaxTrivia = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fullText")(fullText.toJsFn)
    __obj.updateDynamic("fullWidth")(fullWidth.toJsFn)
    __obj.updateDynamic("isComment")(isComment.toJsFn)
    __obj.updateDynamic("isNewLine")(isNewLine.toJsFn)
    __obj.updateDynamic("isSkippedToken")(isSkippedToken.toJsFn)
    __obj.updateDynamic("isWhitespace")(isWhitespace.toJsFn)
    __obj.updateDynamic("kind")(kind.toJsFn)
    __obj.updateDynamic("skippedToken")(skippedToken.toJsFn)
    __obj.asInstanceOf[ISyntaxTrivia]
  }
}

