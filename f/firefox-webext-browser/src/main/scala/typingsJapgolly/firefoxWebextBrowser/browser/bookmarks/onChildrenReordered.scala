package typingsJapgolly.firefoxWebextBrowser.browser.bookmarks

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.firefoxWebextBrowser.AnonChildIds
import typingsJapgolly.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the children of a folder have changed their order due to the order being sorted in the UI. This is
  * not called as a result of a move().
  * @deprecated Unsupported on Firefox at this time.
  */
@JSGlobal("browser.bookmarks.onChildrenReordered")
@js.native
object onChildrenReordered
  extends TopLevel[
      js.UndefOr[WebExtEvent[js.Function2[/* id */ String, /* reorderInfo */ AnonChildIds, Unit]]]
    ]

