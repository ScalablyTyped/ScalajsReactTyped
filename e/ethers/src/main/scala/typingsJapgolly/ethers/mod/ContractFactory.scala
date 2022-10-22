package typingsJapgolly.ethers.mod

import typingsJapgolly.ethersprojectAbi.mod.Interface
import typingsJapgolly.ethersprojectBytes.mod.BytesLike
import typingsJapgolly.ethersprojectContracts.anon.Nonce
import typingsJapgolly.ethersprojectContracts.anon.Object
import typingsJapgolly.ethersprojectContracts.mod.ContractInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ContractFactory")
@js.native
open class ContractFactory protected ()
  extends typingsJapgolly.ethersprojectContracts.mod.ContractFactory {
  def this(contractInterface: ContractInterface, bytecode: BytesLike) = this()
  def this(contractInterface: ContractInterface, bytecode: Object) = this()
  def this(
    contractInterface: ContractInterface,
    bytecode: BytesLike,
    signer: typingsJapgolly.ethersprojectAbstractSigner.mod.Signer
  ) = this()
  def this(
    contractInterface: ContractInterface,
    bytecode: Object,
    signer: typingsJapgolly.ethersprojectAbstractSigner.mod.Signer
  ) = this()
}
/* static members */
object ContractFactory {
  
  @JSImport("ethers", "ContractFactory")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromSolidity(compilerOutput: Any): typingsJapgolly.ethersprojectContracts.mod.ContractFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSolidity")(compilerOutput.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectContracts.mod.ContractFactory]
  inline def fromSolidity(compilerOutput: Any, signer: typingsJapgolly.ethersprojectAbstractSigner.mod.Signer): typingsJapgolly.ethersprojectContracts.mod.ContractFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSolidity")(compilerOutput.asInstanceOf[js.Any], signer.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectContracts.mod.ContractFactory]
  
  inline def getContract(address: String, contractInterface: ContractInterface): typingsJapgolly.ethersprojectContracts.mod.Contract = (^.asInstanceOf[js.Dynamic].applyDynamic("getContract")(address.asInstanceOf[js.Any], contractInterface.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectContracts.mod.Contract]
  inline def getContract(
    address: String,
    contractInterface: ContractInterface,
    signer: typingsJapgolly.ethersprojectAbstractSigner.mod.Signer
  ): typingsJapgolly.ethersprojectContracts.mod.Contract = (^.asInstanceOf[js.Dynamic].applyDynamic("getContract")(address.asInstanceOf[js.Any], contractInterface.asInstanceOf[js.Any], signer.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectContracts.mod.Contract]
  
  inline def getContractAddress(tx: Nonce): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getContractAddress")(tx.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getInterface(contractInterface: ContractInterface): Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("getInterface")(contractInterface.asInstanceOf[js.Any]).asInstanceOf[Interface]
}
