package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridMultiColumnHeaders
  extends /**
	 * Option for igGridMultiColumnHeaders
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Event fired after the group collapsing has been executed and results are rendered.
  	 */
  var groupCollapsed: js.UndefOr[GroupCollapsedEvent] = js.undefined
  /**
  	 * Event fired before a group collapsing operation is executed.
  	 */
  var groupCollapsing: js.UndefOr[GroupCollapsingEvent] = js.undefined
  /**
  	 * Event fired after the group expanding has been executed and results are rendered.
  	 */
  var groupExpanded: js.UndefOr[GroupExpandedEvent] = js.undefined
  /**
  	 * Event fired before a group expanding operation is executed.
  	 */
  var groupExpanding: js.UndefOr[GroupExpandingEvent] = js.undefined
  /**
  	 * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
  	 */
  var inherit: js.UndefOr[Boolean] = js.undefined
}

object IgGridMultiColumnHeaders {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igGridMultiColumnHeaders
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    groupCollapsed: (/* event */ Event_, /* ui */ GroupCollapsedEventUIParam) => Callback = null,
    groupCollapsing: (/* event */ Event_, /* ui */ GroupCollapsingEventUIParam) => Callback = null,
    groupExpanded: (/* event */ Event_, /* ui */ GroupExpandedEventUIParam) => Callback = null,
    groupExpanding: (/* event */ Event_, /* ui */ GroupExpandingEventUIParam) => Callback = null,
    inherit: js.UndefOr[Boolean] = js.undefined
  ): IgGridMultiColumnHeaders = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (groupCollapsed != null) __obj.updateDynamic("groupCollapsed")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.GroupCollapsedEventUIParam) => groupCollapsed(t0, t1).runNow()))
    if (groupCollapsing != null) __obj.updateDynamic("groupCollapsing")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.GroupCollapsingEventUIParam) => groupCollapsing(t0, t1).runNow()))
    if (groupExpanded != null) __obj.updateDynamic("groupExpanded")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.GroupExpandedEventUIParam) => groupExpanded(t0, t1).runNow()))
    if (groupExpanding != null) __obj.updateDynamic("groupExpanding")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.GroupExpandingEventUIParam) => groupExpanding(t0, t1).runNow()))
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridMultiColumnHeaders]
  }
}

