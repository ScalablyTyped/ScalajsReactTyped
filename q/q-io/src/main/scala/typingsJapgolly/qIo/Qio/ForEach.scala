package typingsJapgolly.qIo.Qio

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForEach extends js.Object {
  def forEach(callback: ForEachCallback): Promise[Unit]
}

object ForEach {
  @scala.inline
  def apply(forEach: ForEachCallback => CallbackTo[Promise[Unit]]): ForEach = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("forEach")(js.Any.fromFunction1((t0: typingsJapgolly.qIo.Qio.ForEachCallback) => forEach(t0).runNow()))
    __obj.asInstanceOf[ForEach]
  }
}

