package typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelSettingsLowerLevelStyle extends js.Object {
  /** Options for customizing the font of labels.
    */
  var font: js.UndefOr[LabelSettingsLowerLevelStyleFont] = js.undefined
  /** Specifies the horizontal text alignment of the text in label.
    * @Default {middle}
    */
  var horizontalAlignment: js.UndefOr[String] = js.undefined
}

object LabelSettingsLowerLevelStyle {
  @scala.inline
  def apply(font: LabelSettingsLowerLevelStyleFont = null, horizontalAlignment: String = null): LabelSettingsLowerLevelStyle = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelSettingsLowerLevelStyle]
  }
}

