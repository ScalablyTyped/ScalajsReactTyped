package typingsJapgolly.libsodiumWrappers.mod

import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_auth_verify")
@js.native
object cryptoAuthVerify extends js.Object {
  def apply(
    tag: scala.scalajs.js.typedarray.Uint8Array,
    message: String,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): Boolean = js.native
  def apply(
    tag: scala.scalajs.js.typedarray.Uint8Array,
    message: Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): Boolean = js.native
}

