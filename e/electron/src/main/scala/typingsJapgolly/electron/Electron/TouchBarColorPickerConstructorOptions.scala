package typingsJapgolly.electron.Electron

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchBarColorPickerConstructorOptions extends js.Object {
  /**
    * Array of hex color strings to appear as possible colors to select.
    */
  var availableColors: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Function to call when a color is selected.
    */
  var change: js.UndefOr[js.Function1[/* color */ String, Unit]] = js.undefined
  /**
    * The selected hex color in the picker, i.e #ABCDEF.
    */
  var selectedColor: js.UndefOr[String] = js.undefined
}

object TouchBarColorPickerConstructorOptions {
  @scala.inline
  def apply(
    availableColors: js.Array[String] = null,
    change: /* color */ String => Callback = null,
    selectedColor: String = null
  ): TouchBarColorPickerConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (availableColors != null) __obj.updateDynamic("availableColors")(availableColors.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1((t0: /* color */ java.lang.String) => change(t0).runNow()))
    if (selectedColor != null) __obj.updateDynamic("selectedColor")(selectedColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarColorPickerConstructorOptions]
  }
}

