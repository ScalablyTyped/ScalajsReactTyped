package typingsJapgolly.vanillaSwipe.typesMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.std.Event_
import typingsJapgolly.vanillaSwipe.vanillaSwipeNumbers.`0`
import typingsJapgolly.vanillaSwipe.vanillaSwipeNumbers.`10`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorProps extends js.Object {
  var delta: js.UndefOr[Double | `10`] = js.undefined
  var element: js.UndefOr[HTMLElement | Null] = js.undefined
  var mouseTrackingEnabled: js.UndefOr[Boolean] = js.undefined
  var onSwiped: js.UndefOr[EventHandler] = js.undefined
  var onSwiping: js.UndefOr[EventHandler] = js.undefined
  var onTap: js.UndefOr[js.Function1[/* e */ Event_, Unit]] = js.undefined
  var preventDefaultTouchmoveEvent: js.UndefOr[Boolean] = js.undefined
  var rotationAngle: js.UndefOr[Double | `0`] = js.undefined
  var touchTrackingEnabled: js.UndefOr[Boolean] = js.undefined
}

object ConstructorProps {
  @scala.inline
  def apply(
    delta: Double | `10` = null,
    element: HTMLElement = null,
    mouseTrackingEnabled: js.UndefOr[Boolean] = js.undefined,
    onSwiped: (/* e */ Event_, /* deltaX */ Double, /* deltaY */ Double, /* absX */ Double, /* absY */ Double, /* duration */ Double) => Callback = null,
    onSwiping: (/* e */ Event_, /* deltaX */ Double, /* deltaY */ Double, /* absX */ Double, /* absY */ Double, /* duration */ Double) => Callback = null,
    onTap: /* e */ Event_ => Callback = null,
    preventDefaultTouchmoveEvent: js.UndefOr[Boolean] = js.undefined,
    rotationAngle: Double | `0` = null,
    touchTrackingEnabled: js.UndefOr[Boolean] = js.undefined
  ): ConstructorProps = {
    val __obj = js.Dynamic.literal()
    if (delta != null) __obj.updateDynamic("delta")(delta.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseTrackingEnabled)) __obj.updateDynamic("mouseTrackingEnabled")(mouseTrackingEnabled.asInstanceOf[js.Any])
    if (onSwiped != null) __obj.updateDynamic("onSwiped")(js.Any.fromFunction6((t0: /* e */ typingsJapgolly.std.Event_, t1: /* deltaX */ scala.Double, t2: /* deltaY */ scala.Double, t3: /* absX */ scala.Double, t4: /* absY */ scala.Double, t5: /* duration */ scala.Double) => onSwiped(t0, t1, t2, t3, t4, t5).runNow()))
    if (onSwiping != null) __obj.updateDynamic("onSwiping")(js.Any.fromFunction6((t0: /* e */ typingsJapgolly.std.Event_, t1: /* deltaX */ scala.Double, t2: /* deltaY */ scala.Double, t3: /* absX */ scala.Double, t4: /* absY */ scala.Double, t5: /* duration */ scala.Double) => onSwiping(t0, t1, t2, t3, t4, t5).runNow()))
    if (onTap != null) __obj.updateDynamic("onTap")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => onTap(t0).runNow()))
    if (!js.isUndefined(preventDefaultTouchmoveEvent)) __obj.updateDynamic("preventDefaultTouchmoveEvent")(preventDefaultTouchmoveEvent.asInstanceOf[js.Any])
    if (rotationAngle != null) __obj.updateDynamic("rotationAngle")(rotationAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(touchTrackingEnabled)) __obj.updateDynamic("touchTrackingEnabled")(touchTrackingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorProps]
  }
}

