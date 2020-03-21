package typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An element of text that is dynamically replaced with content that can change over time, such as a
  * slide number.
  */
trait AutoText extends js.Object {
  def getAutoTextType(): AutoTextType
  def getIndex(): Integer
  def getRange(): TextRange
}

object AutoText {
  @scala.inline
  def apply(
    getAutoTextType: CallbackTo[AutoTextType],
    getIndex: CallbackTo[Integer],
    getRange: CallbackTo[TextRange]
  ): AutoText = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAutoTextType")(getAutoTextType.toJsFn)
    __obj.updateDynamic("getIndex")(getIndex.toJsFn)
    __obj.updateDynamic("getRange")(getRange.toJsFn)
    __obj.asInstanceOf[AutoText]
  }
}

