package typingsJapgolly.ethers

import typingsJapgolly.ethers.signingKeyMod.SigningKey
import typingsJapgolly.ethers.typesMod.Arrayish
import typingsJapgolly.ethers.typesMod.BigNumber
import typingsJapgolly.ethers.typesMod.BlockTag
import typingsJapgolly.ethers.typesMod.HDNode
import typingsJapgolly.ethers.typesMod.MinimalProvider
import typingsJapgolly.ethers.typesMod.ProgressCallback
import typingsJapgolly.ethers.typesMod.Signer
import typingsJapgolly.ethers.typesMod.TransactionRequest
import typingsJapgolly.ethers.typesMod.Wordlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/wallet/wallet", JSImport.Namespace)
@js.native
object walletWalletMod extends js.Object {
  @js.native
  class Wallet protected () extends Signer {
    def this(privateKey: SigningKey) = this()
    def this(privateKey: Arrayish) = this()
    def this(privateKey: HDNode) = this()
    def this(privateKey: SigningKey, provider: MinimalProvider) = this()
    def this(privateKey: Arrayish, provider: MinimalProvider) = this()
    def this(privateKey: HDNode, provider: MinimalProvider) = this()
    val address: String = js.native
    val mnemonic: String = js.native
    val path: String = js.native
    val privateKey: String = js.native
    @JSName("provider")
    val provider_Wallet: MinimalProvider = js.native
    val signingKey: js.Any = js.native
    /**
      *  Create a new instance of this Wallet connected to provider.
      */
    def connect(provider: MinimalProvider): Wallet = js.native
    def encrypt(password: String, options: js.Any, progressCallback: ProgressCallback): js.Promise[String] = js.native
    def encrypt(password: Arrayish, options: js.Any, progressCallback: ProgressCallback): js.Promise[String] = js.native
    def getBalance(): js.Promise[BigNumber] = js.native
    def getBalance(blockTag: BlockTag): js.Promise[BigNumber] = js.native
    def getTransactionCount(): js.Promise[Double] = js.native
    def getTransactionCount(blockTag: BlockTag): js.Promise[Double] = js.native
    def sign(transaction: TransactionRequest): js.Promise[String] = js.native
  }
  
  /* static members */
  @js.native
  object Wallet extends js.Object {
    /**
      *  Static methods to create Wallet instances.
      */
    def createRandom(): Wallet = js.native
    def createRandom(options: js.Any): Wallet = js.native
    def fromEncryptedJson(json: String, password: Arrayish, progressCallback: ProgressCallback): js.Promise[Wallet] = js.native
    def fromMnemonic(mnemonic: String): Wallet = js.native
    def fromMnemonic(mnemonic: String, path: String): Wallet = js.native
    def fromMnemonic(mnemonic: String, path: String, wordlist: Wordlist): Wallet = js.native
  }
  
}

