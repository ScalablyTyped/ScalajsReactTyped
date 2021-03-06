package typingsJapgolly.typedGithubApi

import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.typedGithubApi.distOwnerRefMod.OwnerRefClass
import typingsJapgolly.typedGithubApi.githubRefMod.OptionsOrRef
import typingsJapgolly.typedGithubApi.organizationMod.MyOrganization
import typingsJapgolly.typedGithubApi.userMod.Organization
import typingsJapgolly.typedGithubApi.userMod.OrganizationSummary
import typingsJapgolly.typedGithubApi.userMod.PrivateOrganization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/organization", JSImport.Namespace)
@js.native
object distOrganizationMod extends js.Object {
  @js.native
  class MyOrganizationClass protected ()
    extends OrganizationClass
       with MyOrganization {
    def this(data: PrivateOrganization, options: OptionsOrRef) = this()
    /* CompleteClass */
    override var billingEmail: String = js.native
    /* CompleteClass */
    override var collaborators: Double = js.native
    /* CompleteClass */
    override var defaultRepositorySettings: String = js.native
    /* CompleteClass */
    override var diskUsage: Double = js.native
    /* CompleteClass */
    override var membersCanCreateRepositories: Boolean = js.native
    /* CompleteClass */
    override var plan: AnonName = js.native
    /* CompleteClass */
    override var privateGists: Double = js.native
    /* CompleteClass */
    override var privateReposOwned: Double = js.native
    /* CompleteClass */
    override var privateReposTotal: Double = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.typedGithubApi.ownerRefMod.OwnerRef because Already inherited
  - typingsJapgolly.typedGithubApi.organizationMod.OrganizationSummary because Already inherited
  - typingsJapgolly.typedGithubApi.organizationMod.Organization because var conflicts: avatarUri, description, id, login. Inlined name, company, blog, location, email, publicRepos, publicGists, followers, following, createdAt, updatedAt, htmlUri, hasOrganizationProjects, hasRepositoryProjects */ @js.native
  class OrganizationClass protected () extends OrganizationSummaryClass {
    def this(data: Organization, options: OptionsOrRef) = this()
    var blog: String = js.native
    var company: String = js.native
    var createdAt: Moment = js.native
    var email: String = js.native
    var followers: Double = js.native
    var following: Double = js.native
    var hasOrganizationProjects: Boolean = js.native
    var hasRepositoryProjects: Boolean = js.native
    var htmlUri: String = js.native
    var location: String = js.native
    var name: String = js.native
    var publicGists: Double = js.native
    var publicRepos: Double = js.native
    var updatedAt: Moment = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.typedGithubApi.ownerRefMod.OwnerRef because Already inherited
  - typingsJapgolly.typedGithubApi.organizationMod.OrganizationSummary because var conflicts: login. Inlined id, avatarUri, description */ @js.native
  class OrganizationSummaryClass protected () extends OwnerRefClass {
    def this(data: OrganizationSummary, options: OptionsOrRef) = this()
    var avatarUri: String = js.native
    var description: String = js.native
    var id: Double = js.native
  }
  
}

