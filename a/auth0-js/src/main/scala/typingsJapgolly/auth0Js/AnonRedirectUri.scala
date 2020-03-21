package typingsJapgolly.auth0Js

import typingsJapgolly.auth0Js.auth0JsStrings.fragment
import typingsJapgolly.auth0Js.auth0JsStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRedirectUri extends js.Object {
  /** url that the Auth0 will redirect after Auth with the Authorization Response */
  var redirectUri: js.UndefOr[String] = js.undefined
  /** how the AuthN response is encoded and redirected back to the client. */
  var responseMode: js.UndefOr[query | fragment] = js.undefined
  /** type of the response used. It can be any of the values `code` and `token` */
  var responseType: js.UndefOr[String] = js.undefined
  /** scopes to be requested during AuthN. e.g. `openid email` */
  var scope: String
}

object AnonRedirectUri {
  @scala.inline
  def apply(
    scope: String,
    redirectUri: String = null,
    responseMode: query | fragment = null,
    responseType: String = null
  ): AnonRedirectUri = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri.asInstanceOf[js.Any])
    if (responseMode != null) __obj.updateDynamic("responseMode")(responseMode.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRedirectUri]
  }
}

