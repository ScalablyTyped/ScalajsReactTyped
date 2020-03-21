package typingsJapgolly.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInstancesResponse extends js.Object {
  /**
    * Summary information about the instances that are associated with the specified service.
    */
  var Instances: js.UndefOr[InstanceSummaryList] = js.native
  /**
    * If more than MaxResults instances match the specified criteria, you can submit another ListInstances request to get the next group of results. Specify the value of NextToken from the previous response in the next request.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.servicediscoveryMod.NextToken] = js.native
}

object ListInstancesResponse {
  @scala.inline
  def apply(Instances: InstanceSummaryList = null, NextToken: NextToken = null): ListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    if (Instances != null) __obj.updateDynamic("Instances")(Instances.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInstancesResponse]
  }
}

