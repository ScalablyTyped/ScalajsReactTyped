package typingsJapgolly.firefoxWebextBrowser.browser.downloads

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.firefoxWebextBrowser.AnonCanResume
import typingsJapgolly.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * When any of a DownloadItem's properties except `bytesReceived` changes, this event fires with the `downloadId`
  * and an object containing the properties that changed.
  */
@JSGlobal("browser.downloads.onChanged")
@js.native
object onChanged
  extends TopLevel[WebExtEvent[js.Function1[/* downloadDelta */ AnonCanResume, Unit]]]

