package typingsJapgolly.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthClientOptions extends BaseClientOptions {
  var clientSecret: js.UndefOr[String] = js.undefined
}

object OAuthClientOptions {
  @scala.inline
  def apply(baseUrl: String, clientId: String = null, clientSecret: String = null): OAuthClientOptions = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthClientOptions]
  }
}

