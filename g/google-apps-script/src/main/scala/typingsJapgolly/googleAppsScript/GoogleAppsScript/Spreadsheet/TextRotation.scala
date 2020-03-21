package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access the text rotation settings for a cell.
  */
trait TextRotation extends js.Object {
  def getDegrees(): Integer
  def isVertical(): Boolean
}

object TextRotation {
  @scala.inline
  def apply(getDegrees: CallbackTo[Integer], isVertical: CallbackTo[Boolean]): TextRotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDegrees")(getDegrees.toJsFn)
    __obj.updateDynamic("isVertical")(isVertical.toJsFn)
    __obj.asInstanceOf[TextRotation]
  }
}

