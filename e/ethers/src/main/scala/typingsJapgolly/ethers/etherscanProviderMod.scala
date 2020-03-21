package typingsJapgolly.ethers

import typingsJapgolly.ethers.providerMod.Provider
import typingsJapgolly.ethers.typesMod.BlockTag
import typingsJapgolly.ethers.typesMod.Networkish
import typingsJapgolly.ethers.typesMod.TransactionResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/providers/etherscan-provider", JSImport.Namespace)
@js.native
object etherscanProviderMod extends js.Object {
  @js.native
  class EtherscanProvider () extends Provider {
    def this(network: Networkish) = this()
    def this(network: Networkish, apiKey: String) = this()
    val apiKey: String = js.native
    val baseUrl: String = js.native
    def getHistory(addressOrName: String): js.Promise[js.Array[TransactionResponse]] = js.native
    def getHistory(addressOrName: String, startBlock: BlockTag): js.Promise[js.Array[TransactionResponse]] = js.native
    def getHistory(addressOrName: String, startBlock: BlockTag, endBlock: BlockTag): js.Promise[js.Array[TransactionResponse]] = js.native
    def getHistory(addressOrName: js.Promise[String]): js.Promise[js.Array[TransactionResponse]] = js.native
    def getHistory(addressOrName: js.Promise[String], startBlock: BlockTag): js.Promise[js.Array[TransactionResponse]] = js.native
    def getHistory(addressOrName: js.Promise[String], startBlock: BlockTag, endBlock: BlockTag): js.Promise[js.Array[TransactionResponse]] = js.native
  }
  
}

