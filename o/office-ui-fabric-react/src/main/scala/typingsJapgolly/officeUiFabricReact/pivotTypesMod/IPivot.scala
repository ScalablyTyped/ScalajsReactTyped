package typingsJapgolly.officeUiFabricReact.pivotTypesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPivot extends js.Object {
  /**
    * Sets focus to the first pivot tab.
    */
  def focus(): Unit
}

object IPivot {
  @scala.inline
  def apply(focus: Callback): IPivot = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("focus")(focus.toJsFn)
    __obj.asInstanceOf[IPivot]
  }
}

