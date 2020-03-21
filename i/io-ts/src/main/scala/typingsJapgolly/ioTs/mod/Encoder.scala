package typingsJapgolly.ioTs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encoder[A, O] extends js.Object {
  def encode(a: A): O
}

object Encoder {
  @scala.inline
  def apply[A, O](encode: A => CallbackTo[O]): Encoder[A, O] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("encode")(js.Any.fromFunction1((t0: A) => encode(t0).runNow()))
    __obj.asInstanceOf[Encoder[A, O]]
  }
}

