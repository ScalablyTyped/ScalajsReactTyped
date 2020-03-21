package typingsJapgolly.reduxTestkit

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFlush extends js.Object {
  def flush(): Unit
  def reset(): Unit
}

object AnonFlush {
  @scala.inline
  def apply(flush: Callback, reset: Callback): AnonFlush = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("flush")(flush.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[AnonFlush]
  }
}

