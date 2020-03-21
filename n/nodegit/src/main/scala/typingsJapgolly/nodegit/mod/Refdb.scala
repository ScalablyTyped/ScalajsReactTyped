package typingsJapgolly.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Refdb")
@js.native
class Refdb ()
  extends typingsJapgolly.nodegit.refDbMod.Refdb

/* static members */
@JSImport("nodegit", "Refdb")
@js.native
object Refdb extends js.Object {
  def open(repo: typingsJapgolly.nodegit.repositoryMod.Repository): js.Promise[typingsJapgolly.nodegit.refDbMod.Refdb] = js.native
}

