package typingsJapgolly.antd.baseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.antd.antdStrings.secondary
  - typingsJapgolly.antd.antdStrings.danger
  - typingsJapgolly.antd.antdStrings.warning
*/
trait BaseType extends js.Object

object BaseType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def danger: typingsJapgolly.antd.antdStrings.danger = this.cast("danger")
  @scala.inline
  def secondary: typingsJapgolly.antd.antdStrings.secondary = this.cast("secondary")
  @scala.inline
  def warning: typingsJapgolly.antd.antdStrings.warning = this.cast("warning")
}

