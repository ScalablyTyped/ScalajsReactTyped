package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEndpointOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the endpoint.
    */
  var EndpointArn: typingsJapgolly.awsSdk.sagemakerMod.EndpointArn = js.native
}

object CreateEndpointOutput {
  @scala.inline
  def apply(EndpointArn: EndpointArn): CreateEndpointOutput = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateEndpointOutput]
  }
}

