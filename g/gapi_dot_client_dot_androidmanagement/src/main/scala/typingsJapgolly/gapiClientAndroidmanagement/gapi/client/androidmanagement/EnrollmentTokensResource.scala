package typingsJapgolly.gapiClientAndroidmanagement.gapi.client.androidmanagement

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidmanagement.AnonAlt
import typingsJapgolly.gapiClientAndroidmanagement.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnrollmentTokensResource extends js.Object {
  /** Creates an enrollment token for a given enterprise. */
  def create(request: AnonKey): Request_[EnrollmentToken]
  /** Deletes an enrollment token, which prevents future use of the token. */
  def delete(request: AnonAlt): Request_[js.Object]
}

object EnrollmentTokensResource {
  @scala.inline
  def apply(
    create: AnonKey => CallbackTo[Request_[EnrollmentToken]],
    delete: AnonAlt => CallbackTo[Request_[js.Object]]
  ): EnrollmentTokensResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidmanagement.AnonKey) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidmanagement.AnonAlt) => delete(t0).runNow()))
    __obj.asInstanceOf[EnrollmentTokensResource]
  }
}

