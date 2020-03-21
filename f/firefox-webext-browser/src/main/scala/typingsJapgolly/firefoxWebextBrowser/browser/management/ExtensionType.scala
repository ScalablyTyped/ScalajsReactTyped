package typingsJapgolly.firefoxWebextBrowser.browser.management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The type of this extension, 'extension' or 'theme'. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.extension
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.theme
*/
trait ExtensionType extends js.Object

object ExtensionType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def extension: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.extension = this.cast("extension")
  @scala.inline
  def theme: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.theme = this.cast("theme")
}

