package typingsJapgolly.sodiumNative.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_secretbox_easy")
@js.native
object cryptoSecretboxEasy extends js.Object {
  def apply(ciphertext: Buffer, message: Buffer, nonce: Buffer, secretKey: Buffer): Unit = js.native
}

