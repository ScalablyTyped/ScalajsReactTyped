package typingsJapgolly.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobRun extends js.Object {
  /**
    * This field is deprecated. Use MaxCapacity instead. The number of AWS Glue data processing units (DPUs) allocated to this JobRun. From 2 to 100 DPUs can be allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the AWS Glue pricing page.
    */
  var AllocatedCapacity: js.UndefOr[IntegerValue] = js.native
  /**
    * The job arguments associated with this run. For this job run, they replace the default arguments set in the job definition itself. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes. For information about how to specify and consume your own job arguments, see the Calling AWS Glue APIs in Python topic in the developer guide. For information about the key-value pairs that AWS Glue consumes to set up your job, see the Special Parameters Used by AWS Glue topic in the developer guide.
    */
  var Arguments: js.UndefOr[GenericMap] = js.native
  /**
    * The number of the attempt to run this job.
    */
  var Attempt: js.UndefOr[AttemptCount] = js.native
  /**
    * The date and time that this job run completed.
    */
  var CompletedOn: js.UndefOr[js.Date] = js.native
  /**
    * An error message associated with this job run.
    */
  var ErrorMessage: js.UndefOr[ErrorString] = js.native
  /**
    * The amount of time (in seconds) that the job run consumed resources.
    */
  var ExecutionTime: js.UndefOr[typingsJapgolly.awsSdk.glueMod.ExecutionTime] = js.native
  /**
    * Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python version indicates the version supported for jobs of type Spark.  For more information about the available AWS Glue versions and corresponding Spark and Python versions, see Glue version in the developer guide. Jobs that are created without specifying a Glue version default to Glue 0.9.
    */
  var GlueVersion: js.UndefOr[GlueVersionString] = js.native
  /**
    * The ID of this job run.
    */
  var Id: js.UndefOr[IdString] = js.native
  /**
    * The name of the job definition being used in this run.
    */
  var JobName: js.UndefOr[NameString] = js.native
  /**
    * The current state of the job run.
    */
  var JobRunState: js.UndefOr[typingsJapgolly.awsSdk.glueMod.JobRunState] = js.native
  /**
    * The last time that this job run was modified.
    */
  var LastModifiedOn: js.UndefOr[js.Date] = js.native
  /**
    * The name of the log group for secure logging that can be server-side encrypted in Amazon CloudWatch using AWS KMS. This name can be /aws-glue/jobs/, in which case the default encryption is NONE. If you add a role name and SecurityConfiguration name (in other words, /aws-glue/jobs-yourRoleName-yourSecurityConfigurationName/), then that security configuration is used to encrypt the log group.
    */
  var LogGroupName: js.UndefOr[GenericString] = js.native
  /**
    * The number of AWS Glue data processing units (DPUs) that can be allocated when this job runs. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the AWS Glue pricing page. Do not set Max Capacity if using WorkerType and NumberOfWorkers. The value that can be allocated for MaxCapacity depends on whether you are running a Python shell job or an Apache Spark ETL job:   When you specify a Python shell job (JobCommand.Name="pythonshell"), you can allocate either 0.0625 or 1 DPU. The default is 0.0625 DPU.   When you specify an Apache Spark ETL job (JobCommand.Name="glueetl"), you can allocate from 2 to 100 DPUs. The default is 10 DPUs. This job type cannot have a fractional DPU allocation.  
    */
  var MaxCapacity: js.UndefOr[NullableDouble] = js.native
  /**
    * Specifies configuration properties of a job run notification.
    */
  var NotificationProperty: js.UndefOr[typingsJapgolly.awsSdk.glueMod.NotificationProperty] = js.native
  /**
    * The number of workers of a defined workerType that are allocated when a job runs. The maximum number of workers you can define are 299 for G.1X, and 149 for G.2X. 
    */
  var NumberOfWorkers: js.UndefOr[NullableInteger] = js.native
  /**
    * A list of predecessors to this job run.
    */
  var PredecessorRuns: js.UndefOr[PredecessorList] = js.native
  /**
    * The ID of the previous run of this job. For example, the JobRunId specified in the StartJobRun action.
    */
  var PreviousRunId: js.UndefOr[IdString] = js.native
  /**
    * The name of the SecurityConfiguration structure to be used with this job run.
    */
  var SecurityConfiguration: js.UndefOr[NameString] = js.native
  /**
    * The date and time at which this job run was started.
    */
  var StartedOn: js.UndefOr[js.Date] = js.native
  /**
    * The JobRun timeout in minutes. This is the maximum time that a job run can consume resources before it is terminated and enters TIMEOUT status. The default is 2,880 minutes (48 hours). This overrides the timeout value set in the parent job.
    */
  var Timeout: js.UndefOr[typingsJapgolly.awsSdk.glueMod.Timeout] = js.native
  /**
    * The name of the trigger that started this job run.
    */
  var TriggerName: js.UndefOr[NameString] = js.native
  /**
    * The type of predefined worker that is allocated when a job runs. Accepts a value of Standard, G.1X, or G.2X.   For the Standard worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2 executors per worker.   For the G.1X worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1 executor per worker.   For the G.2X worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and 1 executor per worker.  
    */
  var WorkerType: js.UndefOr[typingsJapgolly.awsSdk.glueMod.WorkerType] = js.native
}

