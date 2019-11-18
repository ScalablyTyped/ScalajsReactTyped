package typingsJapgolly.lodash.lodashMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cancelable extends js.Object {
  def cancel(): Unit
  def flush(): Unit
}

object Cancelable {
  @scala.inline
  def apply(cancel: Callback, flush: Callback): Cancelable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.updateDynamic("flush")(flush.toJsFn)
    __obj.asInstanceOf[Cancelable]
  }
}

