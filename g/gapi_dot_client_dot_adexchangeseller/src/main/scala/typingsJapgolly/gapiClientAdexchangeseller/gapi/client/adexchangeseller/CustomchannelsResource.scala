package typingsJapgolly.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexchangeseller.AnonAdClientId
import typingsJapgolly.gapiClientAdexchangeseller.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomchannelsResource extends js.Object {
  /** Get the specified custom channel from the specified ad client. */
  def get(request: AnonAdClientId): Request_[CustomChannel]
  /** List all custom channels in the specified ad client for this Ad Exchange account. */
  def list(request: AnonFields): Request_[CustomChannels]
}

object CustomchannelsResource {
  @scala.inline
  def apply(
    get: AnonAdClientId => CallbackTo[Request_[CustomChannel]],
    list: AnonFields => CallbackTo[Request_[CustomChannels]]
  ): CustomchannelsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangeseller.AnonAdClientId) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangeseller.AnonFields) => list(t0).runNow()))
    __obj.asInstanceOf[CustomchannelsResource]
  }
}

