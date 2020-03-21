package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for focusable UI elements.
  */
trait UiFocusable extends js.Object {
  /**
    * Sets focus on the element.
    */
  def setFocus(): Unit
}

object UiFocusable {
  @scala.inline
  def apply(setFocus: Callback): UiFocusable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setFocus")(setFocus.toJsFn)
    __obj.asInstanceOf[UiFocusable]
  }
}

