package typingsJapgolly.libsodiumWrappersSumo.mod

import typingsJapgolly.libsodiumWrappers.mod.StateAddress
import typingsJapgolly.libsodiumWrappers.mod.StringOutputFormat
import typingsJapgolly.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth_final")
@js.native
object cryptoOnetimeauthFinal extends js.Object {
  def apply(state_address: StateAddress): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(state_address: StateAddress, outputFormat: StringOutputFormat): String = js.native
  def apply(state_address: StateAddress, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
}

