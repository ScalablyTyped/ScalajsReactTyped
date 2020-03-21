package typingsJapgolly.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Reflog")
@js.native
class Reflog ()
  extends typingsJapgolly.nodegit.refLogMod.Reflog

/* static members */
@JSImport("nodegit", "Reflog")
@js.native
object Reflog extends js.Object {
  def delete(repo: typingsJapgolly.nodegit.repositoryMod.Repository, name: String): Double = js.native
  def read(repo: typingsJapgolly.nodegit.repositoryMod.Repository, name: String): js.Promise[typingsJapgolly.nodegit.refLogMod.Reflog] = js.native
  def rename(repo: typingsJapgolly.nodegit.repositoryMod.Repository, oldName: String, name: String): Double = js.native
}

