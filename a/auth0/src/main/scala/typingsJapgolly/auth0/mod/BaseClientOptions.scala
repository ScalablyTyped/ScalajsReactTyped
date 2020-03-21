package typingsJapgolly.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseClientOptions extends js.Object {
  var baseUrl: String
  var clientId: js.UndefOr[String] = js.undefined
}

object BaseClientOptions {
  @scala.inline
  def apply(baseUrl: String, clientId: String = null): BaseClientOptions = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseClientOptions]
  }
}

