package typingsJapgolly.createHmac.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.cryptoMod.Hmac
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("create-hmac", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(algo: Algorithm, key: String): Hmac = js.native
  def apply(algo: Algorithm, key: Buffer): Hmac = js.native
}

