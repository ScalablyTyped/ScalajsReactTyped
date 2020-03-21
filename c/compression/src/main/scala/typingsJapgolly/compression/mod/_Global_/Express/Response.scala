package typingsJapgolly.compression.mod._Global_.Express

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  /**
    * Forces the partially-compressed response to be flushed to the client.
    */
  def flush(): Unit
}

object Response {
  @scala.inline
  def apply(flush: Callback): Response = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("flush")(flush.toJsFn)
    __obj.asInstanceOf[Response]
  }
}

