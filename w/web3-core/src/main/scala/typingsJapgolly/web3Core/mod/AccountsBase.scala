package typingsJapgolly.web3Core.mod

import typingsJapgolly.node.netMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web3-core", "AccountsBase")
@js.native
open class AccountsBase () extends StObject {
  def this(provider: typingsJapgolly.web3Core.mod.provider) = this()
  def this(provider: typingsJapgolly.web3Core.mod.provider, net: Socket) = this()
  
  def create(): Account = js.native
  def create(entropy: String): Account = js.native
  
  val currentProvider: typingsJapgolly.web3Core.mod.provider = js.native
  
  def decrypt(keystoreJsonV3: EncryptedKeystoreV3Json, password: String): Account = js.native
  
  def encrypt(privateKey: String, password: String): EncryptedKeystoreV3Json = js.native
  
  val givenProvider: Any = js.native
  
  def hashMessage(message: String): String = js.native
  
  def privateKeyToAccount(privateKey: String): Account = js.native
  def privateKeyToAccount(privateKey: String, ignoreLength: Boolean): Account = js.native
  
  def recover(message: String, signature: String): String = js.native
  def recover(message: String, signature: String, preFixed: Boolean): String = js.native
  def recover(message: String, v: String, r: String, s: String): String = js.native
  def recover(message: String, v: String, r: String, s: String, preFixed: Boolean): String = js.native
  def recover(signatureObject: SignatureObject): String = js.native
  
  def recoverTransaction(signature: String): String = js.native
  
  def setProvider(provider: typingsJapgolly.web3Core.mod.provider): Boolean = js.native
  
  def sign(data: String, privateKey: String): Sign = js.native
  
  def signTransaction(transactionConfig: TransactionConfig, privateKey: String): js.Promise[SignedTransaction] = js.native
  def signTransaction(
    transactionConfig: TransactionConfig,
    privateKey: String,
    callback: js.Function2[/* error */ js.Error, /* signedTransaction */ SignedTransaction, Unit]
  ): js.Promise[SignedTransaction] = js.native
  
  var wallet: WalletBase = js.native
}
