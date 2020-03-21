package typingsJapgolly.reactTouch.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoldableProps extends js.Object {
  /** @see defineHold */
  var config: js.UndefOr[HoldableConfig] = js.undefined
  var onHoldComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onHoldProgress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onMouseDown: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onTouchStart: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object HoldableProps {
  @scala.inline
  def apply(
    config: HoldableConfig = null,
    onHoldComplete: js.UndefOr[Callback] = js.undefined,
    onHoldProgress: js.UndefOr[Callback] = js.undefined,
    onMouseDown: js.UndefOr[Callback] = js.undefined,
    onTouchStart: js.UndefOr[Callback] = js.undefined
  ): HoldableProps = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    onHoldComplete.foreach(p => __obj.updateDynamic("onHoldComplete")(p.toJsFn))
    onHoldProgress.foreach(p => __obj.updateDynamic("onHoldProgress")(p.toJsFn))
    onMouseDown.foreach(p => __obj.updateDynamic("onMouseDown")(p.toJsFn))
    onTouchStart.foreach(p => __obj.updateDynamic("onTouchStart")(p.toJsFn))
    __obj.asInstanceOf[HoldableProps]
  }
}

