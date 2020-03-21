package typingsJapgolly.libsodiumWrappersSumo.mod

import typingsJapgolly.libsodiumWrappers.AnonHeader
import typingsJapgolly.libsodiumWrappers.AnonState
import typingsJapgolly.libsodiumWrappers.mod.StringOutputFormat
import typingsJapgolly.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_init_push")
@js.native
object cryptoSecretstreamXchacha20poly1305InitPush extends js.Object {
  def apply(key: scala.scalajs.js.typedarray.Uint8Array): AnonHeader = js.native
  def apply(key: scala.scalajs.js.typedarray.Uint8Array, outputFormat: StringOutputFormat): AnonState = js.native
  def apply(key: scala.scalajs.js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): AnonHeader = js.native
}

