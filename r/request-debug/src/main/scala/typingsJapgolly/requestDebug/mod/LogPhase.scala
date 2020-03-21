package typingsJapgolly.requestDebug.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.requestDebug.requestDebugStrings.request
  - typingsJapgolly.requestDebug.requestDebugStrings.response
  - typingsJapgolly.requestDebug.requestDebugStrings.redirect
  - typingsJapgolly.requestDebug.requestDebugStrings.auth
*/
trait LogPhase extends js.Object

object LogPhase {
  @scala.inline
  def auth: typingsJapgolly.requestDebug.requestDebugStrings.auth = this.cast("auth")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def redirect: typingsJapgolly.requestDebug.requestDebugStrings.redirect = this.cast("redirect")
  @scala.inline
  def request: typingsJapgolly.requestDebug.requestDebugStrings.request = this.cast("request")
  @scala.inline
  def response: typingsJapgolly.requestDebug.requestDebugStrings.response = this.cast("response")
}

