package typingsJapgolly.ethers

import typingsJapgolly.ethers.typesMod.MinimalProvider
import typingsJapgolly.ethers.typesMod.ParamType
import typingsJapgolly.ethers.typesMod.Signer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/contracts", JSImport.Namespace)
@js.native
object contractsMod extends js.Object {
  @js.native
  class Contract protected ()
    extends typingsJapgolly.ethers.contractMod.Contract {
    def this(addressOrName: String, contractInterface: String, signerOrProvider: MinimalProvider) = this()
    def this(addressOrName: String, contractInterface: String, signerOrProvider: Signer) = this()
    def this(
      addressOrName: String,
      contractInterface: js.Array[String | ParamType],
      signerOrProvider: MinimalProvider
    ) = this()
    def this(addressOrName: String, contractInterface: js.Array[String | ParamType], signerOrProvider: Signer) = this()
    def this(
      addressOrName: String,
      contractInterface: typingsJapgolly.ethers.interfaceMod.Interface,
      signerOrProvider: MinimalProvider
    ) = this()
    def this(
      addressOrName: String,
      contractInterface: typingsJapgolly.ethers.interfaceMod.Interface,
      signerOrProvider: Signer
    ) = this()
  }
  
  @js.native
  class Interface protected ()
    extends typingsJapgolly.ethers.interfaceMod.Interface {
    def this(abi: String) = this()
    def this(abi: js.Array[String | ParamType]) = this()
  }
  
}

