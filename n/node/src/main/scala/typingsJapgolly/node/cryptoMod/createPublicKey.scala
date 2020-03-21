package typingsJapgolly.node.cryptoMod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "createPublicKey")
@js.native
object createPublicKey extends js.Object {
  def apply(key: String): KeyObject = js.native
  def apply(key: Buffer): KeyObject = js.native
  def apply(key: KeyObject): KeyObject = js.native
  def apply(key: PublicKeyInput): KeyObject = js.native
}

