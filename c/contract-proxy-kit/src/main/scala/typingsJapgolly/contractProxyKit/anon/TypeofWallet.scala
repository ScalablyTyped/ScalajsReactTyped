package typingsJapgolly.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.ethers.mod.ethers.Wallet
import typingsJapgolly.ethersprojectBytes.mod.Bytes
import typingsJapgolly.ethersprojectBytes.mod.BytesLike
import typingsJapgolly.ethersprojectJsonWallets.libKeystoreMod.ProgressCallback
import typingsJapgolly.ethersprojectWordlists.mod.Wordlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofWallet
  extends StObject
     with Instantiable1[/* privateKey */ BytesLike, Wallet] {
  
  /**
    *  Static methods to create Wallet instances.
    */
  def createRandom(): typingsJapgolly.ethersprojectWallet.mod.Wallet = js.native
  def createRandom(options: Any): typingsJapgolly.ethersprojectWallet.mod.Wallet = js.native
  
  def fromEncryptedJson(json: String, password: String): js.Promise[typingsJapgolly.ethersprojectWallet.mod.Wallet] = js.native
  def fromEncryptedJson(json: String, password: String, progressCallback: ProgressCallback): js.Promise[typingsJapgolly.ethersprojectWallet.mod.Wallet] = js.native
  def fromEncryptedJson(json: String, password: Bytes): js.Promise[typingsJapgolly.ethersprojectWallet.mod.Wallet] = js.native
  def fromEncryptedJson(json: String, password: Bytes, progressCallback: ProgressCallback): js.Promise[typingsJapgolly.ethersprojectWallet.mod.Wallet] = js.native
  
  def fromEncryptedJsonSync(json: String, password: String): typingsJapgolly.ethersprojectWallet.mod.Wallet = js.native
  def fromEncryptedJsonSync(json: String, password: Bytes): typingsJapgolly.ethersprojectWallet.mod.Wallet = js.native
  
  def fromMnemonic(mnemonic: String): typingsJapgolly.ethersprojectWallet.mod.Wallet = js.native
  def fromMnemonic(mnemonic: String, path: String): typingsJapgolly.ethersprojectWallet.mod.Wallet = js.native
  def fromMnemonic(mnemonic: String, path: String, wordlist: Wordlist): typingsJapgolly.ethersprojectWallet.mod.Wallet = js.native
  def fromMnemonic(mnemonic: String, path: Unit, wordlist: Wordlist): typingsJapgolly.ethersprojectWallet.mod.Wallet = js.native
}
