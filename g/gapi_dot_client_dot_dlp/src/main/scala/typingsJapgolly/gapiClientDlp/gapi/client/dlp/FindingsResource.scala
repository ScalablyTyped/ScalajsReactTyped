package typingsJapgolly.gapiClientDlp.gapi.client.dlp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDlp.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindingsResource extends js.Object {
  /** Returns list of results for given inspect operation result set id. */
  def list(request: AnonBearertoken): Request_[GooglePrivacyDlpV2beta1ListInspectFindingsResponse]
}

object FindingsResource {
  @scala.inline
  def apply(list: AnonBearertoken => CallbackTo[Request_[GooglePrivacyDlpV2beta1ListInspectFindingsResponse]]): FindingsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDlp.AnonBearertoken) => list(t0).runNow()))
    __obj.asInstanceOf[FindingsResource]
  }
}

