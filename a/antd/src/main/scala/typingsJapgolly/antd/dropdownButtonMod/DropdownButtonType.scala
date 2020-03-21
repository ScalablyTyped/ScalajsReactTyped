package typingsJapgolly.antd.dropdownButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.antd.antdStrings.primary
  - typingsJapgolly.antd.antdStrings.ghost
  - typingsJapgolly.antd.antdStrings.dashed
*/
trait DropdownButtonType extends js.Object

object DropdownButtonType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dashed: typingsJapgolly.antd.antdStrings.dashed = this.cast("dashed")
  @scala.inline
  def ghost: typingsJapgolly.antd.antdStrings.ghost = this.cast("ghost")
  @scala.inline
  def primary: typingsJapgolly.antd.antdStrings.primary = this.cast("primary")
}

