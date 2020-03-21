package typingsJapgolly.typedGithubApi

import typingsJapgolly.typedGithubApi.githubRefMod.GitHubRef
import typingsJapgolly.typedGithubApi.githubRefMod.OptionsOrRef
import typingsJapgolly.typedGithubApi.interfacesRepositoryMod.Repository
import typingsJapgolly.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import typingsJapgolly.typedGithubApi.interfacesUserMod.User
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.all
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.created
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.full_name
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.member
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.owner
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.pushed
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/user-ref", JSImport.Namespace)
@js.native
object userRefMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UserRef * / any */ @js.native
  class UserRefClass protected () extends GitHubRef {
    def this(login: String, options: OptionsOrRef) = this()
    var login: String = js.native
    def getRepository(name: String): RepositoryRef = js.native
    def loadAsync(): js.Promise[User | Null] = js.native
    def loadRepositoriesAsync(): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: all | owner | member): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: all | owner | member, _sort: created | updated | pushed | full_name): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: all | owner | member, _sort: created | updated | pushed | full_name, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
  }
  
}

