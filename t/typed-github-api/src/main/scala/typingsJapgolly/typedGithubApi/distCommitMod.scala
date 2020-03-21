package typingsJapgolly.typedGithubApi

import typingsJapgolly.typedGithubApi.commitMod.Commit
import typingsJapgolly.typedGithubApi.commitRefMod.CommitRefClass
import typingsJapgolly.typedGithubApi.interfacesCommitMod.CommitRef
import typingsJapgolly.typedGithubApi.interfacesCommitMod.CommitSummary
import typingsJapgolly.typedGithubApi.interfacesCommitMod.GitActor
import typingsJapgolly.typedGithubApi.interfacesCommitMod.GitChanges
import typingsJapgolly.typedGithubApi.interfacesCommitMod.GitCommit
import typingsJapgolly.typedGithubApi.interfacesCommitMod.GitCommitSummary
import typingsJapgolly.typedGithubApi.interfacesCommitMod.GitFile
import typingsJapgolly.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import typingsJapgolly.typedGithubApi.repositoryRefMod.RepositoryRefClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/commit", JSImport.Namespace)
@js.native
object distCommitMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.typedGithubApi.interfacesCommitMod.CommitRef because Already inherited
  - typingsJapgolly.typedGithubApi.interfacesCommitMod.CommitSummary because Already inherited
  - typingsJapgolly.typedGithubApi.interfacesCommitMod.Commit because var conflicts: author, committer, gitCommit, htmlUri, parents. Inlined changes, files */ @js.native
  class CommitClass protected () extends CommitSummaryClass {
    def this(repository: RepositoryRefClass, data: Commit) = this()
    var changes: GitChanges = js.native
    var files: js.Array[GitFile] = js.native
  }
  
  @js.native
  class CommitSummaryClass protected ()
    extends CommitRefClass
       with CommitSummary {
    def this(repository: RepositoryRefClass, data: typingsJapgolly.typedGithubApi.commitMod.CommitSummary) = this()
    /* CompleteClass */
    override var gitCommit: GitCommitSummary = js.native
    /* CompleteClass */
    override var htmlUri: String = js.native
    /* CompleteClass */
    override var parents: js.Array[CommitRef] = js.native
    /* CompleteClass */
    override val repository: RepositoryRef = js.native
    /* CompleteClass */
    override val sha: String = js.native
    /* CompleteClass */
    override def loadAsync(): js.Promise[typingsJapgolly.typedGithubApi.interfacesCommitMod.Commit | Null] = js.native
    /* CompleteClass */
    override def loadGitAsync(): js.Promise[GitCommit | Null] = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.typedGithubApi.interfacesCommitMod.CommitRef because Already inherited
  - typingsJapgolly.typedGithubApi.interfacesCommitMod.GitCommitSummary because Already inherited
  - typingsJapgolly.typedGithubApi.interfacesCommitMod.GitCommit because var conflicts: author, committer, message. Inlined parents */ @js.native
  class GitCommitClass protected () extends GitCommitSummaryClass {
    def this(repository: RepositoryRefClass, data: typingsJapgolly.typedGithubApi.commitMod.GitCommit) = this()
    var parents: js.Array[CommitRef] = js.native
  }
  
  @js.native
  class GitCommitSummaryClass protected ()
    extends CommitRefClass
       with GitCommitSummary {
    def this(
      repository: RepositoryRefClass,
      sha: String,
      data: typingsJapgolly.typedGithubApi.commitMod.GitCommitSummary
    ) = this()
    /* CompleteClass */
    override var author: GitActor = js.native
    /* CompleteClass */
    override var committer: GitActor = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override val repository: RepositoryRef = js.native
    /* CompleteClass */
    override val sha: String = js.native
    /* CompleteClass */
    override def loadAsync(): js.Promise[typingsJapgolly.typedGithubApi.interfacesCommitMod.Commit | Null] = js.native
    /* CompleteClass */
    override def loadGitAsync(): js.Promise[GitCommit | Null] = js.native
  }
  
}

