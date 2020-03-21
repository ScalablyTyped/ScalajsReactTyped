package typingsJapgolly.javascriptObfuscator.threadsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Thread[T, U] extends js.Object {
  var killed: Boolean
  def kill(): Unit
  def on(eventType: String, responseCallback: ResponseCallback[U]): Thread[T, U]
  def send(data: T): Thread[T, U]
}

object Thread {
  @scala.inline
  def apply[T, U](
    kill: Callback,
    killed: Boolean,
    on: (String, ResponseCallback[U]) => CallbackTo[Thread[T, U]],
    send: T => CallbackTo[Thread[T, U]]
  ): Thread[T, U] = {
    val __obj = js.Dynamic.literal(killed = killed.asInstanceOf[js.Any])
    __obj.updateDynamic("kill")(kill.toJsFn)
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.javascriptObfuscator.threadsMod.ResponseCallback[U]) => on(t0, t1).runNow()))
    __obj.updateDynamic("send")(js.Any.fromFunction1((t0: T) => send(t0).runNow()))
    __obj.asInstanceOf[Thread[T, U]]
  }
}

