package typingsJapgolly.gapiClientAndroidpublisher.gapi.client.androidpublisher

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidpublisher.AnonEditId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailsResource extends js.Object {
  /** Fetches app details for this edit. This includes the default language and developer support contact information. */
  def get(request: AnonEditId): Request_[AppDetails]
  /** Updates app details for this edit. This method supports patch semantics. */
  def patch(request: AnonEditId): Request_[AppDetails]
  /** Updates app details for this edit. */
  def update(request: AnonEditId): Request_[AppDetails]
}

object DetailsResource {
  @scala.inline
  def apply(
    get: AnonEditId => CallbackTo[Request_[AppDetails]],
    patch: AnonEditId => CallbackTo[Request_[AppDetails]],
    update: AnonEditId => CallbackTo[Request_[AppDetails]]
  ): DetailsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonEditId) => get(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonEditId) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonEditId) => update(t0).runNow()))
    __obj.asInstanceOf[DetailsResource]
  }
}

