package typingsJapgolly.devextreme.mod.DevExpress.viz

import typingsJapgolly.devextreme.devextremeStrings.bottom
import typingsJapgolly.devextreme.devextremeStrings.center
import typingsJapgolly.devextreme.devextremeStrings.inside
import typingsJapgolly.devextreme.devextremeStrings.left
import typingsJapgolly.devextreme.devextremeStrings.outside
import typingsJapgolly.devextreme.devextremeStrings.right
import typingsJapgolly.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxChartValueAxisConstantLinesLabel extends dxChartCommonAxisSettingsConstantLineStyleLabel {
  /** Aligns constant line labels in the horizontal direction. */
  var horizontalAlignment: js.UndefOr[center | left | right] = js.undefined
  /** Specifies the text of a constant line label. By default, equals to the value of the constant line. */
  var text: js.UndefOr[String] = js.undefined
  /** Aligns constant line labels in the vertical direction. */
  var verticalAlignment: js.UndefOr[bottom | center | top] = js.undefined
}

object dxChartValueAxisConstantLinesLabel {
  @scala.inline
  def apply(
    font: Font = null,
    horizontalAlignment: center | left | right = null,
    position: inside | outside = null,
    text: String = null,
    verticalAlignment: bottom | center | top = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxChartValueAxisConstantLinesLabel = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartValueAxisConstantLinesLabel]
  }
}

