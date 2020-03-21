package typingsJapgolly.sodiumNative.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_sign_verify_detached")
@js.native
object cryptoSignVerifyDetached extends js.Object {
  def apply(signature: Buffer, message: Buffer, publicKey: Buffer): Boolean = js.native
}

