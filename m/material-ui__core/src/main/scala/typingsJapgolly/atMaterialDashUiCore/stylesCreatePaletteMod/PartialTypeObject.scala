package typingsJapgolly.atMaterialDashUiCore.stylesCreatePaletteMod

import typingsJapgolly.atMaterialDashUiCore.PartialTypeAction
import typingsJapgolly.atMaterialDashUiCore.PartialTypeBackground
import typingsJapgolly.atMaterialDashUiCore.PartialTypeText
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ P in keyof @material-ui/core.@material-ui/core/styles/createPalette.TypeObject ]:? std.Partial<@material-ui/core.@material-ui/core/styles/createPalette.TypeObject[P]>} */
trait PartialTypeObject extends js.Object {
  var action: js.UndefOr[PartialTypeAction] = js.undefined
  var background: js.UndefOr[PartialTypeBackground] = js.undefined
  var divider: js.UndefOr[Partial[TypeDivider]] = js.undefined
  var text: js.UndefOr[PartialTypeText] = js.undefined
}

object PartialTypeObject {
  @scala.inline
  def apply(
    action: PartialTypeAction = null,
    background: PartialTypeBackground = null,
    divider: Partial[TypeDivider] = null,
    text: PartialTypeText = null
  ): PartialTypeObject = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (divider != null) __obj.updateDynamic("divider")(divider.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTypeObject]
  }
}

