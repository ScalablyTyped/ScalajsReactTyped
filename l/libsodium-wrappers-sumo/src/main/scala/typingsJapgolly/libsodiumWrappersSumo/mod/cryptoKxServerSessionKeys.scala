package typingsJapgolly.libsodiumWrappersSumo.mod

import typingsJapgolly.libsodiumWrappers.mod.CryptoKX
import typingsJapgolly.libsodiumWrappers.mod.StringCryptoKX
import typingsJapgolly.libsodiumWrappers.mod.StringOutputFormat
import typingsJapgolly.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_kx_server_session_keys")
@js.native
object cryptoKxServerSessionKeys extends js.Object {
  def apply(
    serverPublicKey: scala.scalajs.js.typedarray.Uint8Array,
    serverSecretKey: scala.scalajs.js.typedarray.Uint8Array,
    clientPublicKey: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoKX = js.native
  def apply(
    serverPublicKey: scala.scalajs.js.typedarray.Uint8Array,
    serverSecretKey: scala.scalajs.js.typedarray.Uint8Array,
    clientPublicKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoKX = js.native
  def apply(
    serverPublicKey: scala.scalajs.js.typedarray.Uint8Array,
    serverSecretKey: scala.scalajs.js.typedarray.Uint8Array,
    clientPublicKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoKX = js.native
}

