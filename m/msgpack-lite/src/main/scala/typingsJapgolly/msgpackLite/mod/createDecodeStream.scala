package typingsJapgolly.msgpackLite.mod

import typingsJapgolly.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("msgpack-lite", "createDecodeStream")
@js.native
object createDecodeStream extends js.Object {
  def apply(): DecodeStream = js.native
  def apply(options: DecoderOptions with TransformOptions): DecodeStream = js.native
}

