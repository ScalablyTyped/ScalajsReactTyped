package typingsJapgolly.ethers

import typingsJapgolly.ethers.typesMod.Arrayish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/utils/pbkdf2", JSImport.Namespace)
@js.native
object pbkdf2Mod extends js.Object {
  def pbkdf2(password: Arrayish, salt: Arrayish, iterations: Double, keylen: Double, hashAlgorithm: String): scala.scalajs.js.typedarray.Uint8Array = js.native
}

