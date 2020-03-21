package typingsJapgolly.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "AnnotatedCommit")
@js.native
class AnnotatedCommit ()
  extends typingsJapgolly.nodegit.annotatedCommitMod.AnnotatedCommit

/* static members */
@JSImport("nodegit", "AnnotatedCommit")
@js.native
object AnnotatedCommit extends js.Object {
  /**
    * @param repo - repository that contains the given commit
    * @param branchName - name of the (remote) branch
    * @param remoteUrl - 	url of the remote
    * @param id - the commit object id of the remote branch
    */
  def fromFetchhead(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    branchName: String,
    remoteUrl: String,
    id: typingsJapgolly.nodegit.oidMod.Oid
  ): js.Promise[typingsJapgolly.nodegit.annotatedCommitMod.AnnotatedCommit] = js.native
  def fromRef(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    ref: typingsJapgolly.nodegit.referenceMod.Reference
  ): js.Promise[typingsJapgolly.nodegit.annotatedCommitMod.AnnotatedCommit] = js.native
  def fromRevspec(repo: typingsJapgolly.nodegit.repositoryMod.Repository, revspec: String): js.Promise[typingsJapgolly.nodegit.annotatedCommitMod.AnnotatedCommit] = js.native
  def lookup(repo: typingsJapgolly.nodegit.repositoryMod.Repository, id: typingsJapgolly.nodegit.oidMod.Oid): js.Promise[typingsJapgolly.nodegit.annotatedCommitMod.AnnotatedCommit] = js.native
}

