package typingsJapgolly.gapiClientIam.gapi.client.iam

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientIam.AnonBearertoken
import typingsJapgolly.gapiClientIam.AnonKeyTypes
import typingsJapgolly.gapiClientIam.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeysResource extends js.Object {
  /**
    * Creates a ServiceAccountKey
    * and returns it.
    */
  def create(request: AnonBearertoken): Request_[ServiceAccountKey]
  /** Deletes a ServiceAccountKey. */
  def delete(request: AnonBearertoken): Request_[js.Object]
  /**
    * Gets the ServiceAccountKey
    * by key id.
    */
  def get(request: AnonName): Request_[ServiceAccountKey]
  /** Lists ServiceAccountKeys. */
  def list(request: AnonKeyTypes): Request_[ListServiceAccountKeysResponse]
}

object KeysResource {
  @scala.inline
  def apply(
    create: AnonBearertoken => CallbackTo[Request_[ServiceAccountKey]],
    delete: AnonBearertoken => CallbackTo[Request_[js.Object]],
    get: AnonName => CallbackTo[Request_[ServiceAccountKey]],
    list: AnonKeyTypes => CallbackTo[Request_[ListServiceAccountKeysResponse]]
  ): KeysResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIam.AnonBearertoken) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIam.AnonBearertoken) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIam.AnonName) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIam.AnonKeyTypes) => list(t0).runNow()))
    __obj.asInstanceOf[KeysResource]
  }
}

