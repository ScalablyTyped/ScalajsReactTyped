package typingsJapgolly.node.bufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("buffer", "transcode")
@js.native
object transcode extends js.Object {
  def apply(
    source: scala.scalajs.js.typedarray.Uint8Array,
    fromEnc: TranscodeEncoding,
    toEnc: TranscodeEncoding
  ): typingsJapgolly.node.Buffer = js.native
}

