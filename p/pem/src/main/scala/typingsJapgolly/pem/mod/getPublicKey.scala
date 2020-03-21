package typingsJapgolly.pem.mod

import typingsJapgolly.pem.AnonPublicKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pem", "getPublicKey")
@js.native
object getPublicKey extends js.Object {
  def apply(callback: Callback[AnonPublicKey]): Unit = js.native
  def apply(certificate: String, callback: Callback[AnonPublicKey]): Unit = js.native
}

