package typingsJapgolly.typedGithubApi

import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.typedGithubApi.distGithubRefMod.GitHubRef
import typingsJapgolly.typedGithubApi.distGithubRefMod.OptionsOrRef
import typingsJapgolly.typedGithubApi.distInterfacesBranchMod.BranchSummary
import typingsJapgolly.typedGithubApi.distInterfacesBranchMod.BranchSummaryWithRepository
import typingsJapgolly.typedGithubApi.distInterfacesIssueMod.Issue
import typingsJapgolly.typedGithubApi.distInterfacesMilestoneMod.Milestone
import typingsJapgolly.typedGithubApi.distInterfacesPullRequestMod.PullRequest
import typingsJapgolly.typedGithubApi.distInterfacesPullRequestMod.Review
import typingsJapgolly.typedGithubApi.distInterfacesPullRequestMod.ReviewComment
import typingsJapgolly.typedGithubApi.distInterfacesPullRequestMod.ReviewRequests
import typingsJapgolly.typedGithubApi.distInterfacesPullRequestMod.Team
import typingsJapgolly.typedGithubApi.distInterfacesUserMod.UserSummary
import typingsJapgolly.typedGithubApi.distIssueMod.IssueCommentClass
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.APPROVED
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.CHANGES_REQUESTED
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.COMMENTED
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.DISMISSED
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.admin
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.closed
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPullRequestMod {
  
  @JSImport("typed-github-api/dist/pull-request", "PullRequestClass")
  @js.native
  open class PullRequestClass protected ()
    extends GitHubRef
       with PullRequest {
    def this(
      data: typingsJapgolly.typedGithubApi.distApiInterfacesPullRequestMod.PullRequest,
      options: OptionsOrRef
    ) = this()
    
    /* CompleteClass */
    var assignee: UserSummary | Null = js.native
    
    /* CompleteClass */
    var assignees: js.Array[UserSummary] = js.native
    
    /* CompleteClass */
    var base: BranchSummaryWithRepository = js.native
    
    /* CompleteClass */
    var body: String = js.native
    
    /* CompleteClass */
    var createdAt: Moment = js.native
    
    /* CompleteClass */
    var createdBy: UserSummary = js.native
    
    /* CompleteClass */
    var head: BranchSummary = js.native
    
    /* CompleteClass */
    var htmlUri: String = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* private */ var issueUri: Any = js.native
    
    /* CompleteClass */
    override def loadAsync(): js.Promise[PullRequest | Null] = js.native
    
    /* CompleteClass */
    override def loadIssueAsync(): js.Promise[Issue] = js.native
    
    /* CompleteClass */
    override def loadReviewCommentsAsync(): js.Promise[js.Array[ReviewComment]] = js.native
    
    /* CompleteClass */
    override def loadReviewRequestsAsync(): js.Promise[ReviewRequests] = js.native
    
    /* CompleteClass */
    override def loadReviewsAsync(): js.Promise[js.Array[Review]] = js.native
    
    /* CompleteClass */
    var locked: Boolean = js.native
    
    /* CompleteClass */
    var milestone: Milestone | Null = js.native
    
    /* CompleteClass */
    override val number: Double = js.native
    
    /* private */ var reviewCommentsUri: Any = js.native
    
    /* CompleteClass */
    var state: open | closed = js.native
    
    /* CompleteClass */
    var title: String = js.native
    
    /* CompleteClass */
    var updatedAt: Moment = js.native
  }
  
  @JSImport("typed-github-api/dist/pull-request", "ReviewClass")
  @js.native
  open class ReviewClass protected ()
    extends GitHubRef
       with Review {
    def this(data: typingsJapgolly.typedGithubApi.distApiInterfacesPullRequestMod.Review, options: OptionsOrRef) = this()
    
    /* CompleteClass */
    var body: String = js.native
    
    /* CompleteClass */
    var commitSha: String = js.native
    
    /* CompleteClass */
    var createdBy: UserSummary = js.native
    
    /* CompleteClass */
    var htmlUri: String = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var state: APPROVED | CHANGES_REQUESTED | COMMENTED | DISMISSED = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.typedGithubApi.distInterfacesIssueMod.IssueComment because Already inherited
  - typingsJapgolly.typedGithubApi.distInterfacesPullRequestMod.ReviewComment because var conflicts: body, createdAt, createdBy, htmlUri, id, updatedAt. Inlined diffHunk, position */ @JSImport("typed-github-api/dist/pull-request", "ReviewCommentClass")
  @js.native
  open class ReviewCommentClass protected () extends IssueCommentClass {
    def this(
      data: typingsJapgolly.typedGithubApi.distApiInterfacesPullRequestMod.ReviewComment,
      options: OptionsOrRef
    ) = this()
    
    var diffHunk: String = js.native
    
    var position: Double = js.native
  }
  
  @JSImport("typed-github-api/dist/pull-request", "TeamClass")
  @js.native
  open class TeamClass protected ()
    extends GitHubRef
       with Team {
    def this(data: typingsJapgolly.typedGithubApi.distApiInterfacesTeamMod.Team, options: OptionsOrRef) = this()
    
    /* CompleteClass */
    var description: String = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var permission: admin = js.native
    
    /* CompleteClass */
    var privacy: closed = js.native
    
    /* CompleteClass */
    var slug: String = js.native
  }
}
