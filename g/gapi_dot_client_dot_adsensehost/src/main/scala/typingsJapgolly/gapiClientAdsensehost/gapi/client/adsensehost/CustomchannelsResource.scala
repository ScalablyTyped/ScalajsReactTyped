package typingsJapgolly.gapiClientAdsensehost.gapi.client.adsensehost

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdsensehost.AnonAdClientId
import typingsJapgolly.gapiClientAdsensehost.AnonCustomChannelId
import typingsJapgolly.gapiClientAdsensehost.AnonMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomchannelsResource extends js.Object {
  /** Delete a specific custom channel from the host AdSense account. */
  def delete(request: AnonCustomChannelId): Request_[CustomChannel]
  /** Get a specific custom channel from the host AdSense account. */
  def get(request: AnonCustomChannelId): Request_[CustomChannel]
  /** Add a new custom channel to the host AdSense account. */
  def insert(request: AnonAdClientId): Request_[CustomChannel]
  /** List all host custom channels in this AdSense account. */
  def list(request: AnonMaxResults): Request_[CustomChannels]
  /** Update a custom channel in the host AdSense account. This method supports patch semantics. */
  def patch(request: AnonCustomChannelId): Request_[CustomChannel]
  /** Update a custom channel in the host AdSense account. */
  def update(request: AnonAdClientId): Request_[CustomChannel]
}

object CustomchannelsResource {
  @scala.inline
  def apply(
    delete: AnonCustomChannelId => CallbackTo[Request_[CustomChannel]],
    get: AnonCustomChannelId => CallbackTo[Request_[CustomChannel]],
    insert: AnonAdClientId => CallbackTo[Request_[CustomChannel]],
    list: AnonMaxResults => CallbackTo[Request_[CustomChannels]],
    patch: AnonCustomChannelId => CallbackTo[Request_[CustomChannel]],
    update: AnonAdClientId => CallbackTo[Request_[CustomChannel]]
  ): CustomchannelsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdsensehost.AnonCustomChannelId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdsensehost.AnonCustomChannelId) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdsensehost.AnonAdClientId) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdsensehost.AnonMaxResults) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdsensehost.AnonCustomChannelId) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdsensehost.AnonAdClientId) => update(t0).runNow()))
    __obj.asInstanceOf[CustomchannelsResource]
  }
}

