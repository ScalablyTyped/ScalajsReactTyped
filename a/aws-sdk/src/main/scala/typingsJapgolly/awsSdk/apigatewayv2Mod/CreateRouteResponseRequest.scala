package typingsJapgolly.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRouteResponseRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  /**
    * The model selection expression for the route response. Supported only for WebSocket APIs.
    */
  var ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.native
  /**
    * The response models for the route response.
    */
  var ResponseModels: js.UndefOr[RouteModels] = js.native
  /**
    * The route response parameters.
    */
  var ResponseParameters: js.UndefOr[RouteParameters] = js.native
  /**
    * The route ID.
    */
  var RouteId: string = js.native
  /**
    * The route response key.
    */
  var RouteResponseKey: SelectionKey = js.native
}

object CreateRouteResponseRequest {
  @scala.inline
  def apply(
    ApiId: string,
    RouteId: string,
    RouteResponseKey: SelectionKey,
    ModelSelectionExpression: SelectionExpression = null,
    ResponseModels: RouteModels = null,
    ResponseParameters: RouteParameters = null
  ): CreateRouteResponseRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], RouteId = RouteId.asInstanceOf[js.Any], RouteResponseKey = RouteResponseKey.asInstanceOf[js.Any])
    if (ModelSelectionExpression != null) __obj.updateDynamic("ModelSelectionExpression")(ModelSelectionExpression.asInstanceOf[js.Any])
    if (ResponseModels != null) __obj.updateDynamic("ResponseModels")(ResponseModels.asInstanceOf[js.Any])
    if (ResponseParameters != null) __obj.updateDynamic("ResponseParameters")(ResponseParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRouteResponseRequest]
  }
}

