package typingsJapgolly.ethers.mod

import typingsJapgolly.ethersprojectAbi.mod.Interface
import typingsJapgolly.ethersprojectAbstractProvider.mod.Provider
import typingsJapgolly.ethersprojectContracts.anon.From
import typingsJapgolly.ethersprojectContracts.mod.ContractInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "BaseContract")
@js.native
open class BaseContract protected ()
  extends typingsJapgolly.ethersprojectContracts.mod.BaseContract {
  def this(addressOrName: String, contractInterface: ContractInterface) = this()
  def this(addressOrName: String, contractInterface: ContractInterface, signerOrProvider: Provider) = this()
  def this(
    addressOrName: String,
    contractInterface: ContractInterface,
    signerOrProvider: typingsJapgolly.ethersprojectAbstractSigner.mod.Signer
  ) = this()
}
/* static members */
object BaseContract {
  
  @JSImport("ethers", "BaseContract")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getContractAddress(transaction: From): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getContractAddress")(transaction.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getInterface(contractInterface: ContractInterface): Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("getInterface")(contractInterface.asInstanceOf[js.Any]).asInstanceOf[Interface]
  
  inline def isIndexed(value: Any): /* is @ethersproject/abi.@ethersproject/abi.Indexed */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIndexed")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abi.@ethersproject/abi.Indexed */ Boolean]
}
