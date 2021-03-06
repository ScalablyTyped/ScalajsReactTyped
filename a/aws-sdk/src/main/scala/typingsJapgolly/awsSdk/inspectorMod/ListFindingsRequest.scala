package typingsJapgolly.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFindingsRequest extends js.Object {
  /**
    * The ARNs of the assessment runs that generate the findings that you want to list.
    */
  var assessmentRunArns: js.UndefOr[ListParentArnList] = js.native
  /**
    * You can use this parameter to specify a subset of data to be included in the action's response. For a record to match a filter, all specified filter attributes must match. When multiple values are specified for a filter attribute, any of the values can match.
    */
  var filter: js.UndefOr[FindingFilter] = js.native
  /**
    * You can use this parameter to indicate the maximum number of items you want in the response. The default value is 10. The maximum value is 500.
    */
  var maxResults: js.UndefOr[ListMaxResults] = js.native
  /**
    * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the ListFindings action. Subsequent calls to the action fill nextToken in the request with the value of NextToken from the previous response to continue listing data.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListFindingsRequest {
  @scala.inline
  def apply(
    assessmentRunArns: ListParentArnList = null,
    filter: FindingFilter = null,
    maxResults: Int | Double = null,
    nextToken: PaginationToken = null
  ): ListFindingsRequest = {
    val __obj = js.Dynamic.literal()
    if (assessmentRunArns != null) __obj.updateDynamic("assessmentRunArns")(assessmentRunArns.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFindingsRequest]
  }
}

