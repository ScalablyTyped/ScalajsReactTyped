package typingsJapgolly.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDedicatedIpPoolsResponse extends js.Object {
  /**
    * A list of all of the dedicated IP pools that are associated with your AWS account in the current Region.
    */
  var DedicatedIpPools: js.UndefOr[ListOfDedicatedIpPools] = js.native
  /**
    * A token that indicates that there are additional IP pools to list. To view additional IP pools, issue another request to ListDedicatedIpPools, passing this token in the NextToken parameter.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.sesv2Mod.NextToken] = js.native
}

object ListDedicatedIpPoolsResponse {
  @scala.inline
  def apply(DedicatedIpPools: ListOfDedicatedIpPools = null, NextToken: NextToken = null): ListDedicatedIpPoolsResponse = {
    val __obj = js.Dynamic.literal()
    if (DedicatedIpPools != null) __obj.updateDynamic("DedicatedIpPools")(DedicatedIpPools.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDedicatedIpPoolsResponse]
  }
}

