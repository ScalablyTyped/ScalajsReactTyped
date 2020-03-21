package typingsJapgolly.gapiClientYoutubereporting.gapi.client.youtubereporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientYoutubereporting.AnonAccesstoken
import typingsJapgolly.gapiClientYoutubereporting.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  /** Gets the metadata of a specific report. */
  def get(request: AnonAccesstoken): Request_[Report]
  /**
    * Lists reports created by a specific job.
    * Returns NOT_FOUND if the job does not exist.
    */
  def list(request: AnonAlt): Request_[ListReportsResponse]
}

object ReportsResource {
  @scala.inline
  def apply(
    get: AnonAccesstoken => CallbackTo[Request_[Report]],
    list: AnonAlt => CallbackTo[Request_[ListReportsResponse]]
  ): ReportsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutubereporting.AnonAccesstoken) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutubereporting.AnonAlt) => list(t0).runNow()))
    __obj.asInstanceOf[ReportsResource]
  }
}

