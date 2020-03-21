package typingsJapgolly.typedGithubApi

import typingsJapgolly.typedGithubApi.githubRefMod.GitHubRef
import typingsJapgolly.typedGithubApi.interfacesBranchMod.Branch
import typingsJapgolly.typedGithubApi.interfacesBranchMod.BranchRef
import typingsJapgolly.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import typingsJapgolly.typedGithubApi.repositoryRefMod.RepositoryRefClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/branch-ref", JSImport.Namespace)
@js.native
object branchRefMod extends js.Object {
  @js.native
  class BranchRefClass protected ()
    extends GitHubRef
       with BranchRef {
    def this(repository: RepositoryRefClass, name: String) = this()
    /* CompleteClass */
    override val name: String = js.native
    /* CompleteClass */
    override val repository: RepositoryRef = js.native
    @JSName("repository")
    val repository_BranchRefClass: RepositoryRefClass = js.native
    /* CompleteClass */
    override def loadAsync(): js.Promise[Branch | Null] = js.native
  }
  
}

