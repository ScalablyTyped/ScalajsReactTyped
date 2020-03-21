package typingsJapgolly.nodeForge.mod.pki

import typingsJapgolly.nodeForge.mod.Bytes
import typingsJapgolly.nodeForge.mod.Hex
import typingsJapgolly.nodeForge.mod.util.ByteStringBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pki.getPublicKeyFingerprint")
@js.native
object getPublicKeyFingerprint extends js.Object {
  def apply(publicKey: PublicKey): ByteStringBuffer = js.native
  def apply(publicKey: PublicKey, options: BinaryFingerprintOptions): Bytes = js.native
  def apply(publicKey: PublicKey, options: ByteBufferFingerprintOptions): ByteStringBuffer = js.native
  def apply(publicKey: PublicKey, options: HexFingerprintOptions): Hex = js.native
}

