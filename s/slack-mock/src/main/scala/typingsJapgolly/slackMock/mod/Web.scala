package typingsJapgolly.slackMock.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Web[T] extends js.Object {
  var calls: js.Array[WebCall[T]]
  def addResponse(opts: WebOptions[T]): Unit
  def reset(): Unit
}

object Web {
  @scala.inline
  def apply[T](addResponse: WebOptions[T] => Callback, calls: js.Array[WebCall[T]], reset: Callback): Web[T] = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any])
    __obj.updateDynamic("addResponse")(js.Any.fromFunction1((t0: typingsJapgolly.slackMock.mod.WebOptions[T]) => addResponse(t0).runNow()))
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[Web[T]]
  }
}

