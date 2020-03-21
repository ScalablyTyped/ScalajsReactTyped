package typingsJapgolly.ampMessage.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  def inspect(): String
  def pop(): js.UndefOr[Buffer]
  def push(items: Buffer*): Double
  def shift(): js.UndefOr[Buffer]
  def toBuffer(): Buffer
  def unshift(items: Buffer*): Double
}

object Message {
  @scala.inline
  def apply(
    inspect: CallbackTo[String],
    pop: CallbackTo[js.UndefOr[Buffer]],
    push: /* repeated */ Buffer => CallbackTo[Double],
    shift: CallbackTo[js.UndefOr[Buffer]],
    toBuffer: CallbackTo[Buffer],
    unshift: /* repeated */ Buffer => CallbackTo[Double]
  ): Message = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("inspect")(inspect.toJsFn)
    __obj.updateDynamic("pop")(pop.toJsFn)
    __obj.updateDynamic("push")(js.Any.fromFunction1((t0: /* repeated */ typingsJapgolly.node.Buffer) => push(t0).runNow()))
    __obj.updateDynamic("shift")(shift.toJsFn)
    __obj.updateDynamic("toBuffer")(toBuffer.toJsFn)
    __obj.updateDynamic("unshift")(js.Any.fromFunction1((t0: /* repeated */ typingsJapgolly.node.Buffer) => unshift(t0).runNow()))
    __obj.asInstanceOf[Message]
  }
}

