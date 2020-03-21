package typingsJapgolly.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallsListResponse extends js.Object {
  /** An installation of an app for a user on a specific device. The existence of an install implies that the user must have an entitlement to the app. */
  var install: js.UndefOr[js.Array[Install]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#installsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
}

object InstallsListResponse {
  @scala.inline
  def apply(install: js.Array[Install] = null, kind: String = null): InstallsListResponse = {
    val __obj = js.Dynamic.literal()
    if (install != null) __obj.updateDynamic("install")(install.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallsListResponse]
  }
}

