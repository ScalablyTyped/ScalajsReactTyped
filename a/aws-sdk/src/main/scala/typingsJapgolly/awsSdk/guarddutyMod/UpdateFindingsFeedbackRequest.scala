package typingsJapgolly.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFindingsFeedbackRequest extends js.Object {
  /**
    * Additional feedback about the GuardDuty findings.
    */
  var Comments: js.UndefOr[String] = js.native
  /**
    * The ID of the detector associated with the findings to update feedback for.
    */
  var DetectorId: typingsJapgolly.awsSdk.guarddutyMod.DetectorId = js.native
  /**
    * The feedback for the finding.
    */
  var Feedback: typingsJapgolly.awsSdk.guarddutyMod.Feedback = js.native
  /**
    * IDs of the findings that you want to mark as useful or not useful.
    */
  var FindingIds: typingsJapgolly.awsSdk.guarddutyMod.FindingIds = js.native
}

object UpdateFindingsFeedbackRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, Feedback: Feedback, FindingIds: FindingIds, Comments: String = null): UpdateFindingsFeedbackRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], Feedback = Feedback.asInstanceOf[js.Any], FindingIds = FindingIds.asInstanceOf[js.Any])
    if (Comments != null) __obj.updateDynamic("Comments")(Comments.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFindingsFeedbackRequest]
  }
}

