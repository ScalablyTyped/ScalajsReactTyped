package typingsJapgolly.vue2Editor.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueEditorWatch extends js.Object {
  def disabled(status: Boolean): Unit
  def value(`val`: js.Any): Unit
}

object VueEditorWatch {
  @scala.inline
  def apply(disabled: Boolean => Callback, value: js.Any => Callback): VueEditorWatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disabled")(js.Any.fromFunction1((t0: scala.Boolean) => disabled(t0).runNow()))
    __obj.updateDynamic("value")(js.Any.fromFunction1((t0: js.Any) => value(t0).runNow()))
    __obj.asInstanceOf[VueEditorWatch]
  }
}

