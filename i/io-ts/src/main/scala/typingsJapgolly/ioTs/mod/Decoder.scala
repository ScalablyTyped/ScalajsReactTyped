package typingsJapgolly.ioTs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Decoder[I, A] extends js.Object {
  val name: String
  def decode(i: I): Validation[A]
  def validate(i: I, context: Context): Validation[A]
}

object Decoder {
  @scala.inline
  def apply[I, A](
    decode: I => CallbackTo[Validation[A]],
    name: String,
    validate: (I, Context) => CallbackTo[Validation[A]]
  ): Decoder[I, A] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("decode")(js.Any.fromFunction1((t0: I) => decode(t0).runNow()))
    __obj.updateDynamic("validate")(js.Any.fromFunction2((t0: I, t1: typingsJapgolly.ioTs.mod.Context) => validate(t0, t1).runNow()))
    __obj.asInstanceOf[Decoder[I, A]]
  }
}

