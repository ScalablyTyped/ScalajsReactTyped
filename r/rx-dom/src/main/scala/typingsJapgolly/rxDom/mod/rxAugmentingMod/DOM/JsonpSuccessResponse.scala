package typingsJapgolly.rxDom.mod.rxAugmentingMod.DOM

import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonpSuccessResponse extends js.Object {
  var originalEvent: Event_
  var response: js.Any
  var responseType: String
  var status: Double
}

object JsonpSuccessResponse {
  @scala.inline
  def apply(originalEvent: Event_, response: js.Any, responseType: String, status: Double): JsonpSuccessResponse = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JsonpSuccessResponse]
  }
}

