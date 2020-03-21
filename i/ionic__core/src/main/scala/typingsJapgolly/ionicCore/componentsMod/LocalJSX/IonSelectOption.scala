package typingsJapgolly.ionicCore.componentsMod.LocalJSX

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonSelectOption extends js.Object {
  /**
    * If `true`, the user cannot interact with the select option.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the element is selected.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * The text value of the option.
    */
  var value: js.UndefOr[js.Any | Null] = js.undefined
}

object IonSelectOption {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    value: js.Any = null
  ): IonSelectOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonSelectOption]
  }
}

