package typingsJapgolly.gapiClientGamesmanagement.gapi.client.gamesmanagement

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGamesmanagement.AnonApplicationId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationsResource extends js.Object {
  /** Get the list of players hidden from the given application. This method is only available to user accounts for your developer console. */
  def listHidden(request: AnonApplicationId): Request_[HiddenPlayerList]
}

object ApplicationsResource {
  @scala.inline
  def apply(listHidden: AnonApplicationId => CallbackTo[Request_[HiddenPlayerList]]): ApplicationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("listHidden")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesmanagement.AnonApplicationId) => listHidden(t0).runNow()))
    __obj.asInstanceOf[ApplicationsResource]
  }
}

