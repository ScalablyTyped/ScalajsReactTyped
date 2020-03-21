package typingsJapgolly.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGroupsRequest extends js.Object {
  /**
    * The maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.workmailMod.MaxResults] = js.native
  /**
    * The token to use to retrieve the next page of results. The first call does not contain any tokens.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.workmailMod.NextToken] = js.native
  /**
    * The identifier for the organization under which the groups exist.
    */
  var OrganizationId: typingsJapgolly.awsSdk.workmailMod.OrganizationId = js.native
}

object ListGroupsRequest {
  @scala.inline
  def apply(OrganizationId: OrganizationId, MaxResults: Int | Double = null, NextToken: NextToken = null): ListGroupsRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGroupsRequest]
  }
}

