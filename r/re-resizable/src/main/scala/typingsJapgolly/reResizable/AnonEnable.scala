package typingsJapgolly.reResizable

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnable extends js.Object {
  var enable: AnonBottom
  var grid: js.Array[Double]
  var lockAspectRatio: Boolean
  var lockAspectRatioExtraHeight: Double
  var lockAspectRatioExtraWidth: Double
  var resizeRatio: Double
  var scale: Double
  var snapGap: Double
  def onResize(): Unit
  def onResizeStart(): Unit
  def onResizeStop(): Unit
}

object AnonEnable {
  @scala.inline
  def apply(
    enable: AnonBottom,
    grid: js.Array[Double],
    lockAspectRatio: Boolean,
    lockAspectRatioExtraHeight: Double,
    lockAspectRatioExtraWidth: Double,
    onResize: Callback,
    onResizeStart: Callback,
    onResizeStop: Callback,
    resizeRatio: Double,
    scale: Double,
    snapGap: Double
  ): AnonEnable = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], lockAspectRatio = lockAspectRatio.asInstanceOf[js.Any], lockAspectRatioExtraHeight = lockAspectRatioExtraHeight.asInstanceOf[js.Any], lockAspectRatioExtraWidth = lockAspectRatioExtraWidth.asInstanceOf[js.Any], resizeRatio = resizeRatio.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], snapGap = snapGap.asInstanceOf[js.Any])
    __obj.updateDynamic("onResize")(onResize.toJsFn)
    __obj.updateDynamic("onResizeStart")(onResizeStart.toJsFn)
    __obj.updateDynamic("onResizeStop")(onResizeStop.toJsFn)
    __obj.asInstanceOf[AnonEnable]
  }
}

