package typingsJapgolly.ethers.mod

import typingsJapgolly.ethersprojectAbstractProvider.mod.Provider
import typingsJapgolly.ethersprojectContracts.mod.ContractInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "Contract")
@js.native
open class Contract protected ()
  extends typingsJapgolly.ethersprojectContracts.mod.Contract {
  def this(addressOrName: String, contractInterface: ContractInterface) = this()
  def this(addressOrName: String, contractInterface: ContractInterface, signerOrProvider: Provider) = this()
  def this(
    addressOrName: String,
    contractInterface: ContractInterface,
    signerOrProvider: typingsJapgolly.ethersprojectAbstractSigner.mod.Signer
  ) = this()
}
