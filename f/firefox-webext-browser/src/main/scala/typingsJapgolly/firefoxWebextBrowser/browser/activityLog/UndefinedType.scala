package typingsJapgolly.firefoxWebextBrowser.browser.activityLog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The type of log entry. api_call is a function call made by the extension and api_event is an event callback to
  * the extension. content_script is logged when a content script is injected.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.api_call
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.api_event
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.content_script
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.user_script
*/
trait UndefinedType extends js.Object

object UndefinedType {
  @scala.inline
  def api_call: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.api_call = this.cast("api_call")
  @scala.inline
  def api_event: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.api_event = this.cast("api_event")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def content_script: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.content_script = this.cast("content_script")
  @scala.inline
  def user_script: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.user_script = this.cast("user_script")
}

