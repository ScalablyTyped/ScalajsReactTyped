package typingsJapgolly.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProductsRequest extends js.Object {
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.securityhubMod.MaxResults] = js.native
  /**
    * The token that is required for pagination. On your first call to the DescribeProducts operation, set the value of this parameter to NULL. For subsequent calls to the operation, to continue listing data, set the value of this parameter to the value returned from the previous response.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.securityhubMod.NextToken] = js.native
}

object DescribeProductsRequest {
  @scala.inline
  def apply(MaxResults: Int | scala.Double = null, NextToken: NextToken = null): DescribeProductsRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProductsRequest]
  }
}

