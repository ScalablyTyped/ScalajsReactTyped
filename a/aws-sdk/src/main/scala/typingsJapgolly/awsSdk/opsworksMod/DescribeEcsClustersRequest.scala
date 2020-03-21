package typingsJapgolly.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEcsClustersRequest extends js.Object {
  /**
    * A list of ARNs, one for each cluster to be described.
    */
  var EcsClusterArns: js.UndefOr[Strings] = js.native
  /**
    * To receive a paginated response, use this parameter to specify the maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  /**
    * If the previous paginated request did not return all of the remaining results, the response object'sNextToken parameter value is set to a token. To retrieve the next set of results, call DescribeEcsClusters again and assign that token to the request object's NextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * A stack ID. DescribeEcsClusters returns a description of the cluster that is registered with the stack.
    */
  var StackId: js.UndefOr[String] = js.native
}

object DescribeEcsClustersRequest {
  @scala.inline
  def apply(
    EcsClusterArns: Strings = null,
    MaxResults: Int | scala.Double = null,
    NextToken: String = null,
    StackId: String = null
  ): DescribeEcsClustersRequest = {
    val __obj = js.Dynamic.literal()
    if (EcsClusterArns != null) __obj.updateDynamic("EcsClusterArns")(EcsClusterArns.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StackId != null) __obj.updateDynamic("StackId")(StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEcsClustersRequest]
  }
}

