package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The rendered style of text in a cell.
  *
  * Text styles can have a corresponding RichTextValue. If the RichTextValue spans multiple text runs that have different values for a given text style read
  * method, the method returns null. To avoid this, query for text styles using the Rich Text
  * values returned by the RichTextValue.getRuns() method.
  */
trait TextStyle extends js.Object {
  def copy(): TextStyleBuilder
  def getFontFamily(): String | Null
  def getFontSize(): Integer | Null
  def getForegroundColor(): String | Null
  def isBold(): Boolean | Null
  def isItalic(): Boolean | Null
  def isStrikethrough(): Boolean | Null
  def isUnderline(): Boolean | Null
}

object TextStyle {
  @scala.inline
  def apply(
    copy: CallbackTo[TextStyleBuilder],
    getFontFamily: CallbackTo[String | Null],
    getFontSize: CallbackTo[Integer | Null],
    getForegroundColor: CallbackTo[String | Null],
    isBold: CallbackTo[Boolean | Null],
    isItalic: CallbackTo[Boolean | Null],
    isStrikethrough: CallbackTo[Boolean | Null],
    isUnderline: CallbackTo[Boolean | Null]
  ): TextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("copy")(copy.toJsFn)
    __obj.updateDynamic("getFontFamily")(getFontFamily.toJsFn)
    __obj.updateDynamic("getFontSize")(getFontSize.toJsFn)
    __obj.updateDynamic("getForegroundColor")(getForegroundColor.toJsFn)
    __obj.updateDynamic("isBold")(isBold.toJsFn)
    __obj.updateDynamic("isItalic")(isItalic.toJsFn)
    __obj.updateDynamic("isStrikethrough")(isStrikethrough.toJsFn)
    __obj.updateDynamic("isUnderline")(isUnderline.toJsFn)
    __obj.asInstanceOf[TextStyle]
  }
}

