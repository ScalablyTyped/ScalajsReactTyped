package typingsJapgolly.gapiClientPhotoslibrary.gapi.client.photoslibrary

import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPhotoslibrary.AnonKey
import typingsJapgolly.gapiClientPhotoslibrary.AnonMediaItemId
import typingsJapgolly.gapiClientPhotoslibrary.AnonMediaItemIds
import typingsJapgolly.gapiClientPhotoslibrary.AnonPageSize
import typingsJapgolly.gapiClientPhotoslibrary.AnonQuotaUser
import typingsJapgolly.gapiClientPhotoslibrary.AnonResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaItemsResource extends js.Object {
  def batchCreate(request: AnonKey, body: BatchCreateMediaItemsRequest): Request_[BatchCreateMediaItemsResponse] = js.native
  /**
    * Creates one or more media items in a user's Google Photos library.
    *
    * This is the second step for creating a media item. For details regarding
    * Step 1, uploading the raw bytes to a Google Server, see
    * <a href="/photos/library/guides/upload-media">Uploading media</a>.
    *
    * This call adds the media item to the library. If an album `id` is
    * specified, the call adds the media item to the album too. Each album can
    * contain up to 20,000 media items. By default, the media item will be added
    * to the end of the library or album.
    *
    * If an album `id` and position are both defined, the media item is
    * added to the album at the specified position.
    *
    * If the call contains multiple media items, they're added at the specified
    * position.
    * If you are creating a media item in a shared album where you are not the
    * owner, you are not allowed to position the media item. Doing so will result
    * in a `BAD REQUEST` error.
    */
  def batchCreate(request: AnonQuotaUser): Request_[BatchCreateMediaItemsResponse] = js.native
  /**
    * Returns the list of media items for the specified media item identifiers.
    * Items are returned in the same order as the supplied identifiers.
    */
  def batchGet(request: AnonMediaItemIds): Request_[BatchGetMediaItemsResponse] = js.native
  /** Returns the media item for the specified media item identifier. */
  def get(request: AnonMediaItemId): Request_[MediaItem] = js.native
  /** List all media items from a user's Google Photos library. */
  def list(request: AnonPageSize): Request_[ListMediaItemsResponse] = js.native
  def search(request: AnonKey, body: SearchMediaItemsRequest): Request_[SearchMediaItemsResponse] = js.native
  /**
    * Searches for media items in a user's Google Photos library.
    * If no filters are set, then all media items in the user's library are
    * returned.
    * If an album is set, all media items in the specified album are returned.
    * If filters are specified, media items that match the filters from the
    * user's library are listed. If you set both the album and the filters, the
    * request results in an error.
    */
  def search(request: AnonResource): Request_[SearchMediaItemsResponse] = js.native
}

