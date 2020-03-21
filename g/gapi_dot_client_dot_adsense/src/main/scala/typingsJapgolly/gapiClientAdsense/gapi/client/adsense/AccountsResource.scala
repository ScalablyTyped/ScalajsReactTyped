package typingsJapgolly.gapiClientAdsense.gapi.client.adsense

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdsense.AnonAlt
import typingsJapgolly.gapiClientAdsense.AnonTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  var adclients: AdclientsResource
  var adunits: AdunitsResource
  var alerts: AlertsResource
  var customchannels: CustomchannelsResource
  var payments: PaymentsResource
  var reports: ReportsResource
  var savedadstyles: SavedadstylesResource
  var urlchannels: UrlchannelsResource
  /** Get information about the selected AdSense account. */
  def get(request: AnonTree): Request_[Account]
  /** List all accounts available to this AdSense account. */
  def list(request: AnonAlt): Request_[Accounts]
}

object AccountsResource {
  @scala.inline
  def apply(
    adclients: AdclientsResource,
    adunits: AdunitsResource,
    alerts: AlertsResource,
    customchannels: CustomchannelsResource,
    get: AnonTree => CallbackTo[Request_[Account]],
    list: AnonAlt => CallbackTo[Request_[Accounts]],
    payments: PaymentsResource,
    reports: ReportsResource,
    savedadstyles: SavedadstylesResource,
    urlchannels: UrlchannelsResource
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(adclients = adclients.asInstanceOf[js.Any], adunits = adunits.asInstanceOf[js.Any], alerts = alerts.asInstanceOf[js.Any], customchannels = customchannels.asInstanceOf[js.Any], payments = payments.asInstanceOf[js.Any], reports = reports.asInstanceOf[js.Any], savedadstyles = savedadstyles.asInstanceOf[js.Any], urlchannels = urlchannels.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdsense.AnonTree) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdsense.AnonAlt) => list(t0).runNow()))
    __obj.asInstanceOf[AccountsResource]
  }
}

