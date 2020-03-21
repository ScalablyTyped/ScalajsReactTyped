package typingsJapgolly.gapiClientGames.gapi.client.games

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGames.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushtokensResource extends js.Object {
  /** Removes a push token for the current user and application. Removing a non-existent push token will report success. */
  def remove(request: AnonOauthtoken): Request_[Unit]
  /** Registers a push token for the current user and application. */
  def update(request: AnonOauthtoken): Request_[Unit]
}

object PushtokensResource {
  @scala.inline
  def apply(
    remove: AnonOauthtoken => CallbackTo[Request_[Unit]],
    update: AnonOauthtoken => CallbackTo[Request_[Unit]]
  ): PushtokensResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonOauthtoken) => remove(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonOauthtoken) => update(t0).runNow()))
    __obj.asInstanceOf[PushtokensResource]
  }
}

