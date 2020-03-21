package typingsJapgolly.reactVisibilitySensor.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[Element | ChildFunction] = js.undefined
  var containment: js.UndefOr[HTMLElement] = js.undefined
  var delayedCall: js.UndefOr[Boolean] = js.undefined
  var intervalCheck: js.UndefOr[Boolean] = js.undefined
  var intervalDelay: js.UndefOr[Double] = js.undefined
  var minTopValue: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Shape] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* isVisible */ Boolean, Unit]] = js.undefined
  var partialVisibility: js.UndefOr[Boolean] = js.undefined
  var resizeCheck: js.UndefOr[Boolean] = js.undefined
  var resizeDelay: js.UndefOr[Double] = js.undefined
  var resizeThrottle: js.UndefOr[Double] = js.undefined
  var scrollCheck: js.UndefOr[Boolean] = js.undefined
  var scrollDelay: js.UndefOr[Double] = js.undefined
  var scrollThrottle: js.UndefOr[Double] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    children: Element | ChildFunction = null,
    containment: HTMLElement = null,
    delayedCall: js.UndefOr[Boolean] = js.undefined,
    intervalCheck: js.UndefOr[Boolean] = js.undefined,
    intervalDelay: Int | Double = null,
    minTopValue: Int | Double = null,
    offset: Shape = null,
    onChange: /* isVisible */ Boolean => Callback = null,
    partialVisibility: js.UndefOr[Boolean] = js.undefined,
    resizeCheck: js.UndefOr[Boolean] = js.undefined,
    resizeDelay: Int | Double = null,
    resizeThrottle: Int | Double = null,
    scrollCheck: js.UndefOr[Boolean] = js.undefined,
    scrollDelay: Int | Double = null,
    scrollThrottle: Int | Double = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (containment != null) __obj.updateDynamic("containment")(containment.asInstanceOf[js.Any])
    if (!js.isUndefined(delayedCall)) __obj.updateDynamic("delayedCall")(delayedCall.asInstanceOf[js.Any])
    if (!js.isUndefined(intervalCheck)) __obj.updateDynamic("intervalCheck")(intervalCheck.asInstanceOf[js.Any])
    if (intervalDelay != null) __obj.updateDynamic("intervalDelay")(intervalDelay.asInstanceOf[js.Any])
    if (minTopValue != null) __obj.updateDynamic("minTopValue")(minTopValue.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* isVisible */ scala.Boolean) => onChange(t0).runNow()))
    if (!js.isUndefined(partialVisibility)) __obj.updateDynamic("partialVisibility")(partialVisibility.asInstanceOf[js.Any])
    if (!js.isUndefined(resizeCheck)) __obj.updateDynamic("resizeCheck")(resizeCheck.asInstanceOf[js.Any])
    if (resizeDelay != null) __obj.updateDynamic("resizeDelay")(resizeDelay.asInstanceOf[js.Any])
    if (resizeThrottle != null) __obj.updateDynamic("resizeThrottle")(resizeThrottle.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollCheck)) __obj.updateDynamic("scrollCheck")(scrollCheck.asInstanceOf[js.Any])
    if (scrollDelay != null) __obj.updateDynamic("scrollDelay")(scrollDelay.asInstanceOf[js.Any])
    if (scrollThrottle != null) __obj.updateDynamic("scrollThrottle")(scrollThrottle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

