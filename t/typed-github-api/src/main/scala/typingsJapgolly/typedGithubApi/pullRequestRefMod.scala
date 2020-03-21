package typingsJapgolly.typedGithubApi

import typingsJapgolly.typedGithubApi.githubRefMod.GitHubRef
import typingsJapgolly.typedGithubApi.interfacesPullRequestMod.PullRequest
import typingsJapgolly.typedGithubApi.interfacesPullRequestMod.PullRequestRef
import typingsJapgolly.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import typingsJapgolly.typedGithubApi.repositoryRefMod.RepositoryRefClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/pull-request-ref", JSImport.Namespace)
@js.native
object pullRequestRefMod extends js.Object {
  @js.native
  class PullRequestRefClass protected ()
    extends GitHubRef
       with PullRequestRef {
    def this(repository: RepositoryRefClass, pullRequestNumber: Double) = this()
    /* CompleteClass */
    override val number: Double = js.native
    val repository: RepositoryRef = js.native
    /* CompleteClass */
    override def loadAsync(): js.Promise[PullRequest | Null] = js.native
  }
  
}

