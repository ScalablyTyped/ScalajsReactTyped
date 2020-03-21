package typingsJapgolly.gapiClientAnalytics.gapi.client.analytics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAnalytics.AnonAccountIdAlt
import typingsJapgolly.gapiClientAnalytics.AnonCustomDataSourceId
import typingsJapgolly.gapiClientAnalytics.AnonUploadId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadsResource extends js.Object {
  /** Delete data associated with a previous upload. */
  def deleteUploadData(request: AnonCustomDataSourceId): Request_[Unit]
  /** List uploads to which the user has access. */
  def get(request: AnonUploadId): Request_[Upload]
  /** List uploads to which the user has access. */
  def list(request: AnonAccountIdAlt): Request_[Uploads]
  /** Upload data for a custom data source. */
  def uploadData(request: AnonCustomDataSourceId): Request_[Upload]
}

object UploadsResource {
  @scala.inline
  def apply(
    deleteUploadData: AnonCustomDataSourceId => CallbackTo[Request_[Unit]],
    get: AnonUploadId => CallbackTo[Request_[Upload]],
    list: AnonAccountIdAlt => CallbackTo[Request_[Uploads]],
    uploadData: AnonCustomDataSourceId => CallbackTo[Request_[Upload]]
  ): UploadsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deleteUploadData")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonCustomDataSourceId) => deleteUploadData(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonUploadId) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonAccountIdAlt) => list(t0).runNow()))
    __obj.updateDynamic("uploadData")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonCustomDataSourceId) => uploadData(t0).runNow()))
    __obj.asInstanceOf[UploadsResource]
  }
}

