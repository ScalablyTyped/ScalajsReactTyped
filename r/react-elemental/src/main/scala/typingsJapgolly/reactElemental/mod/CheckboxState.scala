package typingsJapgolly.reactElemental.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxState extends js.Object {
  val isFocus: Boolean
  val isHover: Boolean
}

object CheckboxState {
  @scala.inline
  def apply(isFocus: Boolean, isHover: Boolean): CheckboxState = {
    val __obj = js.Dynamic.literal(isFocus = isFocus.asInstanceOf[js.Any], isHover = isHover.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CheckboxState]
  }
}

