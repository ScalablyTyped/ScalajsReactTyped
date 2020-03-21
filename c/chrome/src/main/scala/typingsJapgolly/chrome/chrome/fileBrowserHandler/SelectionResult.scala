package typingsJapgolly.chrome.chrome.fileBrowserHandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionResult extends js.Object {
  /** Optional. Selected file entry. It will be null if a file hasn't been selected.  */
  var entry: js.UndefOr[js.Object | Null] = js.undefined
  /** Whether the file has been selected. */
  var success: Boolean
}

object SelectionResult {
  @scala.inline
  def apply(success: Boolean, entry: js.Object = null): SelectionResult = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    if (entry != null) __obj.updateDynamic("entry")(entry.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionResult]
  }
}

