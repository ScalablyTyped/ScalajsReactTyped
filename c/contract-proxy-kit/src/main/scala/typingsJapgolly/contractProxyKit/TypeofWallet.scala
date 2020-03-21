package typingsJapgolly.contractProxyKit

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.ethers.mod.ethers.Wallet
import typingsJapgolly.ethers.signingKeyMod.SigningKey
import typingsJapgolly.ethers.typesMod.Arrayish
import typingsJapgolly.ethers.typesMod.ProgressCallback
import typingsJapgolly.ethers.typesMod.Wordlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofWallet extends Instantiable1[/* privateKey */ SigningKey, Wallet] {
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

