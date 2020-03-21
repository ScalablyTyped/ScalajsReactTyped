package typingsJapgolly.bullBoard.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.bull.mod.Queue
import typingsJapgolly.bull.mod.QueueOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateQueue extends js.Object {
  def add(name: String, opts: QueueOptions): Queue[_]
}

object CreateQueue {
  @scala.inline
  def apply(add: (String, QueueOptions) => CallbackTo[Queue[js.Any]]): CreateQueue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.bull.mod.QueueOptions) => add(t0, t1).runNow()))
    __obj.asInstanceOf[CreateQueue]
  }
}

