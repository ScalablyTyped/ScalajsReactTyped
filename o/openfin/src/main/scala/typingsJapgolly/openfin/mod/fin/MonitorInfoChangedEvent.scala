package typingsJapgolly.openfin.mod.fin

import typingsJapgolly.openfin.monitorMod.DipRect
import typingsJapgolly.openfin.monitorMod.MonitorDetails
import typingsJapgolly.openfin.monitorMod.TaskBar
import typingsJapgolly.openfin.openfinStrings.`monitor-info-changed`
import typingsJapgolly.openfin.openfinStrings.system
import typingsJapgolly.openfin.pointMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonitorInfoChangedEvent
  extends typingsJapgolly.openfin.monitorMod.MonitorInfo {
  var topic: system
  var `type`: `monitor-info-changed`
}

object MonitorInfoChangedEvent {
  @scala.inline
  def apply(
    deviceScaleFactor: Double,
    dpi: Point,
    nonPrimaryMonitors: js.Array[MonitorDetails],
    primaryMonitor: MonitorDetails,
    reason: String,
    taskBar: TaskBar,
    topic: system,
    `type`: `monitor-info-changed`,
    virtualScreen: DipRect
  ): MonitorInfoChangedEvent = {
    val __obj = js.Dynamic.literal(deviceScaleFactor = deviceScaleFactor.asInstanceOf[js.Any], dpi = dpi.asInstanceOf[js.Any], nonPrimaryMonitors = nonPrimaryMonitors.asInstanceOf[js.Any], primaryMonitor = primaryMonitor.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], taskBar = taskBar.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], virtualScreen = virtualScreen.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitorInfoChangedEvent]
  }
}

