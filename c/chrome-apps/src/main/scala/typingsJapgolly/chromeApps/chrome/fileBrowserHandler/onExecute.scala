package typingsJapgolly.chromeApps.chrome.fileBrowserHandler

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.chromeApps.AnonEntries
import typingsJapgolly.chromeApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when file system action is executed from ChromeOS file browser.
  */
@JSGlobal("chrome.fileBrowserHandler.onExecute")
@js.native
object onExecute
  extends TopLevel[
      Event[
        js.Function2[/* id */ FileBrowserHandleExecuteId, /* details */ AnonEntries, Unit]
      ]
    ]

