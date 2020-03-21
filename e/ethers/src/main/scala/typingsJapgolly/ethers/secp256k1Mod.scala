package typingsJapgolly.ethers

import typingsJapgolly.ethers.typesMod.Arrayish
import typingsJapgolly.ethers.typesMod.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/utils/secp256k1", JSImport.Namespace)
@js.native
object secp256k1Mod extends js.Object {
  @js.native
  class KeyPair protected () extends js.Object {
    def this(privateKey: Arrayish) = this()
    val compressedPublicKey: String = js.native
    val privateKey: String = js.native
    val publicKey: String = js.native
    val publicKeyBytes: scala.scalajs.js.typedarray.Uint8Array = js.native
    def sign(digest: Arrayish): Signature = js.native
  }
  
  def computeAddress(key: String): String = js.native
  def computePublicKey(key: Arrayish): String = js.native
  def computePublicKey(key: Arrayish, compressed: Boolean): String = js.native
  def recoverAddress(digest: Arrayish, signature: Signature): String = js.native
  def recoverPublicKey(digest: Arrayish, signature: Signature): String = js.native
  def verifyMessage(message: String, signature: String): String = js.native
  def verifyMessage(message: String, signature: Signature): String = js.native
  def verifyMessage(message: Arrayish, signature: String): String = js.native
  def verifyMessage(message: Arrayish, signature: Signature): String = js.native
}