object JobRun {
  @scala.inline
  def apply(
    AllocatedCapacity: Int | Double = null,
    Arguments: GenericMap = null,
    Attempt: Int | Double = null,
    CompletedOn: js.Date = null,
    ErrorMessage: ErrorString = null,
    ExecutionTime: Int | Double = null,
    GlueVersion: GlueVersionString = null,
    Id: IdString = null,
    JobName: NameString = null,
    JobRunState: JobRunState = null,
    LastModifiedOn: js.Date = null,
    LogGroupName: GenericString = null,
    MaxCapacity: Int | Double = null,
    NotificationProperty: NotificationProperty = null,
    NumberOfWorkers: Int | Double = null,
    PredecessorRuns: PredecessorList = null,
    PreviousRunId: IdString = null,
    SecurityConfiguration: NameString = null,
    StartedOn: js.Date = null,
    Timeout: Int | Double = null,
    TriggerName: NameString = null,
    WorkerType: WorkerType = null
  ): JobRun = {
    val __obj = js.Dynamic.literal()
    if (AllocatedCapacity != null) __obj.updateDynamic("AllocatedCapacity")(AllocatedCapacity.asInstanceOf[js.Any])
    if (Arguments != null) __obj.updateDynamic("Arguments")(Arguments.asInstanceOf[js.Any])
    if (Attempt != null) __obj.updateDynamic("Attempt")(Attempt.asInstanceOf[js.Any])
    if (CompletedOn != null) __obj.updateDynamic("CompletedOn")(CompletedOn.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (ExecutionTime != null) __obj.updateDynamic("ExecutionTime")(ExecutionTime.asInstanceOf[js.Any])
    if (GlueVersion != null) __obj.updateDynamic("GlueVersion")(GlueVersion.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (JobName != null) __obj.updateDynamic("JobName")(JobName.asInstanceOf[js.Any])
    if (JobRunState != null) __obj.updateDynamic("JobRunState")(JobRunState.asInstanceOf[js.Any])
    if (LastModifiedOn != null) __obj.updateDynamic("LastModifiedOn")(LastModifiedOn.asInstanceOf[js.Any])
    if (LogGroupName != null) __obj.updateDynamic("LogGroupName")(LogGroupName.asInstanceOf[js.Any])
    if (MaxCapacity != null) __obj.updateDynamic("MaxCapacity")(MaxCapacity.asInstanceOf[js.Any])
    if (NotificationProperty != null) __obj.updateDynamic("NotificationProperty")(NotificationProperty.asInstanceOf[js.Any])
    if (NumberOfWorkers != null) __obj.updateDynamic("NumberOfWorkers")(NumberOfWorkers.asInstanceOf[js.Any])
    if (PredecessorRuns != null) __obj.updateDynamic("PredecessorRuns")(PredecessorRuns.asInstanceOf[js.Any])
    if (PreviousRunId != null) __obj.updateDynamic("PreviousRunId")(PreviousRunId.asInstanceOf[js.Any])
    if (SecurityConfiguration != null) __obj.updateDynamic("SecurityConfiguration")(SecurityConfiguration.asInstanceOf[js.Any])
    if (StartedOn != null) __obj.updateDynamic("StartedOn")(StartedOn.asInstanceOf[js.Any])
    if (Timeout != null) __obj.updateDynamic("Timeout")(Timeout.asInstanceOf[js.Any])
    if (TriggerName != null) __obj.updateDynamic("TriggerName")(TriggerName.asInstanceOf[js.Any])
    if (WorkerType != null) __obj.updateDynamic("WorkerType")(WorkerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobRun]
  }
}

