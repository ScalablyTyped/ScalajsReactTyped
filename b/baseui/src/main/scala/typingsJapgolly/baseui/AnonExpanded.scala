package typingsJapgolly.baseui

import typingsJapgolly.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpanded extends js.Object {
  var expanded: js.Array[Key]
}

object AnonExpanded {
  @scala.inline
  def apply(expanded: js.Array[Key]): AnonExpanded = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExpanded]
  }
}

