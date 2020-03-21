package typingsJapgolly.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDedicatedIpsResponse extends js.Object {
  /**
    * A list of dedicated IP addresses that are associated with your AWS account.
    */
  var DedicatedIps: js.UndefOr[DedicatedIpList] = js.native
  /**
    * A token that indicates that there are additional dedicated IP addresses to list. To view additional addresses, issue another request to GetDedicatedIps, passing this token in the NextToken parameter.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.sesv2Mod.NextToken] = js.native
}

object GetDedicatedIpsResponse {
  @scala.inline
  def apply(DedicatedIps: DedicatedIpList = null, NextToken: NextToken = null): GetDedicatedIpsResponse = {
    val __obj = js.Dynamic.literal()
    if (DedicatedIps != null) __obj.updateDynamic("DedicatedIps")(DedicatedIps.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDedicatedIpsResponse]
  }
}

