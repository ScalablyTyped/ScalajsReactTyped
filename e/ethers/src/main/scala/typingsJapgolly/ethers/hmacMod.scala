package typingsJapgolly.ethers

import typingsJapgolly.ethers.typesMod.Arrayish
import typingsJapgolly.ethers.typesMod.SupportedAlgorithms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/utils/hmac", JSImport.Namespace)
@js.native
object hmacMod extends js.Object {
  def computeHmac(algorithm: SupportedAlgorithms, key: Arrayish, data: Arrayish): scala.scalajs.js.typedarray.Uint8Array = js.native
}

