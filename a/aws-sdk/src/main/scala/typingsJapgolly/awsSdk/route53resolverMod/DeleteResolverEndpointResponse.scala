package typingsJapgolly.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteResolverEndpointResponse extends js.Object {
  /**
    * Information about the DeleteResolverEndpoint request, including the status of the request.
    */
  var ResolverEndpoint: js.UndefOr[typingsJapgolly.awsSdk.route53resolverMod.ResolverEndpoint] = js.native
}

object DeleteResolverEndpointResponse {
  @scala.inline
  def apply(ResolverEndpoint: ResolverEndpoint = null): DeleteResolverEndpointResponse = {
    val __obj = js.Dynamic.literal()
    if (ResolverEndpoint != null) __obj.updateDynamic("ResolverEndpoint")(ResolverEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResolverEndpointResponse]
  }
}

