package typingsJapgolly.firefoxWebextBrowser.browser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bookmarks {
  /* bookmarks types */
  /**
    * Indicates the reason why this node is unmodifiable. The `managed` value indicates that this node was configured
    * by the system administrator or by the custodian of a supervised user. Omitted if the node can be modified by the
    * user and the extension (default).
    */
  type BookmarkTreeNodeUnmodifiable = typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.managed
}
