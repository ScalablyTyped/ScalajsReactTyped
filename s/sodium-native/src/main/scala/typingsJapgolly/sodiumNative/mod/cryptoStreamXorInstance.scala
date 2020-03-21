package typingsJapgolly.sodiumNative.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_stream_xor_instance")
@js.native
object cryptoStreamXorInstance extends js.Object {
  def apply(nonce: Buffer, key: Buffer): CryptoStreamChacha20XorWrap = js.native
}

