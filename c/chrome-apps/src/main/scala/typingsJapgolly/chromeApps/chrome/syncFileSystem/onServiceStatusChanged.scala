package typingsJapgolly.chromeApps.chrome.syncFileSystem

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.chromeApps.AnonState
import typingsJapgolly.chromeApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when an error or other status change has happened in the sync backend
  * (for example, when the sync is temporarily disabled due to network or authentication error).
  * @see ServiceStatus
  */
@JSGlobal("chrome.syncFileSystem.onServiceStatusChanged")
@js.native
object onServiceStatusChanged
  extends TopLevel[Event[js.Function1[/* detail */ AnonState, Unit]]]

