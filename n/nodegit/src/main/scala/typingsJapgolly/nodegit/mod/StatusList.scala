package typingsJapgolly.nodegit.mod

import typingsJapgolly.nodegit.statusOptionsMod.StatusOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "StatusList")
@js.native
class StatusList ()
  extends typingsJapgolly.nodegit.statusListMod.StatusList

/* static members */
@JSImport("nodegit", "StatusList")
@js.native
object StatusList extends js.Object {
  def create(repo: typingsJapgolly.nodegit.repositoryMod.Repository): js.Promise[typingsJapgolly.nodegit.statusListMod.StatusList] = js.native
  def create(repo: typingsJapgolly.nodegit.repositoryMod.Repository, opts: StatusOptions): js.Promise[typingsJapgolly.nodegit.statusListMod.StatusList] = js.native
}

