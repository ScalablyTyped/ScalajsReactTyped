package typingsJapgolly.sjcl.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ________________________________________________________________________
trait SjclCodec[T] extends js.Object {
  def fromBits(bits: BitArray_): T
  def toBits(value: T): BitArray_
}

object SjclCodec {
  @scala.inline
  def apply[T](fromBits: BitArray_ => CallbackTo[T], toBits: T => CallbackTo[BitArray_]): SjclCodec[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromBits")(js.Any.fromFunction1((t0: typingsJapgolly.sjcl.mod.BitArray_) => fromBits(t0).runNow()))
    __obj.updateDynamic("toBits")(js.Any.fromFunction1((t0: T) => toBits(t0).runNow()))
    __obj.asInstanceOf[SjclCodec[T]]
  }
}

