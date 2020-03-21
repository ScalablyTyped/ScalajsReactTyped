package typingsJapgolly.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `deleteDocument` operation. */
trait DeleteDocumentParams extends js.Object {
  /** The ID of the collection. */
  var collection_id: String
  /** The ID of the document. */
  var document_id: String
  /** The ID of the environment. */
  var environment_id: String
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object DeleteDocumentParams {
  @scala.inline
  def apply(
    collection_id: String,
    document_id: String,
    environment_id: String,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): DeleteDocumentParams = {
    val __obj = js.Dynamic.literal(collection_id = collection_id.asInstanceOf[js.Any], document_id = document_id.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDocumentParams]
  }
}

