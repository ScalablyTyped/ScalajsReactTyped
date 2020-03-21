package typingsJapgolly.firefoxWebextBrowser.browser.browserAction

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.firefoxWebextBrowser.WebExtEvent
import typingsJapgolly.firefoxWebextBrowser.browser.tabs.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* browserAction events */
/**
  * Fired when a browser action icon is clicked. This event will not fire if the browser action has a popup.
  */
@JSGlobal("browser.browserAction.onClicked")
@js.native
object onClicked
  extends TopLevel[WebExtEvent[js.Function1[/* tab */ Tab, Unit]]]

