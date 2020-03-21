package typingsJapgolly.chromeApps.WebView.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * String indicating the reason for the exit.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chromeApps.chromeAppsStrings.normal
  - typingsJapgolly.chromeApps.chromeAppsStrings.abnormal
  - typingsJapgolly.chromeApps.chromeAppsStrings.crash
  - typingsJapgolly.chromeApps.chromeAppsStrings.kill
*/
trait ExitEventReason extends js.Object

object ExitEventReason {
  @scala.inline
  def abnormal: typingsJapgolly.chromeApps.chromeAppsStrings.abnormal = this.cast("abnormal")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def crash: typingsJapgolly.chromeApps.chromeAppsStrings.crash = this.cast("crash")
  @scala.inline
  def kill: typingsJapgolly.chromeApps.chromeAppsStrings.kill = this.cast("kill")
  @scala.inline
  def normal: typingsJapgolly.chromeApps.chromeAppsStrings.normal = this.cast("normal")
}

