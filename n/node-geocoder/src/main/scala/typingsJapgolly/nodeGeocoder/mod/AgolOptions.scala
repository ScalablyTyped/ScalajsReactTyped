package typingsJapgolly.nodeGeocoder.mod

import typingsJapgolly.nodeGeocoder.nodeGeocoderStrings.agol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgolOptions extends js.Object {
  var client_id: js.UndefOr[String] = js.undefined
  var client_secret: js.UndefOr[String] = js.undefined
  var provider: agol
}

object AgolOptions {
  @scala.inline
  def apply(provider: agol, client_id: String = null, client_secret: String = null): AgolOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    if (client_id != null) __obj.updateDynamic("client_id")(client_id.asInstanceOf[js.Any])
    if (client_secret != null) __obj.updateDynamic("client_secret")(client_secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgolOptions]
  }
}

