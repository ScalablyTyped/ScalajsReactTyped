package typingsJapgolly.msgpackLite.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("msgpack-lite", "decode")
@js.native
object decode extends js.Object {
  def apply(input: js.Array[Double]): js.Any = js.native
  def apply(input: js.Array[Double], options: DecoderOptions): js.Any = js.native
  def apply(input: Buffer): js.Any = js.native
  def apply(input: Buffer, options: DecoderOptions): js.Any = js.native
  def apply(input: Uint8Array): js.Any = js.native
  def apply(input: Uint8Array, options: DecoderOptions): js.Any = js.native
}

