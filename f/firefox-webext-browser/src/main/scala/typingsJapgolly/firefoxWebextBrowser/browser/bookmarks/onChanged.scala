package typingsJapgolly.firefoxWebextBrowser.browser.bookmarks

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.firefoxWebextBrowser.AnonTitleUrl
import typingsJapgolly.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a bookmark or folder changes. **Note:** Currently, only title and url changes trigger this.
  */
@JSGlobal("browser.bookmarks.onChanged")
@js.native
object onChanged
  extends TopLevel[WebExtEvent[js.Function2[/* id */ String, /* changeInfo */ AnonTitleUrl, Unit]]]

