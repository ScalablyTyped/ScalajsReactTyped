package typingsJapgolly.libsodiumWrappersSumo.mod

import typingsJapgolly.libsodiumWrappers.mod.StringOutputFormat
import typingsJapgolly.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_box_seal_open")
@js.native
object cryptoBoxSealOpen extends js.Object {
  def apply(
    ciphertext: String,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(
    ciphertext: String,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    ciphertext: String,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(
    ciphertext: Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(
    ciphertext: Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    ciphertext: Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
}

