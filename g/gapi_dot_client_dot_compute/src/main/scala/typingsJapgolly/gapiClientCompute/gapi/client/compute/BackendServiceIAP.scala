package typingsJapgolly.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackendServiceIAP extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var oauth2ClientId: js.UndefOr[String] = js.undefined
  var oauth2ClientSecret: js.UndefOr[String] = js.undefined
  /** [Output Only] SHA256 hash value for the field oauth2_client_secret above. */
  var oauth2ClientSecretSha256: js.UndefOr[String] = js.undefined
}

object BackendServiceIAP {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    oauth2ClientId: String = null,
    oauth2ClientSecret: String = null,
    oauth2ClientSecretSha256: String = null
  ): BackendServiceIAP = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (oauth2ClientId != null) __obj.updateDynamic("oauth2ClientId")(oauth2ClientId.asInstanceOf[js.Any])
    if (oauth2ClientSecret != null) __obj.updateDynamic("oauth2ClientSecret")(oauth2ClientSecret.asInstanceOf[js.Any])
    if (oauth2ClientSecretSha256 != null) __obj.updateDynamic("oauth2ClientSecretSha256")(oauth2ClientSecretSha256.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendServiceIAP]
  }
}

