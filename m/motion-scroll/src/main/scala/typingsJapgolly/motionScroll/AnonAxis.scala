package typingsJapgolly.motionScroll

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.motionScroll.motionScrollStrings.x
import typingsJapgolly.motionScroll.motionScrollStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAxis extends js.Object {
  var axis: js.UndefOr[x | y] = js.undefined
  var callBack: js.UndefOr[js.Function0[Unit]] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[js.Function0[Unit]] = js.undefined
  var element: js.UndefOr[HTMLElement] = js.undefined
  var force: js.UndefOr[Boolean] = js.undefined
  var maxScrollTime: js.UndefOr[Double] = js.undefined
  var minScrollTime: js.UndefOr[Double] = js.undefined
  var scrollTo: js.UndefOr[Double] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
}

object AnonAxis {
  @scala.inline
  def apply(
    axis: x | y = null,
    callBack: js.UndefOr[Callback] = js.undefined,
    delay: Int | Double = null,
    easing: js.UndefOr[Callback] = js.undefined,
    element: HTMLElement = null,
    force: js.UndefOr[Boolean] = js.undefined,
    maxScrollTime: Int | Double = null,
    minScrollTime: Int | Double = null,
    scrollTo: Int | Double = null,
    speed: Int | Double = null
  ): AnonAxis = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    callBack.foreach(p => __obj.updateDynamic("callBack")(p.toJsFn))
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    easing.foreach(p => __obj.updateDynamic("easing")(p.toJsFn))
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (maxScrollTime != null) __obj.updateDynamic("maxScrollTime")(maxScrollTime.asInstanceOf[js.Any])
    if (minScrollTime != null) __obj.updateDynamic("minScrollTime")(minScrollTime.asInstanceOf[js.Any])
    if (scrollTo != null) __obj.updateDynamic("scrollTo")(scrollTo.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAxis]
  }
}

