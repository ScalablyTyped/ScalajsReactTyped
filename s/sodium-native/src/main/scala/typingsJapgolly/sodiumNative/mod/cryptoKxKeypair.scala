package typingsJapgolly.sodiumNative.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_kx_keypair")
@js.native
object cryptoKxKeypair extends js.Object {
  def apply(publicKey: Buffer, secretKey: Buffer): Unit = js.native
}

