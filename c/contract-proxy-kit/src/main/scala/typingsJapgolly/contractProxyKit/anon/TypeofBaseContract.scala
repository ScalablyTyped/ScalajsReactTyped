package typingsJapgolly.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.ethers.mod.ethers.BaseContract
import typingsJapgolly.ethersprojectAbi.mod.Interface
import typingsJapgolly.ethersprojectContracts.anon.From
import typingsJapgolly.ethersprojectContracts.mod.ContractInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofBaseContract
  extends StObject
     with Instantiable2[/* addressOrName */ String, /* contractInterface */ ContractInterface, BaseContract] {
  
  def getContractAddress(transaction: From): String = js.native
  
  def getInterface(contractInterface: ContractInterface): Interface = js.native
  
  def isIndexed(value: Any): /* is @ethersproject/abi.@ethersproject/abi.Indexed */ Boolean = js.native
}
