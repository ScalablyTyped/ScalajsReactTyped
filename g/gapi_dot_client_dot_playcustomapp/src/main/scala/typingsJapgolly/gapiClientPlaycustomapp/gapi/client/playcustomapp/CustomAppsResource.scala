package typingsJapgolly.gapiClientPlaycustomapp.gapi.client.playcustomapp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPlaycustomapp.AnonAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomAppsResource extends js.Object {
  /** Create and publish a new custom app. */
  def create(request: AnonAccount): Request_[CustomApp]
}

object CustomAppsResource {
  @scala.inline
  def apply(create: AnonAccount => CallbackTo[Request_[CustomApp]]): CustomAppsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlaycustomapp.AnonAccount) => create(t0).runNow()))
    __obj.asInstanceOf[CustomAppsResource]
  }
}

