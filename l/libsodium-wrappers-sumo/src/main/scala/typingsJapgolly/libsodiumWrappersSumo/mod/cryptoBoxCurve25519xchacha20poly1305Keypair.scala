package typingsJapgolly.libsodiumWrappersSumo.mod

import typingsJapgolly.libsodiumWrappers.mod.KeyPair
import typingsJapgolly.libsodiumWrappers.mod.StringKeyPair
import typingsJapgolly.libsodiumWrappers.mod.StringOutputFormat
import typingsJapgolly.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_box_curve25519xchacha20poly1305_keypair")
@js.native
object cryptoBoxCurve25519xchacha20poly1305Keypair extends js.Object {
  def apply(
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    secretKey: scala.scalajs.js.typedarray.Uint8Array
  ): KeyPair = js.native
  def apply(
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    secretKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringKeyPair = js.native
  def apply(
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    secretKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): KeyPair = js.native
}

