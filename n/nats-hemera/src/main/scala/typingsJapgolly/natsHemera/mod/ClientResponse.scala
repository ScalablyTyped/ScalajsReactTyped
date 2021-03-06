package typingsJapgolly.natsHemera.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientResponse extends js.Object {
  var error: js.Error
  var payload: HemeraMessagePayload
}

object ClientResponse {
  @scala.inline
  def apply(error: js.Error, payload: HemeraMessagePayload): ClientResponse = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientResponse]
  }
}

