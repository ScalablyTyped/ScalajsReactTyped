package typingsJapgolly.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_sign_final_verify")
@js.native
object cryptoSignFinalVerify extends js.Object {
  def apply(
    state_address: StateAddress,
    signature: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array
  ): Boolean = js.native
}

