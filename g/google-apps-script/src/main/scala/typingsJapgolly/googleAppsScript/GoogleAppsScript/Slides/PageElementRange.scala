package typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of one or more PageElement instances.
  */
trait PageElementRange extends js.Object {
  def getPageElements(): js.Array[PageElement]
}

object PageElementRange {
  @scala.inline
  def apply(getPageElements: CallbackTo[js.Array[PageElement]]): PageElementRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getPageElements")(getPageElements.toJsFn)
    __obj.asInstanceOf[PageElementRange]
  }
}

