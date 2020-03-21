package typingsJapgolly.restify.mod

import typingsJapgolly.restify.AnonPassword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestAuthorization extends js.Object {
  var basic: js.UndefOr[AnonPassword] = js.undefined
  var credentials: String
  var scheme: String
}

object RequestAuthorization {
  @scala.inline
  def apply(credentials: String, scheme: String, basic: AnonPassword = null): RequestAuthorization = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    if (basic != null) __obj.updateDynamic("basic")(basic.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestAuthorization]
  }
}

