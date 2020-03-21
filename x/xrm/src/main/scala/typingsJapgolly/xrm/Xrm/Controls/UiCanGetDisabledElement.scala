package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for UI elements which can have the disabled value read.
  */
trait UiCanGetDisabledElement extends js.Object {
  /**
    * Gets a boolean value, indicating whether the control is disabled.
    * @returns true if it is disabled, otherwise false.
    */
  def getDisabled(): Boolean
}

object UiCanGetDisabledElement {
  @scala.inline
  def apply(getDisabled: CallbackTo[Boolean]): UiCanGetDisabledElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDisabled")(getDisabled.toJsFn)
    __obj.asInstanceOf[UiCanGetDisabledElement]
  }
}

