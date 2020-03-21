package typingsJapgolly.nodegit.branchMod.Branch

import typingsJapgolly.nodegit.annotatedCommitMod.AnnotatedCommit
import typingsJapgolly.nodegit.commitMod.Commit
import typingsJapgolly.nodegit.referenceMod.Reference
import typingsJapgolly.nodegit.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/branch", "Branch")
@js.native
object ^ extends js.Object {
  def create(repo: Repository, branchName: String, target: Commit, force: Double): js.Promise[Reference] = js.native
  def createFromAnnotated(repository: Repository, branchName: String, commit: AnnotatedCommit, force: Double): Reference = js.native
  def delete(branch: Reference): Double = js.native
  def isHead(branch: Reference): Double = js.native
  def iteratorNew(repo: Repository, listFlags: Double): js.Promise[_] = js.native
  def lookup(repo: Repository, branchName: String, branchType: BRANCH): js.Promise[Reference] = js.native
  def move(branch: Reference, newBranchName: String, force: Double): js.Promise[Reference] = js.native
  def name(ref: Reference): js.Promise[String] = js.native
  def setUpstream(branch: Reference, upstreamName: String): js.Promise[Double] = js.native
  def upstream(branch: Reference): js.Promise[Reference] = js.native
}

