package typingsJapgolly.heremaps.H.service

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property id {number} - the ID associated internally with this request
  * @property cancel {function()} - this function cancels the request and invokes the errback function
  */
trait JsonpRequestHandle extends js.Object {
  var id: Double
  def cancel(): Unit
}

object JsonpRequestHandle {
  @scala.inline
  def apply(cancel: Callback, id: Double): JsonpRequestHandle = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.asInstanceOf[JsonpRequestHandle]
  }
}

