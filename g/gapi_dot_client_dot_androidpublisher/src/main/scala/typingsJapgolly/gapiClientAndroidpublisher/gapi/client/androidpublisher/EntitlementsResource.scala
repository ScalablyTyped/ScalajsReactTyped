package typingsJapgolly.gapiClientAndroidpublisher.gapi.client.androidpublisher

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidpublisher.AnonMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntitlementsResource extends js.Object {
  /** Lists the user's current inapp item or subscription entitlements */
  def list(request: AnonMaxResults): Request_[EntitlementsListResponse]
}

object EntitlementsResource {
  @scala.inline
  def apply(list: AnonMaxResults => CallbackTo[Request_[EntitlementsListResponse]]): EntitlementsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonMaxResults) => list(t0).runNow()))
    __obj.asInstanceOf[EntitlementsResource]
  }
}

