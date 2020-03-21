package typingsJapgolly.chromeApps.chrome.fileSystemProvider.internal

import typingsJapgolly.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @private
  * @internal
  */
trait EntryPathRequestedEventOptions extends RequestedEventOptions {
  /** The path of the entry to which this operation is related to. */
  var entryPath: String
}

object EntryPathRequestedEventOptions {
  @scala.inline
  def apply(entryPath: String, fileSystemId: String, requestId: integer): EntryPathRequestedEventOptions = {
    val __obj = js.Dynamic.literal(entryPath = entryPath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EntryPathRequestedEventOptions]
  }
}

