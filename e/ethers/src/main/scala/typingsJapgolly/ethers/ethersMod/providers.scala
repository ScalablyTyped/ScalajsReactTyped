package typingsJapgolly.ethers.ethersMod

import typingsJapgolly.ethers.typesMod.AsyncProvider
import typingsJapgolly.ethers.typesMod.ConnectionInfo
import typingsJapgolly.ethers.typesMod.Network
import typingsJapgolly.ethers.typesMod.Networkish
import typingsJapgolly.ethers.typesMod.TransactionRequest
import typingsJapgolly.ethers.typesMod.TransactionResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/ethers", "providers")
@js.native
object providers extends js.Object {
  @js.native
  class EtherscanProvider ()
    extends typingsJapgolly.ethers.providersMod.EtherscanProvider {
    def this(network: Networkish) = this()
    def this(network: Networkish, apiKey: String) = this()
  }
  
  @js.native
  class FallbackProvider protected ()
    extends typingsJapgolly.ethers.providersMod.FallbackProvider {
    def this(providers: js.Array[typingsJapgolly.ethers.providerMod.Provider]) = this()
  }
  
  @js.native
  class InfuraProvider ()
    extends typingsJapgolly.ethers.providersMod.InfuraProvider {
    def this(network: Networkish) = this()
    def this(network: Networkish, apiAccessToken: String) = this()
  }
  
  @js.native
  class IpcProvider protected ()
    extends typingsJapgolly.ethers.providersMod.IpcProvider {
    def this(path: String) = this()
    def this(path: String, network: Networkish) = this()
  }
  
  @js.native
  class JsonRpcProvider ()
    extends typingsJapgolly.ethers.providersMod.JsonRpcProvider {
    def this(url: String) = this()
    def this(url: ConnectionInfo) = this()
    def this(url: String, network: Networkish) = this()
    def this(url: ConnectionInfo, network: Networkish) = this()
  }
  
  @js.native
  class JsonRpcSigner protected ()
    extends typingsJapgolly.ethers.providersMod.JsonRpcSigner {
    def this(provider: typingsJapgolly.ethers.jsonRpcProviderMod.JsonRpcProvider) = this()
    def this(provider: typingsJapgolly.ethers.jsonRpcProviderMod.JsonRpcProvider, address: String) = this()
  }
  
  @js.native
  class Provider protected ()
    extends typingsJapgolly.ethers.providersMod.Provider {
    def this(network: js.Promise[Network]) = this()
    def this(network: Networkish) = this()
  }
  
  @js.native
  class Web3Provider protected ()
    extends typingsJapgolly.ethers.providersMod.Web3Provider {
    def this(web3Provider: AsyncProvider) = this()
    def this(web3Provider: AsyncProvider, network: Networkish) = this()
  }
  
  def getDefaultProvider(): typingsJapgolly.ethers.providerMod.Provider = js.native
  def getDefaultProvider(network: String): typingsJapgolly.ethers.providerMod.Provider = js.native
  def getDefaultProvider(network: Network): typingsJapgolly.ethers.providerMod.Provider = js.native
  /* static members */
  @js.native
  object JsonRpcProvider extends js.Object {
    def hexlifyTransaction(transaction: TransactionRequest): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Provider extends js.Object {
    def checkTransactionResponse(transaction: js.Any): TransactionResponse = js.native
  }
  
}

