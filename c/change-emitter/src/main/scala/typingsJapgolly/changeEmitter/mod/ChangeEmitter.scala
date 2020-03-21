package typingsJapgolly.changeEmitter.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEmitter extends js.Object {
  def emit(args: js.Any*): Unit
  def listen(listener: Listener): Unlisten
}

object ChangeEmitter {
  @scala.inline
  def apply(emit: /* repeated */ js.Any => Callback, listen: Listener => CallbackTo[Unlisten]): ChangeEmitter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("emit")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => emit(t0).runNow()))
    __obj.updateDynamic("listen")(js.Any.fromFunction1((t0: typingsJapgolly.changeEmitter.mod.Listener) => listen(t0).runNow()))
    __obj.asInstanceOf[ChangeEmitter]
  }
}

