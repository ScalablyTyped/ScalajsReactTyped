package typingsJapgolly.gapiClientYoutubereporting.gapi.client.youtubereporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientYoutubereporting.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportTypesResource extends js.Object {
  /** Lists report types. */
  def list(request: AnonFields): Request_[ListReportTypesResponse]
}

object ReportTypesResource {
  @scala.inline
  def apply(list: AnonFields => CallbackTo[Request_[ListReportTypesResponse]]): ReportTypesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutubereporting.AnonFields) => list(t0).runNow()))
    __obj.asInstanceOf[ReportTypesResource]
  }
}

