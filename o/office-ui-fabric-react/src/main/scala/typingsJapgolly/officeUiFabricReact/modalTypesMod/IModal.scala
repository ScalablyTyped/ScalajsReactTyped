package typingsJapgolly.officeUiFabricReact.modalTypesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModal extends js.Object {
  /**
    * Sets focus on the first focusable, or configured, child in focus trap zone
    */
  def focus(): Unit
}

object IModal {
  @scala.inline
  def apply(focus: Callback): IModal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("focus")(focus.toJsFn)
    __obj.asInstanceOf[IModal]
  }
}

