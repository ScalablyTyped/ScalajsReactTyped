package typingsJapgolly.firefoxWebextBrowser.browser.bookmarks

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.firefoxWebextBrowser.AnonOldIndex
import typingsJapgolly.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when a bookmark or folder is moved to a different parent folder. */
@JSGlobal("browser.bookmarks.onMoved")
@js.native
object onMoved
  extends TopLevel[WebExtEvent[js.Function2[/* id */ String, /* moveInfo */ AnonOldIndex, Unit]]]

