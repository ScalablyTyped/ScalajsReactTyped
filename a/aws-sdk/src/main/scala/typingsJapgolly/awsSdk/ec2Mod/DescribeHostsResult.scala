package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHostsResult extends js.Object {
  /**
    * Information about the Dedicated Hosts.
    */
  var Hosts: js.UndefOr[HostList] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeHostsResult {
  @scala.inline
  def apply(Hosts: HostList = null, NextToken: String = null): DescribeHostsResult = {
    val __obj = js.Dynamic.literal()
    if (Hosts != null) __obj.updateDynamic("Hosts")(Hosts.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHostsResult]
  }
}

