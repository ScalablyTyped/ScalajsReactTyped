package typingsJapgolly.gijgo.Types

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownSettings extends js.Object {
  //Events
  var change: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var dataSource: js.UndefOr[js.Any] = js.undefined
  var icons: js.UndefOr[DropDownIcons] = js.undefined
  var iconsLibrary: js.UndefOr[String] = js.undefined
  var maxHeight: js.UndefOr[js.Any] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var selectedField: js.UndefOr[String] = js.undefined
  var textField: js.UndefOr[String] = js.undefined
  var uiLibrary: js.UndefOr[String] = js.undefined
  var valueField: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object DropDownSettings {
  @scala.inline
  def apply(
    change: /* e */ js.Any => CallbackTo[js.Any] = null,
    dataBound: /* e */ js.Any => CallbackTo[js.Any] = null,
    dataSource: js.Any = null,
    icons: DropDownIcons = null,
    iconsLibrary: String = null,
    maxHeight: js.Any = null,
    placeholder: String = null,
    selectedField: String = null,
    textField: String = null,
    uiLibrary: String = null,
    valueField: String = null,
    width: Int | Double = null
  ): DropDownSettings = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1((t0: /* e */ js.Any) => change(t0).runNow()))
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1((t0: /* e */ js.Any) => dataBound(t0).runNow()))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (iconsLibrary != null) __obj.updateDynamic("iconsLibrary")(iconsLibrary.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (selectedField != null) __obj.updateDynamic("selectedField")(selectedField.asInstanceOf[js.Any])
    if (textField != null) __obj.updateDynamic("textField")(textField.asInstanceOf[js.Any])
    if (uiLibrary != null) __obj.updateDynamic("uiLibrary")(uiLibrary.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownSettings]
  }
}

