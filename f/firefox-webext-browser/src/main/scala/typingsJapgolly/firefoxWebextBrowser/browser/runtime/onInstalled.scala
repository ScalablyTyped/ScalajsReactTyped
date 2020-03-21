package typingsJapgolly.firefoxWebextBrowser.browser.runtime

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.firefoxWebextBrowser.AnonPreviousVersion
import typingsJapgolly.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the extension is first installed, when the extension is updated to a new version, and when the
  * browser is updated to a new version.
  */
@JSGlobal("browser.runtime.onInstalled")
@js.native
object onInstalled
  extends TopLevel[WebExtEvent[js.Function1[/* details */ AnonPreviousVersion, Unit]]]

