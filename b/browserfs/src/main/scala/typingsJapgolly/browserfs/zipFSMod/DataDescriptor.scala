package typingsJapgolly.browserfs.zipFSMod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/backend/ZipFS", "DataDescriptor")
@js.native
class DataDescriptor protected () extends js.Object {
  def this(data: Buffer) = this()
  var data: js.Any = js.native
  def compressedSize(): Double = js.native
  def crc32(): Double = js.native
  def uncompressedSize(): Double = js.native
}

