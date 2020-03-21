package typingsJapgolly.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApiMappingResponse extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: js.UndefOr[Id] = js.native
  /**
    * The API mapping identifier.
    */
  var ApiMappingId: js.UndefOr[Id] = js.native
  /**
    * The API mapping key.
    */
  var ApiMappingKey: js.UndefOr[SelectionKey] = js.native
  /**
    * The API stage.
    */
  var Stage: js.UndefOr[StringWithLengthBetween1And128] = js.native
}

object GetApiMappingResponse {
  @scala.inline
  def apply(
    ApiId: Id = null,
    ApiMappingId: Id = null,
    ApiMappingKey: SelectionKey = null,
    Stage: StringWithLengthBetween1And128 = null
  ): GetApiMappingResponse = {
    val __obj = js.Dynamic.literal()
    if (ApiId != null) __obj.updateDynamic("ApiId")(ApiId.asInstanceOf[js.Any])
    if (ApiMappingId != null) __obj.updateDynamic("ApiMappingId")(ApiMappingId.asInstanceOf[js.Any])
    if (ApiMappingKey != null) __obj.updateDynamic("ApiMappingKey")(ApiMappingKey.asInstanceOf[js.Any])
    if (Stage != null) __obj.updateDynamic("Stage")(Stage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApiMappingResponse]
  }
}

