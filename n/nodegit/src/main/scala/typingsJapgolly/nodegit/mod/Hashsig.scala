package typingsJapgolly.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Hashsig")
@js.native
class Hashsig ()
  extends typingsJapgolly.nodegit.hashSigMod.Hashsig

/* static members */
@JSImport("nodegit", "Hashsig")
@js.native
object Hashsig extends js.Object {
  def create(buf: String, buflen: Double, opts: Double): js.Promise[typingsJapgolly.nodegit.hashSigMod.Hashsig] = js.native
  def createFromFile(path: String, opts: Double): js.Promise[typingsJapgolly.nodegit.hashSigMod.Hashsig] = js.native
}

