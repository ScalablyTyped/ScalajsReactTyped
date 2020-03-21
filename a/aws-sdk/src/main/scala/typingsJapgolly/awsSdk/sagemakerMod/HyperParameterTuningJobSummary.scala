package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HyperParameterTuningJobSummary extends js.Object {
  /**
    * The date and time that the tuning job was created.
    */
  var CreationTime: js.Date = js.native
  /**
    * The date and time that the tuning job ended.
    */
  var HyperParameterTuningEndTime: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the tuning job.
    */
  var HyperParameterTuningJobArn: typingsJapgolly.awsSdk.sagemakerMod.HyperParameterTuningJobArn = js.native
  /**
    * The name of the tuning job.
    */
  var HyperParameterTuningJobName: typingsJapgolly.awsSdk.sagemakerMod.HyperParameterTuningJobName = js.native
  /**
    * The status of the tuning job.
    */
  var HyperParameterTuningJobStatus: typingsJapgolly.awsSdk.sagemakerMod.HyperParameterTuningJobStatus = js.native
  /**
    * The date and time that the tuning job was modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  /**
    * The ObjectiveStatusCounters object that specifies the numbers of training jobs, categorized by objective metric status, that this tuning job launched.
    */
  var ObjectiveStatusCounters: typingsJapgolly.awsSdk.sagemakerMod.ObjectiveStatusCounters = js.native
  /**
    * The ResourceLimits object that specifies the maximum number of training jobs and parallel training jobs allowed for this tuning job.
    */
  var ResourceLimits: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.ResourceLimits] = js.native
  /**
    * Specifies the search strategy hyperparameter tuning uses to choose which hyperparameters to use for each iteration. Currently, the only valid value is Bayesian.
    */
  var Strategy: HyperParameterTuningJobStrategyType = js.native
  /**
    * The TrainingJobStatusCounters object that specifies the numbers of training jobs, categorized by status, that this tuning job launched.
    */
  var TrainingJobStatusCounters: typingsJapgolly.awsSdk.sagemakerMod.TrainingJobStatusCounters = js.native
}

object HyperParameterTuningJobSummary {
  @scala.inline
  def apply(
    CreationTime: js.Date,
    HyperParameterTuningJobArn: HyperParameterTuningJobArn,
    HyperParameterTuningJobName: HyperParameterTuningJobName,
    HyperParameterTuningJobStatus: HyperParameterTuningJobStatus,
    ObjectiveStatusCounters: ObjectiveStatusCounters,
    Strategy: HyperParameterTuningJobStrategyType,
    TrainingJobStatusCounters: TrainingJobStatusCounters,
    HyperParameterTuningEndTime: js.Date = null,
    LastModifiedTime: js.Date = null,
    ResourceLimits: ResourceLimits = null
  ): HyperParameterTuningJobSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], HyperParameterTuningJobArn = HyperParameterTuningJobArn.asInstanceOf[js.Any], HyperParameterTuningJobName = HyperParameterTuningJobName.asInstanceOf[js.Any], HyperParameterTuningJobStatus = HyperParameterTuningJobStatus.asInstanceOf[js.Any], ObjectiveStatusCounters = ObjectiveStatusCounters.asInstanceOf[js.Any], Strategy = Strategy.asInstanceOf[js.Any], TrainingJobStatusCounters = TrainingJobStatusCounters.asInstanceOf[js.Any])
    if (HyperParameterTuningEndTime != null) __obj.updateDynamic("HyperParameterTuningEndTime")(HyperParameterTuningEndTime.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    if (ResourceLimits != null) __obj.updateDynamic("ResourceLimits")(ResourceLimits.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperParameterTuningJobSummary]
  }
}

