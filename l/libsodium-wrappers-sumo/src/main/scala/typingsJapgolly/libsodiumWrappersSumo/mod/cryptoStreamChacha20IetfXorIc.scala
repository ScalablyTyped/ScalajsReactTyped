package typingsJapgolly.libsodiumWrappersSumo.mod

import typingsJapgolly.libsodiumWrappers.mod.StringOutputFormat
import typingsJapgolly.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_ietf_xor_ic")
@js.native
object cryptoStreamChacha20IetfXorIc extends js.Object {
  def apply(
    input_message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(
    input_message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    input_message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(
    input_message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(
    input_message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    input_message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
}

