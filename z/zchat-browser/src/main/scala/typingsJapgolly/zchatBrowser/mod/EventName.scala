package typingsJapgolly.zchatBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.zchatBrowser.zchatBrowserStrings.account_status
  - typingsJapgolly.zchatBrowser.zchatBrowserStrings.connection_update
  - typingsJapgolly.zchatBrowser.zchatBrowserStrings.department_update
  - typingsJapgolly.zchatBrowser.zchatBrowserStrings.visitor_update
  - typingsJapgolly.zchatBrowser.zchatBrowserStrings.agent_update
  - typingsJapgolly.zchatBrowser.zchatBrowserStrings.chat
  - typingsJapgolly.zchatBrowser.zchatBrowserStrings.history
  - typingsJapgolly.zchatBrowser.zchatBrowserStrings.typing
  - typingsJapgolly.zchatBrowser.zchatBrowserStrings.error
*/
trait EventName extends js.Object

object EventName {
  @scala.inline
  def account_status: typingsJapgolly.zchatBrowser.zchatBrowserStrings.account_status = this.cast("account_status")
  @scala.inline
  def agent_update: typingsJapgolly.zchatBrowser.zchatBrowserStrings.agent_update = this.cast("agent_update")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chat: typingsJapgolly.zchatBrowser.zchatBrowserStrings.chat = this.cast("chat")
  @scala.inline
  def connection_update: typingsJapgolly.zchatBrowser.zchatBrowserStrings.connection_update = this.cast("connection_update")
  @scala.inline
  def department_update: typingsJapgolly.zchatBrowser.zchatBrowserStrings.department_update = this.cast("department_update")
  @scala.inline
  def error: typingsJapgolly.zchatBrowser.zchatBrowserStrings.error = this.cast("error")
  @scala.inline
  def history: typingsJapgolly.zchatBrowser.zchatBrowserStrings.history = this.cast("history")
  @scala.inline
  def typing: typingsJapgolly.zchatBrowser.zchatBrowserStrings.typing = this.cast("typing")
  @scala.inline
  def visitor_update: typingsJapgolly.zchatBrowser.zchatBrowserStrings.visitor_update = this.cast("visitor_update")
}

