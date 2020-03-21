package typingsJapgolly.gapiClientStorage.gapi.client.storage

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientStorage.AnonProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceAccountResource extends js.Object {
  /** Get the email address of this project's Google Cloud Storage service account. */
  def get(request: AnonProjectId): Request_[ServiceAccount]
}

object ServiceAccountResource {
  @scala.inline
  def apply(get: AnonProjectId => CallbackTo[Request_[ServiceAccount]]): ServiceAccountResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonProjectId) => get(t0).runNow()))
    __obj.asInstanceOf[ServiceAccountResource]
  }
}

