package typingsJapgolly.chromeApps.chrome.displaySource

import typingsJapgolly.chromeApps.AnonPBC
import typingsJapgolly.chromeApps.chrome.ToStringLiteral
import typingsJapgolly.chromeApps.chromeAppsStrings.PBC
import typingsJapgolly.chromeApps.chromeAppsStrings.PIN
import typingsJapgolly.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationInfo extends js.Object {
  /**
    * Authentication data (e.g. PIN value).
    */
  var data: js.UndefOr[String] = js.undefined
  /**
    * Authentication method.
    * @see AuthenticationMethod
    */
  var method: js.UndefOr[ToStringLiteral[AnonPBC, String, Exclude[String, PBC | PIN]]] = js.undefined
}

object AuthenticationInfo {
  @scala.inline
  def apply(data: String = null, method: ToStringLiteral[AnonPBC, String, Exclude[String, PBC | PIN]] = null): AuthenticationInfo = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationInfo]
  }
}

