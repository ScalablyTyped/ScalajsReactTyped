package typingsJapgolly.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgFocusEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the igDialog widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object IgFocusEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null): IgFocusEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgFocusEventUIParam]
  }
}

