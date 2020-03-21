package typingsJapgolly.readableStream.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.safeBuffer.mod.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferList[D /* <: Buffer */] extends js.Object {
  var head: Entry[D]
  var length: Double
  var tail: Entry[D]
  def clear(): Unit
  def concat(n: Double): D
  def join(s: js.Any): String
  def push(v: D): Unit
  def shift(): D
  def unshift(v: D): Unit
}

object BufferList {
  @scala.inline
  def apply[D /* <: Buffer */](
    clear: Callback,
    concat: Double => CallbackTo[D],
    head: Entry[D],
    join: js.Any => CallbackTo[String],
    length: Double,
    push: D => Callback,
    shift: CallbackTo[D],
    tail: Entry[D],
    unshift: D => Callback
  ): BufferList[D] = {
    val __obj = js.Dynamic.literal(head = head.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], tail = tail.asInstanceOf[js.Any])
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("concat")(js.Any.fromFunction1((t0: scala.Double) => concat(t0).runNow()))
    __obj.updateDynamic("join")(js.Any.fromFunction1((t0: js.Any) => join(t0).runNow()))
    __obj.updateDynamic("push")(js.Any.fromFunction1((t0: D) => push(t0).runNow()))
    __obj.updateDynamic("shift")(shift.toJsFn)
    __obj.updateDynamic("unshift")(js.Any.fromFunction1((t0: D) => unshift(t0).runNow()))
    __obj.asInstanceOf[BufferList[D]]
  }
}

