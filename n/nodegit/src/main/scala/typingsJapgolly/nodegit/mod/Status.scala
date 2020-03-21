package typingsJapgolly.nodegit.mod

import typingsJapgolly.nodegit.statusOptionsMod.StatusOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Status")
@js.native
class Status ()
  extends typingsJapgolly.nodegit.statusMod.Status

/* static members */
@JSImport("nodegit", "Status")
@js.native
object Status extends js.Object {
  def byIndex(statuslist: typingsJapgolly.nodegit.statusListMod.StatusList, idx: Double): typingsJapgolly.nodegit.statusEntryMod.StatusEntry = js.native
  def file(repo: typingsJapgolly.nodegit.repositoryMod.Repository, path: String): Double = js.native
  def foreach(repo: typingsJapgolly.nodegit.repositoryMod.Repository): js.Promise[Double] = js.native
  def foreach(repo: typingsJapgolly.nodegit.repositoryMod.Repository, callback: js.Function): js.Promise[Double] = js.native
  def foreachExt(repo: typingsJapgolly.nodegit.repositoryMod.Repository): js.Promise[Double] = js.native
  def foreachExt(repo: typingsJapgolly.nodegit.repositoryMod.Repository, opts: StatusOptions): js.Promise[Double] = js.native
  def foreachExt(repo: typingsJapgolly.nodegit.repositoryMod.Repository, opts: StatusOptions, callback: js.Function): js.Promise[Double] = js.native
  def shouldIgnore(ignored: Double, repo: typingsJapgolly.nodegit.repositoryMod.Repository, path: String): Double = js.native
}

