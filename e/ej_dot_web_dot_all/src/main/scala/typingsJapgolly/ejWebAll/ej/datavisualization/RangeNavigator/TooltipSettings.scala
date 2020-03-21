package typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipSettings extends js.Object {
  /** Specifies the background color of tooltip.
    * @Default {#303030}
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /** Options for customizing the font in tooltip.
    */
  var font: js.UndefOr[TooltipSettingsFont] = js.undefined
  /** Specifies the format of text to be displayed in tooltip.
    * @Default {MM/dd/yyyy}
    */
  var labelFormat: js.UndefOr[String] = js.undefined
  /** Specifies the mode of displaying the tooltip. Neither to display the tooltip always nor on demand.
    * @Default {null}
    */
  var tooltipDisplayMode: js.UndefOr[String] = js.undefined
  /** Toggles the visibility of tooltip.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object TooltipSettings {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    font: TooltipSettingsFont = null,
    labelFormat: String = null,
    tooltipDisplayMode: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): TooltipSettings = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (labelFormat != null) __obj.updateDynamic("labelFormat")(labelFormat.asInstanceOf[js.Any])
    if (tooltipDisplayMode != null) __obj.updateDynamic("tooltipDisplayMode")(tooltipDisplayMode.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipSettings]
  }
}

