package typingsJapgolly.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexchangeseller.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlchannelsResource extends js.Object {
  /** List all URL channels in the specified ad client for this Ad Exchange account. */
  def list(request: AnonFields): Request_[UrlChannels]
}

object UrlchannelsResource {
  @scala.inline
  def apply(list: AnonFields => CallbackTo[Request_[UrlChannels]]): UrlchannelsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangeseller.AnonFields) => list(t0).runNow()))
    __obj.asInstanceOf[UrlchannelsResource]
  }
}

