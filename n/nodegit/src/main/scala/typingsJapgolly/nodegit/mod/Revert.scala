package typingsJapgolly.nodegit.mod

import typingsJapgolly.nodegit.revertMod.RevertOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Revert")
@js.native
class Revert ()
  extends typingsJapgolly.nodegit.revertMod.Revert

/* static members */
@JSImport("nodegit", "Revert")
@js.native
object Revert extends js.Object {
  /**
    * Reverts the given commit against the given "our" commit, producing an index that reflects the result of the revert.
    */
  def commit(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    revertCommit: typingsJapgolly.nodegit.commitMod.Commit,
    ourCommit: typingsJapgolly.nodegit.commitMod.Commit,
    mainline: Double
  ): js.Promise[Index] = js.native
  def commit(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    revertCommit: typingsJapgolly.nodegit.commitMod.Commit,
    ourCommit: typingsJapgolly.nodegit.commitMod.Commit,
    mainline: Double,
    mergeOptions: typingsJapgolly.nodegit.mergeOptionsMod.MergeOptions
  ): js.Promise[Index] = js.native
  def revert(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    commit: typingsJapgolly.nodegit.commitMod.Commit
  ): js.Promise[Double] = js.native
  def revert(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    commit: typingsJapgolly.nodegit.commitMod.Commit,
    givenOpts: RevertOptions
  ): js.Promise[Double] = js.native
}

