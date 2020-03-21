package typingsJapgolly.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSource extends js.Object {
  /**
    *  The parameter is true if statistics need to be generated from the observation data. 
    */
  var ComputeStatistics: js.UndefOr[typingsJapgolly.awsSdk.machinelearningMod.ComputeStatistics] = js.native
  var ComputeTime: js.UndefOr[LongType] = js.native
  /**
    * The time that the DataSource was created. The time is expressed in epoch time.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.native
  /**
    * The AWS user account from which the DataSource was created. The account type can be either an AWS root account or an AWS Identity and Access Management (IAM) user account.
    */
  var CreatedByIamUser: js.UndefOr[AwsUserArn] = js.native
  /**
    * The location and name of the data in Amazon Simple Storage Service (Amazon S3) that is used by a DataSource.
    */
  var DataLocationS3: js.UndefOr[S3Url] = js.native
  /**
    * A JSON string that represents the splitting and rearrangement requirement used when this DataSource was created.
    */
  var DataRearrangement: js.UndefOr[typingsJapgolly.awsSdk.machinelearningMod.DataRearrangement] = js.native
  /**
    * The total number of observations contained in the data files that the DataSource references.
    */
  var DataSizeInBytes: js.UndefOr[LongType] = js.native
  /**
    * The ID that is assigned to the DataSource during creation.
    */
  var DataSourceId: js.UndefOr[EntityId] = js.native
  var FinishedAt: js.UndefOr[js.Date] = js.native
  /**
    * The time of the most recent edit to the BatchPrediction. The time is expressed in epoch time.
    */
  var LastUpdatedAt: js.UndefOr[js.Date] = js.native
  /**
    * A description of the most recent details about creating the DataSource.
    */
  var Message: js.UndefOr[typingsJapgolly.awsSdk.machinelearningMod.Message] = js.native
  /**
    * A user-supplied name or description of the DataSource.
    */
  var Name: js.UndefOr[EntityName] = js.native
  /**
    * The number of data files referenced by the DataSource.
    */
  var NumberOfFiles: js.UndefOr[LongType] = js.native
  var RDSMetadata: js.UndefOr[typingsJapgolly.awsSdk.machinelearningMod.RDSMetadata] = js.native
  var RedshiftMetadata: js.UndefOr[typingsJapgolly.awsSdk.machinelearningMod.RedshiftMetadata] = js.native
  var RoleARN: js.UndefOr[typingsJapgolly.awsSdk.machinelearningMod.RoleARN] = js.native
  var StartedAt: js.UndefOr[js.Date] = js.native
  /**
    * The current status of the DataSource. This element can have one of the following values:   PENDING - Amazon Machine Learning (Amazon ML) submitted a request to create a DataSource. INPROGRESS - The creation process is underway. FAILED - The request to create a DataSource did not run to completion. It is not usable. COMPLETED - The creation process completed successfully. DELETED - The DataSource is marked as deleted. It is not usable. 
    */
  var Status: js.UndefOr[EntityStatus] = js.native
}

object DataSource {
  @scala.inline
  def apply(
    ComputeStatistics: js.UndefOr[Boolean] = js.undefined,
    ComputeTime: Int | Double = null,
    CreatedAt: js.Date = null,
    CreatedByIamUser: AwsUserArn = null,
    DataLocationS3: S3Url = null,
    DataRearrangement: DataRearrangement = null,
    DataSizeInBytes: Int | Double = null,
    DataSourceId: EntityId = null,
    FinishedAt: js.Date = null,
    LastUpdatedAt: js.Date = null,
    Message: Message = null,
    Name: EntityName = null,
    NumberOfFiles: Int | Double = null,
    RDSMetadata: RDSMetadata = null,
    RedshiftMetadata: RedshiftMetadata = null,
    RoleARN: RoleARN = null,
    StartedAt: js.Date = null,
    Status: EntityStatus = null
  ): DataSource = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ComputeStatistics)) __obj.updateDynamic("ComputeStatistics")(ComputeStatistics.asInstanceOf[js.Any])
    if (ComputeTime != null) __obj.updateDynamic("ComputeTime")(ComputeTime.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (CreatedByIamUser != null) __obj.updateDynamic("CreatedByIamUser")(CreatedByIamUser.asInstanceOf[js.Any])
    if (DataLocationS3 != null) __obj.updateDynamic("DataLocationS3")(DataLocationS3.asInstanceOf[js.Any])
    if (DataRearrangement != null) __obj.updateDynamic("DataRearrangement")(DataRearrangement.asInstanceOf[js.Any])
    if (DataSizeInBytes != null) __obj.updateDynamic("DataSizeInBytes")(DataSizeInBytes.asInstanceOf[js.Any])
    if (DataSourceId != null) __obj.updateDynamic("DataSourceId")(DataSourceId.asInstanceOf[js.Any])
    if (FinishedAt != null) __obj.updateDynamic("FinishedAt")(FinishedAt.asInstanceOf[js.Any])
    if (LastUpdatedAt != null) __obj.updateDynamic("LastUpdatedAt")(LastUpdatedAt.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (NumberOfFiles != null) __obj.updateDynamic("NumberOfFiles")(NumberOfFiles.asInstanceOf[js.Any])
    if (RDSMetadata != null) __obj.updateDynamic("RDSMetadata")(RDSMetadata.asInstanceOf[js.Any])
    if (RedshiftMetadata != null) __obj.updateDynamic("RedshiftMetadata")(RedshiftMetadata.asInstanceOf[js.Any])
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN.asInstanceOf[js.Any])
    if (StartedAt != null) __obj.updateDynamic("StartedAt")(StartedAt.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSource]
  }
}

