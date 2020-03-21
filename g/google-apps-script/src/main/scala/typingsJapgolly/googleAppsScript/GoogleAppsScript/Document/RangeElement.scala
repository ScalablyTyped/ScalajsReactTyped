package typingsJapgolly.googleAppsScript.GoogleAppsScript.Document

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A wrapper around an Element with a possible start and end offset. These offsets allow a
  * range of characters within a Text
  * element to be represented in search results, document selections, and named ranges.
  */
trait RangeElement extends js.Object {
  def getElement(): Element
  def getEndOffsetInclusive(): Integer
  def getStartOffset(): Integer
  def isPartial(): Boolean
}

object RangeElement {
  @scala.inline
  def apply(
    getElement: CallbackTo[Element],
    getEndOffsetInclusive: CallbackTo[Integer],
    getStartOffset: CallbackTo[Integer],
    isPartial: CallbackTo[Boolean]
  ): RangeElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getElement")(getElement.toJsFn)
    __obj.updateDynamic("getEndOffsetInclusive")(getEndOffsetInclusive.toJsFn)
    __obj.updateDynamic("getStartOffset")(getStartOffset.toJsFn)
    __obj.updateDynamic("isPartial")(isPartial.toJsFn)
    __obj.asInstanceOf[RangeElement]
  }
}

