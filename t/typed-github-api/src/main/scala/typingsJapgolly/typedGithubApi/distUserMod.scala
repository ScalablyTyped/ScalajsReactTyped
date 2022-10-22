package typingsJapgolly.typedGithubApi

import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.typedGithubApi.anon.Name
import typingsJapgolly.typedGithubApi.distApiInterfacesUserMod.PrivateUser
import typingsJapgolly.typedGithubApi.distApiInterfacesUserMod.User
import typingsJapgolly.typedGithubApi.distApiInterfacesUserMod.UserSummary
import typingsJapgolly.typedGithubApi.distGithubRefMod.OptionsOrRef
import typingsJapgolly.typedGithubApi.distOwnerRefMod.OwnerRefClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUserMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.typedGithubApi.distInterfacesOwnerRefMod.OwnerRef because Already inherited
  - typingsJapgolly.typedGithubApi.distInterfacesUserMod.UserSummary because Already inherited
  - typingsJapgolly.typedGithubApi.distInterfacesUserMod.User because Already inherited
  - typingsJapgolly.typedGithubApi.distInterfacesUserMod.MyUser because var conflicts: avatarUri, blog, company, createdAt, email, followers, following, id, location, login, name, publicGists, publicRepos, updatedAt. Inlined privateReposTotal, privateReposOwned, privateGists, diskUsage, collaborators, plan, twoFactorAuthentication */ @JSImport("typed-github-api/dist/user", "MyUserClass")
  @js.native
  open class MyUserClass protected () extends UserClass {
    def this(data: PrivateUser, options: OptionsOrRef) = this()
    
    var collaborators: Double = js.native
    
    var diskUsage: Double = js.native
    
    var plan: Name = js.native
    
    var privateGists: Double = js.native
    
    var privateReposOwned: Double = js.native
    
    var privateReposTotal: Double = js.native
    
    var twoFactorAuthentication: Boolean = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.typedGithubApi.distInterfacesOwnerRefMod.OwnerRef because Already inherited
  - typingsJapgolly.typedGithubApi.distInterfacesUserMod.UserSummary because Already inherited
  - typingsJapgolly.typedGithubApi.distInterfacesUserMod.User because var conflicts: avatarUri, id, login. Inlined name, company, blog, location, email, publicRepos, publicGists, followers, following, createdAt, updatedAt */ @JSImport("typed-github-api/dist/user", "UserClass")
  @js.native
  open class UserClass protected () extends UserSummaryClass {
    def this(data: User, options: OptionsOrRef) = this()
    
    var biography: String = js.native
    
    var blog: String = js.native
    
    var company: String = js.native
    
    var createdAt: Moment = js.native
    
    var email: String = js.native
    
    var followers: Double = js.native
    
    var following: Double = js.native
    
    var isHireable: Boolean = js.native
    
    var location: String = js.native
    
    var name: String = js.native
    
    var publicGists: Double = js.native
    
    var publicRepos: Double = js.native
    
    var updatedAt: Moment = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.typedGithubApi.distInterfacesOwnerRefMod.OwnerRef because Already inherited
  - typingsJapgolly.typedGithubApi.distInterfacesUserMod.UserSummary because var conflicts: login. Inlined id, avatarUri */ @JSImport("typed-github-api/dist/user", "UserSummaryClass")
  @js.native
  open class UserSummaryClass protected () extends OwnerRefClass {
    def this(data: UserSummary, options: OptionsOrRef) = this()
    
    var avatarUri: String = js.native
    
    var id: Double = js.native
    
    var siteAdministrator: Boolean = js.native
  }
}
