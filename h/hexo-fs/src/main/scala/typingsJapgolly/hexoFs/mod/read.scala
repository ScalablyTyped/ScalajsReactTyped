package typingsJapgolly.hexoFs.mod

import typingsJapgolly.hexoFs.AnonBuffer
import typingsJapgolly.hexoFs.AnonBytesRead
import typingsJapgolly.node.Buffer
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "read")
@js.native
object read extends js.Object {
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double): typingsJapgolly.bluebird.mod.^[AnonBuffer] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): typingsJapgolly.bluebird.mod.^[AnonBuffer] = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double, length: Double): typingsJapgolly.bluebird.mod.^[AnonBytesRead] = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double, length: Double, position: Double): typingsJapgolly.bluebird.mod.^[AnonBytesRead] = js.native
}

