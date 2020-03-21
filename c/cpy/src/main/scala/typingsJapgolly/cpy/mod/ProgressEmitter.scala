package typingsJapgolly.cpy.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cpy.cpyStrings.progress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressEmitter extends js.Object {
  @JSName("on")
  def on_progress(event: progress, handler: js.Function1[/* progress */ ProgressData, Unit]): js.Promise[js.Array[String]]
}

object ProgressEmitter {
  @scala.inline
  def apply(
    on: (progress, js.Function1[/* progress */ ProgressData, Unit]) => CallbackTo[js.Promise[js.Array[String]]]
  ): ProgressEmitter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: typingsJapgolly.cpy.cpyStrings.progress, t1: js.Function1[/* progress */ typingsJapgolly.cpy.mod.ProgressData, scala.Unit]) => on(t0, t1).runNow()))
    __obj.asInstanceOf[ProgressEmitter]
  }
}

