package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressBarOptions extends js.Object {
  var animation: js.UndefOr[Boolean | ProgressBarAnimation] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ ProgressBarChangeEvent, Unit]] = js.undefined
  var chunkCount: js.UndefOr[Double] = js.undefined
  var complete: js.UndefOr[js.Function1[/* e */ ProgressBarCompleteEvent, Unit]] = js.undefined
  var enable: js.UndefOr[Boolean] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var showStatus: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object ProgressBarOptions {
  @scala.inline
  def apply(
    animation: Boolean | ProgressBarAnimation = null,
    change: /* e */ ProgressBarChangeEvent => Callback = null,
    chunkCount: Int | Double = null,
    complete: /* e */ ProgressBarCompleteEvent => Callback = null,
    enable: js.UndefOr[Boolean] = js.undefined,
    max: Int | Double = null,
    min: Int | Double = null,
    name: String = null,
    orientation: String = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    showStatus: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    value: Int | Double = null
  ): ProgressBarOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ProgressBarChangeEvent) => change(t0).runNow()))
    if (chunkCount != null) __obj.updateDynamic("chunkCount")(chunkCount.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ProgressBarCompleteEvent) => complete(t0).runNow()))
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (!js.isUndefined(showStatus)) __obj.updateDynamic("showStatus")(showStatus.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarOptions]
  }
}

