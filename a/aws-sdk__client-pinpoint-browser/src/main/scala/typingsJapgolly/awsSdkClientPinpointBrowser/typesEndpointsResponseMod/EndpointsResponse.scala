package typingsJapgolly.awsSdkClientPinpointBrowser.typesEndpointsResponseMod

import typingsJapgolly.awsSdkClientPinpointBrowser.typesEndpointResponseMod.EndpointResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointsResponse extends js.Object {
  /**
    * The list of endpoints.
    */
  var Item: js.UndefOr[js.Array[EndpointResponse] | js.Iterable[EndpointResponse]] = js.undefined
}

object EndpointsResponse {
  @scala.inline
  def apply(Item: js.Array[EndpointResponse] | js.Iterable[EndpointResponse] = null): EndpointsResponse = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointsResponse]
  }
}

