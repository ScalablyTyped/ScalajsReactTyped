package typingsJapgolly.contractProxyKit

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.ethers.jsonRpcProviderMod.JsonRpcProvider
import typingsJapgolly.ethers.providerMod.Provider
import typingsJapgolly.ethers.typesMod.AsyncProvider
import typingsJapgolly.ethers.typesMod.Network
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofproviders extends js.Object {
  var EtherscanProvider: Instantiable0[typingsJapgolly.ethers.mod.ethers.providers.EtherscanProvider] = js.native
  var FallbackProvider: Instantiable1[
    /* providers */ js.Array[Provider], 
    typingsJapgolly.ethers.mod.ethers.providers.FallbackProvider
  ] = js.native
  var InfuraProvider: Instantiable0[typingsJapgolly.ethers.mod.ethers.providers.InfuraProvider] = js.native
  var IpcProvider: Instantiable1[/* path */ String, typingsJapgolly.ethers.mod.ethers.providers.IpcProvider] = js.native
  var JsonRpcProvider: TypeofJsonRpcProvider = js.native
  var JsonRpcSigner: Instantiable1[
    /* provider */ JsonRpcProvider, 
    typingsJapgolly.ethers.mod.ethers.providers.JsonRpcSigner
  ] = js.native
  var Provider: TypeofProvider = js.native
  var Web3Provider: Instantiable1[
    /* web3Provider */ AsyncProvider, 
    typingsJapgolly.ethers.mod.ethers.providers.Web3Provider
  ] = js.native
  def getDefaultProvider(): Provider = js.native
  def getDefaultProvider(network: String): Provider = js.native
  def getDefaultProvider(network: Network): Provider = js.native
}

