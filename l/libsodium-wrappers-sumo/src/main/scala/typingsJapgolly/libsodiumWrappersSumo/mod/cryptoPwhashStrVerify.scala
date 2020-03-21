package typingsJapgolly.libsodiumWrappersSumo.mod

import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_pwhash_str_verify")
@js.native
object cryptoPwhashStrVerify extends js.Object {
  def apply(hashed_password: String, password: String): Boolean = js.native
  def apply(hashed_password: String, password: Uint8Array): Boolean = js.native
}

