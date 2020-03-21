package typingsJapgolly.firefoxWebextBrowser.browser.commands

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* commands events */
/** Fired when a registered command is activated using a keyboard shortcut. */
@JSGlobal("browser.commands.onCommand")
@js.native
object onCommand
  extends TopLevel[WebExtEvent[js.Function1[/* command */ String, Unit]]]

