package typingsJapgolly.libsodiumWrappers.mod

import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_box_open_easy")
@js.native
object cryptoBoxOpenEasy extends js.Object {
  def apply(
    ciphertext: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(
    ciphertext: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    ciphertext: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(
    ciphertext: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(
    ciphertext: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    ciphertext: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
}

