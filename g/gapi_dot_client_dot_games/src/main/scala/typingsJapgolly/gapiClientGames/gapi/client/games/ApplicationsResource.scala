package typingsJapgolly.gapiClientGames.gapi.client.games

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGames.AnonApplicationId
import typingsJapgolly.gapiClientGames.AnonOauthtoken
import typingsJapgolly.gapiClientGames.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationsResource extends js.Object {
  /**
    * Retrieves the metadata of the application with the given ID. If the requested application is not available for the specified platformType, the returned
    * response will not include any instance data.
    */
  def get(request: AnonApplicationId): Request_[Application]
  /** Indicate that the the currently authenticated user is playing your application. */
  def played(request: AnonOauthtoken): Request_[Unit]
  /** Verifies the auth token provided with this request is for the application with the specified ID, and returns the ID of the player it was granted for. */
  def verify(request: AnonPrettyPrint): Request_[ApplicationVerifyResponse]
}

object ApplicationsResource {
  @scala.inline
  def apply(
    get: AnonApplicationId => CallbackTo[Request_[Application]],
    played: AnonOauthtoken => CallbackTo[Request_[Unit]],
    verify: AnonPrettyPrint => CallbackTo[Request_[ApplicationVerifyResponse]]
  ): ApplicationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonApplicationId) => get(t0).runNow()))
    __obj.updateDynamic("played")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonOauthtoken) => played(t0).runNow()))
    __obj.updateDynamic("verify")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonPrettyPrint) => verify(t0).runNow()))
    __obj.asInstanceOf[ApplicationsResource]
  }
}

