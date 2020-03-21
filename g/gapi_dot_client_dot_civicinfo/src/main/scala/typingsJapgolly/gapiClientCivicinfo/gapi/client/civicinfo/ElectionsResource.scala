package typingsJapgolly.gapiClientCivicinfo.gapi.client.civicinfo

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCivicinfo.AnonAddress
import typingsJapgolly.gapiClientCivicinfo.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElectionsResource extends js.Object {
  /** List of available elections to query. */
  def electionQuery(request: AnonFields): Request_[ElectionsQueryResponse]
  /** Looks up information relevant to a voter based on the voter's registered address. */
  def voterInfoQuery(request: AnonAddress): Request_[VoterInfoResponse]
}

object ElectionsResource {
  @scala.inline
  def apply(
    electionQuery: AnonFields => CallbackTo[Request_[ElectionsQueryResponse]],
    voterInfoQuery: AnonAddress => CallbackTo[Request_[VoterInfoResponse]]
  ): ElectionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("electionQuery")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCivicinfo.AnonFields) => electionQuery(t0).runNow()))
    __obj.updateDynamic("voterInfoQuery")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCivicinfo.AnonAddress) => voterInfoQuery(t0).runNow()))
    __obj.asInstanceOf[ElectionsResource]
  }
}

