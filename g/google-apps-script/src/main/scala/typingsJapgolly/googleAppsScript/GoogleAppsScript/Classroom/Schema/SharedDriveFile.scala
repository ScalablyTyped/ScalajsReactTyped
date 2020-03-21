package typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedDriveFile extends js.Object {
  var driveFile: js.UndefOr[DriveFile] = js.undefined
  var shareMode: js.UndefOr[String] = js.undefined
}

object SharedDriveFile {
  @scala.inline
  def apply(driveFile: DriveFile = null, shareMode: String = null): SharedDriveFile = {
    val __obj = js.Dynamic.literal()
    if (driveFile != null) __obj.updateDynamic("driveFile")(driveFile.asInstanceOf[js.Any])
    if (shareMode != null) __obj.updateDynamic("shareMode")(shareMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedDriveFile]
  }
}

