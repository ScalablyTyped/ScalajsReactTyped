package typingsJapgolly.libsodiumWrappers.mod

import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_sign_open")
@js.native
object cryptoSignOpen extends js.Object {
  def apply(signedMessage: String, publicKey: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(
    signedMessage: String,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    signedMessage: String,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(signedMessage: Uint8Array, publicKey: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(
    signedMessage: Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    signedMessage: Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
}

