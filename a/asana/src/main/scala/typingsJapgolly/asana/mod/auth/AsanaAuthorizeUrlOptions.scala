package typingsJapgolly.asana.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsanaAuthorizeUrlOptions extends js.Object {
  var asanaBaseUrl: js.UndefOr[String] = js.undefined
  var redirectUri: js.UndefOr[String] = js.undefined
}

object AsanaAuthorizeUrlOptions {
  @scala.inline
  def apply(asanaBaseUrl: String = null, redirectUri: String = null): AsanaAuthorizeUrlOptions = {
    val __obj = js.Dynamic.literal()
    if (asanaBaseUrl != null) __obj.updateDynamic("asanaBaseUrl")(asanaBaseUrl.asInstanceOf[js.Any])
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsanaAuthorizeUrlOptions]
  }
}

