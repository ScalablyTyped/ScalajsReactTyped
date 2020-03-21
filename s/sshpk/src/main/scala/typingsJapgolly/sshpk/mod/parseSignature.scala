package typingsJapgolly.sshpk.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "parseSignature")
@js.native
object parseSignature extends js.Object {
  def apply(data: String, `type`: String, format: String): Signature = js.native
  def apply(data: Buffer, `type`: String, format: String): Signature = js.native
}

