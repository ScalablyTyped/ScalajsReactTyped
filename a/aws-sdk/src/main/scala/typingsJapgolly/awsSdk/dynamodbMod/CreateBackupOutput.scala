package typingsJapgolly.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBackupOutput extends js.Object {
  /**
    * Contains the details of the backup created for the table.
    */
  var BackupDetails: js.UndefOr[typingsJapgolly.awsSdk.dynamodbMod.BackupDetails] = js.native
}

object CreateBackupOutput {
  @scala.inline
  def apply(BackupDetails: BackupDetails = null): CreateBackupOutput = {
    val __obj = js.Dynamic.literal()
    if (BackupDetails != null) __obj.updateDynamic("BackupDetails")(BackupDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackupOutput]
  }
}

