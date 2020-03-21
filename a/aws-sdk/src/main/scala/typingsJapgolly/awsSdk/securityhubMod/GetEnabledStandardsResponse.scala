package typingsJapgolly.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEnabledStandardsResponse extends js.Object {
  /**
    * The pagination token to use to request the next page of results.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.securityhubMod.NextToken] = js.native
  /**
    * The list of StandardsSubscriptions objects that include information about the enabled standards.
    */
  var StandardsSubscriptions: js.UndefOr[typingsJapgolly.awsSdk.securityhubMod.StandardsSubscriptions] = js.native
}

object GetEnabledStandardsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, StandardsSubscriptions: StandardsSubscriptions = null): GetEnabledStandardsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StandardsSubscriptions != null) __obj.updateDynamic("StandardsSubscriptions")(StandardsSubscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEnabledStandardsResponse]
  }
}

