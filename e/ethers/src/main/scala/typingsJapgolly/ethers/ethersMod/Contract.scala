package typingsJapgolly.ethers.ethersMod

import typingsJapgolly.ethers.typesMod.MinimalProvider
import typingsJapgolly.ethers.typesMod.ParamType
import typingsJapgolly.ethers.typesMod.Signer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/ethers", "Contract")
@js.native
class Contract protected ()
  extends typingsJapgolly.ethers.contractsMod.Contract {
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

