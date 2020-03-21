package typingsJapgolly.typedGithubApi

import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.typedGithubApi.githubRefMod.GitHubRef
import typingsJapgolly.typedGithubApi.githubRefMod.OptionsOrRef
import typingsJapgolly.typedGithubApi.interfacesMilestoneMod.Milestone
import typingsJapgolly.typedGithubApi.interfacesUserMod.UserSummary
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.closed
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/milestone", JSImport.Namespace)
@js.native
object distMilestoneMod extends js.Object {
  @js.native
  class MilestoneClass protected ()
    extends GitHubRef
       with Milestone {
    def this(data: typingsJapgolly.typedGithubApi.milestoneMod.Milestone, options: OptionsOrRef) = this()
    /* CompleteClass */
    override var closedIssueCount: Double = js.native
    /* CompleteClass */
    override var created: Moment = js.native
    /* CompleteClass */
    override var creator: UserSummary = js.native
    /* CompleteClass */
    override var description: String = js.native
    /* CompleteClass */
    override var due: Moment = js.native
    /* CompleteClass */
    override var htmlUri: String = js.native
    /* CompleteClass */
    override var id: Double = js.native
    /* CompleteClass */
    override var number: Double = js.native
    /* CompleteClass */
    override var openIssueCount: Double = js.native
    /* CompleteClass */
    override var state: open | closed = js.native
    /* CompleteClass */
    override var title: String = js.native
    /* CompleteClass */
    override var updated: Moment = js.native
  }
  
}

