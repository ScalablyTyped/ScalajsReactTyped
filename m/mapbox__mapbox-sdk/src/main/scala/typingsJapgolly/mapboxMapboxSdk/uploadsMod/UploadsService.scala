package typingsJapgolly.mapboxMapboxSdk.uploadsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mapboxMapboxSdk.AnonMapId
import typingsJapgolly.mapboxMapboxSdk.AnonReverse
import typingsJapgolly.mapboxMapboxSdk.AnonUploadId
import typingsJapgolly.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadsService extends js.Object {
  /**
    * Create an upload.
    * @param config
    */
  def createUpload(config: AnonMapId): MapiRequest
  /**
    * Create S3 credentials.
    */
  def createUploadCredentials(): MapiRequest
  /**
    * Delete an upload.
    * @param config
    */
  // implicit any
  def deleteUpload(config: AnonUploadId): js.Any
  /**
    * Get an upload's status.
    * @param config
    */
  // implicit any
  def getUpload(config: AnonUploadId): js.Any
  /**
    * List the statuses of all recent uploads.
    * @param config
    */
  def listUploads(config: AnonReverse): MapiRequest
}

object UploadsService {
  @scala.inline
  def apply(
    createUpload: AnonMapId => CallbackTo[MapiRequest],
    createUploadCredentials: CallbackTo[MapiRequest],
    deleteUpload: AnonUploadId => CallbackTo[js.Any],
    getUpload: AnonUploadId => CallbackTo[js.Any],
    listUploads: AnonReverse => CallbackTo[MapiRequest]
  ): UploadsService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createUpload")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.AnonMapId) => createUpload(t0).runNow()))
    __obj.updateDynamic("createUploadCredentials")(createUploadCredentials.toJsFn)
    __obj.updateDynamic("deleteUpload")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.AnonUploadId) => deleteUpload(t0).runNow()))
    __obj.updateDynamic("getUpload")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.AnonUploadId) => getUpload(t0).runNow()))
    __obj.updateDynamic("listUploads")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.AnonReverse) => listUploads(t0).runNow()))
    __obj.asInstanceOf[UploadsService]
  }
}

