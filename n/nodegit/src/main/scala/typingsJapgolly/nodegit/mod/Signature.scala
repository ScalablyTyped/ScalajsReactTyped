package typingsJapgolly.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Signature")
@js.native
class Signature ()
  extends typingsJapgolly.nodegit.signatureMod.Signature

/* static members */
@JSImport("nodegit", "Signature")
@js.native
object Signature extends js.Object {
  def create(name: String, email: String, time: Double, offset: Double): typingsJapgolly.nodegit.signatureMod.Signature = js.native
  def default(repo: typingsJapgolly.nodegit.repositoryMod.Repository): typingsJapgolly.nodegit.signatureMod.Signature = js.native
  def fromBuffer(buf: String): js.Promise[typingsJapgolly.nodegit.signatureMod.Signature] = js.native
  def now(name: String, email: String): typingsJapgolly.nodegit.signatureMod.Signature = js.native
}

