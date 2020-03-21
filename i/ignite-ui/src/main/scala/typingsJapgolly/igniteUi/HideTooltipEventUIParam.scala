package typingsJapgolly.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HideTooltipEventUIParam extends js.Object {
  /**
  	 * Used to obtain reference to jquery object which represents tooltip or value of ui.element from last updateTooltip event. Value of that member can be replaced by custom element.
  	 */
  var element: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to obtain reference to item.
  	 */
  var item: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to obtain reference to chart widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object HideTooltipEventUIParam {
  @scala.inline
  def apply(element: js.Any = null, item: js.Any = null, owner: js.Any = null): HideTooltipEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[HideTooltipEventUIParam]
  }
}

