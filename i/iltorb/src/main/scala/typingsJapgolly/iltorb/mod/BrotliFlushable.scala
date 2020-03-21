package typingsJapgolly.iltorb.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrotliFlushable extends js.Object {
  def flush(): Unit
}

object BrotliFlushable {
  @scala.inline
  def apply(flush: Callback): BrotliFlushable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("flush")(flush.toJsFn)
    __obj.asInstanceOf[BrotliFlushable]
  }
}

