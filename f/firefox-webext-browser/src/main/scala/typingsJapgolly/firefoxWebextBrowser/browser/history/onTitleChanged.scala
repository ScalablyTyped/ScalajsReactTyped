package typingsJapgolly.firefoxWebextBrowser.browser.history

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.firefoxWebextBrowser.AnonTitleString
import typingsJapgolly.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when the title of a URL is changed in the browser history. */
@JSGlobal("browser.history.onTitleChanged")
@js.native
object onTitleChanged
  extends TopLevel[WebExtEvent[js.Function1[/* changed */ AnonTitleString, Unit]]]

