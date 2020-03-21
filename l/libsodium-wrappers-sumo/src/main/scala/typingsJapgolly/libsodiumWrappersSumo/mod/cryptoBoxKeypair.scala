package typingsJapgolly.libsodiumWrappersSumo.mod

import typingsJapgolly.libsodiumWrappers.mod.KeyPair
import typingsJapgolly.libsodiumWrappers.mod.StringKeyPair
import typingsJapgolly.libsodiumWrappers.mod.StringOutputFormat
import typingsJapgolly.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_box_keypair")
@js.native
object cryptoBoxKeypair extends js.Object {
  def apply(): KeyPair = js.native
  def apply(outputFormat: StringOutputFormat): StringKeyPair = js.native
  def apply(outputFormat: Uint8ArrayOutputFormat): KeyPair = js.native
}

