package typingsJapgolly.fundamentalReact

import typingsJapgolly.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Panel/Panel.PanelActionsProps> */
trait WeakValidationMapPanelAct extends js.Object {
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
}

object WeakValidationMapPanelAct {
  @scala.inline
  def apply(className: Validator[js.UndefOr[Null | String]] = null): WeakValidationMapPanelAct = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapPanelAct]
  }
}

