package typingsJapgolly.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetModelTemplateRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  /**
    * The model ID.
    */
  var ModelId: string = js.native
}

object GetModelTemplateRequest {
  @scala.inline
  def apply(ApiId: string, ModelId: string): GetModelTemplateRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], ModelId = ModelId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetModelTemplateRequest]
  }
}

