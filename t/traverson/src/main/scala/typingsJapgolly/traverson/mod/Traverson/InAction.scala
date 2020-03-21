package typingsJapgolly.traverson.mod.Traverson

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InAction extends js.Object {
  def abort(): Unit
}

object InAction {
  @scala.inline
  def apply(abort: Callback): InAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort.toJsFn)
    __obj.asInstanceOf[InAction]
  }
}

