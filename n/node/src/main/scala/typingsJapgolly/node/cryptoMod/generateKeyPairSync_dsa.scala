package typingsJapgolly.node.cryptoMod

import typingsJapgolly.node.nodeStrings.dsa
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "generateKeyPairSync")
@js.native
object generateKeyPairSync_dsa extends js.Object {
  def apply(`type`: dsa, options: DSAKeyPairKeyObjectOptions): KeyPairKeyObjectResult = js.native
}

