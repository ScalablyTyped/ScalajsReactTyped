package typingsJapgolly.natsHemera.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerResponse extends js.Object {
  var error: js.Error
  var payload: HemeraMessagePayload
}

object ServerResponse {
  @scala.inline
  def apply(error: js.Error, payload: HemeraMessagePayload): ServerResponse = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServerResponse]
  }
}

