package typingsJapgolly.mixpanelBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mixpanelBrowser.mixpanelBrowserStrings.cookie
  - typingsJapgolly.mixpanelBrowser.mixpanelBrowserStrings.localStorage
*/
trait Persistence extends js.Object

object Persistence {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cookie: typingsJapgolly.mixpanelBrowser.mixpanelBrowserStrings.cookie = this.cast("cookie")
  @scala.inline
  def localStorage: typingsJapgolly.mixpanelBrowser.mixpanelBrowserStrings.localStorage = this.cast("localStorage")
}

