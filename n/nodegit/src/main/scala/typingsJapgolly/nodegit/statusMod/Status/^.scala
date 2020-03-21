package typingsJapgolly.nodegit.statusMod.Status

import typingsJapgolly.nodegit.repositoryMod.Repository
import typingsJapgolly.nodegit.statusEntryMod.StatusEntry
import typingsJapgolly.nodegit.statusListMod.StatusList
import typingsJapgolly.nodegit.statusOptionsMod.StatusOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/status", "Status")
@js.native
object ^ extends js.Object {
  def byIndex(statuslist: StatusList, idx: Double): StatusEntry = js.native
  def file(repo: Repository, path: String): Double = js.native
  def foreach(repo: Repository): js.Promise[Double] = js.native
  def foreach(repo: Repository, callback: js.Function): js.Promise[Double] = js.native
  def foreachExt(repo: Repository): js.Promise[Double] = js.native
  def foreachExt(repo: Repository, opts: StatusOptions): js.Promise[Double] = js.native
  def foreachExt(repo: Repository, opts: StatusOptions, callback: js.Function): js.Promise[Double] = js.native
  def shouldIgnore(ignored: Double, repo: Repository, path: String): Double = js.native
}

