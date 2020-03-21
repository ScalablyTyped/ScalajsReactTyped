package typingsJapgolly.gapiClientAdsense.gapi.client.adsense

import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdsense.AnonAlertId
import typingsJapgolly.gapiClientAdsense.AnonAlertIdAlt
import typingsJapgolly.gapiClientAdsense.AnonAltFields
import typingsJapgolly.gapiClientAdsense.AnonLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertsResource extends js.Object {
  /** Dismiss (delete) the specified alert from the specified publisher AdSense account. */
  def delete(request: AnonAlertId): Request_[Unit] = js.native
  /** Dismiss (delete) the specified alert from the publisher's AdSense account. */
  def delete(request: AnonAlertIdAlt): Request_[Unit] = js.native
  /** List the alerts for this AdSense account. */
  def list(request: AnonAltFields): Request_[Alerts] = js.native
  /** List the alerts for the specified AdSense account. */
  def list(request: AnonLocale): Request_[Alerts] = js.native
}

