package typingsJapgolly.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUserStatesResponse extends js.Object {
  /** Current response metadata. */
  var responseMetadata: js.UndefOr[ResponseMetadata] = js.undefined
  /** User's states. */
  var userStates: js.UndefOr[js.Array[String]] = js.undefined
}

object ListUserStatesResponse {
  @scala.inline
  def apply(responseMetadata: ResponseMetadata = null, userStates: js.Array[String] = null): ListUserStatesResponse = {
    val __obj = js.Dynamic.literal()
    if (responseMetadata != null) __obj.updateDynamic("responseMetadata")(responseMetadata.asInstanceOf[js.Any])
    if (userStates != null) __obj.updateDynamic("userStates")(userStates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUserStatesResponse]
  }
}

