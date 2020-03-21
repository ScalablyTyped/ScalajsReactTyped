package typingsJapgolly.gapiClientReseller.gapi.client.reseller

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientReseller.AnonAlt
import typingsJapgolly.gapiClientReseller.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResellernotifyResource extends js.Object {
  /** Topic name of the PubSub */
  var topicName: js.UndefOr[String] = js.undefined
  /** Returns all the details of the watch corresponding to the reseller. */
  def getwatchdetails(request: AnonAlt): Request_[ResellernotifyGetwatchdetailsResponse]
  /** Registers a Reseller for receiving notifications. */
  def register(request: AnonFields): Request_[ResellernotifyResource]
  /** Unregisters a Reseller for receiving notifications. */
  def unregister(request: AnonFields): Request_[ResellernotifyResource]
}

object ResellernotifyResource {
  @scala.inline
  def apply(
    getwatchdetails: AnonAlt => CallbackTo[Request_[ResellernotifyGetwatchdetailsResponse]],
    register: AnonFields => CallbackTo[Request_[ResellernotifyResource]],
    unregister: AnonFields => CallbackTo[Request_[ResellernotifyResource]],
    topicName: String = null
  ): ResellernotifyResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getwatchdetails")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientReseller.AnonAlt) => getwatchdetails(t0).runNow()))
    __obj.updateDynamic("register")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientReseller.AnonFields) => register(t0).runNow()))
    __obj.updateDynamic("unregister")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientReseller.AnonFields) => unregister(t0).runNow()))
    if (topicName != null) __obj.updateDynamic("topicName")(topicName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResellernotifyResource]
  }
}

