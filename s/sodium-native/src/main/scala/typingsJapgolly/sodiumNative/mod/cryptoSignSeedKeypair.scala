package typingsJapgolly.sodiumNative.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_sign_seed_keypair")
@js.native
object cryptoSignSeedKeypair extends js.Object {
  def apply(publicKey: Buffer, secretKey: Buffer, seed: Buffer): Unit = js.native
}

