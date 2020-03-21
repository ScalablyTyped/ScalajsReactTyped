package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpcClassicLinkDnsSupportRequest extends js.Object {
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[DescribeVpcClassicLinkDnsSupportMaxResults] = js.native
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[DescribeVpcClassicLinkDnsSupportNextToken] = js.native
  /**
    * One or more VPC IDs.
    */
  var VpcIds: js.UndefOr[VpcClassicLinkIdList] = js.native
}

object DescribeVpcClassicLinkDnsSupportRequest {
  @scala.inline
  def apply(
    MaxResults: Int | scala.Double = null,
    NextToken: DescribeVpcClassicLinkDnsSupportNextToken = null,
    VpcIds: VpcClassicLinkIdList = null
  ): DescribeVpcClassicLinkDnsSupportRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (VpcIds != null) __obj.updateDynamic("VpcIds")(VpcIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVpcClassicLinkDnsSupportRequest]
  }
}

