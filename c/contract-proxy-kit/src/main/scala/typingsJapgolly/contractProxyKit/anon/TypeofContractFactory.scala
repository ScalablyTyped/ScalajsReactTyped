package typingsJapgolly.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.ethers.mod.ethers.ContractFactory
import typingsJapgolly.ethersprojectAbi.mod.Interface
import typingsJapgolly.ethersprojectAbstractSigner.mod.Signer
import typingsJapgolly.ethersprojectBytes.mod.BytesLike
import typingsJapgolly.ethersprojectContracts.anon.Nonce
import typingsJapgolly.ethersprojectContracts.mod.Contract
import typingsJapgolly.ethersprojectContracts.mod.ContractInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofContractFactory
  extends StObject
     with Instantiable2[/* contractInterface */ ContractInterface, /* bytecode */ BytesLike, ContractFactory] {
  
  def fromSolidity(compilerOutput: Any): typingsJapgolly.ethersprojectContracts.mod.ContractFactory = js.native
  def fromSolidity(compilerOutput: Any, signer: Signer): typingsJapgolly.ethersprojectContracts.mod.ContractFactory = js.native
  
  def getContract(address: String, contractInterface: ContractInterface): Contract = js.native
  def getContract(address: String, contractInterface: ContractInterface, signer: Signer): Contract = js.native
  
  def getContractAddress(tx: Nonce): String = js.native
  
  def getInterface(contractInterface: ContractInterface): Interface = js.native
}
