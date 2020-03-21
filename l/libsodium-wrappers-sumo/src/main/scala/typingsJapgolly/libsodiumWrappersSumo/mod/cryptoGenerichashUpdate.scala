package typingsJapgolly.libsodiumWrappersSumo.mod

import typingsJapgolly.libsodiumWrappers.mod.StateAddress
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_generichash_update")
@js.native
object cryptoGenerichashUpdate extends js.Object {
  def apply(state_address: StateAddress, message_chunk: String): Unit = js.native
  def apply(state_address: StateAddress, message_chunk: Uint8Array): Unit = js.native
}

