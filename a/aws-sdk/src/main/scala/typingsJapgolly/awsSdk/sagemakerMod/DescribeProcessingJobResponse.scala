package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProcessingJobResponse extends js.Object {
  /**
    * Configures the processing job to run a specified container image.
    */
  var AppSpecification: typingsJapgolly.awsSdk.sagemakerMod.AppSpecification = js.native
  /**
    * The ARN of an AutoML job associated with this processing job.
    */
  var AutoMLJobArn: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.AutoMLJobArn] = js.native
  /**
    * The time at which the processing job was created.
    */
  var CreationTime: js.Date = js.native
  /**
    * The environment variables set in the Docker container.
    */
  var Environment: js.UndefOr[ProcessingEnvironmentMap] = js.native
  /**
    * An optional string, up to one KB in size, that contains metadata from the processing container when the processing job exits.
    */
  var ExitMessage: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.ExitMessage] = js.native
  /**
    * The configuration information used to create an experiment.
    */
  var ExperimentConfig: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.ExperimentConfig] = js.native
  /**
    * A string, up to one KB in size, that contains the reason a processing job failed, if it failed.
    */
  var FailureReason: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.FailureReason] = js.native
  /**
    * The time at which the processing job was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  /**
    * The ARN of a monitoring schedule for an endpoint associated with this processing job.
    */
  var MonitoringScheduleArn: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.MonitoringScheduleArn] = js.native
  /**
    * Networking options for a processing job.
    */
  var NetworkConfig: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.NetworkConfig] = js.native
  /**
    * The time at which the processing job completed.
    */
  var ProcessingEndTime: js.UndefOr[js.Date] = js.native
  /**
    * The inputs for a processing job.
    */
  var ProcessingInputs: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.ProcessingInputs] = js.native
  /**
    * The Amazon Resource Name (ARN) of the processing job.
    */
  var ProcessingJobArn: typingsJapgolly.awsSdk.sagemakerMod.ProcessingJobArn = js.native
  /**
    * The name of the processing job. The name must be unique within an AWS Region in the AWS account.
    */
  var ProcessingJobName: typingsJapgolly.awsSdk.sagemakerMod.ProcessingJobName = js.native
  /**
    * Provides the status of a processing job.
    */
  var ProcessingJobStatus: typingsJapgolly.awsSdk.sagemakerMod.ProcessingJobStatus = js.native
  /**
    * Output configuration for the processing job.
    */
  var ProcessingOutputConfig: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.ProcessingOutputConfig] = js.native
  /**
    * Identifies the resources, ML compute instances, and ML storage volumes to deploy for a processing job. In distributed training, you specify more than one instance.
    */
  var ProcessingResources: typingsJapgolly.awsSdk.sagemakerMod.ProcessingResources = js.native
  /**
    * The time at which the processing job started.
    */
  var ProcessingStartTime: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
    */
  var RoleArn: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.RoleArn] = js.native
  /**
    * The time limit for how long the processing job is allowed to run.
    */
  var StoppingCondition: js.UndefOr[ProcessingStoppingCondition] = js.native
  /**
    * The ARN of a training job associated with this processing job.
    */
  var TrainingJobArn: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.TrainingJobArn] = js.native
}

object DescribeProcessingJobResponse {
  @scala.inline
  def apply(
    AppSpecification: AppSpecification,
    CreationTime: js.Date,
    ProcessingJobArn: ProcessingJobArn,
    ProcessingJobName: ProcessingJobName,
    ProcessingJobStatus: ProcessingJobStatus,
    ProcessingResources: ProcessingResources,
    AutoMLJobArn: AutoMLJobArn = null,
    Environment: ProcessingEnvironmentMap = null,
    ExitMessage: ExitMessage = null,
    ExperimentConfig: ExperimentConfig = null,
    FailureReason: FailureReason = null,
    LastModifiedTime: js.Date = null,
    MonitoringScheduleArn: MonitoringScheduleArn = null,
    NetworkConfig: NetworkConfig = null,
    ProcessingEndTime: js.Date = null,
    ProcessingInputs: ProcessingInputs = null,
    ProcessingOutputConfig: ProcessingOutputConfig = null,
    ProcessingStartTime: js.Date = null,
    RoleArn: RoleArn = null,
    StoppingCondition: ProcessingStoppingCondition = null,
    TrainingJobArn: TrainingJobArn = null
  ): DescribeProcessingJobResponse = {
    val __obj = js.Dynamic.literal(AppSpecification = AppSpecification.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], ProcessingJobArn = ProcessingJobArn.asInstanceOf[js.Any], ProcessingJobName = ProcessingJobName.asInstanceOf[js.Any], ProcessingJobStatus = ProcessingJobStatus.asInstanceOf[js.Any], ProcessingResources = ProcessingResources.asInstanceOf[js.Any])
    if (AutoMLJobArn != null) __obj.updateDynamic("AutoMLJobArn")(AutoMLJobArn.asInstanceOf[js.Any])
    if (Environment != null) __obj.updateDynamic("Environment")(Environment.asInstanceOf[js.Any])
    if (ExitMessage != null) __obj.updateDynamic("ExitMessage")(ExitMessage.asInstanceOf[js.Any])
    if (ExperimentConfig != null) __obj.updateDynamic("ExperimentConfig")(ExperimentConfig.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    if (MonitoringScheduleArn != null) __obj.updateDynamic("MonitoringScheduleArn")(MonitoringScheduleArn.asInstanceOf[js.Any])
    if (NetworkConfig != null) __obj.updateDynamic("NetworkConfig")(NetworkConfig.asInstanceOf[js.Any])
    if (ProcessingEndTime != null) __obj.updateDynamic("ProcessingEndTime")(ProcessingEndTime.asInstanceOf[js.Any])
    if (ProcessingInputs != null) __obj.updateDynamic("ProcessingInputs")(ProcessingInputs.asInstanceOf[js.Any])
    if (ProcessingOutputConfig != null) __obj.updateDynamic("ProcessingOutputConfig")(ProcessingOutputConfig.asInstanceOf[js.Any])
    if (ProcessingStartTime != null) __obj.updateDynamic("ProcessingStartTime")(ProcessingStartTime.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (StoppingCondition != null) __obj.updateDynamic("StoppingCondition")(StoppingCondition.asInstanceOf[js.Any])
    if (TrainingJobArn != null) __obj.updateDynamic("TrainingJobArn")(TrainingJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProcessingJobResponse]
  }
}

