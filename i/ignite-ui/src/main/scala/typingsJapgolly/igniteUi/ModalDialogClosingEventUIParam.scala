package typingsJapgolly.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalDialogClosingEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the modal dialog element. This is a jQuery object.
  	 */
  var modalDialogElement: js.UndefOr[String] = js.undefined
  /**
  	 * Gets access the GroupBy widget object.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ModalDialogClosingEventUIParam {
  @scala.inline
  def apply(modalDialogElement: String = null, owner: js.Any = null): ModalDialogClosingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (modalDialogElement != null) __obj.updateDynamic("modalDialogElement")(modalDialogElement.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalDialogClosingEventUIParam]
  }
}

