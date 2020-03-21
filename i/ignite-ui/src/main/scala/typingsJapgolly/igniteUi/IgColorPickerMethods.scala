package typingsJapgolly.igniteUi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgColorPickerMethods extends js.Object {
  /**
  	 * Gets the color for an element from the color picker in RGB format.
  	 *
  	 * @param $element A jQuery element in the color picker from which the color will be retrieved.
  	 */
  def colorFromElement($element: js.Object): String
  /**
  	 * Gets a reference to the div element of the color table
  	 */
  def colorTable(): js.Object
  /**
  	 * Gets a reference to the div element with the default or custom colors table.
  	 */
  def customColorTable(): js.Object
  /**
  	 * Select a color.
  	 *
  	 * @param color The #RGB value of the color to be selected.
  	 */
  def selectColor(color: String): js.Object
  /**
  	 * Returns the hexademical string of the currently selected color in the color picker. Returns null if no color is selected.
  	 * @return string|null Returns the selected color if available. Null if no color is selected.
  	 */
  def selectedColor(): String
  /**
  	 * Returns the div element with the standard color table.
  	 */
  def standardColorsTable(): js.Object
}

object IgColorPickerMethods {
  @scala.inline
  def apply(
    colorFromElement: js.Object => CallbackTo[String],
    colorTable: CallbackTo[js.Object],
    customColorTable: CallbackTo[js.Object],
    selectColor: String => CallbackTo[js.Object],
    selectedColor: CallbackTo[String],
    standardColorsTable: CallbackTo[js.Object]
  ): IgColorPickerMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("colorFromElement")(js.Any.fromFunction1((t0: js.Object) => colorFromElement(t0).runNow()))
    __obj.updateDynamic("colorTable")(colorTable.toJsFn)
    __obj.updateDynamic("customColorTable")(customColorTable.toJsFn)
    __obj.updateDynamic("selectColor")(js.Any.fromFunction1((t0: java.lang.String) => selectColor(t0).runNow()))
    __obj.updateDynamic("selectedColor")(selectedColor.toJsFn)
    __obj.updateDynamic("standardColorsTable")(standardColorsTable.toJsFn)
    __obj.asInstanceOf[IgColorPickerMethods]
  }
}

