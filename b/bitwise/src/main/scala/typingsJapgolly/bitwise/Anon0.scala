package typingsJapgolly.bitwise

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.bitwise.bitwiseTypesMod.Bit
import typingsJapgolly.bitwise.bitwiseTypesMod.UInt4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
  def read(nibble: UInt4): js.Tuple4[Bit, Bit, Bit, Bit]
  def write(nibble: js.Tuple4[Bit, Bit, Bit, Bit]): UInt4
}

object Anon0 {
  @scala.inline
  def apply(
    read: UInt4 => CallbackTo[js.Tuple4[Bit, Bit, Bit, Bit]],
    write: js.Tuple4[Bit, Bit, Bit, Bit] => CallbackTo[UInt4]
  ): Anon0 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("read")(js.Any.fromFunction1((t0: typingsJapgolly.bitwise.bitwiseTypesMod.UInt4) => read(t0).runNow()))
    __obj.updateDynamic("write")(js.Any.fromFunction1((t0: js.Tuple4[
  typingsJapgolly.bitwise.bitwiseTypesMod.Bit, 
  typingsJapgolly.bitwise.bitwiseTypesMod.Bit, 
  typingsJapgolly.bitwise.bitwiseTypesMod.Bit, 
  typingsJapgolly.bitwise.bitwiseTypesMod.Bit]) => write(t0).runNow()))
    __obj.asInstanceOf[Anon0]
  }
}

