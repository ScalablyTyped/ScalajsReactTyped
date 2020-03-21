package typingsJapgolly.typedGithubApi

import typingsJapgolly.typedGithubApi.githubRefMod.GitHubRef
import typingsJapgolly.typedGithubApi.interfacesIssueMod.Issue
import typingsJapgolly.typedGithubApi.interfacesIssueMod.IssueRef
import typingsJapgolly.typedGithubApi.interfacesRepositoryMod.Repository
import typingsJapgolly.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import typingsJapgolly.typedGithubApi.repositoryRefMod.RepositoryRefClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/issue-ref", JSImport.Namespace)
@js.native
object issueRefMod extends js.Object {
  @js.native
  class IssueRefClass protected ()
    extends GitHubRef
       with IssueRef {
    def this(repository: RepositoryRefClass, issueNumber: Double) = this()
    /* CompleteClass */
    override val number: Double = js.native
    val repository: RepositoryRef = js.native
    /* CompleteClass */
    override def loadAsync(): js.Promise[Issue | Null] = js.native
    /* CompleteClass */
    override def loadRepositoryAsync(): js.Promise[Repository] = js.native
  }
  
}

