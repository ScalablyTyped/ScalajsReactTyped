package typingsJapgolly.ethers.mod

import typingsJapgolly.ethers.typesMod.ParamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers", "Interface")
@js.native
class Interface protected ()
  extends typingsJapgolly.ethers.ethersMod.Interface {
  def this(abi: String) = this()
  def this(abi: js.Array[String | ParamType]) = this()
}

