package typingsJapgolly.gapiClientAnalytics.gapi.client.analytics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAnalytics.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDataSourcesResource extends js.Object {
  /** List custom data sources to which the user has access. */
  def list(request: AnonPrettyPrint): Request_[CustomDataSources]
}

object CustomDataSourcesResource {
  @scala.inline
  def apply(list: AnonPrettyPrint => CallbackTo[Request_[CustomDataSources]]): CustomDataSourcesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonPrettyPrint) => list(t0).runNow()))
    __obj.asInstanceOf[CustomDataSourcesResource]
  }
}

