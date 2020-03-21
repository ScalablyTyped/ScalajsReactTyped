package typingsJapgolly.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBackupOutput extends js.Object {
  /**
    * Contains the description of the backup created for the table.
    */
  var BackupDescription: js.UndefOr[typingsJapgolly.awsSdk.dynamodbMod.BackupDescription] = js.native
}

object DeleteBackupOutput {
  @scala.inline
  def apply(BackupDescription: BackupDescription = null): DeleteBackupOutput = {
    val __obj = js.Dynamic.literal()
    if (BackupDescription != null) __obj.updateDynamic("BackupDescription")(BackupDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBackupOutput]
  }
}

