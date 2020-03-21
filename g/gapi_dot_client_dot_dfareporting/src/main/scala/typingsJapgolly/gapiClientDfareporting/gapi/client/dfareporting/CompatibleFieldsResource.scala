package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompatibleFieldsResource extends js.Object {
  /**
    * Returns the fields that are compatible to be selected in the respective sections of a report criteria, given the fields already selected in the input
    * report and user permissions.
    */
  def query(request: AnonKey): Request_[CompatibleFields]
}

object CompatibleFieldsResource {
  @scala.inline
  def apply(query: AnonKey => CallbackTo[Request_[CompatibleFields]]): CompatibleFieldsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("query")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => query(t0).runNow()))
    __obj.asInstanceOf[CompatibleFieldsResource]
  }
}

