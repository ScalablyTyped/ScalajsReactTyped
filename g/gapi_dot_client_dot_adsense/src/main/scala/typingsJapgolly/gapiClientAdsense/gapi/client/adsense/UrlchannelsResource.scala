package typingsJapgolly.gapiClientAdsense.gapi.client.adsense

import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdsense.AnonFields
import typingsJapgolly.gapiClientAdsense.AnonMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlchannelsResource extends js.Object {
  /** List all URL channels in the specified ad client for the specified account. */
  def list(request: AnonFields): Request_[UrlChannels] = js.native
  /** List all URL channels in the specified ad client for this AdSense account. */
  def list(request: AnonMaxResults): Request_[UrlChannels] = js.native
}

