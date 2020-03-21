package typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeOsDeviceDiskVolumeReportsVolumeInfo extends js.Object {
  var storageFree: js.UndefOr[String] = js.undefined
  var storageTotal: js.UndefOr[String] = js.undefined
  var volumeId: js.UndefOr[String] = js.undefined
}

object ChromeOsDeviceDiskVolumeReportsVolumeInfo {
  @scala.inline
  def apply(storageFree: String = null, storageTotal: String = null, volumeId: String = null): ChromeOsDeviceDiskVolumeReportsVolumeInfo = {
    val __obj = js.Dynamic.literal()
    if (storageFree != null) __obj.updateDynamic("storageFree")(storageFree.asInstanceOf[js.Any])
    if (storageTotal != null) __obj.updateDynamic("storageTotal")(storageTotal.asInstanceOf[js.Any])
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChromeOsDeviceDiskVolumeReportsVolumeInfo]
  }
}

