package typingsJapgolly.typedGithubApi

import typingsJapgolly.typedGithubApi.githubRefMod.GitHubRef
import typingsJapgolly.typedGithubApi.githubRefMod.OptionsOrRef
import typingsJapgolly.typedGithubApi.interfacesRepositoryMod.Repository
import typingsJapgolly.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import typingsJapgolly.typedGithubApi.organizationMod.Organization
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.`private`
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.all
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.created
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.forks
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.full_name
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.member
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.public
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.pushed
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.sources
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/organization-ref", JSImport.Namespace)
@js.native
object organizationRefMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrganizationRef * / any */ @js.native
  class OrganizationRefClass protected () extends GitHubRef {
    def this(login: String, options: OptionsOrRef) = this()
    var login: String = js.native
    def getRepository(name: String): RepositoryRef = js.native
    def loadAsync(): js.Promise[Organization | Null] = js.native
    def loadRepositoriesAsync(): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: all | public | `private` | forks | sources | member): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(
      _type: all | public | `private` | forks | sources | member,
      _sort: created | updated | pushed | full_name
    ): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(
      _type: all | public | `private` | forks | sources | member,
      _sort: created | updated | pushed | full_name,
      _ascending: Boolean
    ): js.Promise[js.Array[Repository]] = js.native
  }
  
}

