package typingsJapgolly.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Api extends js.Object {
  /**
    * The URI of the API, of the form {api-id}.execute-api.{region}.amazonaws.com. The stage name is typically appended to this URI to form a complete path to a deployed API stage.
    */
  var ApiEndpoint: js.UndefOr[string] = js.native
  /**
    * The API ID.
    */
  var ApiId: js.UndefOr[Id] = js.native
  /**
    * An API key selection expression. Supported only for WebSocket APIs. See API Key Selection Expressions.
    */
  var ApiKeySelectionExpression: js.UndefOr[SelectionExpression] = js.native
  /**
    * A CORS configuration. Supported only for HTTP APIs.
    */
  var CorsConfiguration: js.UndefOr[Cors] = js.native
  /**
    * The timestamp when the API was created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.native
  /**
    * The description of the API.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.native
  /**
    * Avoid validating models when creating a deployment. Supported only for WebSocket APIs.
    */
  var DisableSchemaValidation: js.UndefOr[boolean] = js.native
  /**
    * The validation information during API import. This may include particular properties of your OpenAPI definition which are ignored during import. Supported only for HTTP APIs.
    */
  var ImportInfo: js.UndefOr[listOfString] = js.native
  /**
    * The name of the API.
    */
  var Name: StringWithLengthBetween1And128 = js.native
  /**
    * The API protocol.
    */
  var ProtocolType: typingsJapgolly.awsSdk.apigatewayv2Mod.ProtocolType = js.native
  /**
    * The route selection expression for the API. For HTTP APIs, the routeSelectionExpression must be ${request.method} ${request.path}. If not provided, this will be the default for HTTP APIs. This property is required for WebSocket APIs.
    */
  var RouteSelectionExpression: SelectionExpression = js.native
  /**
    * A collection of tags associated with the API.
    */
  var Tags: js.UndefOr[typingsJapgolly.awsSdk.apigatewayv2Mod.Tags] = js.native
  /**
    * A version identifier for the API.
    */
  var Version: js.UndefOr[StringWithLengthBetween1And64] = js.native
  /**
    * The warning messages reported when failonwarnings is turned on during API import.
    */
  var Warnings: js.UndefOr[listOfString] = js.native
}

object Api {
  @scala.inline
  def apply(
    Name: StringWithLengthBetween1And128,
    ProtocolType: ProtocolType,
    RouteSelectionExpression: SelectionExpression,
    ApiEndpoint: string = null,
    ApiId: Id = null,
    ApiKeySelectionExpression: SelectionExpression = null,
    CorsConfiguration: Cors = null,
    CreatedDate: js.Date = null,
    Description: StringWithLengthBetween0And1024 = null,
    DisableSchemaValidation: js.UndefOr[Boolean] = js.undefined,
    ImportInfo: listOfString = null,
    Tags: Tags = null,
    Version: StringWithLengthBetween1And64 = null,
    Warnings: listOfString = null
  ): Api = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], ProtocolType = ProtocolType.asInstanceOf[js.Any], RouteSelectionExpression = RouteSelectionExpression.asInstanceOf[js.Any])
    if (ApiEndpoint != null) __obj.updateDynamic("ApiEndpoint")(ApiEndpoint.asInstanceOf[js.Any])
    if (ApiId != null) __obj.updateDynamic("ApiId")(ApiId.asInstanceOf[js.Any])
    if (ApiKeySelectionExpression != null) __obj.updateDynamic("ApiKeySelectionExpression")(ApiKeySelectionExpression.asInstanceOf[js.Any])
    if (CorsConfiguration != null) __obj.updateDynamic("CorsConfiguration")(CorsConfiguration.asInstanceOf[js.Any])
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(DisableSchemaValidation)) __obj.updateDynamic("DisableSchemaValidation")(DisableSchemaValidation.asInstanceOf[js.Any])
    if (ImportInfo != null) __obj.updateDynamic("ImportInfo")(ImportInfo.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    if (Warnings != null) __obj.updateDynamic("Warnings")(Warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Api]
  }
}

