package typingsJapgolly.gapiClientAdsensehost.gapi.client.adsensehost

import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdsensehost.AnonAccountId
import typingsJapgolly.gapiClientAdsensehost.AnonAdClientId
import typingsJapgolly.gapiClientAdsensehost.AnonAlt
import typingsJapgolly.gapiClientAdsensehost.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdclientsResource extends js.Object {
  /** Get information about one of the ad clients in the specified publisher's AdSense account. */
  def get(request: AnonAccountId): Request_[AdClient] = js.native
  /** Get information about one of the ad clients in the Host AdSense account. */
  def get(request: AnonAdClientId): Request_[AdClient] = js.native
  /** List all hosted ad clients in the specified hosted account. */
  def list(request: AnonAlt): Request_[AdClients] = js.native
  /** List all host ad clients in this AdSense account. */
  def list(request: AnonFields): Request_[AdClients] = js.native
}

