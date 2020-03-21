package typingsJapgolly.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTeamMembersRequest extends js.Object {
  /**
    * The maximum number of team members you want returned in a response.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The continuation token for the next set of results, if the results cannot be returned in one response.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The ID of the project for which you want to list team members.
    */
  var projectId: ProjectId = js.native
}

object ListTeamMembersRequest {
  @scala.inline
  def apply(projectId: ProjectId, maxResults: Int | Double = null, nextToken: PaginationToken = null): ListTeamMembersRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTeamMembersRequest]
  }
}

