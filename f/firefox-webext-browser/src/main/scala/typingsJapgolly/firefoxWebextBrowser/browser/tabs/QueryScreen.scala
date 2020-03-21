package typingsJapgolly.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.Screen
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.Window
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.Application
*/
trait QueryScreen extends js.Object

object QueryScreen {
  @scala.inline
  def Application: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.Application = this.cast("Application")
  @scala.inline
  def Screen: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.Screen = this.cast("Screen")
  @scala.inline
  def Window: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.Window = this.cast("Window")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

