package typingsJapgolly.typedGithubApi

import typingsJapgolly.typedGithubApi.distGithubRefMod.GitHubRef
import typingsJapgolly.typedGithubApi.distGithubRefMod.OptionsOrRef
import typingsJapgolly.typedGithubApi.distInterfacesOrganizationMod.Organization
import typingsJapgolly.typedGithubApi.distInterfacesRepositoryMod.Repository
import typingsJapgolly.typedGithubApi.distInterfacesRepositoryMod.RepositoryRef
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOrganizationRefMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrganizationRef * / any */ @JSImport("typed-github-api/dist/organization-ref", "OrganizationRefClass")
  @js.native
  open class OrganizationRefClass protected () extends GitHubRef {
    def this(login: String, options: OptionsOrRef) = this()
    
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
    def loadRepositoriesAsync(_type: all | public | `private` | forks | sources | member, _sort: Unit, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: Unit, _sort: created | updated | pushed | full_name): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: Unit, _sort: created | updated | pushed | full_name, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: Unit, _sort: Unit, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    
    var login: String = js.native
  }
}
