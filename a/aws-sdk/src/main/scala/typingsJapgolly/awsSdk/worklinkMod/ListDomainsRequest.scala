package typingsJapgolly.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDomainsRequest extends js.Object {
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typingsJapgolly.awsSdk.worklinkMod.FleetArn = js.native
  /**
    * The maximum number of results to be included in the next page.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.worklinkMod.MaxResults] = js.native
  /**
    * The pagination token used to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.worklinkMod.NextToken] = js.native
}

object ListDomainsRequest {
  @scala.inline
  def apply(FleetArn: FleetArn, MaxResults: Int | Double = null, NextToken: NextToken = null): ListDomainsRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainsRequest]
  }
}

