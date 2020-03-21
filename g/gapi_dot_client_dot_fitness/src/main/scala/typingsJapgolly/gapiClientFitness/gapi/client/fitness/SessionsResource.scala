package typingsJapgolly.gapiClientFitness.gapi.client.fitness

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientFitness.AnonEndTime
import typingsJapgolly.gapiClientFitness.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionsResource extends js.Object {
  /** Deletes a session specified by the given session ID. */
  def delete(request: AnonOauthtoken): Request_[Unit]
  /** Lists sessions previously created. */
  def list(request: AnonEndTime): Request_[ListSessionsResponse]
  /** Updates or insert a given session. */
  def update(request: AnonOauthtoken): Request_[Session]
}

object SessionsResource {
  @scala.inline
  def apply(
    delete: AnonOauthtoken => CallbackTo[Request_[Unit]],
    list: AnonEndTime => CallbackTo[Request_[ListSessionsResponse]],
    update: AnonOauthtoken => CallbackTo[Request_[Session]]
  ): SessionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFitness.AnonOauthtoken) => delete(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFitness.AnonEndTime) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFitness.AnonOauthtoken) => update(t0).runNow()))
    __obj.asInstanceOf[SessionsResource]
  }
}

