package typingsJapgolly.chromeApps.chrome.mediaGalleries

import typingsJapgolly.filesystem.FileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.mediaGalleries.getMediaFileSystemMetadata")
@js.native
object getMediaFileSystemMetadata extends js.Object {
  /**
    * Get metadata about a specific media file system
    * @since Chrome 26.
    */
  def apply(mediaFileSystem: FileSystem): MediaFileSystemMetadata = js.native
}

