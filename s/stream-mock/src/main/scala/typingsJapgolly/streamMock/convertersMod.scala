package typingsJapgolly.streamMock

import typingsJapgolly.node.Buffer
import typingsJapgolly.streamMock.chunkMod.IChunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock/lib/helpers/converters", JSImport.Namespace)
@js.native
object convertersMod extends js.Object {
  def chunk2Buffer(chunk: IChunk): Buffer = js.native
}

