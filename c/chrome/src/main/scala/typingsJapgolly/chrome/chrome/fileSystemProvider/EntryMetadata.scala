package typingsJapgolly.chrome.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntryMetadata extends js.Object {
  /** True if it is a directory. */
  var isDirectory: Boolean
  /** Optional. Mime type for the entry.  */
  var mimeType: js.UndefOr[String] = js.undefined
  /** The last modified time of this entry. */
  var modificationTime: js.Date
  /** Name of this entry (not full path name). Must not contain '/'. For root it must be empty. */
  var name: String
  /** File size in bytes. */
  var size: Double
  /** Optional. Thumbnail image as a data URI in either PNG, JPEG or WEBP format, at most 32 KB in size. Optional, but can be provided only when explicitly requested by the onGetMetadataRequested event.  */
  var thumbnail: js.UndefOr[String] = js.undefined
}

object EntryMetadata {
  @scala.inline
  def apply(
    isDirectory: Boolean,
    modificationTime: js.Date,
    name: String,
    size: Double,
    mimeType: String = null,
    thumbnail: String = null
  ): EntryMetadata = {
    val __obj = js.Dynamic.literal(isDirectory = isDirectory.asInstanceOf[js.Any], modificationTime = modificationTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryMetadata]
  }
}

