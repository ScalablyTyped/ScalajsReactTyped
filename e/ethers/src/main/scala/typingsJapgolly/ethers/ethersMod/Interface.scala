package typingsJapgolly.ethers.ethersMod

import typingsJapgolly.ethers.typesMod.ParamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/ethers", "Interface")
@js.native
class Interface protected ()
  extends typingsJapgolly.ethers.contractsMod.Interface {
  def this(abi: String) = this()
  def this(abi: js.Array[String | ParamType]) = this()
}

