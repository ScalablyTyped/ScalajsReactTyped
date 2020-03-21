package typingsJapgolly.firefoxWebextBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.insecure
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.weak
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.broken
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.secure
*/
trait SecurityInfoState extends js.Object

object SecurityInfoState {
  @scala.inline
  def broken: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.broken = this.cast("broken")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def insecure: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.insecure = this.cast("insecure")
  @scala.inline
  def secure: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.secure = this.cast("secure")
  @scala.inline
  def weak: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.weak = this.cast("weak")
}

