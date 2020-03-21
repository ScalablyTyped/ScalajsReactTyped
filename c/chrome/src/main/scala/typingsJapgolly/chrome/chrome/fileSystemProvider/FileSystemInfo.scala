package typingsJapgolly.chrome.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystemInfo extends js.Object {
  /** A human-readable name for the file system. */
  var displayName: String
  /** The identifier of the file system. */
  var fileSystemId: String
  /**
    * List of currently opened files.
    * @since Since Chrome 42.
    */
  var openedFiles: js.Array[OpenedFileInfo]
  /**
    * The maximum number of files that can be opened at once. If 0, then not limited.
    * @since Since Chrome 42.
    */
  var openedFilesLimit: Double
  /**
    * Optional.
    * Whether the file system supports the tag field for observing directories.
    * @since Since Chrome 45. Warning: this is the current Beta channel.
    */
  var supportsNotifyTag: js.UndefOr[Boolean] = js.undefined
  /**
    * List of watchers.
    * @since Since Chrome 45. Warning: this is the current Beta channel.
    */
  var watchers: js.Array[FileWatchersInfo]
  /** Whether the file system supports operations which may change contents of the file system (such as creating, deleting or writing to files). */
  var writable: Boolean
}

object FileSystemInfo {
  @scala.inline
  def apply(
    displayName: String,
    fileSystemId: String,
    openedFiles: js.Array[OpenedFileInfo],
    openedFilesLimit: Double,
    watchers: js.Array[FileWatchersInfo],
    writable: Boolean,
    supportsNotifyTag: js.UndefOr[Boolean] = js.undefined
  ): FileSystemInfo = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], openedFiles = openedFiles.asInstanceOf[js.Any], openedFilesLimit = openedFilesLimit.asInstanceOf[js.Any], watchers = watchers.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsNotifyTag)) __obj.updateDynamic("supportsNotifyTag")(supportsNotifyTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemInfo]
  }
}

