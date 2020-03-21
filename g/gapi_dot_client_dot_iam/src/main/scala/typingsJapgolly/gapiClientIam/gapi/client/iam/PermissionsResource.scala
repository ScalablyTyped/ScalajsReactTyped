package typingsJapgolly.gapiClientIam.gapi.client.iam

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientIam.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionsResource extends js.Object {
  /**
    * Lists the permissions testable on a resource.
    * A permission is testable if it can be tested for an identity on a resource.
    */
  def queryTestablePermissions(request: AnonOauthtoken): Request_[QueryTestablePermissionsResponse]
}

object PermissionsResource {
  @scala.inline
  def apply(queryTestablePermissions: AnonOauthtoken => CallbackTo[Request_[QueryTestablePermissionsResponse]]): PermissionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("queryTestablePermissions")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIam.AnonOauthtoken) => queryTestablePermissions(t0).runNow()))
    __obj.asInstanceOf[PermissionsResource]
  }
}

