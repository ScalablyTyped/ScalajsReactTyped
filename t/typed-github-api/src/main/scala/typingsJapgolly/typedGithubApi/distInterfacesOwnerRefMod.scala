package typingsJapgolly.typedGithubApi

import typingsJapgolly.typedGithubApi.distInterfacesOrganizationMod.Organization
import typingsJapgolly.typedGithubApi.distInterfacesRepositoryMod.Repository
import typingsJapgolly.typedGithubApi.distInterfacesRepositoryMod.RepositoryRef
import typingsJapgolly.typedGithubApi.distInterfacesUserMod.User
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.`private`
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.all
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.created
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.forks
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.full_name
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.member
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.owner
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.public
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.pushed
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.sources
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.updated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesOwnerRefMod {
  
  @js.native
  trait OwnerRef extends StObject {
    
    def getRepository(name: String): RepositoryRef = js.native
    
    def loadOrganizationAsync(): js.Promise[Organization | Null] = js.native
    
    /**
      * Loads repositories owned by this organisation.
      * @param type      The type of repository to return (default all)
      * @param sort      The field to sort by (default full_name)
      * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
      * @returns         The resulting array of repositories
      */
    def loadOrganizationRepositoriesAsync(): js.Promise[js.Array[Repository]] = js.native
    def loadOrganizationRepositoriesAsync(`type`: all | public | `private` | forks | sources | member): js.Promise[js.Array[Repository]] = js.native
    def loadOrganizationRepositoriesAsync(
      `type`: all | public | `private` | forks | sources | member,
      sort: created | updated | pushed | full_name
    ): js.Promise[js.Array[Repository]] = js.native
    def loadOrganizationRepositoriesAsync(
      `type`: all | public | `private` | forks | sources | member,
      sort: created | updated | pushed | full_name,
      ascending: Boolean
    ): js.Promise[js.Array[Repository]] = js.native
    def loadOrganizationRepositoriesAsync(`type`: all | public | `private` | forks | sources | member, sort: Unit, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadOrganizationRepositoriesAsync(`type`: Unit, sort: created | updated | pushed | full_name): js.Promise[js.Array[Repository]] = js.native
    def loadOrganizationRepositoriesAsync(`type`: Unit, sort: created | updated | pushed | full_name, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadOrganizationRepositoriesAsync(`type`: Unit, sort: Unit, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    
    /**
      * Loads repositories accessible to this user.
      * @param type      The type of search (default owner)
      * @param sort      The field to sort by (default full_name)
      * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
      * @returns         The resulting array of repositories
      */
    def loadRepositoriesAsync(): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: all | owner | member): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: all | owner | member, sort: created | updated | pushed | full_name): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: all | owner | member, sort: created | updated | pushed | full_name, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: all | owner | member, sort: Unit, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: Unit, sort: created | updated | pushed | full_name): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: Unit, sort: created | updated | pushed | full_name, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: Unit, sort: Unit, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    
    def loadUserAsync(): js.Promise[User | Null] = js.native
    
    var login: String = js.native
  }
}
