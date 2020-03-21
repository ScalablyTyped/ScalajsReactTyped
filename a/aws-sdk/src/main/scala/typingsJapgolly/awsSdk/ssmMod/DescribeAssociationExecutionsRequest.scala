package typingsJapgolly.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAssociationExecutionsRequest extends js.Object {
  /**
    * The association ID for which you want to view execution history details.
    */
  var AssociationId: typingsJapgolly.awsSdk.ssmMod.AssociationId = js.native
  /**
    * Filters for the request. You can specify the following filters and values. ExecutionId (EQUAL) Status (EQUAL) CreatedTime (EQUAL, GREATER_THAN, LESS_THAN)
    */
  var Filters: js.UndefOr[AssociationExecutionFilterList] = js.native
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.MaxResults] = js.native
  /**
    * A token to start the list. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.NextToken] = js.native
}

object DescribeAssociationExecutionsRequest {
  @scala.inline
  def apply(
    AssociationId: AssociationId,
    Filters: AssociationExecutionFilterList = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null
  ): DescribeAssociationExecutionsRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssociationExecutionsRequest]
  }
}

