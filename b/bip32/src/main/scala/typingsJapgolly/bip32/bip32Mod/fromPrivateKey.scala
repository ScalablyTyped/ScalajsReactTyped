package typingsJapgolly.bip32.bip32Mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip32/types/bip32", "fromPrivateKey")
@js.native
object fromPrivateKey extends js.Object {
  def apply(privateKey: Buffer, chainCode: Buffer): BIP32Interface = js.native
  def apply(privateKey: Buffer, chainCode: Buffer, network: Network): BIP32Interface = js.native
}

