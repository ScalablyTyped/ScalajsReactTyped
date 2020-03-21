package typingsJapgolly.gapiClientDoubleclicksearch.gapi.client.doubleclicksearch

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDoubleclicksearch.AnonAlt
import typingsJapgolly.gapiClientDoubleclicksearch.AnonFields
import typingsJapgolly.gapiClientDoubleclicksearch.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  /** Generates and returns a report immediately. */
  def generate(request: AnonAlt): Request_[Report]
  /** Polls for the status of a report request. */
  def get(request: AnonFields): Request_[Report]
  /** Downloads a report file encoded in UTF-8. */
  def getFile(request: AnonKey): Request_[Unit]
  /** Inserts a report request into the reporting system. */
  def request(request: AnonAlt): Request_[Report]
}

object ReportsResource {
  @scala.inline
  def apply(
    generate: AnonAlt => CallbackTo[Request_[Report]],
    get: AnonFields => CallbackTo[Request_[Report]],
    getFile: AnonKey => CallbackTo[Request_[Unit]],
    request: AnonAlt => CallbackTo[Request_[Report]]
  ): ReportsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("generate")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDoubleclicksearch.AnonAlt) => generate(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDoubleclicksearch.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("getFile")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDoubleclicksearch.AnonKey) => getFile(t0).runNow()))
    __obj.updateDynamic("request")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDoubleclicksearch.AnonAlt) => request(t0).runNow()))
    __obj.asInstanceOf[ReportsResource]
  }
}

