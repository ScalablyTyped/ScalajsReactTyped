package typingsJapgolly.libsodiumWrappers.mod

import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_hash")
@js.native
object cryptoHash extends js.Object {
  def apply(message: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(message: String, outputFormat: StringOutputFormat): String = js.native
  def apply(message: String, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(message: Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(message: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(message: Uint8Array, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
}

