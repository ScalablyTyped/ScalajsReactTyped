package typingsJapgolly.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MovingDialogClosingEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the ColumnMoving widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object MovingDialogClosingEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null): MovingDialogClosingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[MovingDialogClosingEventUIParam]
  }
}

