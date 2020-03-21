package typingsJapgolly.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinuxGetAuthorizedKeysViewResponse extends js.Object {
  /** [Output Only] A list of authorized public keys for a user. */
  var resource: js.UndefOr[AuthorizedKeysView] = js.undefined
}

object LinuxGetAuthorizedKeysViewResponse {
  @scala.inline
  def apply(resource: AuthorizedKeysView = null): LinuxGetAuthorizedKeysViewResponse = {
    val __obj = js.Dynamic.literal()
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinuxGetAuthorizedKeysViewResponse]
  }
}

