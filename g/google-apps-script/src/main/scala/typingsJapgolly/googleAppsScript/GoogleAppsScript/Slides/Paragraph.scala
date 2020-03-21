package typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A segment of text terminated by a newline character.
  */
trait Paragraph extends js.Object {
  def getIndex(): Integer
  def getRange(): TextRange
}

object Paragraph {
  @scala.inline
  def apply(getIndex: CallbackTo[Integer], getRange: CallbackTo[TextRange]): Paragraph = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getIndex")(getIndex.toJsFn)
    __obj.updateDynamic("getRange")(getRange.toJsFn)
    __obj.asInstanceOf[Paragraph]
  }
}

