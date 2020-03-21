package typingsJapgolly.gapiClientPartners.gapi.client.partners

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPartners.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserStatesResource extends js.Object {
  /** Lists states for current user. */
  def list(request: AnonFields): Request_[ListUserStatesResponse]
}

object UserStatesResource {
  @scala.inline
  def apply(list: AnonFields => CallbackTo[Request_[ListUserStatesResponse]]): UserStatesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPartners.AnonFields) => list(t0).runNow()))
    __obj.asInstanceOf[UserStatesResource]
  }
}

