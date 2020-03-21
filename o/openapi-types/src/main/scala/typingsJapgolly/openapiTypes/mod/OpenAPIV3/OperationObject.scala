package typingsJapgolly.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.openapiTypes.mod.OpenAPI.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationObject extends Operation {
  var callbacks: js.UndefOr[StringDictionary[ReferenceObject | CallbackObject]] = js.undefined
  var deprecated: js.UndefOr[Boolean] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var externalDocs: js.UndefOr[ExternalDocumentationObject] = js.undefined
  var operationId: js.UndefOr[String] = js.undefined
  var parameters: js.UndefOr[js.Array[ReferenceObject | ParameterObject]] = js.undefined
  var requestBody: js.UndefOr[ReferenceObject | RequestBodyObject] = js.undefined
  var responses: js.UndefOr[ResponsesObject] = js.undefined
  var security: js.UndefOr[js.Array[SecurityRequirementObject]] = js.undefined
  var servers: js.UndefOr[js.Array[ServerObject]] = js.undefined
  var summary: js.UndefOr[String] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object OperationObject {
  @scala.inline
  def apply(
    callbacks: StringDictionary[ReferenceObject | CallbackObject] = null,
    deprecated: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    externalDocs: ExternalDocumentationObject = null,
    operationId: String = null,
    parameters: js.Array[ReferenceObject | ParameterObject] = null,
    requestBody: ReferenceObject | RequestBodyObject = null,
    responses: ResponsesObject = null,
    security: js.Array[SecurityRequirementObject] = null,
    servers: js.Array[ServerObject] = null,
    summary: String = null,
    tags: js.Array[String] = null
  ): OperationObject = {
    val __obj = js.Dynamic.literal()
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (externalDocs != null) __obj.updateDynamic("externalDocs")(externalDocs.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody.asInstanceOf[js.Any])
    if (responses != null) __obj.updateDynamic("responses")(responses.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (servers != null) __obj.updateDynamic("servers")(servers.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationObject]
  }
}

