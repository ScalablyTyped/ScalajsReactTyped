package typingsJapgolly.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Job extends js.Object {
  /**
    * Accelerated transcoding can significantly speed up jobs with long, visually complex content.
    */
  var AccelerationSettings: js.UndefOr[typingsJapgolly.awsSdk.mediaconvertMod.AccelerationSettings] = js.native
  /**
    * Describes whether the current job is running with accelerated transcoding. For jobs that have Acceleration (AccelerationMode) set to DISABLED, AccelerationStatus is always NOT_APPLICABLE. For jobs that have Acceleration (AccelerationMode) set to ENABLED or PREFERRED, AccelerationStatus is one of the other states. AccelerationStatus is IN_PROGRESS initially, while the service determines whether the input files and job settings are compatible with accelerated transcoding. If they are, AcclerationStatus is ACCELERATED. If your input files and job settings aren't compatible with accelerated transcoding, the service either fails your job or runs it without accelerated transcoding, depending on how you set Acceleration (AccelerationMode). When the service runs your job without accelerated transcoding, AccelerationStatus is NOT_ACCELERATED.
    */
  var AccelerationStatus: js.UndefOr[typingsJapgolly.awsSdk.mediaconvertMod.AccelerationStatus] = js.native
  /**
    * An identifier for this resource that is unique within all of AWS.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * Optional. Choose a tag type that AWS Billing and Cost Management will use to sort your AWS Elemental MediaConvert costs on any billing report that you set up. Any transcoding outputs that don't have an associated tag will appear in your billing report unsorted. If you don't choose a valid value for this field, your job outputs will appear on the billing report unsorted.
    */
  var BillingTagsSource: js.UndefOr[typingsJapgolly.awsSdk.mediaconvertMod.BillingTagsSource] = js.native
  /**
    * The time, in Unix epoch format in seconds, when the job got created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.native
  /**
    * A job's phase can be PROBING, TRANSCODING OR UPLOADING
    */
  var CurrentPhase: js.UndefOr[JobPhase] = js.native
  /**
    * Error code for the job
    */
  var ErrorCode: js.UndefOr[integer] = js.native
  /**
    * Error message of Job
    */
  var ErrorMessage: js.UndefOr[string] = js.native
  /**
    * A portion of the job's ARN, unique within your AWS Elemental MediaConvert resources
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * An estimate of how far your job has progressed. This estimate is shown as a percentage of the total time from when your job leaves its queue to when your output files appear in your output Amazon S3 bucket. AWS Elemental MediaConvert provides jobPercentComplete in CloudWatch STATUS_UPDATE events and in the response to GetJob and ListJobs requests. The jobPercentComplete estimate is reliable for the following input containers: Quicktime, Transport Stream, MP4, and MXF. For some jobs, the service can't provide information about job progress. In those cases, jobPercentComplete returns a null value.
    */
  var JobPercentComplete: js.UndefOr[integer] = js.native
  /**
    * The job template that the job is created from, if it is created from a job template.
    */
  var JobTemplate: js.UndefOr[string] = js.native
  /**
    * Provides messages from the service about jobs that you have already successfully submitted.
    */
  var Messages: js.UndefOr[JobMessages] = js.native
  /**
    * List of output group details
    */
  var OutputGroupDetails: js.UndefOr[listOfOutputGroupDetail] = js.native
  /**
    * Relative priority on the job.
    */
  var Priority: js.UndefOr[integerMinNegative50Max50] = js.native
  /**
    * Optional. When you create a job, you can specify a queue to send it to. If you don't specify, the job will go to the default queue. For more about queues, see the User Guide topic at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
    */
  var Queue: js.UndefOr[string] = js.native
  /**
    * The number of times that the service automatically attempted to process your job after encountering an error.
    */
  var RetryCount: js.UndefOr[integer] = js.native
  /**
    * The IAM role you use for creating this job. For details about permissions, see the User Guide topic at the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html
    */
  var Role: string = js.native
  /**
    * JobSettings contains all the transcode settings for a job.
    */
  var Settings: JobSettings = js.native
  /**
    * Enable this setting when you run a test job to estimate how many reserved transcoding slots (RTS) you need. When this is enabled, MediaConvert runs your job from an on-demand queue with similar performance to what you will see with one RTS in a reserved queue. This setting is disabled by default.
    */
  var SimulateReservedQueue: js.UndefOr[typingsJapgolly.awsSdk.mediaconvertMod.SimulateReservedQueue] = js.native
  /**
    * A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or ERROR.
    */
  var Status: js.UndefOr[JobStatus] = js.native
  /**
    * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins processing your job to the time it completes the transcode or encounters an error.
    */
  var StatusUpdateInterval: js.UndefOr[typingsJapgolly.awsSdk.mediaconvertMod.StatusUpdateInterval] = js.native
  /**
    * Information about when jobs are submitted, started, and finished is specified in Unix epoch format in seconds.
    */
  var Timing: js.UndefOr[typingsJapgolly.awsSdk.mediaconvertMod.Timing] = js.native
  /**
    * User-defined metadata that you want to associate with an MediaConvert job. You specify metadata in key/value pairs.
    */
  var UserMetadata: js.UndefOr[mapOfString] = js.native
}

