package typingsJapgolly.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.ethers.libUtilsMod.Logger
import typingsJapgolly.ethersprojectContracts.mod.ContractInterface
import typingsJapgolly.ethersprojectNetworks.libTypesMod.Networkish
import typingsJapgolly.ethersprojectProviders.libBaseProviderMod.BaseProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofethers extends StObject {
  
  var BaseContract: TypeofBaseContract = js.native
  
  var BigNumber: TypeofBigNumber = js.native
  
  var Contract: Instantiable2[
    /* addressOrName */ String, 
    /* contractInterface */ ContractInterface, 
    typingsJapgolly.ethers.mod.ethers.Contract
  ] = js.native
  
  var ContractFactory: TypeofContractFactory = js.native
  
  var FixedNumber: TypeofFixedNumber = js.native
  
  var Signer: TypeofSigner = js.native
  
  var VoidSigner: Instantiable1[/* address */ String, typingsJapgolly.ethers.mod.ethers.VoidSigner] = js.native
  
  var Wallet: TypeofWallet = js.native
  
  var Wordlist: TypeofWordlist = js.native
  
  val constants: Typeofconstants = js.native
  
  def getDefaultProvider(): BaseProvider = js.native
  def getDefaultProvider(network: Unit, options: Any): BaseProvider = js.native
  def getDefaultProvider(network: Networkish): BaseProvider = js.native
  def getDefaultProvider(network: Networkish, options: Any): BaseProvider = js.native
  
  val logger: Logger = js.native
  
  val providers: Typeofproviders = js.native
  
  val utils: Typeofutils = js.native
  
  val version: /* "ethers/5.7.1" */ String = js.native
  
  val wordlists: Any = js.native
}
