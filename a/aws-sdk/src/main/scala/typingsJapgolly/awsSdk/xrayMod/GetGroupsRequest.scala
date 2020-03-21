package typingsJapgolly.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGroupsRequest extends js.Object {
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[GetGroupsNextToken] = js.native
}

object GetGroupsRequest {
  @scala.inline
  def apply(NextToken: GetGroupsNextToken = null): GetGroupsRequest = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGroupsRequest]
  }
}

