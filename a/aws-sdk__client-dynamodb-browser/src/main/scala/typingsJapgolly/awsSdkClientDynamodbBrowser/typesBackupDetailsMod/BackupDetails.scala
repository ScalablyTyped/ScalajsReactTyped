package typingsJapgolly.awsSdkClientDynamodbBrowser.typesBackupDetailsMod

import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.AVAILABLE
import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.CREATING
import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DELETED
import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.SYSTEM
import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.USER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupDetails extends js.Object {
  /**
    * <p>ARN associated with the backup.</p>
    */
  var BackupArn: String
  /**
    * <p>Time at which the backup was created. This is the request time of the backup. </p>
    */
  var BackupCreationDateTime: js.Date | String | Double
  /**
    * <p>Time at which the automatic on-demand backup created by DynamoDB will expire. This <code>SYSTEM</code> on-demand backup expires automatically 35 days after its creation.</p>
    */
  var BackupExpiryDateTime: js.UndefOr[js.Date | String | Double] = js.undefined
  /**
    * <p>Name of the requested backup.</p>
    */
  var BackupName: String
  /**
    * <p>Size of the backup in bytes.</p>
    */
  var BackupSizeBytes: js.UndefOr[Double] = js.undefined
  /**
    * <p>Backup can be in one of the following states: CREATING, ACTIVE, DELETED. </p>
    */
  var BackupStatus: CREATING | DELETED | AVAILABLE | String
  /**
    * <p>BackupType:</p> <ul> <li> <p> <code>USER</code> - On-demand backup created by you.</p> </li> <li> <p> <code>SYSTEM</code> - On-demand backup automatically created by DynamoDB.</p> </li> </ul>
    */
  var BackupType: USER | SYSTEM | String
}

object BackupDetails {
  @scala.inline
  def apply(
    BackupArn: String,
    BackupCreationDateTime: js.Date | String | Double,
    BackupName: String,
    BackupStatus: CREATING | DELETED | AVAILABLE | String,
    BackupType: USER | SYSTEM | String,
    BackupExpiryDateTime: js.Date | String | Double = null,
    BackupSizeBytes: Int | Double = null
  ): BackupDetails = {
    val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any], BackupCreationDateTime = BackupCreationDateTime.asInstanceOf[js.Any], BackupName = BackupName.asInstanceOf[js.Any], BackupStatus = BackupStatus.asInstanceOf[js.Any], BackupType = BackupType.asInstanceOf[js.Any])
    if (BackupExpiryDateTime != null) __obj.updateDynamic("BackupExpiryDateTime")(BackupExpiryDateTime.asInstanceOf[js.Any])
    if (BackupSizeBytes != null) __obj.updateDynamic("BackupSizeBytes")(BackupSizeBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupDetails]
  }
}

