package typingsJapgolly.msgpackLite.mod

import typingsJapgolly.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("msgpack-lite", "createEncodeStream")
@js.native
object createEncodeStream extends js.Object {
  def apply(): EncodeStream = js.native
  def apply(options: EncoderOptions with TransformOptions): EncodeStream = js.native
}

