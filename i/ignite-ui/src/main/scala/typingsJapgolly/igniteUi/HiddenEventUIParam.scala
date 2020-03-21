package typingsJapgolly.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HiddenEventUIParam extends js.Object {
  /**
  	 * Gets the content displayed in the popover as a string.
  	 */
  var content: js.UndefOr[String] = js.undefined
  /**
  	 * Gets the element the popover is hidden for.
  	 */
  var element: js.UndefOr[String] = js.undefined
  /**
  	 * Gets reference to the %%WidgetName%% widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the popover element hidden.
  	 */
  var popover: js.UndefOr[String] = js.undefined
}

object HiddenEventUIParam {
  @scala.inline
  def apply(content: String = null, element: String = null, owner: js.Any = null, popover: String = null): HiddenEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (popover != null) __obj.updateDynamic("popover")(popover.asInstanceOf[js.Any])
    __obj.asInstanceOf[HiddenEventUIParam]
  }
}

