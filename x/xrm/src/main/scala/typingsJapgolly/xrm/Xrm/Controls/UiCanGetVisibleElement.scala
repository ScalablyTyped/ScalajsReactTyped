package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for UI elements which can have the visibility value read.
  */
trait UiCanGetVisibleElement extends js.Object {
  /**
    * Gets the visibility state.
    * @returns true if the tab is visible, otherwise false.
    */
  def getVisible(): Boolean
}

object UiCanGetVisibleElement {
  @scala.inline
  def apply(getVisible: CallbackTo[Boolean]): UiCanGetVisibleElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getVisible")(getVisible.toJsFn)
    __obj.asInstanceOf[UiCanGetVisibleElement]
  }
}

