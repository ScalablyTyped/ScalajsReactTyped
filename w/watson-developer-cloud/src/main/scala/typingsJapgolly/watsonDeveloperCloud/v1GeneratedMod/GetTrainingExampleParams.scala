package typingsJapgolly.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `getTrainingExample` operation. */
trait GetTrainingExampleParams extends js.Object {
  /** The ID of the collection. */
  var collection_id: String
  /** The ID of the environment. */
  var environment_id: String
  /** The ID of the document as it is indexed. */
  var example_id: String
  var headers: js.UndefOr[js.Object] = js.undefined
  /** The ID of the query used for training. */
  var query_id: String
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object GetTrainingExampleParams {
  @scala.inline
  def apply(
    collection_id: String,
    environment_id: String,
    example_id: String,
    query_id: String,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): GetTrainingExampleParams = {
    val __obj = js.Dynamic.literal(collection_id = collection_id.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any], example_id = example_id.asInstanceOf[js.Any], query_id = query_id.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTrainingExampleParams]
  }
}

