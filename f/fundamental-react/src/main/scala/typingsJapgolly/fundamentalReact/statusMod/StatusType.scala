package typingsJapgolly.fundamentalReact.statusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fundamentalReact.fundamentalReactStrings.success
  - typingsJapgolly.fundamentalReact.fundamentalReactStrings.warning
  - typingsJapgolly.fundamentalReact.fundamentalReactStrings.error
  - typingsJapgolly.fundamentalReact.fundamentalReactStrings.available
  - typingsJapgolly.fundamentalReact.fundamentalReactStrings.away
  - typingsJapgolly.fundamentalReact.fundamentalReactStrings.busy
  - typingsJapgolly.fundamentalReact.fundamentalReactStrings.offline
*/
trait StatusType extends js.Object

object StatusType {
  @scala.inline
  def available: typingsJapgolly.fundamentalReact.fundamentalReactStrings.available = this.cast("available")
  @scala.inline
  def away: typingsJapgolly.fundamentalReact.fundamentalReactStrings.away = this.cast("away")
  @scala.inline
  def busy: typingsJapgolly.fundamentalReact.fundamentalReactStrings.busy = this.cast("busy")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.fundamentalReact.fundamentalReactStrings.error = this.cast("error")
  @scala.inline
  def offline: typingsJapgolly.fundamentalReact.fundamentalReactStrings.offline = this.cast("offline")
  @scala.inline
  def success: typingsJapgolly.fundamentalReact.fundamentalReactStrings.success = this.cast("success")
  @scala.inline
  def warning: typingsJapgolly.fundamentalReact.fundamentalReactStrings.warning = this.cast("warning")
}

