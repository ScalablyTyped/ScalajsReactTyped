package typingsJapgolly.firebaseFirestore

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCloseFn[I] extends js.Object {
  def closeFn(): Unit
  def sendFn(msg: I): Unit
}

object AnonCloseFn {
  @scala.inline
  def apply[I](closeFn: Callback, sendFn: I => Callback): AnonCloseFn[I] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("closeFn")(closeFn.toJsFn)
    __obj.updateDynamic("sendFn")(js.Any.fromFunction1((t0: I) => sendFn(t0).runNow()))
    __obj.asInstanceOf[AnonCloseFn[I]]
  }
}

