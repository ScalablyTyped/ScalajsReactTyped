package typingsJapgolly.gapiClientPartners.gapi.client.partners

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPartners.AnonAddress
import typingsJapgolly.gapiClientPartners.AnonCompanyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompaniesResource extends js.Object {
  var leads: LeadsResource
  /** Gets a company. */
  def get(request: AnonAddress): Request_[GetCompanyResponse]
  /** Lists companies. */
  def list(request: AnonCompanyName): Request_[ListCompaniesResponse]
}

object CompaniesResource {
  @scala.inline
  def apply(
    get: AnonAddress => CallbackTo[Request_[GetCompanyResponse]],
    leads: LeadsResource,
    list: AnonCompanyName => CallbackTo[Request_[ListCompaniesResponse]]
  ): CompaniesResource = {
    val __obj = js.Dynamic.literal(leads = leads.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPartners.AnonAddress) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPartners.AnonCompanyName) => list(t0).runNow()))
    __obj.asInstanceOf[CompaniesResource]
  }
}

