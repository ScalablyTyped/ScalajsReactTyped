package typingsJapgolly.gapiClientAdsensehost.gapi.client.adsensehost

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdsensehost.AnonAccountId
import typingsJapgolly.gapiClientAdsensehost.AnonAdUnitId
import typingsJapgolly.gapiClientAdsensehost.AnonHostCustomChannelId
import typingsJapgolly.gapiClientAdsensehost.AnonIncludeInactive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdunitsResource extends js.Object {
  /** Delete the specified ad unit from the specified publisher AdSense account. */
  def delete(request: AnonAdUnitId): Request_[AdUnit]
  /** Get the specified host ad unit in this AdSense account. */
  def get(request: AnonAdUnitId): Request_[AdUnit]
  /** Get ad code for the specified ad unit, attaching the specified host custom channels. */
  def getAdCode(request: AnonHostCustomChannelId): Request_[AdCode]
  /** Insert the supplied ad unit into the specified publisher AdSense account. */
  def insert(request: AnonAccountId): Request_[AdUnit]
  /** List all ad units in the specified publisher's AdSense account. */
  def list(request: AnonIncludeInactive): Request_[AdUnits]
  /** Update the supplied ad unit in the specified publisher AdSense account. This method supports patch semantics. */
  def patch(request: AnonAdUnitId): Request_[AdUnit]
  /** Update the supplied ad unit in the specified publisher AdSense account. */
  def update(request: AnonAccountId): Request_[AdUnit]
}

object AdunitsResource {
  @scala.inline
  def apply(
    delete: AnonAdUnitId => CallbackTo[Request_[AdUnit]],
    get: AnonAdUnitId => CallbackTo[Request_[AdUnit]],
    getAdCode: AnonHostCustomChannelId => CallbackTo[Request_[AdCode]],
    insert: AnonAccountId => CallbackTo[Request_[AdUnit]],
    list: AnonIncludeInactive => CallbackTo[Request_[AdUnits]],
    patch: AnonAdUnitId => CallbackTo[Request_[AdUnit]],
    update: AnonAccountId => CallbackTo[Request_[AdUnit]]
  ): AdunitsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdsensehost.AnonAdUnitId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdsensehost.AnonAdUnitId) => get(t0).runNow()))
    __obj.updateDynamic("getAdCode")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdsensehost.AnonHostCustomChannelId) => getAdCode(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdsensehost.AnonAccountId) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdsensehost.AnonIncludeInactive) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdsensehost.AnonAdUnitId) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdsensehost.AnonAccountId) => update(t0).runNow()))
    __obj.asInstanceOf[AdunitsResource]
  }
}

