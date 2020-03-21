package typingsJapgolly.nodeForge.mod.pki

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pki.certificateFromPem")
@js.native
object certificateFromPem extends js.Object {
  def apply(pem: PEM): Certificate = js.native
  def apply(pem: PEM, computeHash: Boolean): Certificate = js.native
  def apply(pem: PEM, computeHash: Boolean, strict: Boolean): Certificate = js.native
}

