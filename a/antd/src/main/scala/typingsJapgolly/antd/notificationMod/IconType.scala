package typingsJapgolly.antd.notificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.antd.antdStrings.success
  - typingsJapgolly.antd.antdStrings.info
  - typingsJapgolly.antd.antdStrings.error
  - typingsJapgolly.antd.antdStrings.warning
*/
trait IconType extends js.Object

object IconType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.antd.antdStrings.error = this.cast("error")
  @scala.inline
  def info: typingsJapgolly.antd.antdStrings.info = this.cast("info")
  @scala.inline
  def success: typingsJapgolly.antd.antdStrings.success = this.cast("success")
  @scala.inline
  def warning: typingsJapgolly.antd.antdStrings.warning = this.cast("warning")
}

