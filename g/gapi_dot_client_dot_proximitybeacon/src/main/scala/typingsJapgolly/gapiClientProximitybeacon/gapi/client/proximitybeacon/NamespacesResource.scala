package typingsJapgolly.gapiClientProximitybeacon.gapi.client.proximitybeacon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientProximitybeacon.AnonCallback
import typingsJapgolly.gapiClientProximitybeacon.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamespacesResource extends js.Object {
  /**
    * Lists all attachment namespaces owned by your Google Developers Console
    * project. Attachment data associated with a beacon must include a
    * namespaced type, and the namespace must be owned by your project.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;viewer&#42;&#42;, &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42;
    * permissions in the Google Developers Console project.
    */
  def list(request: AnonCallback): Request_[ListNamespacesResponse]
  /**
    * Updates the information about the specified namespace. Only the namespace
    * visibility can be updated.
    */
  def update(request: AnonFields): Request_[Namespace]
}

object NamespacesResource {
  @scala.inline
  def apply(
    list: AnonCallback => CallbackTo[Request_[ListNamespacesResponse]],
    update: AnonFields => CallbackTo[Request_[Namespace]]
  ): NamespacesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientProximitybeacon.AnonCallback) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientProximitybeacon.AnonFields) => update(t0).runNow()))
    __obj.asInstanceOf[NamespacesResource]
  }
}

