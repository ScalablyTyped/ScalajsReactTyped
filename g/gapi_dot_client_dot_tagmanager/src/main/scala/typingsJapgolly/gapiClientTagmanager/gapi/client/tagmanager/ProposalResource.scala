package typingsJapgolly.gapiClientTagmanager.gapi.client.tagmanager

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientTagmanager.AnonAlt
import typingsJapgolly.gapiClientTagmanager.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProposalResource extends js.Object {
  /** Creates a GTM Workspace Proposal. */
  def create(request: AnonAlt): Request_[WorkspaceProposal]
  /** Deletes a GTM Workspace Proposal. */
  def delete(request: AnonFields): Request_[Unit]
}

object ProposalResource {
  @scala.inline
  def apply(
    create: AnonAlt => CallbackTo[Request_[WorkspaceProposal]],
    delete: AnonFields => CallbackTo[Request_[Unit]]
  ): ProposalResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonAlt) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFields) => delete(t0).runNow()))
    __obj.asInstanceOf[ProposalResource]
  }
}

