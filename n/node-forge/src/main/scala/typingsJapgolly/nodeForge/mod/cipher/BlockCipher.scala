package typingsJapgolly.nodeForge.mod.cipher

import typingsJapgolly.nodeForge.mod.util.ByteBuffer
import typingsJapgolly.nodeForge.mod.util.ByteStringBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockCipher extends js.Object {
  var mode: Mode = js.native
  var output: ByteStringBuffer = js.native
  def finish(): Boolean = js.native
  def start(): Unit = js.native
  def start(options: StartOptions): Unit = js.native
  def update(payload: ByteBuffer): Unit = js.native
}

