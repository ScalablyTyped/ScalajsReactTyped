package typingsJapgolly.libsodiumWrappersSumo.mod

import typingsJapgolly.libsodiumWrappers.mod.StateAddress
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth_init")
@js.native
object cryptoOnetimeauthInit extends js.Object {
  def apply(): StateAddress = js.native
  def apply(key: String): StateAddress = js.native
  def apply(key: Uint8Array): StateAddress = js.native
}

