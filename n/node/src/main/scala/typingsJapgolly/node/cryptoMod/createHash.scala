package typingsJapgolly.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "createHash")
@js.native
object createHash extends js.Object {
  def apply(algorithm: String): Hash = js.native
  def apply(algorithm: String, options: HashOptions): Hash = js.native
}

