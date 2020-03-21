package typingsJapgolly.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizedKeysView extends js.Object {
  /** [Output Only] The list of authorized public keys in SSH format. */
  var keys: js.UndefOr[js.Array[String]] = js.undefined
  /** [Output Only] Whether the user has the ability to elevate on the instance that requested the authorized keys. */
  var sudoer: js.UndefOr[Boolean] = js.undefined
}

object AuthorizedKeysView {
  @scala.inline
  def apply(keys: js.Array[String] = null, sudoer: js.UndefOr[Boolean] = js.undefined): AuthorizedKeysView = {
    val __obj = js.Dynamic.literal()
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (!js.isUndefined(sudoer)) __obj.updateDynamic("sudoer")(sudoer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizedKeysView]
  }
}

