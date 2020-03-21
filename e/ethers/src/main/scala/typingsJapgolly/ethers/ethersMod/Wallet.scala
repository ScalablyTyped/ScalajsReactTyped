package typingsJapgolly.ethers.ethersMod

import typingsJapgolly.ethers.typesMod.Arrayish
import typingsJapgolly.ethers.typesMod.MinimalProvider
import typingsJapgolly.ethers.typesMod.ProgressCallback
import typingsJapgolly.ethers.typesMod.Wordlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/ethers", "Wallet")
@js.native
class Wallet protected ()
  extends typingsJapgolly.ethers.walletMod.Wallet {
  def this(privateKey: typingsJapgolly.ethers.signingKeyMod.SigningKey) = this()
  def this(privateKey: Arrayish) = this()
  def this(privateKey: typingsJapgolly.ethers.typesMod.HDNode) = this()
  def this(privateKey: typingsJapgolly.ethers.signingKeyMod.SigningKey, provider: MinimalProvider) = this()
  def this(privateKey: Arrayish, provider: MinimalProvider) = this()
  def this(privateKey: typingsJapgolly.ethers.typesMod.HDNode, provider: MinimalProvider) = this()
}

/* static members */
@JSImport("ethers/dist/types/ethers", "Wallet")
@js.native
object Wallet extends js.Object {
  /**
    *  Static methods to create Wallet instances.
    */
  def createRandom(): typingsJapgolly.ethers.walletWalletMod.Wallet = js.native
  def createRandom(options: js.Any): typingsJapgolly.ethers.walletWalletMod.Wallet = js.native
  def fromEncryptedJson(json: String, password: Arrayish, progressCallback: ProgressCallback): js.Promise[typingsJapgolly.ethers.walletWalletMod.Wallet] = js.native
  def fromMnemonic(mnemonic: String): typingsJapgolly.ethers.walletWalletMod.Wallet = js.native
  def fromMnemonic(mnemonic: String, path: String): typingsJapgolly.ethers.walletWalletMod.Wallet = js.native
  def fromMnemonic(mnemonic: String, path: String, wordlist: Wordlist): typingsJapgolly.ethers.walletWalletMod.Wallet = js.native
}

