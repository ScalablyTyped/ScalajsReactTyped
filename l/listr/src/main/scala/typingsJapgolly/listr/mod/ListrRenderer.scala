package typingsJapgolly.listr.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListrRenderer extends js.Object {
  def end(err: js.Error): Unit
  def render(): Unit
}

object ListrRenderer {
  @scala.inline
  def apply(end: js.Error => Callback, render: Callback): ListrRenderer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(js.Any.fromFunction1((t0: js.Error) => end(t0).runNow()))
    __obj.updateDynamic("render")(render.toJsFn)
    __obj.asInstanceOf[ListrRenderer]
  }
}

