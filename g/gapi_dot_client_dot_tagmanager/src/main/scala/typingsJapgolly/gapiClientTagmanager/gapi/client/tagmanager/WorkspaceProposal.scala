package typingsJapgolly.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceProposal extends js.Object {
  /** List of authors for the workspace proposal. */
  var authors: js.UndefOr[js.Array[WorkspaceProposalUser]] = js.undefined
  /** The fingerprint of the GTM workspace proposal as computed at storage time. This value is recomputed whenever the proposal is modified. */
  var fingerprint: js.UndefOr[String] = js.undefined
  /** Records the history of comments and status changes. */
  var history: js.UndefOr[js.Array[WorkspaceProposalHistory]] = js.undefined
  /** GTM workspace proposal's relative path. */
  var path: js.UndefOr[String] = js.undefined
  /** Lists of reviewers for the workspace proposal. */
  var reviewers: js.UndefOr[js.Array[WorkspaceProposalUser]] = js.undefined
  /** The status of the workspace proposal as it goes through review. */
  var status: js.UndefOr[String] = js.undefined
}

object WorkspaceProposal {
  @scala.inline
  def apply(
    authors: js.Array[WorkspaceProposalUser] = null,
    fingerprint: String = null,
    history: js.Array[WorkspaceProposalHistory] = null,
    path: String = null,
    reviewers: js.Array[WorkspaceProposalUser] = null,
    status: String = null
  ): WorkspaceProposal = {
    val __obj = js.Dynamic.literal()
    if (authors != null) __obj.updateDynamic("authors")(authors.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (reviewers != null) __obj.updateDynamic("reviewers")(reviewers.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceProposal]
  }
}

