package typingsJapgolly.firefoxWebextBrowser.browser.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* downloads types */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.uniquify
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.overwrite
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.prompt
*/
trait FilenameConflictAction extends js.Object

object FilenameConflictAction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def overwrite: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.overwrite = this.cast("overwrite")
  @scala.inline
  def prompt: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.prompt = this.cast("prompt")
  @scala.inline
  def uniquify: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.uniquify = this.cast("uniquify")
}

