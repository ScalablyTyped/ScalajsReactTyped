package typingsJapgolly.debounce

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClear extends js.Object {
  def clear(): Unit
  def flush(): Unit
}

object AnonClear {
  @scala.inline
  def apply(clear: Callback, flush: Callback): AnonClear = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("flush")(flush.toJsFn)
    __obj.asInstanceOf[AnonClear]
  }
}

