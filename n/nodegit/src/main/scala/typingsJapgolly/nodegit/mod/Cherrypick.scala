package typingsJapgolly.nodegit.mod

import typingsJapgolly.nodegit.cherryPickOptionsMod.CherrypickOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Cherrypick")
@js.native
class Cherrypick ()
  extends typingsJapgolly.nodegit.cherryPickMod.Cherrypick

/* static members */
@JSImport("nodegit", "Cherrypick")
@js.native
object Cherrypick extends js.Object {
  /**
    * Cherrypick a commit and, changing the index and working directory
    */
  def cherrypick(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    commit: typingsJapgolly.nodegit.commitMod.Commit
  ): js.Promise[Double] = js.native
  def cherrypick(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    commit: typingsJapgolly.nodegit.commitMod.Commit,
    options: CherrypickOptions
  ): js.Promise[Double] = js.native
  /**
    * Cherrypicks the given commit against "our" commit, producing an index that reflects the result of the cherrypick. The index is not backed by a repo.
    */
  def commit(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    cherrypickCommit: typingsJapgolly.nodegit.commitMod.Commit,
    ourCommit: typingsJapgolly.nodegit.commitMod.Commit,
    mainline: Double
  ): js.Promise[Double] = js.native
  def commit(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    cherrypickCommit: typingsJapgolly.nodegit.commitMod.Commit,
    ourCommit: typingsJapgolly.nodegit.commitMod.Commit,
    mainline: Double,
    mergeOptions: typingsJapgolly.nodegit.mergeOptionsMod.MergeOptions
  ): js.Promise[Double] = js.native
  def initOptions(opts: CherrypickOptions, version: Double): Double = js.native
}

