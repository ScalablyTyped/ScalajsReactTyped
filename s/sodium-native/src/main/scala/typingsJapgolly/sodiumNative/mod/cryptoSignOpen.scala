package typingsJapgolly.sodiumNative.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_sign_open")
@js.native
object cryptoSignOpen extends js.Object {
  def apply(message: Buffer, signedMessage: Buffer, publicKey: Buffer): Boolean = js.native
}

