package typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The list styling for a range of text.
  */
trait ListStyle extends js.Object {
  def applyListPreset(listPreset: ListPreset): ListStyle
  def getGlyph(): String
  def getList(): List
  def getNestingLevel(): Integer
  def isInList(): Boolean
  def removeFromList(): ListStyle
}

object ListStyle {
  @scala.inline
  def apply(
    applyListPreset: ListPreset => CallbackTo[ListStyle],
    getGlyph: CallbackTo[String],
    getList: CallbackTo[List],
    getNestingLevel: CallbackTo[Integer],
    isInList: CallbackTo[Boolean],
    removeFromList: CallbackTo[ListStyle]
  ): ListStyle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("applyListPreset")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ListPreset) => applyListPreset(t0).runNow()))
    __obj.updateDynamic("getGlyph")(getGlyph.toJsFn)
    __obj.updateDynamic("getList")(getList.toJsFn)
    __obj.updateDynamic("getNestingLevel")(getNestingLevel.toJsFn)
    __obj.updateDynamic("isInList")(isInList.toJsFn)
    __obj.updateDynamic("removeFromList")(removeFromList.toJsFn)
    __obj.asInstanceOf[ListStyle]
  }
}

