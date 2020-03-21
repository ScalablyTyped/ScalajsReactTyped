package typingsJapgolly.authmosphere.bodyParametersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyParameters extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var grant_type: String
  var password: js.UndefOr[String] = js.undefined
  var redirect_uri: js.UndefOr[String] = js.undefined
  var refresh_token: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object BodyParameters {
  @scala.inline
  def apply(
    grant_type: String,
    code: String = null,
    password: String = null,
    redirect_uri: String = null,
    refresh_token: String = null,
    username: String = null
  ): BodyParameters = {
    val __obj = js.Dynamic.literal(grant_type = grant_type.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri.asInstanceOf[js.Any])
    if (refresh_token != null) __obj.updateDynamic("refresh_token")(refresh_token.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyParameters]
  }
}

