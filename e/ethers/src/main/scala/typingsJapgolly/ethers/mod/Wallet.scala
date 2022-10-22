package typingsJapgolly.ethers.mod

import typingsJapgolly.ethersprojectAbstractProvider.mod.Provider
import typingsJapgolly.ethersprojectAbstractSigner.mod.ExternallyOwnedAccount
import typingsJapgolly.ethersprojectBytes.mod.Bytes
import typingsJapgolly.ethersprojectBytes.mod.BytesLike
import typingsJapgolly.ethersprojectJsonWallets.libKeystoreMod.ProgressCallback
import typingsJapgolly.ethersprojectSigningKey.mod.SigningKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "Wallet")
@js.native
open class Wallet protected ()
  extends typingsJapgolly.ethersprojectWallet.mod.Wallet {
  def this(privateKey: ExternallyOwnedAccount) = this()
  def this(privateKey: BytesLike) = this()
  def this(privateKey: SigningKey) = this()
  def this(privateKey: ExternallyOwnedAccount, provider: Provider) = this()
  def this(privateKey: BytesLike, provider: Provider) = this()
  def this(privateKey: SigningKey, provider: Provider) = this()
}
/* static members */
object Wallet {
  
  @JSImport("ethers", "Wallet")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *  Static methods to create Wallet instances.
    */
  inline def createRandom(): typingsJapgolly.ethersprojectWallet.mod.Wallet = ^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")().asInstanceOf[typingsJapgolly.ethersprojectWallet.mod.Wallet]
  inline def createRandom(options: Any): typingsJapgolly.ethersprojectWallet.mod.Wallet = ^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectWallet.mod.Wallet]
  
  inline def fromEncryptedJson(json: String, password: String): js.Promise[typingsJapgolly.ethersprojectWallet.mod.Wallet] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncryptedJson")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.ethersprojectWallet.mod.Wallet]]
  inline def fromEncryptedJson(json: String, password: String, progressCallback: ProgressCallback): js.Promise[typingsJapgolly.ethersprojectWallet.mod.Wallet] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncryptedJson")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.ethersprojectWallet.mod.Wallet]]
  inline def fromEncryptedJson(json: String, password: Bytes): js.Promise[typingsJapgolly.ethersprojectWallet.mod.Wallet] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncryptedJson")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.ethersprojectWallet.mod.Wallet]]
  inline def fromEncryptedJson(json: String, password: Bytes, progressCallback: ProgressCallback): js.Promise[typingsJapgolly.ethersprojectWallet.mod.Wallet] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncryptedJson")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.ethersprojectWallet.mod.Wallet]]
  
  inline def fromEncryptedJsonSync(json: String, password: String): typingsJapgolly.ethersprojectWallet.mod.Wallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncryptedJsonSync")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectWallet.mod.Wallet]
  inline def fromEncryptedJsonSync(json: String, password: Bytes): typingsJapgolly.ethersprojectWallet.mod.Wallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncryptedJsonSync")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectWallet.mod.Wallet]
  
  inline def fromMnemonic(mnemonic: String): typingsJapgolly.ethersprojectWallet.mod.Wallet = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMnemonic")(mnemonic.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectWallet.mod.Wallet]
  inline def fromMnemonic(mnemonic: String, path: String): typingsJapgolly.ethersprojectWallet.mod.Wallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMnemonic")(mnemonic.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectWallet.mod.Wallet]
  inline def fromMnemonic(mnemonic: String, path: String, wordlist: typingsJapgolly.ethersprojectWordlists.mod.Wordlist): typingsJapgolly.ethersprojectWallet.mod.Wallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMnemonic")(mnemonic.asInstanceOf[js.Any], path.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectWallet.mod.Wallet]
  inline def fromMnemonic(mnemonic: String, path: Unit, wordlist: typingsJapgolly.ethersprojectWordlists.mod.Wordlist): typingsJapgolly.ethersprojectWallet.mod.Wallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMnemonic")(mnemonic.asInstanceOf[js.Any], path.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectWallet.mod.Wallet]
}
