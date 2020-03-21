package typingsJapgolly.chromeApps.WebView.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The type of modal dialog requested by the guest.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chromeApps.chromeAppsStrings.alert
  - typingsJapgolly.chromeApps.chromeAppsStrings.confirm
  - typingsJapgolly.chromeApps.chromeAppsStrings.prompt
*/
trait DialogMessageType extends js.Object

object DialogMessageType {
  @scala.inline
  def alert: typingsJapgolly.chromeApps.chromeAppsStrings.alert = this.cast("alert")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def confirm: typingsJapgolly.chromeApps.chromeAppsStrings.confirm = this.cast("confirm")
  @scala.inline
  def prompt: typingsJapgolly.chromeApps.chromeAppsStrings.prompt = this.cast("prompt")
}

