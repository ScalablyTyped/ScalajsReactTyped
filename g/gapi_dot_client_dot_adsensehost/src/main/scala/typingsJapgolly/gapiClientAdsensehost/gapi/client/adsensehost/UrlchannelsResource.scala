package typingsJapgolly.gapiClientAdsensehost.gapi.client.adsensehost

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdsensehost.AnonAdClientId
import typingsJapgolly.gapiClientAdsensehost.AnonMaxResults
import typingsJapgolly.gapiClientAdsensehost.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlchannelsResource extends js.Object {
  /** Delete a URL channel from the host AdSense account. */
  def delete(request: AnonQuotaUser): Request_[UrlChannel]
  /** Add a new URL channel to the host AdSense account. */
  def insert(request: AnonAdClientId): Request_[UrlChannel]
  /** List all host URL channels in the host AdSense account. */
  def list(request: AnonMaxResults): Request_[UrlChannels]
}

object UrlchannelsResource {
  @scala.inline
  def apply(
    delete: AnonQuotaUser => CallbackTo[Request_[UrlChannel]],
    insert: AnonAdClientId => CallbackTo[Request_[UrlChannel]],
    list: AnonMaxResults => CallbackTo[Request_[UrlChannels]]
  ): UrlchannelsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdsensehost.AnonQuotaUser) => delete(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdsensehost.AnonAdClientId) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdsensehost.AnonMaxResults) => list(t0).runNow()))
    __obj.asInstanceOf[UrlchannelsResource]
  }
}

