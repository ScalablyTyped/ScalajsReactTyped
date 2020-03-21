package typingsJapgolly.encodingDown.mod.EncodingDown

import typingsJapgolly.abstractLeveldown.mod.AbstractChainedBatch
import typingsJapgolly.abstractLeveldown.mod.AbstractOptions
import typingsJapgolly.levelCodec.mod.CodecOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainedBatch[K, V] extends AbstractChainedBatch[K, V] {
  def write(cb: js.Any): js.Any = js.native
  def write(options: CodecOptions with AbstractOptions, cb: js.Any): js.Any = js.native
}

