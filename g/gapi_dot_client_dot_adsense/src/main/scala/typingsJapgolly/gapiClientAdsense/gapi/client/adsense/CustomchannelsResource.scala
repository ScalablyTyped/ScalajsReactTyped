package typingsJapgolly.gapiClientAdsense.gapi.client.adsense

import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdsense.AnonAdClientId
import typingsJapgolly.gapiClientAdsense.AnonAdUnitId
import typingsJapgolly.gapiClientAdsense.AnonCustomChannelId
import typingsJapgolly.gapiClientAdsense.AnonFields
import typingsJapgolly.gapiClientAdsense.AnonKey
import typingsJapgolly.gapiClientAdsense.AnonMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomchannelsResource extends js.Object {
  var adunits: AdunitsResource = js.native
  /** Get the specified custom channel from the specified ad client for the specified account. */
  def get(request: AnonCustomChannelId): Request_[CustomChannel] = js.native
  /** Get the specified custom channel from the specified ad client. */
  def get(request: AnonKey): Request_[CustomChannel] = js.native
  /** List all custom channels which the specified ad unit belongs to. */
  def list(request: AnonAdClientId): Request_[CustomChannels] = js.native
  /** List all custom channels which the specified ad unit belongs to. */
  def list(request: AnonAdUnitId): Request_[CustomChannels] = js.native
  /** List all custom channels in the specified ad client for the specified account. */
  def list(request: AnonFields): Request_[CustomChannels] = js.native
  /** List all custom channels in the specified ad client for this AdSense account. */
  def list(request: AnonMaxResults): Request_[CustomChannels] = js.native
}

