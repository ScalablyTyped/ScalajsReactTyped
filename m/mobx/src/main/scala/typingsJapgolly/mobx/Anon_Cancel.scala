package typingsJapgolly.mobx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancel extends js.Object {
  def cancel(): Unit
}

object Anon_Cancel {
  @scala.inline
  def apply(cancel: Callback): Anon_Cancel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.asInstanceOf[Anon_Cancel]
  }
}

