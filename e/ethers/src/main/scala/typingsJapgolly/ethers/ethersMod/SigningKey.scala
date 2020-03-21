package typingsJapgolly.ethers.ethersMod

import typingsJapgolly.ethers.typesMod.Arrayish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/ethers", "SigningKey")
@js.native
class SigningKey protected ()
  extends typingsJapgolly.ethers.walletMod.SigningKey {
  def this(privateKey: Arrayish) = this()
  def this(privateKey: typingsJapgolly.ethers.typesMod.HDNode) = this()
}

