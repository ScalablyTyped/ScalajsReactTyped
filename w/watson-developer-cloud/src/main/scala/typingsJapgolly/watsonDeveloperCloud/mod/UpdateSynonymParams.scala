package typingsJapgolly.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `updateSynonym` operation. */
trait UpdateSynonymParams extends js.Object {
  /** The name of the entity. */
  var entity: String
  var headers: js.UndefOr[js.Object] = js.undefined
  /** The text of the synonym. This string must conform to the following restrictions: - It cannot contain carriage return, newline, or tab characters. - It cannot consist of only whitespace characters. - It must be no longer than 64 characters. */
  var new_synonym: js.UndefOr[String] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** The text of the synonym. */
  var synonym: String
  /** The text of the entity value. */
  var value: String
  /** Unique identifier of the workspace. */
  var workspace_id: String
}

object UpdateSynonymParams {
  @scala.inline
  def apply(
    entity: String,
    synonym: String,
    value: String,
    workspace_id: String,
    headers: js.Object = null,
    new_synonym: String = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): UpdateSynonymParams = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], synonym = synonym.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (new_synonym != null) __obj.updateDynamic("new_synonym")(new_synonym.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSynonymParams]
  }
}

