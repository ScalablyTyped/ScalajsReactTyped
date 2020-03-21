package typingsJapgolly.typedGithubApi

import typingsJapgolly.typedGithubApi.githubRefMod.GitHubRef
import typingsJapgolly.typedGithubApi.interfacesCommitMod.Commit
import typingsJapgolly.typedGithubApi.interfacesCommitMod.CommitRef
import typingsJapgolly.typedGithubApi.interfacesCommitMod.GitCommit
import typingsJapgolly.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import typingsJapgolly.typedGithubApi.repositoryRefMod.RepositoryRefClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/commit-ref", JSImport.Namespace)
@js.native
object commitRefMod extends js.Object {
  @js.native
  class CommitRefClass protected ()
    extends GitHubRef
       with CommitRef {
    def this(repository: RepositoryRefClass, sha: String) = this()
    /* CompleteClass */
    override val repository: RepositoryRef = js.native
    @JSName("repository")
    val repository_CommitRefClass: RepositoryRefClass = js.native
    /* CompleteClass */
    override val sha: String = js.native
    /* CompleteClass */
    override def loadAsync(): js.Promise[Commit | Null] = js.native
    /* CompleteClass */
    override def loadGitAsync(): js.Promise[GitCommit | Null] = js.native
  }
  
}

