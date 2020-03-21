package typingsJapgolly.uuidJs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait uuid extends js.Object {
  def equals(uuid: uuid): Boolean
  def fromParts(
    timeLow: js.Any,
    timeMid: js.Any,
    timeHiAndVersion: js.Any,
    clockSeqHiAndReserved: js.Any,
    clockSeqLow: js.Any,
    node: js.Any
  ): uuid
  def toBytes(): js.Array[_]
  def toURN(): String
}

object uuid {
  @scala.inline
  def apply(
    equals: uuid => CallbackTo[Boolean],
    fromParts: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => CallbackTo[uuid],
    toBytes: CallbackTo[js.Array[js.Any]],
    toURN: CallbackTo[String]
  ): uuid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("equals")(js.Any.fromFunction1((t0: typingsJapgolly.uuidJs.mod.uuid) => equals(t0).runNow()))
    __obj.updateDynamic("fromParts")(js.Any.fromFunction6((t0: js.Any, t1: js.Any, t2: js.Any, t3: js.Any, t4: js.Any, t5: js.Any) => fromParts(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("toBytes")(toBytes.toJsFn)
    __obj.updateDynamic("toURN")(toURN.toJsFn)
    __obj.asInstanceOf[uuid]
  }
}

