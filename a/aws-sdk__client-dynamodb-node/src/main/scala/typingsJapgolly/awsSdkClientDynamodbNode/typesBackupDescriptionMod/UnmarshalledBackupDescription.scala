package typingsJapgolly.awsSdkClientDynamodbNode.typesBackupDescriptionMod

import typingsJapgolly.awsSdkClientDynamodbNode.typesBackupDetailsMod.UnmarshalledBackupDetails
import typingsJapgolly.awsSdkClientDynamodbNode.typesSourceTableDetailsMod.UnmarshalledSourceTableDetails
import typingsJapgolly.awsSdkClientDynamodbNode.typesSourceTableFeatureDetailsMod.UnmarshalledSourceTableFeatureDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledBackupDescription extends BackupDescription {
  /**
    * <p>Contains the details of the backup created for the table. </p>
    */
  @JSName("BackupDetails")
  var BackupDetails_UnmarshalledBackupDescription: js.UndefOr[UnmarshalledBackupDetails] = js.undefined
  /**
    * <p>Contains the details of the table when the backup was created. </p>
    */
  @JSName("SourceTableDetails")
  var SourceTableDetails_UnmarshalledBackupDescription: js.UndefOr[UnmarshalledSourceTableDetails] = js.undefined
  /**
    * <p>Contains the details of the features enabled on the table when the backup was created. For example, LSIs, GSIs, streams, TTL.</p>
    */
  @JSName("SourceTableFeatureDetails")
  var SourceTableFeatureDetails_UnmarshalledBackupDescription: js.UndefOr[UnmarshalledSourceTableFeatureDetails] = js.undefined
}

object UnmarshalledBackupDescription {
  @scala.inline
  def apply(
    BackupDetails: UnmarshalledBackupDetails = null,
    SourceTableDetails: UnmarshalledSourceTableDetails = null,
    SourceTableFeatureDetails: UnmarshalledSourceTableFeatureDetails = null
  ): UnmarshalledBackupDescription = {
    val __obj = js.Dynamic.literal()
    if (BackupDetails != null) __obj.updateDynamic("BackupDetails")(BackupDetails.asInstanceOf[js.Any])
    if (SourceTableDetails != null) __obj.updateDynamic("SourceTableDetails")(SourceTableDetails.asInstanceOf[js.Any])
    if (SourceTableFeatureDetails != null) __obj.updateDynamic("SourceTableFeatureDetails")(SourceTableFeatureDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledBackupDescription]
  }
}

