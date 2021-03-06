package typingsJapgolly.extjs.Ext.button

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISplit extends IButton {
  /** [Config Option] (Function) */
  var arrowHandler: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var arrowTooltip: js.UndefOr[String] = js.undefined
  /** [Method] Sets this button s arrow click handler
  		* @param handler Function The function to call when the arrow is clicked.
  		* @param scope Object Scope for the function passed above.
  		*/
  var setArrowHandler: js.UndefOr[
    js.Function2[/* handler */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
}

object ISplit {
  @scala.inline
  def apply(
    IButton: IButton = null,
    arrowHandler: js.Any = null,
    arrowTooltip: String = null,
    setArrowHandler: (/* handler */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null
  ): ISplit = {
    val __obj = js.Dynamic.literal()
    if (IButton != null) js.Dynamic.global.Object.assign(__obj, IButton)
    if (arrowHandler != null) __obj.updateDynamic("arrowHandler")(arrowHandler.asInstanceOf[js.Any])
    if (arrowTooltip != null) __obj.updateDynamic("arrowTooltip")(arrowTooltip.asInstanceOf[js.Any])
    if (setArrowHandler != null) __obj.updateDynamic("setArrowHandler")(js.Any.fromFunction2((t0: /* handler */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => setArrowHandler(t0, t1).runNow()))
    __obj.asInstanceOf[ISplit]
  }
}

