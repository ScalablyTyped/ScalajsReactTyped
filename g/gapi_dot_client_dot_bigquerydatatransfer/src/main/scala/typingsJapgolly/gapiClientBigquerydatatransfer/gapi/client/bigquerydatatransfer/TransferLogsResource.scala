package typingsJapgolly.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBigquerydatatransfer.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferLogsResource extends js.Object {
  /** Returns user facing log messages for the data transfer run. */
  def list(request: AnonBearertoken): Request_[ListTransferLogsResponse]
}

object TransferLogsResource {
  @scala.inline
  def apply(list: AnonBearertoken => CallbackTo[Request_[ListTransferLogsResponse]]): TransferLogsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquerydatatransfer.AnonBearertoken) => list(t0).runNow()))
    __obj.asInstanceOf[TransferLogsResource]
  }
}

