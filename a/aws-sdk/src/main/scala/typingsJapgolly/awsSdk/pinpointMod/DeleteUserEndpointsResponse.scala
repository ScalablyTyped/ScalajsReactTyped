package typingsJapgolly.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteUserEndpointsResponse extends js.Object {
  var EndpointsResponse: typingsJapgolly.awsSdk.pinpointMod.EndpointsResponse = js.native
}

object DeleteUserEndpointsResponse {
  @scala.inline
  def apply(EndpointsResponse: EndpointsResponse): DeleteUserEndpointsResponse = {
    val __obj = js.Dynamic.literal(EndpointsResponse = EndpointsResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteUserEndpointsResponse]
  }
}

