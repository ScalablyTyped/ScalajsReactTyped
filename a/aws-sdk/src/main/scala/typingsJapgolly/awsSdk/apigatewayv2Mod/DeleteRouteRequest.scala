package typingsJapgolly.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRouteRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  /**
    * The route ID.
    */
  var RouteId: string = js.native
}

object DeleteRouteRequest {
  @scala.inline
  def apply(ApiId: string, RouteId: string): DeleteRouteRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], RouteId = RouteId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteRouteRequest]
  }
}

