package typingsJapgolly.scheduler

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancel extends js.Object {
  def cancel(): Unit
}

object AnonCancel {
  @scala.inline
  def apply(cancel: Callback): AnonCancel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.asInstanceOf[AnonCancel]
  }
}

