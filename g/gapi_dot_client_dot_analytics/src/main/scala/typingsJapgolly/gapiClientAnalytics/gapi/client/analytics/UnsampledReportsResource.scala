package typingsJapgolly.gapiClientAnalytics.gapi.client.analytics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAnalytics.AnonProfileId
import typingsJapgolly.gapiClientAnalytics.AnonStartindex
import typingsJapgolly.gapiClientAnalytics.AnonUnsampledReportId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsampledReportsResource extends js.Object {
  /** Deletes an unsampled report. */
  def delete(request: AnonUnsampledReportId): Request_[Unit]
  /** Returns a single unsampled report. */
  def get(request: AnonUnsampledReportId): Request_[UnsampledReport]
  /** Create a new unsampled report. */
  def insert(request: AnonProfileId): Request_[UnsampledReport]
  /** Lists unsampled reports to which the user has access. */
  def list(request: AnonStartindex): Request_[UnsampledReports]
}

object UnsampledReportsResource {
  @scala.inline
  def apply(
    delete: AnonUnsampledReportId => CallbackTo[Request_[Unit]],
    get: AnonUnsampledReportId => CallbackTo[Request_[UnsampledReport]],
    insert: AnonProfileId => CallbackTo[Request_[UnsampledReport]],
    list: AnonStartindex => CallbackTo[Request_[UnsampledReports]]
  ): UnsampledReportsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonUnsampledReportId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonUnsampledReportId) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonProfileId) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonStartindex) => list(t0).runNow()))
    __obj.asInstanceOf[UnsampledReportsResource]
  }
}

