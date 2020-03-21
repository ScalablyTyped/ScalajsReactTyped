package typingsJapgolly.officeUiFabricReact.focusTrapZoneTypesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFocusTrapZone extends js.Object {
  /**
    * Sets focus to a descendant in the Trap Zone.
    * See firstFocusableSelector and focusPreviouslyFocusedInnerElement for details.
    */
  def focus(): Unit
}

object IFocusTrapZone {
  @scala.inline
  def apply(focus: Callback): IFocusTrapZone = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("focus")(focus.toJsFn)
    __obj.asInstanceOf[IFocusTrapZone]
  }
}

