package typingsJapgolly.gapiClientOslogin.gapi.client.oslogin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportSshPublicKeyResponse extends js.Object {
  /** The login profile information for the user. */
  var loginProfile: js.UndefOr[LoginProfile] = js.undefined
}

object ImportSshPublicKeyResponse {
  @scala.inline
  def apply(loginProfile: LoginProfile = null): ImportSshPublicKeyResponse = {
    val __obj = js.Dynamic.literal()
    if (loginProfile != null) __obj.updateDynamic("loginProfile")(loginProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportSshPublicKeyResponse]
  }
}

