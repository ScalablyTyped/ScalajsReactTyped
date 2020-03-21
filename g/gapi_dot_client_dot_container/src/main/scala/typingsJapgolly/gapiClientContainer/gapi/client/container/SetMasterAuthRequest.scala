package typingsJapgolly.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetMasterAuthRequest extends js.Object {
  /** The exact form of action to be taken on the master auth. */
  var action: js.UndefOr[String] = js.undefined
  /** A description of the update. */
  var update: js.UndefOr[MasterAuth] = js.undefined
}

object SetMasterAuthRequest {
  @scala.inline
  def apply(action: String = null, update: MasterAuth = null): SetMasterAuthRequest = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetMasterAuthRequest]
  }
}

