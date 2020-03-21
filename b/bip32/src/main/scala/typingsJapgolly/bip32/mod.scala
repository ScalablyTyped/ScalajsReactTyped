package typingsJapgolly.bip32

import typingsJapgolly.bip32.bip32Mod.BIP32Interface
import typingsJapgolly.bip32.bip32Mod.Network
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip32", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def fromBase58(inString: String): BIP32Interface = js.native
  def fromBase58(inString: String, network: Network): BIP32Interface = js.native
  def fromPrivateKey(privateKey: Buffer, chainCode: Buffer): BIP32Interface = js.native
  def fromPrivateKey(privateKey: Buffer, chainCode: Buffer, network: Network): BIP32Interface = js.native
  def fromPublicKey(publicKey: Buffer, chainCode: Buffer): BIP32Interface = js.native
  def fromPublicKey(publicKey: Buffer, chainCode: Buffer, network: Network): BIP32Interface = js.native
  def fromSeed(seed: Buffer): BIP32Interface = js.native
  def fromSeed(seed: Buffer, network: Network): BIP32Interface = js.native
}

