package typingsJapgolly.gapiClientAdmin.gapi.client.admin

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdmin.AnonActorIpAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitiesResource extends js.Object {
  /** Retrieves a list of activities for a specific customer and application. */
  def list(request: AnonActorIpAddress): Request_[Activities]
  /** Push changes to activities */
  def watch(request: AnonActorIpAddress): Request_[Channel]
}

object ActivitiesResource {
  @scala.inline
  def apply(
    list: AnonActorIpAddress => CallbackTo[Request_[Activities]],
    watch: AnonActorIpAddress => CallbackTo[Request_[Channel]]
  ): ActivitiesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdmin.AnonActorIpAddress) => list(t0).runNow()))
    __obj.updateDynamic("watch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdmin.AnonActorIpAddress) => watch(t0).runNow()))
    __obj.asInstanceOf[ActivitiesResource]
  }
}