object Job {
  @scala.inline
  def apply(
    Role: string,
    Settings: JobSettings,
    AccelerationSettings: AccelerationSettings = null,
    AccelerationStatus: AccelerationStatus = null,
    Arn: string = null,
    BillingTagsSource: BillingTagsSource = null,
    CreatedAt: js.Date = null,
    CurrentPhase: JobPhase = null,
    ErrorCode: Int | Double = null,
    ErrorMessage: string = null,
    Id: string = null,
    JobPercentComplete: Int | Double = null,
    JobTemplate: string = null,
    Messages: JobMessages = null,
    OutputGroupDetails: listOfOutputGroupDetail = null,
    Priority: Int | Double = null,
    Queue: string = null,
    RetryCount: Int | Double = null,
    SimulateReservedQueue: SimulateReservedQueue = null,
    Status: JobStatus = null,
    StatusUpdateInterval: StatusUpdateInterval = null,
    Timing: Timing = null,
    UserMetadata: mapOfString = null
  ): Job = {
    val __obj = js.Dynamic.literal(Role = Role.asInstanceOf[js.Any], Settings = Settings.asInstanceOf[js.Any])
    if (AccelerationSettings != null) __obj.updateDynamic("AccelerationSettings")(AccelerationSettings.asInstanceOf[js.Any])
    if (AccelerationStatus != null) __obj.updateDynamic("AccelerationStatus")(AccelerationStatus.asInstanceOf[js.Any])
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (BillingTagsSource != null) __obj.updateDynamic("BillingTagsSource")(BillingTagsSource.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (CurrentPhase != null) __obj.updateDynamic("CurrentPhase")(CurrentPhase.asInstanceOf[js.Any])
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (JobPercentComplete != null) __obj.updateDynamic("JobPercentComplete")(JobPercentComplete.asInstanceOf[js.Any])
    if (JobTemplate != null) __obj.updateDynamic("JobTemplate")(JobTemplate.asInstanceOf[js.Any])
    if (Messages != null) __obj.updateDynamic("Messages")(Messages.asInstanceOf[js.Any])
    if (OutputGroupDetails != null) __obj.updateDynamic("OutputGroupDetails")(OutputGroupDetails.asInstanceOf[js.Any])
    if (Priority != null) __obj.updateDynamic("Priority")(Priority.asInstanceOf[js.Any])
    if (Queue != null) __obj.updateDynamic("Queue")(Queue.asInstanceOf[js.Any])
    if (RetryCount != null) __obj.updateDynamic("RetryCount")(RetryCount.asInstanceOf[js.Any])
    if (SimulateReservedQueue != null) __obj.updateDynamic("SimulateReservedQueue")(SimulateReservedQueue.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusUpdateInterval != null) __obj.updateDynamic("StatusUpdateInterval")(StatusUpdateInterval.asInstanceOf[js.Any])
    if (Timing != null) __obj.updateDynamic("Timing")(Timing.asInstanceOf[js.Any])
    if (UserMetadata != null) __obj.updateDynamic("UserMetadata")(UserMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Job]
  }
}

