package typingsJapgolly.nodegit.revertMod

import typingsJapgolly.nodegit.commitMod.Commit
import typingsJapgolly.nodegit.mergeOptionsMod.MergeOptions
import typingsJapgolly.nodegit.mod.Index
import typingsJapgolly.nodegit.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/revert", "Revert")
@js.native
class Revert () extends js.Object

/* static members */
@JSImport("nodegit/revert", "Revert")
@js.native
object Revert extends js.Object {
  /**
    * Reverts the given commit against the given "our" commit, producing an index that reflects the result of the revert.
    */
  def commit(repo: Repository, revertCommit: Commit, ourCommit: Commit, mainline: Double): js.Promise[Index] = js.native
  def commit(
    repo: Repository,
    revertCommit: Commit,
    ourCommit: Commit,
    mainline: Double,
    mergeOptions: MergeOptions
  ): js.Promise[Index] = js.native
  def revert(repo: Repository, commit: Commit): js.Promise[Double] = js.native
  def revert(repo: Repository, commit: Commit, givenOpts: RevertOptions): js.Promise[Double] = js.native
}

