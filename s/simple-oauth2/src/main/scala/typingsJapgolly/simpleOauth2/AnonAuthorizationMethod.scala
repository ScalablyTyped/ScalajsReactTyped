package typingsJapgolly.simpleOauth2

import typingsJapgolly.simpleOauth2.simpleOauth2Strings.body
import typingsJapgolly.simpleOauth2.simpleOauth2Strings.form
import typingsJapgolly.simpleOauth2.simpleOauth2Strings.header
import typingsJapgolly.simpleOauth2.simpleOauth2Strings.json
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthorizationMethod extends js.Object {
  /**
    * Indicates the method used to send the client.id/client.secret authorization params at the token request.
    * If set to body, the bodyFormat option will be used to format the credentials.
    * Defaults to header
    */
  var authorizationMethod: js.UndefOr[header | body] = js.undefined
  /** Format of data sent in the request body. Defaults to form. */
  var bodyFormat: js.UndefOr[json | form] = js.undefined
}

object AnonAuthorizationMethod {
  @scala.inline
  def apply(authorizationMethod: header | body = null, bodyFormat: json | form = null): AnonAuthorizationMethod = {
    val __obj = js.Dynamic.literal()
    if (authorizationMethod != null) __obj.updateDynamic("authorizationMethod")(authorizationMethod.asInstanceOf[js.Any])
    if (bodyFormat != null) __obj.updateDynamic("bodyFormat")(bodyFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthorizationMethod]
  }
}

