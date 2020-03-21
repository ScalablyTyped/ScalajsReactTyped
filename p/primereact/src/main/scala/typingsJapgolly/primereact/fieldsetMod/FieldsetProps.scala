package typingsJapgolly.primereact.fieldsetMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.primereact.AnonEvent
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldsetProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var legend: js.UndefOr[js.Any] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onCollapse: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onExpand: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onToggle: js.UndefOr[js.Function1[/* e */ AnonEvent, Unit]] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var toggleable: js.UndefOr[Boolean] = js.undefined
}

object FieldsetProps {
  @scala.inline
  def apply(
    className: String = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    legend: js.Any = null,
    onClick: /* event */ Event_ => Callback = null,
    onCollapse: /* event */ Event_ => Callback = null,
    onExpand: /* event */ Event_ => Callback = null,
    onToggle: /* e */ AnonEvent => Callback = null,
    style: js.Object = null,
    toggleable: js.UndefOr[Boolean] = js.undefined
  ): FieldsetProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onClick(t0).runNow()))
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onCollapse(t0).runNow()))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onExpand(t0).runNow()))
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonEvent) => onToggle(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(toggleable)) __obj.updateDynamic("toggleable")(toggleable.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldsetProps]
  }
}

