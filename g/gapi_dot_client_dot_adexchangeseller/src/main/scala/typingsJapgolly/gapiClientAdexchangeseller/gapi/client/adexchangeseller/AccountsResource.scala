package typingsJapgolly.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexchangeseller.AnonKey
import typingsJapgolly.gapiClientAdexchangeseller.AnonMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  var adclients: AdclientsResource
  var alerts: AlertsResource
  var customchannels: CustomchannelsResource
  var metadata: MetadataResource
  var preferreddeals: PreferreddealsResource
  var reports: ReportsResource
  var urlchannels: UrlchannelsResource
  /** Get information about the selected Ad Exchange account. */
  def get(request: AnonKey): Request_[Account]
  /** List all accounts available to this Ad Exchange account. */
  def list(request: AnonMaxResults): Request_[Accounts]
}

object AccountsResource {
  @scala.inline
  def apply(
    adclients: AdclientsResource,
    alerts: AlertsResource,
    customchannels: CustomchannelsResource,
    get: AnonKey => CallbackTo[Request_[Account]],
    list: AnonMaxResults => CallbackTo[Request_[Accounts]],
    metadata: MetadataResource,
    preferreddeals: PreferreddealsResource,
    reports: ReportsResource,
    urlchannels: UrlchannelsResource
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(adclients = adclients.asInstanceOf[js.Any], alerts = alerts.asInstanceOf[js.Any], customchannels = customchannels.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], preferreddeals = preferreddeals.asInstanceOf[js.Any], reports = reports.asInstanceOf[js.Any], urlchannels = urlchannels.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangeseller.AnonKey) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangeseller.AnonMaxResults) => list(t0).runNow()))
    __obj.asInstanceOf[AccountsResource]
  }
}

