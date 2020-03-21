package typingsJapgolly.gapiClientAndroidpublisher.gapi.client.androidpublisher

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidpublisher.AnonFields
import typingsJapgolly.gapiClientAndroidpublisher.AnonImageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagesResource extends js.Object {
  /** Deletes the image (specified by id) from the edit. */
  def delete(request: AnonFields): Request_[Unit]
  /** Deletes all images for the specified language and image type. */
  def deleteall(request: AnonImageType): Request_[ImagesDeleteAllResponse]
  /** Lists all images for the specified language and image type. */
  def list(request: AnonImageType): Request_[ImagesListResponse]
  /** Uploads a new image and adds it to the list of images for the specified language and image type. */
  def upload(request: AnonImageType): Request_[ImagesUploadResponse]
}

object ImagesResource {
  @scala.inline
  def apply(
    delete: AnonFields => CallbackTo[Request_[Unit]],
    deleteall: AnonImageType => CallbackTo[Request_[ImagesDeleteAllResponse]],
    list: AnonImageType => CallbackTo[Request_[ImagesListResponse]],
    upload: AnonImageType => CallbackTo[Request_[ImagesUploadResponse]]
  ): ImagesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonFields) => delete(t0).runNow()))
    __obj.updateDynamic("deleteall")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonImageType) => deleteall(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonImageType) => list(t0).runNow()))
    __obj.updateDynamic("upload")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonImageType) => upload(t0).runNow()))
    __obj.asInstanceOf[ImagesResource]
  }
}

