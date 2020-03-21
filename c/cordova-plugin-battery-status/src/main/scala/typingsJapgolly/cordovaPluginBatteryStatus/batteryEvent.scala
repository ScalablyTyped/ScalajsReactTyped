package typingsJapgolly.cordovaPluginBatteryStatus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cordovaPluginBatteryStatus.cordovaPluginBatteryStatusStrings.batterystatus
  - typingsJapgolly.cordovaPluginBatteryStatus.cordovaPluginBatteryStatusStrings.batterycritical
  - typingsJapgolly.cordovaPluginBatteryStatus.cordovaPluginBatteryStatusStrings.batterylow
*/
trait batteryEvent extends js.Object

object batteryEvent {
  @scala.inline
  def batterycritical: typingsJapgolly.cordovaPluginBatteryStatus.cordovaPluginBatteryStatusStrings.batterycritical = this.cast("batterycritical")
  @scala.inline
  def batterylow: typingsJapgolly.cordovaPluginBatteryStatus.cordovaPluginBatteryStatusStrings.batterylow = this.cast("batterylow")
  @scala.inline
  def batterystatus: typingsJapgolly.cordovaPluginBatteryStatus.cordovaPluginBatteryStatusStrings.batterystatus = this.cast("batterystatus")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

