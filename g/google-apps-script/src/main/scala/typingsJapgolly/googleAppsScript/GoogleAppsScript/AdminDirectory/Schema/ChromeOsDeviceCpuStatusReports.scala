package typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeOsDeviceCpuStatusReports extends js.Object {
  var cpuTemperatureInfo: js.UndefOr[js.Array[ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo]] = js.undefined
  var cpuUtilizationPercentageInfo: js.UndefOr[js.Array[Double]] = js.undefined
  var reportTime: js.UndefOr[String] = js.undefined
}

object ChromeOsDeviceCpuStatusReports {
  @scala.inline
  def apply(
    cpuTemperatureInfo: js.Array[ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo] = null,
    cpuUtilizationPercentageInfo: js.Array[Double] = null,
    reportTime: String = null
  ): ChromeOsDeviceCpuStatusReports = {
    val __obj = js.Dynamic.literal()
    if (cpuTemperatureInfo != null) __obj.updateDynamic("cpuTemperatureInfo")(cpuTemperatureInfo.asInstanceOf[js.Any])
    if (cpuUtilizationPercentageInfo != null) __obj.updateDynamic("cpuUtilizationPercentageInfo")(cpuUtilizationPercentageInfo.asInstanceOf[js.Any])
    if (reportTime != null) __obj.updateDynamic("reportTime")(reportTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChromeOsDeviceCpuStatusReports]
  }
}

