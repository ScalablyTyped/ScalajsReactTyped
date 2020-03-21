package typingsJapgolly.gapiClientYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientYoutube.AnonUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoAbuseReportReasonsResource extends js.Object {
  /** Returns a list of abuse reasons that can be used for reporting abusive videos. */
  def list(request: AnonUserIp): Request_[VideoAbuseReportReasonListResponse]
}

object VideoAbuseReportReasonsResource {
  @scala.inline
  def apply(list: AnonUserIp => CallbackTo[Request_[VideoAbuseReportReasonListResponse]]): VideoAbuseReportReasonsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonUserIp) => list(t0).runNow()))
    __obj.asInstanceOf[VideoAbuseReportReasonsResource]
  }
}

