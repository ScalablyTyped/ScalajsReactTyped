package typingsJapgolly.gapiClientGmail.gapi.client.gmail

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGmail.AnonAlt
import typingsJapgolly.gapiClientGmail.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FiltersResource extends js.Object {
  /** Creates a filter. */
  def create(request: AnonAlt): Request_[Filter]
  /** Deletes a filter. */
  def delete(request: AnonFields): Request_[Unit]
  /** Gets a filter. */
  def get(request: AnonFields): Request_[Filter]
  /** Lists the message filters of a Gmail user. */
  def list(request: AnonAlt): Request_[ListFiltersResponse]
}

object FiltersResource {
  @scala.inline
  def apply(
    create: AnonAlt => CallbackTo[Request_[Filter]],
    delete: AnonFields => CallbackTo[Request_[Unit]],
    get: AnonFields => CallbackTo[Request_[Filter]],
    list: AnonAlt => CallbackTo[Request_[ListFiltersResponse]]
  ): FiltersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonAlt) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonFields) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonAlt) => list(t0).runNow()))
    __obj.asInstanceOf[FiltersResource]
  }
}

