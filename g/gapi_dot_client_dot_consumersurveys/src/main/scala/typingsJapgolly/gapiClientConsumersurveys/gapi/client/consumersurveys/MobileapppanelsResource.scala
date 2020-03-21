package typingsJapgolly.gapiClientConsumersurveys.gapi.client.consumersurveys

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientConsumersurveys.AnonAlt
import typingsJapgolly.gapiClientConsumersurveys.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileapppanelsResource extends js.Object {
  /** Retrieves a MobileAppPanel that is available to the authenticated user. */
  def get(request: AnonAlt): Request_[MobileAppPanel]
  /** Lists the MobileAppPanels available to the authenticated user. */
  def list(request: AnonFields): Request_[MobileAppPanelsListResponse]
  /** Updates a MobileAppPanel. Currently the only property that can be updated is the owners property. */
  def update(request: AnonAlt): Request_[MobileAppPanel]
}

object MobileapppanelsResource {
  @scala.inline
  def apply(
    get: AnonAlt => CallbackTo[Request_[MobileAppPanel]],
    list: AnonFields => CallbackTo[Request_[MobileAppPanelsListResponse]],
    update: AnonAlt => CallbackTo[Request_[MobileAppPanel]]
  ): MobileapppanelsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientConsumersurveys.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientConsumersurveys.AnonFields) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientConsumersurveys.AnonAlt) => update(t0).runNow()))
    __obj.asInstanceOf[MobileapppanelsResource]
  }
}

