package typingsJapgolly.libsodiumWrappersSumo.mod

import typingsJapgolly.libsodiumWrappers.mod.StringOutputFormat
import typingsJapgolly.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_reduce")
@js.native
object cryptoCoreRistretto255ScalarReduce extends js.Object {
  def apply(secret: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(secret: String, outputFormat: StringOutputFormat): String = js.native
  def apply(secret: String, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(secret: Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(secret: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(secret: Uint8Array, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
}

