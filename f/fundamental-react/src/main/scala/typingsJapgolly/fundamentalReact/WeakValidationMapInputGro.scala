package typingsJapgolly.fundamentalReact

import typingsJapgolly.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/InputGroup/InputGroup.InputGroupAddonProps> */
trait WeakValidationMapInputGro extends js.Object {
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var isButton: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
}

object WeakValidationMapInputGro {
  @scala.inline
  def apply(
    className: Validator[js.UndefOr[Null | String]] = null,
    isButton: Validator[js.UndefOr[Boolean | Null]] = null
  ): WeakValidationMapInputGro = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (isButton != null) __obj.updateDynamic("isButton")(isButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapInputGro]
  }
}

