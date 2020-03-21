package typingsJapgolly.gapiClientCivicinfo.gapi.client.civicinfo

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCivicinfo.AnonIncludeOffices
import typingsJapgolly.gapiClientCivicinfo.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepresentativesResource extends js.Object {
  /** Looks up political geography and representative information for a single address. */
  def representativeInfoByAddress(request: AnonIncludeOffices): Request_[RepresentativeInfoResponse]
  /** Looks up representative information for a single geographic division. */
  def representativeInfoByDivision(request: AnonKey): Request_[RepresentativeInfoData]
}

object RepresentativesResource {
  @scala.inline
  def apply(
    representativeInfoByAddress: AnonIncludeOffices => CallbackTo[Request_[RepresentativeInfoResponse]],
    representativeInfoByDivision: AnonKey => CallbackTo[Request_[RepresentativeInfoData]]
  ): RepresentativesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("representativeInfoByAddress")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCivicinfo.AnonIncludeOffices) => representativeInfoByAddress(t0).runNow()))
    __obj.updateDynamic("representativeInfoByDivision")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCivicinfo.AnonKey) => representativeInfoByDivision(t0).runNow()))
    __obj.asInstanceOf[RepresentativesResource]
  }
}

