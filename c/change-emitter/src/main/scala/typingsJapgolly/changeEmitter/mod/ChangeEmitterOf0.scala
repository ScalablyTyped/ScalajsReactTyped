package typingsJapgolly.changeEmitter.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEmitterOf0 extends js.Object {
  def emit(): Unit
  def listen(listener: ListenerOf0): Unlisten
}

object ChangeEmitterOf0 {
  @scala.inline
  def apply(emit: Callback, listen: ListenerOf0 => CallbackTo[Unlisten]): ChangeEmitterOf0 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("emit")(emit.toJsFn)
    __obj.updateDynamic("listen")(js.Any.fromFunction1((t0: typingsJapgolly.changeEmitter.mod.ListenerOf0) => listen(t0).runNow()))
    __obj.asInstanceOf[ChangeEmitterOf0]
  }
}

