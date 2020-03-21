package typingsJapgolly.chromeApps.chrome.fileSystemProvider

import typingsJapgolly.chromeApps.chrome.fileSystemProvider.internal.EntryPathRequestedEventOptions
import typingsJapgolly.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatcherRequestedEventOptions extends EntryPathRequestedEventOptions {
  /**
    * Mode of the watcher.
    * Whether observing should include all child entries recursively.
    * It can be true for directories only.
    */
  var recursive: Boolean
}

object WatcherRequestedEventOptions {
  @scala.inline
  def apply(entryPath: String, fileSystemId: String, recursive: Boolean, requestId: integer): WatcherRequestedEventOptions = {
    val __obj = js.Dynamic.literal(entryPath = entryPath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WatcherRequestedEventOptions]
  }
}

