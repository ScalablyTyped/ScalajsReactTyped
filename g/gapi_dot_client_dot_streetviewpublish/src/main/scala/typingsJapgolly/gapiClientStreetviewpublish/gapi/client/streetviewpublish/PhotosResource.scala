package typingsJapgolly.gapiClientStreetviewpublish.gapi.client.streetviewpublish

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientStreetviewpublish.AnonAccesstoken
import typingsJapgolly.gapiClientStreetviewpublish.AnonFields
import typingsJapgolly.gapiClientStreetviewpublish.AnonFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhotosResource extends js.Object {
  /**
    * Deletes a list of Photos and their
    * metadata.
    *
    * Note that if
    * BatchDeletePhotos
    * fails, either critical fields are missing or there was an authentication
    * error. Even if
    * BatchDeletePhotos
    * succeeds, there may have been failures for single photos in the batch.
    * These failures will be specified in each
    * PhotoResponse.status
    * in
    * BatchDeletePhotosResponse.results.
    * See
    * DeletePhoto
    * for specific failures that can occur per photo.
    */
  def batchDelete(request: AnonAccesstoken): Request_[BatchDeletePhotosResponse]
  /**
    * Gets the metadata of the specified
    * Photo batch.
    *
    * Note that if
    * BatchGetPhotos
    * fails, either critical fields are missing or there was an authentication
    * error. Even if
    * BatchGetPhotos
    * succeeds, there may have been failures for single photos in the batch.
    * These failures will be specified in each
    * PhotoResponse.status
    * in
    * BatchGetPhotosResponse.results.
    * See
    * GetPhoto
    * for specific failures that can occur per photo.
    */
  def batchGet(request: AnonFields): Request_[BatchGetPhotosResponse]
  /**
    * Updates the metadata of Photos, such
    * as pose, place association, connections, etc. Changing the pixels of photos
    * is not supported.
    *
    * Note that if
    * BatchUpdatePhotos
    * fails, either critical fields are missing or there was an authentication
    * error. Even if
    * BatchUpdatePhotos
    * succeeds, there may have been failures for single photos in the batch.
    * These failures will be specified in each
    * PhotoResponse.status
    * in
    * BatchUpdatePhotosResponse.results.
    * See
    * UpdatePhoto
    * for specific failures that can occur per photo.
    *
    * Only the fields specified in
    * updateMask
    * field are used. If `updateMask` is not present, the update applies to all
    * fields.
    *
    * <aside class="note"><b>Note:</b> To update
    * Pose.altitude,
    * Pose.latLngPair has to be
    * filled as well. Otherwise, the request will fail.</aside>
    */
  def batchUpdate(request: AnonAccesstoken): Request_[BatchUpdatePhotosResponse]
  /**
    * Lists all the Photos that belong to
    * the user.
    */
  def list(request: AnonFilter): Request_[ListPhotosResponse]
}

object PhotosResource {
  @scala.inline
  def apply(
    batchDelete: AnonAccesstoken => CallbackTo[Request_[BatchDeletePhotosResponse]],
    batchGet: AnonFields => CallbackTo[Request_[BatchGetPhotosResponse]],
    batchUpdate: AnonAccesstoken => CallbackTo[Request_[BatchUpdatePhotosResponse]],
    list: AnonFilter => CallbackTo[Request_[ListPhotosResponse]]
  ): PhotosResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("batchDelete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStreetviewpublish.AnonAccesstoken) => batchDelete(t0).runNow()))
    __obj.updateDynamic("batchGet")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStreetviewpublish.AnonFields) => batchGet(t0).runNow()))
    __obj.updateDynamic("batchUpdate")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStreetviewpublish.AnonAccesstoken) => batchUpdate(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStreetviewpublish.AnonFilter) => list(t0).runNow()))
    __obj.asInstanceOf[PhotosResource]
  }
}

