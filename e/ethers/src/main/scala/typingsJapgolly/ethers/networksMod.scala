package typingsJapgolly.ethers

import typingsJapgolly.ethers.typesMod.Network
import typingsJapgolly.ethers.typesMod.Networkish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/utils/networks", JSImport.Namespace)
@js.native
object networksMod extends js.Object {
  def getNetwork(network: Networkish): Network = js.native
}

