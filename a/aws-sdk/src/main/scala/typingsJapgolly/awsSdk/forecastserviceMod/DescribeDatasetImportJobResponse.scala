package typingsJapgolly.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDatasetImportJobResponse extends js.Object {
  /**
    * When the dataset import job was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The size of the dataset in gigabytes (GB) after the import job has finished.
    */
  var DataSize: js.UndefOr[Double] = js.native
  /**
    * The location of the training data to import and an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the data. If encryption is used, DataSource includes an AWS Key Management Service (KMS) key.
    */
  var DataSource: js.UndefOr[typingsJapgolly.awsSdk.forecastserviceMod.DataSource] = js.native
  /**
    * The Amazon Resource Name (ARN) of the dataset that the training data was imported to.
    */
  var DatasetArn: js.UndefOr[Arn] = js.native
  /**
    * The ARN of the dataset import job.
    */
  var DatasetImportJobArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the dataset import job.
    */
  var DatasetImportJobName: js.UndefOr[Name] = js.native
  /**
    * Statistical information about each field in the input data.
    */
  var FieldStatistics: js.UndefOr[typingsJapgolly.awsSdk.forecastserviceMod.FieldStatistics] = js.native
  /**
    * The last time that the dataset was modified. The time depends on the status of the job, as follows:    CREATE_PENDING - The same time as CreationTime.    CREATE_IN_PROGRESS - The current timestamp.    ACTIVE or CREATE_FAILED - When the job finished or failed.  
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.native
  /**
    * If an error occurred, an informational message about the error.
    */
  var Message: js.UndefOr[typingsJapgolly.awsSdk.forecastserviceMod.Message] = js.native
  /**
    * The status of the dataset import job. The status is reflected in the status of the dataset. For example, when the import job status is CREATE_IN_PROGRESS, the status of the dataset is UPDATE_IN_PROGRESS. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED   
    */
  var Status: js.UndefOr[typingsJapgolly.awsSdk.forecastserviceMod.Status] = js.native
  /**
    * The format of timestamps in the dataset. The format that you specify depends on the DataFrequency specified when the dataset was created. The following formats are supported   "yyyy-MM-dd" For the following data frequencies: Y, M, W, and D   "yyyy-MM-dd HH:mm:ss" For the following data frequencies: H, 30min, 15min, and 1min; and optionally, for: Y, M, W, and D  
    */
  var TimestampFormat: js.UndefOr[typingsJapgolly.awsSdk.forecastserviceMod.TimestampFormat] = js.native
}

object DescribeDatasetImportJobResponse {
  @scala.inline
  def apply(
    CreationTime: js.Date = null,
    DataSize: Int | scala.Double = null,
    DataSource: DataSource = null,
    DatasetArn: Arn = null,
    DatasetImportJobArn: Arn = null,
    DatasetImportJobName: Name = null,
    FieldStatistics: FieldStatistics = null,
    LastModificationTime: js.Date = null,
    Message: Message = null,
    Status: Status = null,
    TimestampFormat: TimestampFormat = null
  ): DescribeDatasetImportJobResponse = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (DataSize != null) __obj.updateDynamic("DataSize")(DataSize.asInstanceOf[js.Any])
    if (DataSource != null) __obj.updateDynamic("DataSource")(DataSource.asInstanceOf[js.Any])
    if (DatasetArn != null) __obj.updateDynamic("DatasetArn")(DatasetArn.asInstanceOf[js.Any])
    if (DatasetImportJobArn != null) __obj.updateDynamic("DatasetImportJobArn")(DatasetImportJobArn.asInstanceOf[js.Any])
    if (DatasetImportJobName != null) __obj.updateDynamic("DatasetImportJobName")(DatasetImportJobName.asInstanceOf[js.Any])
    if (FieldStatistics != null) __obj.updateDynamic("FieldStatistics")(FieldStatistics.asInstanceOf[js.Any])
    if (LastModificationTime != null) __obj.updateDynamic("LastModificationTime")(LastModificationTime.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TimestampFormat != null) __obj.updateDynamic("TimestampFormat")(TimestampFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDatasetImportJobResponse]
  }
}

