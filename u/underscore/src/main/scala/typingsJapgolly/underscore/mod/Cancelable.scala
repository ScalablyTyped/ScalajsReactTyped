package typingsJapgolly.underscore.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cancelable extends js.Object {
  def cancel(): Unit
}

object Cancelable {
  @scala.inline
  def apply(cancel: Callback): Cancelable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.asInstanceOf[Cancelable]
  }
}

