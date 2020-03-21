package typingsJapgolly.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAssessmentRunsResponse extends js.Object {
  /**
    * A list of ARNs that specifies the assessment runs that are returned by the action.
    */
  var assessmentRunArns: ListReturnedArnList = js.native
  /**
    *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListAssessmentRunsResponse {
  @scala.inline
  def apply(assessmentRunArns: ListReturnedArnList, nextToken: PaginationToken = null): ListAssessmentRunsResponse = {
    val __obj = js.Dynamic.literal(assessmentRunArns = assessmentRunArns.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssessmentRunsResponse]
  }
}

