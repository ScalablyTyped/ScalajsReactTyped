package typingsJapgolly.ethers

import typingsJapgolly.ethers.jsonRpcProviderMod.JsonRpcProvider
import typingsJapgolly.ethers.typesMod.AsyncProvider
import typingsJapgolly.ethers.typesMod.Networkish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/providers/web3-provider", JSImport.Namespace)
@js.native
object web3ProviderMod extends js.Object {
  @js.native
  class Web3Provider protected () extends JsonRpcProvider {
    def this(web3Provider: AsyncProvider) = this()
    def this(web3Provider: AsyncProvider, network: Networkish) = this()
    val _web3Provider: AsyncProvider = js.native
  }
  
}

