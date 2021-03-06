package typingsJapgolly.bufferCrc32

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("buffer-crc32", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(input: String): Buffer = js.native
  def apply(input: String, partialCrc: Buffer): Buffer = js.native
  def apply(input: Buffer): Buffer = js.native
  def apply(input: Buffer, partialCrc: Buffer): Buffer = js.native
  def signed(buffer: Buffer): Double = js.native
  def unsigned(buffer: Buffer): Double = js.native
}

