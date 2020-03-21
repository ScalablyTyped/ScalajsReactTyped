package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHostReservationsRequest extends js.Object {
  /**
    * The filters.    instance-family - The instance family (for example, m4).    payment-option - The payment option (NoUpfront | PartialUpfront | AllUpfront).    state - The state of the reservation (payment-pending | payment-failed | active | retired).    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.  
    */
  var Filter: js.UndefOr[FilterList] = js.native
  /**
    * The host reservation IDs.
    */
  var HostReservationIdSet: js.UndefOr[typingsJapgolly.awsSdk.ec2Mod.HostReservationIdSet] = js.native
  /**
    * The maximum number of results to return for the request in a single page. The remaining results can be seen by sending another request with the returned nextToken value. This value can be between 5 and 500. If maxResults is given a larger value than 500, you receive an error.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeHostReservationsRequest {
  @scala.inline
  def apply(
    Filter: FilterList = null,
    HostReservationIdSet: HostReservationIdSet = null,
    MaxResults: Int | scala.Double = null,
    NextToken: String = null
  ): DescribeHostReservationsRequest = {
    val __obj = js.Dynamic.literal()
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    if (HostReservationIdSet != null) __obj.updateDynamic("HostReservationIdSet")(HostReservationIdSet.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHostReservationsRequest]
  }
}

