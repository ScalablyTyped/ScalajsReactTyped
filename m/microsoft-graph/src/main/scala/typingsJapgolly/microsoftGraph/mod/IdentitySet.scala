package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitySet extends js.Object {
  // Optional. The application associated with this action.
  var application: js.UndefOr[Identity] = js.undefined
  // Optional. The device associated with this action.
  var device: js.UndefOr[Identity] = js.undefined
  // Optional. The user associated with this action.
  var user: js.UndefOr[Identity] = js.undefined
}

object IdentitySet {
  @scala.inline
  def apply(application: Identity = null, device: Identity = null, user: Identity = null): IdentitySet = {
    val __obj = js.Dynamic.literal()
    if (application != null) __obj.updateDynamic("application")(application.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentitySet]
  }
}

