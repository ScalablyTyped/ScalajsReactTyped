package typingsJapgolly.snappy.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snappy", "uncompressSync")
@js.native
object uncompressSync extends js.Object {
  def apply(buffer: Buffer): Buffer = js.native
  def apply(buffer: Buffer, options: SnappyDecompressOpts): Buffer | String = js.native
}

