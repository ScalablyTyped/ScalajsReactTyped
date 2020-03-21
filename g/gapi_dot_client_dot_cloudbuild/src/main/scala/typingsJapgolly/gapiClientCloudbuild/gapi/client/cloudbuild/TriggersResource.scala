package typingsJapgolly.gapiClientCloudbuild.gapi.client.cloudbuild

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCloudbuild.AnonCallback
import typingsJapgolly.gapiClientCloudbuild.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggersResource extends js.Object {
  /**
    * Creates a new BuildTrigger.
    *
    * This API is experimental.
    */
  def create(request: AnonCallback): Request_[BuildTrigger]
  /**
    * Deletes an BuildTrigger by its project ID and trigger ID.
    *
    * This API is experimental.
    */
  def delete(request: AnonKey): Request_[js.Object]
  /**
    * Gets information about a BuildTrigger.
    *
    * This API is experimental.
    */
  def get(request: AnonKey): Request_[BuildTrigger]
  /**
    * Lists existing BuildTrigger.
    *
    * This API is experimental.
    */
  def list(request: AnonCallback): Request_[ListBuildTriggersResponse]
  /**
    * Updates an BuildTrigger by its project ID and trigger ID.
    *
    * This API is experimental.
    */
  def patch(request: AnonKey): Request_[BuildTrigger]
}

object TriggersResource {
  @scala.inline
  def apply(
    create: AnonCallback => CallbackTo[Request_[BuildTrigger]],
    delete: AnonKey => CallbackTo[Request_[js.Object]],
    get: AnonKey => CallbackTo[Request_[BuildTrigger]],
    list: AnonCallback => CallbackTo[Request_[ListBuildTriggersResponse]],
    patch: AnonKey => CallbackTo[Request_[BuildTrigger]]
  ): TriggersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudbuild.AnonCallback) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudbuild.AnonKey) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudbuild.AnonKey) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudbuild.AnonCallback) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudbuild.AnonKey) => patch(t0).runNow()))
    __obj.asInstanceOf[TriggersResource]
  }
}

