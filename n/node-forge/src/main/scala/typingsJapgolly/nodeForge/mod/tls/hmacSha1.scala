package typingsJapgolly.nodeForge.mod.tls

import typingsJapgolly.nodeForge.mod.Byte
import typingsJapgolly.nodeForge.mod.Bytes
import typingsJapgolly.nodeForge.mod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "tls.hmac_sha1")
@js.native
object hmacSha1 extends js.Object {
  def apply(key: String, seqNum: js.Tuple2[Double, Double], record: Record): Bytes = js.native
  def apply(key: js.Array[Byte], seqNum: js.Tuple2[Double, Double], record: Record): Bytes = js.native
  def apply(key: ByteBuffer, seqNum: js.Tuple2[Double, Double], record: Record): Bytes = js.native
}

