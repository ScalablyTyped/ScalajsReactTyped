package typingsJapgolly.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationDetail extends js.Object {
  /**
    * ARN of the application.
    */
  var ApplicationARN: ResourceARN = js.native
  /**
    * Returns the application code that you provided to perform data analysis on any of the in-application streams in your application.
    */
  var ApplicationCode: js.UndefOr[typingsJapgolly.awsSdk.kinesisanalyticsMod.ApplicationCode] = js.native
  /**
    * Description of the application.
    */
  var ApplicationDescription: js.UndefOr[typingsJapgolly.awsSdk.kinesisanalyticsMod.ApplicationDescription] = js.native
  /**
    * Name of the application.
    */
  var ApplicationName: typingsJapgolly.awsSdk.kinesisanalyticsMod.ApplicationName = js.native
  /**
    * Status of the application.
    */
  var ApplicationStatus: typingsJapgolly.awsSdk.kinesisanalyticsMod.ApplicationStatus = js.native
  /**
    * Provides the current application version.
    */
  var ApplicationVersionId: typingsJapgolly.awsSdk.kinesisanalyticsMod.ApplicationVersionId = js.native
  /**
    * Describes the CloudWatch log streams that are configured to receive application messages. For more information about using CloudWatch log streams with Amazon Kinesis Analytics applications, see Working with Amazon CloudWatch Logs. 
    */
  var CloudWatchLoggingOptionDescriptions: js.UndefOr[typingsJapgolly.awsSdk.kinesisanalyticsMod.CloudWatchLoggingOptionDescriptions] = js.native
  /**
    * Time stamp when the application version was created.
    */
  var CreateTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * Describes the application input configuration. For more information, see Configuring Application Input. 
    */
  var InputDescriptions: js.UndefOr[typingsJapgolly.awsSdk.kinesisanalyticsMod.InputDescriptions] = js.native
  /**
    * Time stamp when the application was last updated.
    */
  var LastUpdateTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * Describes the application output configuration. For more information, see Configuring Application Output. 
    */
  var OutputDescriptions: js.UndefOr[typingsJapgolly.awsSdk.kinesisanalyticsMod.OutputDescriptions] = js.native
  /**
    * Describes reference data sources configured for the application. For more information, see Configuring Application Input. 
    */
  var ReferenceDataSourceDescriptions: js.UndefOr[typingsJapgolly.awsSdk.kinesisanalyticsMod.ReferenceDataSourceDescriptions] = js.native
}

object ApplicationDetail {
  @scala.inline
  def apply(
    ApplicationARN: ResourceARN,
    ApplicationName: ApplicationName,
    ApplicationStatus: ApplicationStatus,
    ApplicationVersionId: ApplicationVersionId,
    ApplicationCode: ApplicationCode = null,
    ApplicationDescription: ApplicationDescription = null,
    CloudWatchLoggingOptionDescriptions: CloudWatchLoggingOptionDescriptions = null,
    CreateTimestamp: js.Date = null,
    InputDescriptions: InputDescriptions = null,
    LastUpdateTimestamp: js.Date = null,
    OutputDescriptions: OutputDescriptions = null,
    ReferenceDataSourceDescriptions: ReferenceDataSourceDescriptions = null
  ): ApplicationDetail = {
    val __obj = js.Dynamic.literal(ApplicationARN = ApplicationARN.asInstanceOf[js.Any], ApplicationName = ApplicationName.asInstanceOf[js.Any], ApplicationStatus = ApplicationStatus.asInstanceOf[js.Any], ApplicationVersionId = ApplicationVersionId.asInstanceOf[js.Any])
    if (ApplicationCode != null) __obj.updateDynamic("ApplicationCode")(ApplicationCode.asInstanceOf[js.Any])
    if (ApplicationDescription != null) __obj.updateDynamic("ApplicationDescription")(ApplicationDescription.asInstanceOf[js.Any])
    if (CloudWatchLoggingOptionDescriptions != null) __obj.updateDynamic("CloudWatchLoggingOptionDescriptions")(CloudWatchLoggingOptionDescriptions.asInstanceOf[js.Any])
    if (CreateTimestamp != null) __obj.updateDynamic("CreateTimestamp")(CreateTimestamp.asInstanceOf[js.Any])
    if (InputDescriptions != null) __obj.updateDynamic("InputDescriptions")(InputDescriptions.asInstanceOf[js.Any])
    if (LastUpdateTimestamp != null) __obj.updateDynamic("LastUpdateTimestamp")(LastUpdateTimestamp.asInstanceOf[js.Any])
    if (OutputDescriptions != null) __obj.updateDynamic("OutputDescriptions")(OutputDescriptions.asInstanceOf[js.Any])
    if (ReferenceDataSourceDescriptions != null) __obj.updateDynamic("ReferenceDataSourceDescriptions")(ReferenceDataSourceDescriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationDetail]
  }
}

