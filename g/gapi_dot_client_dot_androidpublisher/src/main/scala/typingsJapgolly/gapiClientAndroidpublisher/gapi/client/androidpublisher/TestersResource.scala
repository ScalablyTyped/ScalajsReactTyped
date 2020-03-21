package typingsJapgolly.gapiClientAndroidpublisher.gapi.client.androidpublisher

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidpublisher.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestersResource extends js.Object {
  def get(request: AnonOauthtoken): Request_[Testers]
  def patch(request: AnonOauthtoken): Request_[Testers]
  def update(request: AnonOauthtoken): Request_[Testers]
}

object TestersResource {
  @scala.inline
  def apply(
    get: AnonOauthtoken => CallbackTo[Request_[Testers]],
    patch: AnonOauthtoken => CallbackTo[Request_[Testers]],
    update: AnonOauthtoken => CallbackTo[Request_[Testers]]
  ): TestersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonOauthtoken) => get(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonOauthtoken) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonOauthtoken) => update(t0).runNow()))
    __obj.asInstanceOf[TestersResource]
  }
}

