package typingsJapgolly.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexchangebuyer.AnonFields
import typingsJapgolly.gapiClientAdexchangebuyer.AnonOauthtoken
import typingsJapgolly.gapiClientAdexchangebuyer.AnonProposalId
import typingsJapgolly.gapiClientAdexchangebuyer.AnonUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProposalsResource extends js.Object {
  /** Get a proposal given its id */
  def get(request: AnonOauthtoken): Request_[Proposal]
  /** Create the given list of proposals */
  def insert(request: AnonFields): Request_[CreateOrdersResponse]
  /** Update the given proposal. This method supports patch semantics. */
  def patch(request: AnonProposalId): Request_[Proposal]
  /** Search for proposals using pql query */
  def search(request: AnonUserIp): Request_[GetOrdersResponse]
  /** Update the given proposal to indicate that setup has been completed. */
  def setupcomplete(request: AnonOauthtoken): Request_[Unit]
  /** Update the given proposal */
  def update(request: AnonProposalId): Request_[Proposal]
}

object ProposalsResource {
  @scala.inline
  def apply(
    get: AnonOauthtoken => CallbackTo[Request_[Proposal]],
    insert: AnonFields => CallbackTo[Request_[CreateOrdersResponse]],
    patch: AnonProposalId => CallbackTo[Request_[Proposal]],
    search: AnonUserIp => CallbackTo[Request_[GetOrdersResponse]],
    setupcomplete: AnonOauthtoken => CallbackTo[Request_[Unit]],
    update: AnonProposalId => CallbackTo[Request_[Proposal]]
  ): ProposalsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonOauthtoken) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonFields) => insert(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonProposalId) => patch(t0).runNow()))
    __obj.updateDynamic("search")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonUserIp) => search(t0).runNow()))
    __obj.updateDynamic("setupcomplete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonOauthtoken) => setupcomplete(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonProposalId) => update(t0).runNow()))
    __obj.asInstanceOf[ProposalsResource]
  }
}

