package typingsJapgolly.officeUiFabricReact.selectionZoneMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectionZone extends js.Object {
  /**
    * Method to ignore subsequent focus.
    */
  def ignoreNextFocus(): Unit
}

object ISelectionZone {
  @scala.inline
  def apply(ignoreNextFocus: Callback): ISelectionZone = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ignoreNextFocus")(ignoreNextFocus.toJsFn)
    __obj.asInstanceOf[ISelectionZone]
  }
}

