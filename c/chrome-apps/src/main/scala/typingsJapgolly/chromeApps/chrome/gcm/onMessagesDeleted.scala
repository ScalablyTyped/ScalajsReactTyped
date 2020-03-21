package typingsJapgolly.chromeApps.chrome.gcm

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.chromeApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when a GCM server had to delete messages sent by an app server to the application. See Messages deleted event section of Cloud Messaging documentation for details on handling this event. */
@JSGlobal("chrome.gcm.onMessagesDeleted")
@js.native
object onMessagesDeleted
  extends TopLevel[Event[js.Function0[Unit]]]

