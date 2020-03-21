package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionValuesResource extends js.Object {
  /** Retrieves list of report dimension values for a list of filters. */
  def query(request: AnonUserIp): Request_[DimensionValueList]
}

object DimensionValuesResource {
  @scala.inline
  def apply(query: AnonUserIp => CallbackTo[Request_[DimensionValueList]]): DimensionValuesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("query")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonUserIp) => query(t0).runNow()))
    __obj.asInstanceOf[DimensionValuesResource]
  }
}

