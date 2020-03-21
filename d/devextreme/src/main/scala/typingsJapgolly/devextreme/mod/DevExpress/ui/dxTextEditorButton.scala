package typingsJapgolly.devextreme.mod.DevExpress.ui

import typingsJapgolly.devextreme.devextremeStrings.after
import typingsJapgolly.devextreme.devextremeStrings.before
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxTextEditorButton extends js.Object {
  /** Specifies whether to place the button before or after the input text field. */
  var location: js.UndefOr[after | before] = js.undefined
  /** Specifies the button's name. */
  var name: js.UndefOr[String] = js.undefined
  /** Configures the Button widget used as the action button. */
  var options: js.UndefOr[dxButtonOptions] = js.undefined
}

object dxTextEditorButton {
  @scala.inline
  def apply(location: after | before = null, name: String = null, options: dxButtonOptions = null): dxTextEditorButton = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxTextEditorButton]
  }
}

