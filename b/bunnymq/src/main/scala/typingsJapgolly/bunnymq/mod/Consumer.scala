package typingsJapgolly.bunnymq.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Consumer extends js.Object {
  /**
    * Handle messages from a named queue.
    *
    * @param queue A named queue.
    * @param callback A callback.
    */
  def consume[T](queue: String, callback: ConsumerCallback[T]): Unit
}

object Consumer {
  @scala.inline
  def apply(consume: (String, ConsumerCallback[js.Any]) => Callback): Consumer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("consume")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.bunnymq.mod.ConsumerCallback[js.Any]) => consume(t0, t1).runNow()))
    __obj.asInstanceOf[Consumer]
  }
}

