package typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeOsDeviceDiskVolumeReports extends js.Object {
  var volumeInfo: js.UndefOr[js.Array[ChromeOsDeviceDiskVolumeReportsVolumeInfo]] = js.undefined
}

object ChromeOsDeviceDiskVolumeReports {
  @scala.inline
  def apply(volumeInfo: js.Array[ChromeOsDeviceDiskVolumeReportsVolumeInfo] = null): ChromeOsDeviceDiskVolumeReports = {
    val __obj = js.Dynamic.literal()
    if (volumeInfo != null) __obj.updateDynamic("volumeInfo")(volumeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChromeOsDeviceDiskVolumeReports]
  }
}

