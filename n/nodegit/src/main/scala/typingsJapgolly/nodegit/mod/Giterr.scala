package typingsJapgolly.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Giterr")
@js.native
class Giterr ()
  extends typingsJapgolly.nodegit.gitErrMod.Giterr

/* static members */
@JSImport("nodegit", "Giterr")
@js.native
object Giterr extends js.Object {
  def errClear(): Unit = js.native
  def errLast(): typingsJapgolly.nodegit.errorMod.Error = js.native
  def errSetOom(): Unit = js.native
  def errSetString(errorClass: Double, string: String): Unit = js.native
}

