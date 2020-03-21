package typingsJapgolly.ethers.mod.ethers

import typingsJapgolly.ethers.typesMod.Arrayish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers", "ethers.SigningKey")
@js.native
class SigningKey protected ()
  extends typingsJapgolly.ethers.ethersMod.SigningKey {
  def this(privateKey: Arrayish) = this()
  def this(privateKey: typingsJapgolly.ethers.typesMod.HDNode) = this()
}

