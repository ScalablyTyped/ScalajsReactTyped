package typingsJapgolly.sodiumNative.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_stream")
@js.native
object cryptoStream extends js.Object {
  def apply(ciphertext: Buffer, nonce: Buffer, key: Buffer): Unit = js.native
}

