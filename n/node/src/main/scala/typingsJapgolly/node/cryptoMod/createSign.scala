package typingsJapgolly.node.cryptoMod

import typingsJapgolly.node.streamMod.WritableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "createSign")
@js.native
object createSign extends js.Object {
  def apply(algorithm: java.lang.String): Signer = js.native
  def apply(algorithm: java.lang.String, options: WritableOptions): Signer = js.native
}

