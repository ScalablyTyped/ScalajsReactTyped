package typingsJapgolly.reactCache.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource[Input, Value] extends js.Object {
  def preload(key: Input): Unit
  def read(key: Input): Value
}

object Resource {
  @scala.inline
  def apply[Input, Value](preload: Input => Callback, read: Input => CallbackTo[Value]): Resource[Input, Value] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("preload")(js.Any.fromFunction1((t0: Input) => preload(t0).runNow()))
    __obj.updateDynamic("read")(js.Any.fromFunction1((t0: Input) => read(t0).runNow()))
    __obj.asInstanceOf[Resource[Input, Value]]
  }
}

