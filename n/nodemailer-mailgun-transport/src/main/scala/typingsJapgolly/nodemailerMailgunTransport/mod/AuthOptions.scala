package typingsJapgolly.nodemailerMailgunTransport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthOptions extends js.Object {
  var api_key: String
  var domain: js.UndefOr[String] = js.undefined
}

object AuthOptions {
  @scala.inline
  def apply(api_key: String, domain: String = null): AuthOptions = {
    val __obj = js.Dynamic.literal(api_key = api_key.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthOptions]
  }
}

