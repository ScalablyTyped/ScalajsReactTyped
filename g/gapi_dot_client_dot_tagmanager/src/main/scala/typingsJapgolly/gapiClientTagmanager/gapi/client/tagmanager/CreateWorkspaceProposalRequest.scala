package typingsJapgolly.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateWorkspaceProposalRequest extends js.Object {
  /** If present, an initial comment to associate with the workspace proposal. */
  var initialComment: js.UndefOr[WorkspaceProposalHistoryComment] = js.undefined
  /** List of users to review the workspace proposal. */
  var reviewers: js.UndefOr[js.Array[WorkspaceProposalUser]] = js.undefined
}

object CreateWorkspaceProposalRequest {
  @scala.inline
  def apply(
    initialComment: WorkspaceProposalHistoryComment = null,
    reviewers: js.Array[WorkspaceProposalUser] = null
  ): CreateWorkspaceProposalRequest = {
    val __obj = js.Dynamic.literal()
    if (initialComment != null) __obj.updateDynamic("initialComment")(initialComment.asInstanceOf[js.Any])
    if (reviewers != null) __obj.updateDynamic("reviewers")(reviewers.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkspaceProposalRequest]
  }
}

