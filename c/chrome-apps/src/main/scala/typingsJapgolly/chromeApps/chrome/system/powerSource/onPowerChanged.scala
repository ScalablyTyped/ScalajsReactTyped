package typingsJapgolly.chromeApps.chrome.system.powerSource

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.chromeApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event for changes in the set of connected power sources.
  */
@JSGlobal("chrome.system.powerSource.onPowerChanged")
@js.native
object onPowerChanged
  extends TopLevel[Event[js.Function1[/* powerSourceInfo */ js.Array[PowerSourceInfo], Unit]]]

