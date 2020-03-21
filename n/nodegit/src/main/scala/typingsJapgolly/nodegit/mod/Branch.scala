package typingsJapgolly.nodegit.mod

import typingsJapgolly.nodegit.branchMod.Branch.BRANCH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Branch")
@js.native
class Branch ()
  extends typingsJapgolly.nodegit.branchMod.Branch

/* static members */
@JSImport("nodegit", "Branch")
@js.native
object Branch extends js.Object {
  def create(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    branchName: String,
    target: typingsJapgolly.nodegit.commitMod.Commit,
    force: Double
  ): js.Promise[typingsJapgolly.nodegit.referenceMod.Reference] = js.native
  def createFromAnnotated(
    repository: typingsJapgolly.nodegit.repositoryMod.Repository,
    branchName: String,
    commit: typingsJapgolly.nodegit.annotatedCommitMod.AnnotatedCommit,
    force: Double
  ): typingsJapgolly.nodegit.referenceMod.Reference = js.native
  def delete(branch: typingsJapgolly.nodegit.referenceMod.Reference): Double = js.native
  def isHead(branch: typingsJapgolly.nodegit.referenceMod.Reference): Double = js.native
  def iteratorNew(repo: typingsJapgolly.nodegit.repositoryMod.Repository, listFlags: Double): js.Promise[_] = js.native
  def lookup(repo: typingsJapgolly.nodegit.repositoryMod.Repository, branchName: String, branchType: BRANCH): js.Promise[typingsJapgolly.nodegit.referenceMod.Reference] = js.native
  def move(branch: typingsJapgolly.nodegit.referenceMod.Reference, newBranchName: String, force: Double): js.Promise[typingsJapgolly.nodegit.referenceMod.Reference] = js.native
  def name(ref: typingsJapgolly.nodegit.referenceMod.Reference): js.Promise[String] = js.native
  def setUpstream(branch: typingsJapgolly.nodegit.referenceMod.Reference, upstreamName: String): js.Promise[Double] = js.native
  def upstream(branch: typingsJapgolly.nodegit.referenceMod.Reference): js.Promise[typingsJapgolly.nodegit.referenceMod.Reference] = js.native
}

