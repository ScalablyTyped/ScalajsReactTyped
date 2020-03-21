package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpcEndpointServicesRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * One or more filters.    service-name - The name of the service.    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The maximum number of items to return for this request. The request returns a token that you can specify in a subsequent call to get the next set of results. Constraint: If the value is greater than 1,000, we return only 1,000 items.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a prior call.)
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * One or more service names.
    */
  var ServiceNames: js.UndefOr[ValueStringList] = js.native
}

object DescribeVpcEndpointServicesRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    Filters: FilterList = null,
    MaxResults: Int | scala.Double = null,
    NextToken: String = null,
    ServiceNames: ValueStringList = null
  ): DescribeVpcEndpointServicesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ServiceNames != null) __obj.updateDynamic("ServiceNames")(ServiceNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVpcEndpointServicesRequest]
  }
}

