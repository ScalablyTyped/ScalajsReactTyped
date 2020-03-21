package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceConfigurationDeviceOverview extends Entity {
  // Version of the policy for that overview
  var configurationVersion: js.UndefOr[Double] = js.undefined
  // Number of error devices
  var errorCount: js.UndefOr[Double] = js.undefined
  // Number of failed devices
  var failedCount: js.UndefOr[Double] = js.undefined
  // Last update time
  var lastUpdateDateTime: js.UndefOr[String] = js.undefined
  // Number of not applicable devices
  var notApplicableCount: js.UndefOr[Double] = js.undefined
  // Number of pending devices
  var pendingCount: js.UndefOr[Double] = js.undefined
  // Number of succeeded devices
  var successCount: js.UndefOr[Double] = js.undefined
}

object DeviceConfigurationDeviceOverview {
  @scala.inline
  def apply(
    configurationVersion: Int | Double = null,
    errorCount: Int | Double = null,
    failedCount: Int | Double = null,
    id: String = null,
    lastUpdateDateTime: String = null,
    notApplicableCount: Int | Double = null,
    pendingCount: Int | Double = null,
    successCount: Int | Double = null
  ): DeviceConfigurationDeviceOverview = {
    val __obj = js.Dynamic.literal()
    if (configurationVersion != null) __obj.updateDynamic("configurationVersion")(configurationVersion.asInstanceOf[js.Any])
    if (errorCount != null) __obj.updateDynamic("errorCount")(errorCount.asInstanceOf[js.Any])
    if (failedCount != null) __obj.updateDynamic("failedCount")(failedCount.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastUpdateDateTime != null) __obj.updateDynamic("lastUpdateDateTime")(lastUpdateDateTime.asInstanceOf[js.Any])
    if (notApplicableCount != null) __obj.updateDynamic("notApplicableCount")(notApplicableCount.asInstanceOf[js.Any])
    if (pendingCount != null) __obj.updateDynamic("pendingCount")(pendingCount.asInstanceOf[js.Any])
    if (successCount != null) __obj.updateDynamic("successCount")(successCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceConfigurationDeviceOverview]
  }
}

