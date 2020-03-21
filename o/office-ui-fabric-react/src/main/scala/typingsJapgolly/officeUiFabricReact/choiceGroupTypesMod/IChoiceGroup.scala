package typingsJapgolly.officeUiFabricReact.choiceGroupTypesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChoiceGroup extends js.Object {
  /**
    * Gets the current checked option.
    */
  var checkedOption: js.UndefOr[IChoiceGroupOption] = js.undefined
  /**
    * Sets focus to the checked option or the first enabled option in the ChoiceGroup.
    */
  def focus(): Unit
}

object IChoiceGroup {
  @scala.inline
  def apply(focus: Callback, checkedOption: IChoiceGroupOption = null): IChoiceGroup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("focus")(focus.toJsFn)
    if (checkedOption != null) __obj.updateDynamic("checkedOption")(checkedOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChoiceGroup]
  }
}

