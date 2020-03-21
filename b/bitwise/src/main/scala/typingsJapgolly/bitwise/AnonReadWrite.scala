package typingsJapgolly.bitwise

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.bitwise.bitwiseTypesMod.Bit
import typingsJapgolly.bitwise.bitwiseTypesMod.UInt8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReadWrite extends js.Object {
  def read(byte: UInt8): js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit]
  def write(byte: js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit]): UInt8
}

object AnonReadWrite {
  @scala.inline
  def apply(
    read: UInt8 => CallbackTo[js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit]],
    write: js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit] => CallbackTo[UInt8]
  ): AnonReadWrite = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("read")(js.Any.fromFunction1((t0: typingsJapgolly.bitwise.bitwiseTypesMod.UInt8) => read(t0).runNow()))
    __obj.updateDynamic("write")(js.Any.fromFunction1((t0: js.Tuple8[
  typingsJapgolly.bitwise.bitwiseTypesMod.Bit, 
  typingsJapgolly.bitwise.bitwiseTypesMod.Bit, 
  typingsJapgolly.bitwise.bitwiseTypesMod.Bit, 
  typingsJapgolly.bitwise.bitwiseTypesMod.Bit, 
  typingsJapgolly.bitwise.bitwiseTypesMod.Bit, 
  typingsJapgolly.bitwise.bitwiseTypesMod.Bit, 
  typingsJapgolly.bitwise.bitwiseTypesMod.Bit, 
  typingsJapgolly.bitwise.bitwiseTypesMod.Bit]) => write(t0).runNow()))
    __obj.asInstanceOf[AnonReadWrite]
  }
}

