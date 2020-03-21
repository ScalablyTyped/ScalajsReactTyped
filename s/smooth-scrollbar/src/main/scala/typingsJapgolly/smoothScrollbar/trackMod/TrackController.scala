package typingsJapgolly.smoothScrollbar.trackMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackController extends js.Object {
  val xAxis: ScrollbarTrack
  val yAxis: ScrollbarTrack
  def autoHideOnIdle(): Unit
  def update(): Unit
}

object TrackController {
  @scala.inline
  def apply(autoHideOnIdle: Callback, update: Callback, xAxis: ScrollbarTrack, yAxis: ScrollbarTrack): TrackController = {
    val __obj = js.Dynamic.literal(xAxis = xAxis.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any])
    __obj.updateDynamic("autoHideOnIdle")(autoHideOnIdle.toJsFn)
    __obj.updateDynamic("update")(update.toJsFn)
    __obj.asInstanceOf[TrackController]
  }
}

