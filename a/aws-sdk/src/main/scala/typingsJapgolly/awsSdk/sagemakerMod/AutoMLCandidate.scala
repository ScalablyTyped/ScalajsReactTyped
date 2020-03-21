package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoMLCandidate extends js.Object {
  /**
    * The candidate name.
    */
  var CandidateName: typingsJapgolly.awsSdk.sagemakerMod.CandidateName = js.native
  /**
    * The candidate's status.
    */
  var CandidateStatus: typingsJapgolly.awsSdk.sagemakerMod.CandidateStatus = js.native
  /**
    * The candidate's steps.
    */
  var CandidateSteps: typingsJapgolly.awsSdk.sagemakerMod.CandidateSteps = js.native
  /**
    * The creation time.
    */
  var CreationTime: js.Date = js.native
  /**
    * The end time.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * The failure reason.
    */
  var FailureReason: js.UndefOr[AutoMLFailureReason] = js.native
  var FinalAutoMLJobObjectiveMetric: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.FinalAutoMLJobObjectiveMetric] = js.native
  /**
    * The inference containers.
    */
  var InferenceContainers: js.UndefOr[AutoMLContainerDefinitions] = js.native
  /**
    * The last modified time.
    */
  var LastModifiedTime: js.Date = js.native
  /**
    * The objective status.
    */
  var ObjectiveStatus: typingsJapgolly.awsSdk.sagemakerMod.ObjectiveStatus = js.native
}

object AutoMLCandidate {
  @scala.inline
  def apply(
    CandidateName: CandidateName,
    CandidateStatus: CandidateStatus,
    CandidateSteps: CandidateSteps,
    CreationTime: js.Date,
    LastModifiedTime: js.Date,
    ObjectiveStatus: ObjectiveStatus,
    EndTime: js.Date = null,
    FailureReason: AutoMLFailureReason = null,
    FinalAutoMLJobObjectiveMetric: FinalAutoMLJobObjectiveMetric = null,
    InferenceContainers: AutoMLContainerDefinitions = null
  ): AutoMLCandidate = {
    val __obj = js.Dynamic.literal(CandidateName = CandidateName.asInstanceOf[js.Any], CandidateStatus = CandidateStatus.asInstanceOf[js.Any], CandidateSteps = CandidateSteps.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], ObjectiveStatus = ObjectiveStatus.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (FinalAutoMLJobObjectiveMetric != null) __obj.updateDynamic("FinalAutoMLJobObjectiveMetric")(FinalAutoMLJobObjectiveMetric.asInstanceOf[js.Any])
    if (InferenceContainers != null) __obj.updateDynamic("InferenceContainers")(InferenceContainers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLCandidate]
  }
}

