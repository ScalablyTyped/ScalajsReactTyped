package typingsJapgolly.selectables.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var elements: js.UndefOr[String] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[String | Boolean] = js.undefined
  var moreUsing: js.UndefOr[String] = js.undefined
  var onDeselect: js.UndefOr[js.Function1[/* el */ Element, Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* el */ Element, Unit]] = js.undefined
  var selectedClass: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[js.Function1[/* e */ Event_, Unit]] = js.undefined
  var stop: js.UndefOr[js.Function1[/* e */ Event_, Unit]] = js.undefined
  var zone: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    elements: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    key: String | Boolean = null,
    moreUsing: String = null,
    onDeselect: /* el */ Element => Callback = null,
    onSelect: /* el */ Element => Callback = null,
    selectedClass: String = null,
    start: /* e */ Event_ => Callback = null,
    stop: /* e */ Event_ => Callback = null,
    zone: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (elements != null) __obj.updateDynamic("elements")(elements.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (moreUsing != null) __obj.updateDynamic("moreUsing")(moreUsing.asInstanceOf[js.Any])
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(js.Any.fromFunction1((t0: /* el */ org.scalajs.dom.raw.Element) => onDeselect(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: /* el */ org.scalajs.dom.raw.Element) => onSelect(t0).runNow()))
    if (selectedClass != null) __obj.updateDynamic("selectedClass")(selectedClass.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => start(t0).runNow()))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => stop(t0).runNow()))
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

