package typingsJapgolly.node.cryptoMod

import typingsJapgolly.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "createHmac")
@js.native
object createHmac extends js.Object {
  def apply(algorithm: String, key: BinaryLike): Hmac = js.native
  def apply(algorithm: String, key: BinaryLike, options: TransformOptions): Hmac = js.native
  def apply(algorithm: String, key: KeyObject): Hmac = js.native
  def apply(algorithm: String, key: KeyObject, options: TransformOptions): Hmac = js.native
}

