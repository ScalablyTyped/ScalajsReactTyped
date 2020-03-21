package typingsJapgolly.gapiClientPartners.gapi.client.partners

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPartners.AnonFields
import typingsJapgolly.gapiClientPartners.AnonPp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait V2Resource extends js.Object {
  /**
    * Gets Partners Status of the logged in user's agency.
    * Should only be called if the logged in user is the admin of the agency.
    */
  def getPartnersstatus(request: AnonFields): Request_[GetPartnersStatusResponse]
  /**
    * Update company.
    * Should only be called within the context of an authorized logged in user.
    */
  def updateCompanies(request: AnonPp): Request_[Company]
  /** Updates the specified lead. */
  def updateLeads(request: AnonPp): Request_[Lead]
}

object V2Resource {
  @scala.inline
  def apply(
    getPartnersstatus: AnonFields => CallbackTo[Request_[GetPartnersStatusResponse]],
    updateCompanies: AnonPp => CallbackTo[Request_[Company]],
    updateLeads: AnonPp => CallbackTo[Request_[Lead]]
  ): V2Resource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getPartnersstatus")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPartners.AnonFields) => getPartnersstatus(t0).runNow()))
    __obj.updateDynamic("updateCompanies")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPartners.AnonPp) => updateCompanies(t0).runNow()))
    __obj.updateDynamic("updateLeads")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPartners.AnonPp) => updateLeads(t0).runNow()))
    __obj.asInstanceOf[V2Resource]
  }
}

