package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEndpointConfigInput extends js.Object {
  /**
    * The name of the endpoint configuration.
    */
  var EndpointConfigName: typingsJapgolly.awsSdk.sagemakerMod.EndpointConfigName = js.native
}

object DescribeEndpointConfigInput {
  @scala.inline
  def apply(EndpointConfigName: EndpointConfigName): DescribeEndpointConfigInput = {
    val __obj = js.Dynamic.literal(EndpointConfigName = EndpointConfigName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeEndpointConfigInput]
  }
}

