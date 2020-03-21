package typingsJapgolly.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRoutingProfilesResponse extends js.Object {
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.connectMod.NextToken] = js.native
  /**
    * Information about the routing profiles.
    */
  var RoutingProfileSummaryList: js.UndefOr[typingsJapgolly.awsSdk.connectMod.RoutingProfileSummaryList] = js.native
}

object ListRoutingProfilesResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, RoutingProfileSummaryList: RoutingProfileSummaryList = null): ListRoutingProfilesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RoutingProfileSummaryList != null) __obj.updateDynamic("RoutingProfileSummaryList")(RoutingProfileSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRoutingProfilesResponse]
  }
}

