package typingsJapgolly.tinymce.mod.ui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Factory extends js.Object {
  def create(settings: js.Any): Control
}

object Factory {
  @scala.inline
  def apply(create: js.Any => CallbackTo[Control]): Factory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: js.Any) => create(t0).runNow()))
    __obj.asInstanceOf[Factory]
  }
}

