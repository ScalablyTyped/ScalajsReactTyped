package typingsJapgolly.hexoFs.mod

import typingsJapgolly.hexoFs.AnonBufferBytesWritten
import typingsJapgolly.hexoFs.AnonBufferString
import typingsJapgolly.hexoFs.AnonBytesWritten
import typingsJapgolly.node.Buffer
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "write")
@js.native
object write extends js.Object {
  def apply(fd: Double): typingsJapgolly.bluebird.mod.^[AnonBytesWritten] = js.native
  def apply(fd: Double, buffer: Buffer): typingsJapgolly.bluebird.mod.^[AnonBytesWritten] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double): typingsJapgolly.bluebird.mod.^[AnonBytesWritten] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double): typingsJapgolly.bluebird.mod.^[AnonBytesWritten] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): typingsJapgolly.bluebird.mod.^[AnonBytesWritten] = js.native
  def apply(fd: Double, buffer: Uint8Array): typingsJapgolly.bluebird.mod.^[AnonBufferBytesWritten] = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double): typingsJapgolly.bluebird.mod.^[AnonBufferBytesWritten] = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double, length: Double): typingsJapgolly.bluebird.mod.^[AnonBufferBytesWritten] = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double, length: Double, position: Double): typingsJapgolly.bluebird.mod.^[AnonBufferBytesWritten] = js.native
  def apply(fd: Double, string: js.Any): typingsJapgolly.bluebird.mod.^[AnonBufferString] = js.native
  def apply(fd: Double, string: js.Any, position: Double): typingsJapgolly.bluebird.mod.^[AnonBufferString] = js.native
  def apply(fd: Double, string: js.Any, position: Double, encoding: String): typingsJapgolly.bluebird.mod.^[AnonBufferString] = js.native
  def apply(fd: Double, string: js.Any, position: Null, encoding: String): typingsJapgolly.bluebird.mod.^[AnonBufferString] = js.native
}

