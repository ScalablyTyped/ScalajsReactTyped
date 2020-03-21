package typingsJapgolly.bip32.bip32Mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip32/types/bip32", "fromSeed")
@js.native
object fromSeed extends js.Object {
  def apply(seed: Buffer): BIP32Interface = js.native
  def apply(seed: Buffer, network: Network): BIP32Interface = js.native
}

