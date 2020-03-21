package typingsJapgolly.libsodiumWrappersSumo.mod

import typingsJapgolly.libsodiumWrappers.mod.StringOutputFormat
import typingsJapgolly.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_generichash")
@js.native
object cryptoGenerichash extends js.Object {
  def apply(hash_length: Double, message: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(hash_length: Double, message: String, key: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(hash_length: Double, message: String, key: String, outputFormat: StringOutputFormat): String = js.native
  def apply(hash_length: Double, message: String, key: String, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(hash_length: Double, message: String, key: Null, outputFormat: StringOutputFormat): String = js.native
  def apply(hash_length: Double, message: String, key: Null, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(hash_length: Double, message: String, key: Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(hash_length: Double, message: String, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(hash_length: Double, message: String, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(hash_length: Double, message: Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(hash_length: Double, message: Uint8Array, key: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(hash_length: Double, message: Uint8Array, key: String, outputFormat: StringOutputFormat): String = js.native
  def apply(hash_length: Double, message: Uint8Array, key: String, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(hash_length: Double, message: Uint8Array, key: Null, outputFormat: StringOutputFormat): String = js.native
  def apply(hash_length: Double, message: Uint8Array, key: Null, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(hash_length: Double, message: Uint8Array, key: Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(hash_length: Double, message: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(hash_length: Double, message: Uint8Array, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
}

