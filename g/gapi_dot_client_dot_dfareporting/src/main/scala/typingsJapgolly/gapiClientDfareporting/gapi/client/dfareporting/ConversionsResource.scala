package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionsResource extends js.Object {
  /** Inserts conversions. */
  def batchinsert(request: AnonKey): Request_[ConversionsBatchInsertResponse]
  /** Updates existing conversions. */
  def batchupdate(request: AnonKey): Request_[ConversionsBatchUpdateResponse]
}

object ConversionsResource {
  @scala.inline
  def apply(
    batchinsert: AnonKey => CallbackTo[Request_[ConversionsBatchInsertResponse]],
    batchupdate: AnonKey => CallbackTo[Request_[ConversionsBatchUpdateResponse]]
  ): ConversionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("batchinsert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => batchinsert(t0).runNow()))
    __obj.updateDynamic("batchupdate")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => batchupdate(t0).runNow()))
    __obj.asInstanceOf[ConversionsResource]
  }
}

