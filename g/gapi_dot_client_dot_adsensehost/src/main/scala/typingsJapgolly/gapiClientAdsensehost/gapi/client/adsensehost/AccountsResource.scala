package typingsJapgolly.gapiClientAdsensehost.gapi.client.adsensehost

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdsensehost.AnonFilterAdClientId
import typingsJapgolly.gapiClientAdsensehost.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  var adclients: AdclientsResource
  var adunits: AdunitsResource
  var reports: ReportsResource
  /** Get information about the selected associated AdSense account. */
  def get(request: AnonKey): Request_[Account]
  /** List hosted accounts associated with this AdSense account by ad client id. */
  def list(request: AnonFilterAdClientId): Request_[Accounts]
}

object AccountsResource {
  @scala.inline
  def apply(
    adclients: AdclientsResource,
    adunits: AdunitsResource,
    get: AnonKey => CallbackTo[Request_[Account]],
    list: AnonFilterAdClientId => CallbackTo[Request_[Accounts]],
    reports: ReportsResource
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(adclients = adclients.asInstanceOf[js.Any], adunits = adunits.asInstanceOf[js.Any], reports = reports.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdsensehost.AnonKey) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdsensehost.AnonFilterAdClientId) => list(t0).runNow()))
    __obj.asInstanceOf[AccountsResource]
  }
}

