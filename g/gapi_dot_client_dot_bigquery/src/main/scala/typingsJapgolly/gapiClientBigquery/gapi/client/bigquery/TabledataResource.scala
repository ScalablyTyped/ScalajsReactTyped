package typingsJapgolly.gapiClientBigquery.gapi.client.bigquery

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBigquery.AnonOauthtoken
import typingsJapgolly.gapiClientBigquery.AnonPageToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabledataResource extends js.Object {
  /** Streams data into BigQuery one record at a time without needing to run a load job. Requires the WRITER dataset role. */
  def insertAll(request: AnonOauthtoken): Request_[TableDataInsertAllResponse]
  /** Retrieves table data from a specified set of rows. Requires the READER dataset role. */
  def list(request: AnonPageToken): Request_[TableDataList]
}

object TabledataResource {
  @scala.inline
  def apply(
    insertAll: AnonOauthtoken => CallbackTo[Request_[TableDataInsertAllResponse]],
    list: AnonPageToken => CallbackTo[Request_[TableDataList]]
  ): TabledataResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("insertAll")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquery.AnonOauthtoken) => insertAll(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquery.AnonPageToken) => list(t0).runNow()))
    __obj.asInstanceOf[TabledataResource]
  }
}

