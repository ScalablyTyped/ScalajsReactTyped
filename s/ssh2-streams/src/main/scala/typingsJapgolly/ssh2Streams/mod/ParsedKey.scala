package typingsJapgolly.ssh2Streams.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedKey extends js.Object {
  var comment: String = js.native
  var `type`: String = js.native
  def getPrivatePEM(): String = js.native
  def getPublicPEM(): String = js.native
  def getPublicSSH(): String = js.native
  def sign(data: String): Buffer | js.Error = js.native
  def sign(data: Buffer): Buffer | js.Error = js.native
  def verify(data: String, signature: Buffer): Boolean | js.Error = js.native
  def verify(data: Buffer, signature: Buffer): Boolean | js.Error = js.native
}

