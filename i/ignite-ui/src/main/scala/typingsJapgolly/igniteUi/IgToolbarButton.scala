package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgToolbarButton
  extends /**
	 * Option for igToolbarButton
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Event fired after the toolbar button is activated.
  	 *                 Function takes arguments evt and ui.
  	 *                 Use ui.owner to get reference to this igToolbarButton.
  	 */
  var activated: js.UndefOr[ActivatedEvent] = js.undefined
  /**
  	 * Event fired before the toolbar button is activated.
  	 *                 Function takes arguments evt and ui.
  	 *                 Use ui.owner to get reference to this igToolbarButton.
  	 */
  var activating: js.UndefOr[ActivatingEvent] = js.undefined
  /**
  	 * Enable/Disable the "Toggling" of a button.
  	 *
  	 */
  var allowToggling: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Event fired after the toolbar button is deactivated.
  	 *                 Function takes arguments evt and ui.
  	 *                 Use ui.owner to get reference to this igToolbarButton.
  	 */
  var deactivated: js.UndefOr[DeactivatedEvent] = js.undefined
  /**
  	 * Event fired before the toolbar button is deactivated.
  	 *                 Function takes arguments evt and ui.
  	 *                 Use ui.owner to get reference to this igToolbarButton.
  	 */
  var deactivating: js.UndefOr[DeactivatingEvent] = js.undefined
  /**
  	 * Get/Set whether the toolbar button is selected.
  	 *
  	 */
  var isSelected: js.UndefOr[Boolean] = js.undefined
}

object IgToolbarButton {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igToolbarButton
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    activated: (/* event */ Event_, /* ui */ ActivatedEventUIParam) => Callback = null,
    activating: (/* event */ Event_, /* ui */ ActivatingEventUIParam) => Callback = null,
    allowToggling: js.UndefOr[Boolean] = js.undefined,
    deactivated: (/* event */ Event_, /* ui */ DeactivatedEventUIParam) => Callback = null,
    deactivating: (/* event */ Event_, /* ui */ DeactivatingEventUIParam) => Callback = null,
    isSelected: js.UndefOr[Boolean] = js.undefined
  ): IgToolbarButton = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (activated != null) __obj.updateDynamic("activated")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ActivatedEventUIParam) => activated(t0, t1).runNow()))
    if (activating != null) __obj.updateDynamic("activating")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ActivatingEventUIParam) => activating(t0, t1).runNow()))
    if (!js.isUndefined(allowToggling)) __obj.updateDynamic("allowToggling")(allowToggling.asInstanceOf[js.Any])
    if (deactivated != null) __obj.updateDynamic("deactivated")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.DeactivatedEventUIParam) => deactivated(t0, t1).runNow()))
    if (deactivating != null) __obj.updateDynamic("deactivating")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.DeactivatingEventUIParam) => deactivating(t0, t1).runNow()))
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgToolbarButton]
  }
}

