package typingsJapgolly.awsSdkClientDynamodbNode.typesBackupDetailsMod

import typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.AVAILABLE
import typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.CREATING
import typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.DELETED
import typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.SYSTEM
import typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.USER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledBackupDetails extends BackupDetails {
  /**
    * <p>Time at which the backup was created. This is the request time of the backup. </p>
    */
  @JSName("BackupCreationDateTime")
  var BackupCreationDateTime_UnmarshalledBackupDetails: js.Date
  /**
    * <p>Time at which the automatic on-demand backup created by DynamoDB will expire. This <code>SYSTEM</code> on-demand backup expires automatically 35 days after its creation.</p>
    */
  @JSName("BackupExpiryDateTime")
  var BackupExpiryDateTime_UnmarshalledBackupDetails: js.UndefOr[js.Date] = js.undefined
}

object UnmarshalledBackupDetails {
  @scala.inline
  def apply(
    BackupArn: String,
    BackupCreationDateTime: js.Date,
    BackupName: String,
    BackupStatus: CREATING | DELETED | AVAILABLE | String,
    BackupType: USER | SYSTEM | String,
    BackupExpiryDateTime: js.Date = null,
    BackupSizeBytes: Int | Double = null
  ): UnmarshalledBackupDetails = {
    val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any], BackupCreationDateTime = BackupCreationDateTime.asInstanceOf[js.Any], BackupName = BackupName.asInstanceOf[js.Any], BackupStatus = BackupStatus.asInstanceOf[js.Any], BackupType = BackupType.asInstanceOf[js.Any])
    if (BackupExpiryDateTime != null) __obj.updateDynamic("BackupExpiryDateTime")(BackupExpiryDateTime.asInstanceOf[js.Any])
    if (BackupSizeBytes != null) __obj.updateDynamic("BackupSizeBytes")(BackupSizeBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledBackupDetails]
  }
}

