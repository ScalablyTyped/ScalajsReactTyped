package typingsJapgolly.nodeForge.mod.asn1

import typingsJapgolly.nodeForge.mod.Bytes
import typingsJapgolly.nodeForge.mod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "asn1.fromDer")
@js.native
object fromDer extends js.Object {
  def apply(bytes: Bytes): Asn1 = js.native
  def apply(bytes: Bytes, strict: Boolean): Asn1 = js.native
  def apply(bytes: ByteBuffer): Asn1 = js.native
  def apply(bytes: ByteBuffer, strict: Boolean): Asn1 = js.native
}

