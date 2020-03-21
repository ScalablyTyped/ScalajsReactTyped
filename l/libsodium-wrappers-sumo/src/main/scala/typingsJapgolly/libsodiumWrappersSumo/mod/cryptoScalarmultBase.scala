package typingsJapgolly.libsodiumWrappersSumo.mod

import typingsJapgolly.libsodiumWrappers.mod.StringOutputFormat
import typingsJapgolly.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_scalarmult_base")
@js.native
object cryptoScalarmultBase extends js.Object {
  def apply(privateKey: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(privateKey: scala.scalajs.js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(privateKey: scala.scalajs.js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
}

