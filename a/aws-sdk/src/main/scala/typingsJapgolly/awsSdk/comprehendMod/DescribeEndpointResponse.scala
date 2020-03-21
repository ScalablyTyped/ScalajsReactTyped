package typingsJapgolly.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEndpointResponse extends js.Object {
  /**
    * Describes information associated with the specific endpoint.
    */
  var EndpointProperties: js.UndefOr[typingsJapgolly.awsSdk.comprehendMod.EndpointProperties] = js.native
}

object DescribeEndpointResponse {
  @scala.inline
  def apply(EndpointProperties: EndpointProperties = null): DescribeEndpointResponse = {
    val __obj = js.Dynamic.literal()
    if (EndpointProperties != null) __obj.updateDynamic("EndpointProperties")(EndpointProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndpointResponse]
  }
}

