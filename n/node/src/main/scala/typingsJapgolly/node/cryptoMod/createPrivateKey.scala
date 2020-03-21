package typingsJapgolly.node.cryptoMod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "createPrivateKey")
@js.native
object createPrivateKey extends js.Object {
  def apply(key: String): KeyObject = js.native
  def apply(key: Buffer): KeyObject = js.native
  def apply(key: PrivateKeyInput): KeyObject = js.native
}

