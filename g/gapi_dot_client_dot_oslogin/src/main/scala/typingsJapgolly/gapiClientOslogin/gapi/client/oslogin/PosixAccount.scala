package typingsJapgolly.gapiClientOslogin.gapi.client.oslogin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PosixAccount extends js.Object {
  /** The GECOS (user information) entry for this account. */
  var gecos: js.UndefOr[String] = js.undefined
  /** The default group ID. */
  var gid: js.UndefOr[String] = js.undefined
  /** The path to the home directory for this account. */
  var homeDirectory: js.UndefOr[String] = js.undefined
  /** Only one POSIX account can be marked as primary. */
  var primary: js.UndefOr[Boolean] = js.undefined
  /** The path to the logic shell for this account. */
  var shell: js.UndefOr[String] = js.undefined
  /**
    * System identifier for which account the username or uid applies to.
    * By default, the empty value is used.
    */
  var systemId: js.UndefOr[String] = js.undefined
  /** The user ID. */
  var uid: js.UndefOr[String] = js.undefined
  /** The username of the POSIX account. */
  var username: js.UndefOr[String] = js.undefined
}

object PosixAccount {
  @scala.inline
  def apply(
    gecos: String = null,
    gid: String = null,
    homeDirectory: String = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    shell: String = null,
    systemId: String = null,
    uid: String = null,
    username: String = null
  ): PosixAccount = {
    val __obj = js.Dynamic.literal()
    if (gecos != null) __obj.updateDynamic("gecos")(gecos.asInstanceOf[js.Any])
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (homeDirectory != null) __obj.updateDynamic("homeDirectory")(homeDirectory.asInstanceOf[js.Any])
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (shell != null) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    if (systemId != null) __obj.updateDynamic("systemId")(systemId.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[PosixAccount]
  }
}

