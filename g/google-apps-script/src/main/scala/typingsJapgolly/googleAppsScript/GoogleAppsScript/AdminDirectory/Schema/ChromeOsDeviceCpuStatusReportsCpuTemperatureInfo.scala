package typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo extends js.Object {
  var label: js.UndefOr[String] = js.undefined
  var temperature: js.UndefOr[Double] = js.undefined
}

object ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo {
  @scala.inline
  def apply(label: String = null, temperature: Int | Double = null): ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (temperature != null) __obj.updateDynamic("temperature")(temperature.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo]
  }
}

