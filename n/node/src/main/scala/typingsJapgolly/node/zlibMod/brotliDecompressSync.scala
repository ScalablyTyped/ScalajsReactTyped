package typingsJapgolly.node.zlibMod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zlib", "brotliDecompressSync")
@js.native
object brotliDecompressSync extends js.Object {
  def apply(buf: InputType): Buffer = js.native
  def apply(buf: InputType, options: BrotliOptions): Buffer = js.native
}

